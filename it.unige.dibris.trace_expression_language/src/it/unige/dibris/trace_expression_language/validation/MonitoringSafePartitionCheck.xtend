package it.unige.dibris.trace_expression_language.validation

import it.unige.dibris.trace_expression_language.tExp.Expression
import it.unige.dibris.trace_expression_language.tExp.InteractionTraceExpression
import java.util.LinkedHashMap
import it.unige.dibris.trace_expression_language.tExp.UnionExpr
import it.unige.dibris.trace_expression_language.tExp.MsgEventType
import java.util.List
import it.unige.dibris.trace_expression_language.tExp.ShuffleExpr
import it.unige.dibris.trace_expression_language.tExp.CatExpr
import it.unige.dibris.trace_expression_language.tExp.AndExpr
import it.unige.dibris.trace_expression_language.tExp.SeqExpr
import it.unige.dibris.trace_expression_language.tExp.FilterExpr
import java.util.TreeSet
import java.util.HashMap
import it.unige.dibris.trace_expression_language.tExp.TerminalExpr
import it.unige.dibris.trace_expression_language.tExp.VarExpr
import java.util.ArrayList

class MonitoringSafePartitionCheck {
	
	static class CriticalPoint{
		MsgEventType evType1
		MsgEventType evType2
		Expression expr
	
		new(MsgEventType type, MsgEventType type2, Expression e) {
			evType1 = type
			evType2 = type2
			expr = e
		}
	
		def evType1() {
			evType1
		}
		
		def evType2() {
			evType2
		}
		
		def expr(){
			expr
		}
	}
	
	def static isMonitoringSafe(InteractionTraceExpression tExp){
		val terms = tExp.terms
		val assocT = new LinkedHashMap<String, Expression>();
		val assocD = new LinkedHashMap<String, Expression>();
		for(term : terms){
			assocT.put(term.name, term.expr);
		}
		for(term : terms){
			if(term.name.equals("Main") || term.name.equals("main")){
				assocD.put(term.name, term.expr);
				var criticalPoints = new ArrayList<CriticalPoint>()
				var criticalPointsNotHandledByPartition = new ArrayList<CriticalPoint>()
				var threshold = 1.0
				if(tExp.threshold !== null && tExp.threshold.size > 0){
					threshold = Double.valueOf(tExp.threshold.get(0))
				}
				extractCriticalPoints(term.expr, criticalPoints, assocT, assocD, threshold)
				println('[')
				for(c : criticalPoints){
					println('(' + c.evType1.name + ', ' + c.evType2.name + ')')
				}
				println(']')
				for(cp : criticalPoints){
					for(p : tExp.partition){
						var solvedL = false
						var solvedR = false
						for(groups : p.constraints){
							if(!solvedL || !solvedR){
								solvedL = false
								solvedR = false
								for(r : groups.roles){
									if(!solvedL){
										for(msg : cp.evType1.msgs){
											if(msg.async_receiver !== null){
												solvedL = r.name == msg.sender.name
											}
											else if(msg.async_sender !== null){
												solvedL = r.name == msg.receiver.name
											}
											else{
												solvedL = (r.name == msg.sender.name || r.name == msg.receiver.name)
											}
										}
									}
									if(!solvedR){
										for(msg : cp.evType2.msgs){
											if(msg.async_receiver !== null){
												solvedR = r.name == msg.sender.name
											}
											else if(msg.async_sender !== null){
												solvedR = r.name == msg.receiver.name
											}
											else{
												solvedR = (r.name == msg.sender.name || r.name == msg.receiver.name)
											}
									}
									}
								}
							}
						}
						if(!solvedL || !solvedR){
							criticalPointsNotHandledByPartition.add(cp)
						}
					}
				}
				return criticalPointsNotHandledByPartition
				//return isContractive(term.expr, 0, -1, assocT, assocD)
			}
		}
	}
	
	def static boolean mayHalt(Expression expr, HashMap<String, Expression> assocT, HashMap<String, Expression> assoc){
		if(expr instanceof TerminalExpr){
			if(expr.terminalExpr.expr !== null){
				return mayHalt(expr.terminalExpr.expr, assocT, assoc)
			}
			if(expr.terminalExpr.term !== null){
				if(assoc.get(expr.terminalExpr.term.name) !== null){
					return false
				}
				assoc.put(expr.terminalExpr.term.name, expr)
				return mayHalt(assocT.get(expr.terminalExpr.term.name), assocT, assoc)
			} else{
				return true
			}
		} else if(expr instanceof ShuffleExpr){
			return mayHalt(expr.left, assocT, assoc) && mayHalt(expr.right, assocT, assoc)
		} else if(expr instanceof AndExpr){
			return mayHalt(expr.left, assocT, assoc) && mayHalt(expr.right, assocT, assoc)
		} else if(expr instanceof UnionExpr){
			return mayHalt(expr.left, assocT, assoc) || mayHalt(expr.right, assocT, assoc)
		} else if(expr instanceof CatExpr){
			return mayHalt(expr.left, assocT, assoc) && mayHalt(expr.right, assocT, assoc)
		} else if(expr instanceof SeqExpr){
			if(expr.seqExpr.typeSeq instanceof MsgEventType) {
				var msgEv = expr.seqExpr.typeSeq as MsgEventType
				if(msgEv.channel !== null && msgEv.channel.reliability !== null && Double.valueOf(msgEv.channel.reliability) < 1)
					return mayHalt(expr.seqExpr.bodySeq, assocT, assoc)
			}
			return false
		} else if(expr instanceof FilterExpr){
			return mayHalt(expr.bodyFilter, assocT, assoc)
		} else{
			return false
		}
	}
	
	def static List<MsgEventType> firstMsgEventTypes(Expression expr, HashMap<String, Expression> assocT, HashMap<String, Expression> assoc, double threshold){
		if(expr instanceof TerminalExpr){
			if(expr.terminalExpr.expr !== null){
				return firstMsgEventTypes(expr.terminalExpr.expr, assocT, assoc, threshold)
			}
			if(expr.terminalExpr.term !== null){
				if(assoc.get(expr.terminalExpr.term.name) !== null){
					return new ArrayList<MsgEventType>()
				}
				assoc.put(expr.terminalExpr.term.name, expr)
				return firstMsgEventTypes(assocT.get(expr.terminalExpr.term.name), assocT, assoc, threshold)
			} else{
				return new ArrayList<MsgEventType>()
			}
		} else if(expr instanceof ShuffleExpr){
			var evTypes1 = firstMsgEventTypes(expr.left, assocT, assoc, threshold)
			var evTypes2 = firstMsgEventTypes(expr.right, assocT, assoc, threshold)
			for(evType2 : evTypes2){
				var found = false
				for(evType1 : evTypes1){
					if(evType1.name == evType2.name){
						found = true
					}
				}
				if(!found){
					evTypes1.add(evType2)
				}
			}
			return evTypes1
		} else if(expr instanceof AndExpr){
			var evTypes1 = firstMsgEventTypes(expr.left, assocT, assoc, threshold)
			var evTypes2 = firstMsgEventTypes(expr.right, assocT, assoc, threshold)
			for(evType2 : evTypes2){
				var found = false
				for(evType1 : evTypes1){
					if(evType1.name == evType2.name){
						found = true
					}
				}
				if(!found){
					evTypes1.add(evType2)
				}
			}
			return evTypes1
		} else if(expr instanceof UnionExpr){
			var evTypes1 = firstMsgEventTypes(expr.left, assocT, assoc, threshold)
			var evTypes2 = firstMsgEventTypes(expr.right, assocT, assoc, threshold)
			for(evType2 : evTypes2){
				var found = false
				for(evType1 : evTypes1){
					if(evType1.name == evType2.name){
						found = true
					}
				}
				if(!found){
					evTypes1.add(evType2)
				}
			}
			return evTypes1
		} else if(expr instanceof CatExpr){
			if(mayHalt(expr, assocT, new HashMap<String, Expression>())){
				var evTypes1 = firstMsgEventTypes(expr.left, assocT, assoc, threshold)
				var evTypes2 = firstMsgEventTypes(expr.right, assocT, assoc, threshold)
				for(evType2 : evTypes2){
				var found = false
				for(evType1 : evTypes1){
					if(evType1.name == evType2.name){
						found = true
					}
				}
				if(!found){
					evTypes1.add(evType2)
				}
			}
				return evTypes1
			} else{
				var evTypes1 = firstMsgEventTypes(expr.left, assocT, assoc, threshold)
				return evTypes1
			}
			
		} else if(expr instanceof SeqExpr){
			if (!(expr.seqExpr.typeSeq instanceof MsgEventType))
				throw new AssertionError("Event type should be a message event type")
			
			var msgEv = expr.seqExpr.typeSeq as MsgEventType
			if(msgEv.channel === null || msgEv.channel.reliability === null || Double.valueOf(msgEv.channel.reliability) >= threshold){
				var eventTypes = new ArrayList<MsgEventType>()
				eventTypes.add(msgEv)
				return eventTypes
			} else if(Double.valueOf(msgEv.channel.reliability) > 0){
				var evTypes2 = firstMsgEventTypes(expr.seqExpr.bodySeq, assocT, assoc, threshold)
				var found = false
				for(evType2 : evTypes2){
					if(msgEv.name == evType2.name){
						found = true
					}
				}
				if(!found){
					evTypes2.add(msgEv)
				}
				return evTypes2
			}
			else{
				return firstMsgEventTypes(expr.seqExpr.bodySeq, assocT, assoc, threshold)
			}
		} else if(expr instanceof FilterExpr){
			return firstMsgEventTypes(expr.filterExpr.bodyFilter, assocT, assoc, threshold)
		} else if(expr instanceof VarExpr){
			return firstMsgEventTypes(expr.varExpr.bodyVar, assocT, assoc, threshold)
		} else{
			return new ArrayList<MsgEventType>()
		}
	}
	
	def static List<MsgEventType> lastMsgEventTypes(Expression expr, HashMap<String, Expression> assocT, HashMap<String, Expression> assoc, double threshold){
		if(expr instanceof TerminalExpr){
			if(expr.terminalExpr.expr !== null){
				return lastMsgEventTypes(expr.terminalExpr.expr, assocT, assoc, threshold)
			}
			if(expr.terminalExpr.term !== null){
				if(assoc.get(expr.terminalExpr.term.name) !== null){
					return new ArrayList<MsgEventType>()
				}
				assoc.put(expr.terminalExpr.term.name, expr)
				return lastMsgEventTypes(assocT.get(expr.terminalExpr.term.name), assocT, assoc, threshold)
			} else{
				return new ArrayList<MsgEventType>()
			}
		} else if(expr instanceof ShuffleExpr){
			var evTypes1 = lastMsgEventTypes(expr.left, assocT, assoc, threshold)
			var evTypes2 = lastMsgEventTypes(expr.right, assocT, assoc, threshold)
			for(evType2 : evTypes2){
				var found = false
				for(evType1 : evTypes1){
					if(evType1.name == evType2.name){
						found = true
					}
				}
				if(!found){
					evTypes1.add(evType2)
				}
			}
			return evTypes1
		} else if(expr instanceof AndExpr){
			var evTypes1 = lastMsgEventTypes(expr.left, assocT, assoc, threshold)
			var evTypes2 = lastMsgEventTypes(expr.right, assocT, assoc, threshold)
			for(evType2 : evTypes2){
				var found = false
				for(evType1 : evTypes1){
					if(evType1.name == evType2.name){
						found = true
					}
				}
				if(!found){
					evTypes1.add(evType2)
				}
			}
			return evTypes1
		} else if(expr instanceof UnionExpr){
			var evTypes1 = lastMsgEventTypes(expr.left, assocT, assoc, threshold)
			var evTypes2 = lastMsgEventTypes(expr.right, assocT, assoc, threshold)
			for(evType2 : evTypes2){
				var found = false
				for(evType1 : evTypes1){
					if(evType1.name == evType2.name){
						found = true
					}
				}
				if(!found){
					evTypes1.add(evType2)
				}
			}
			return evTypes1
		} else if(expr instanceof CatExpr){		
			if(lastMsgEventTypes(expr.left, assocT, assoc, threshold).size == 0){
				return new ArrayList<MsgEventType>()
			}	
			var evTypes2 = lastMsgEventTypes(expr.right, assocT, assoc, threshold)
			return evTypes2
		} else if(expr instanceof SeqExpr){		
			if(mayHalt(expr.seqExpr.bodySeq, assocT, new HashMap<String, Expression>())){
				if (!(expr.seqExpr.typeSeq instanceof MsgEventType))
					throw new AssertionError("Event type should be a message event type")
			
				var msgEv = expr.seqExpr.typeSeq as MsgEventType
			
				if (msgEv.channel === null || msgEv.channel.reliability === null || Double.valueOf(msgEv.channel.reliability) >= threshold){
					var evTypes2 = lastMsgEventTypes(expr.seqExpr.bodySeq, assocT, assoc, threshold)
					var evTypes1 = new ArrayList<MsgEventType>()
					evTypes1.add(msgEv)
					var found = false
					for(evType2 : evTypes2){
						if(evTypes1.get(0).name == evType2.name){
							found = true
						}
					}
					if(!found){
						evTypes2.add(evTypes1.get(0))
					}
					return evTypes2
				} else if(Double.valueOf(msgEv.channel.reliability) > 0){
					var evTypes2 = lastMsgEventTypes(expr.seqExpr.bodySeq, assocT, assoc, threshold)
					var found = false
					for(evType2 : evTypes2){
						if(msgEv.name == evType2.name){
							found = true
						}
					}
					if(!found){
						evTypes2.add(msgEv)
					}
					return evTypes2
				}
			}
			return lastMsgEventTypes(expr.seqExpr.bodySeq, assocT, assoc, threshold)
		} else if(expr instanceof FilterExpr){
			return lastMsgEventTypes(expr.filterExpr.bodyFilter, assocT, assoc, threshold)
		} else if(expr instanceof VarExpr){
			return lastMsgEventTypes(expr.varExpr.bodyVar, assocT, assoc, threshold)
		} else{
			return new ArrayList<MsgEventType>()
		}
	}
	
	def static getRolesFromMsgEventType(MsgEventType eventType){
		var roles = new TreeSet<String>();
		for(msg : eventType.msgs){
			if(msg.sender !== null && msg.receiver !== null){
				roles.add(msg.sender.name)
				roles.add(msg.receiver.name)	
			} else if(msg.async_sender !== null){
				// roles.add(msg.async_sender.name)
				roles.add(msg.receiver.name)
			} else{
				roles.add(msg.sender.name)
				// roles.add(msg.async_receiver.name)
			}
		}
		return roles
	}
	
	def static void extractCriticalPoints(Expression expr, List<CriticalPoint> criticalPoints, HashMap<String, Expression> assocT, HashMap<String, Expression> assoc, double threshold){
		if(expr instanceof ShuffleExpr){
			extractCriticalPoints(expr.left, criticalPoints, assocT, assoc, threshold)
			extractCriticalPoints(expr.right, criticalPoints, assocT, assoc, threshold)
		} else if(expr instanceof AndExpr){
			extractCriticalPoints(expr.left, criticalPoints, assocT, assoc, threshold)
			extractCriticalPoints(expr.right, criticalPoints, assocT, assoc, threshold)
		} else if(expr instanceof UnionExpr){
			extractCriticalPoints(expr.left, criticalPoints, assocT, assoc, threshold)
			extractCriticalPoints(expr.right, criticalPoints, assocT, assoc, threshold)
			var eventTypes1 = firstMsgEventTypes(expr.left, assocT, new HashMap<String, Expression>(), threshold)
			var eventTypes2 = firstMsgEventTypes(expr.right, assocT, new HashMap<String, Expression>(), threshold)
			for(eventType1 : eventTypes1){
				var found = false
				for(eventType2 : eventTypes2){
					for(r1 : getRolesFromMsgEventType(eventType1)){
						for(r2 : getRolesFromMsgEventType(eventType2)){
							if(r1 == r2){
								found = true		
							}	
						}
					}
					if(!found){
						for(c : criticalPoints){
							if(c.evType1 == eventType1 && c.evType2 == eventType2 
								|| c.evType1 == eventType2 && c.evType2 == eventType1){
									found = true	
								}
						}
						if(!found){
							criticalPoints.add(new CriticalPoint(eventType1, eventType2, expr))
						}
					}
				}
			}
		} else if(expr instanceof CatExpr){
			extractCriticalPoints(expr.left, criticalPoints, assocT, assoc, threshold)
			extractCriticalPoints(expr.right, criticalPoints, assocT, assoc, threshold)
			var eventTypes1 = lastMsgEventTypes(expr.left, assocT, new HashMap<String, Expression>(), threshold)
			var eventTypes2 = firstMsgEventTypes(expr.right, assocT, new HashMap<String, Expression>(), threshold)
			for(eventType1 : eventTypes1){
				var found = false
				for(eventType2 : eventTypes2){
					for(r1 : getRolesFromMsgEventType(eventType1)){
						for(r2 : getRolesFromMsgEventType(eventType2)){
							if(r1 == r2){
								found = true		
							}	
						}
					}
					if(!found){
						criticalPoints.add(new CriticalPoint(eventType1, eventType2, expr))
					}
				}
			}
		} else if(expr instanceof SeqExpr){
			if (!(expr.seqExpr.typeSeq instanceof MsgEventType))
				throw new AssertionError("Event type should be a message event type")
		
			var msgEv = expr.seqExpr.typeSeq as MsgEventType
			
			if(msgEv.channel === null || msgEv.channel.reliability === null || Double.valueOf(msgEv.channel.reliability) > 0){
				extractCriticalPoints(expr.seqExpr.bodySeq, criticalPoints, assocT, assoc, threshold)
				var eventTypes1 = new ArrayList<MsgEventType>()
				eventTypes1.add(msgEv)
				var eventTypes2 = firstMsgEventTypes(expr.seqExpr.bodySeq, assocT, new HashMap<String, Expression>(), threshold)
				for(eventType1 : eventTypes1){
					for(eventType2 : eventTypes2){
						var found = false
						for(r1 : getRolesFromMsgEventType(eventType1)){
							for(r2 : getRolesFromMsgEventType(eventType2)){
								if(r1 == r2){
									found = true		
								}	
							}
						}
						if(!found){
							criticalPoints.add(new CriticalPoint(eventType1, eventType2, expr))
						}
					}
				}
			} else{
				extractCriticalPoints(expr.seqExpr.bodySeq, criticalPoints, assocT, assoc, threshold)
			}
		} else if(expr instanceof FilterExpr){
			extractCriticalPoints(expr.filterExpr.bodyFilter, criticalPoints, assocT, assoc, threshold)
		} else if(expr instanceof VarExpr){
			extractCriticalPoints(expr.varExpr.bodyVar, criticalPoints, assocT, assoc, threshold)
		} else if(expr instanceof TerminalExpr){
			if(expr.terminalExpr.expr !== null){
				extractCriticalPoints(expr.terminalExpr.expr, criticalPoints, assocT, assoc, threshold)
			} else if(expr.terminalExpr.term !== null){
				if(assoc.get(expr.terminalExpr.term.name) === null){
					assoc.put(expr.terminalExpr.term.name, expr)
					extractCriticalPoints(assocT.get(expr.terminalExpr.term.name), criticalPoints, assocT, assoc, threshold)
				}
			} 
		}
	}
	
}