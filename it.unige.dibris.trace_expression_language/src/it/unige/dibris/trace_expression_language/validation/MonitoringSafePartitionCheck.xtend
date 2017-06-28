package it.unige.dibris.trace_expression_language.validation

import it.unige.dibris.trace_expression_language.tExp.Expression
import it.unige.dibris.trace_expression_language.tExp.TraceExpression
import java.util.LinkedHashMap
import it.unige.dibris.trace_expression_language.tExp.UnionExpr
import it.unige.dibris.trace_expression_language.tExp.EventType
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
		EventType evType1
		EventType evType2
		Expression expr
	
		new(EventType type, EventType type2, Expression e) {
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
	
	def static isMonitoringSafe(TraceExpression tExp){
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
									for(msg : cp.evType1.msgs){
										if(r.name == msg.sender.name || r.name == msg.receiver.name){
											solvedL = true
										}
									}
									for(msg : cp.evType2.msgs){
										if(r.name == msg.sender.name || r.name == msg.receiver.name){
											solvedR = true
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
			return false
		} else if(expr instanceof FilterExpr){
			return mayHalt(expr.bodyFilter, assocT, assoc)
		} else{
			return false
		}
	}
	
	def static List<EventType> firstEventTypes(Expression expr, HashMap<String, Expression> assocT, HashMap<String, Expression> assoc, double threshold){
		if(expr instanceof TerminalExpr){
			if(expr.terminalExpr.expr !== null){
				return firstEventTypes(expr.terminalExpr.expr, assocT, assoc, threshold)
			}
			if(expr.terminalExpr.term !== null){
				if(assoc.get(expr.terminalExpr.term.name) !== null){
					return new ArrayList<EventType>()
				}
				assoc.put(expr.terminalExpr.term.name, expr)
				return firstEventTypes(assocT.get(expr.terminalExpr.term.name), assocT, assoc, threshold)
			} else{
				return new ArrayList<EventType>()
			}
		} else if(expr instanceof ShuffleExpr){
			var evTypes1 = firstEventTypes(expr.left, assocT, assoc, threshold)
			var evTypes2 = firstEventTypes(expr.right, assocT, assoc, threshold)
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
			var evTypes1 = firstEventTypes(expr.left, assocT, assoc, threshold)
			var evTypes2 = firstEventTypes(expr.right, assocT, assoc, threshold)
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
			var evTypes1 = firstEventTypes(expr.left, assocT, assoc, threshold)
			var evTypes2 = firstEventTypes(expr.right, assocT, assoc, threshold)
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
				var evTypes1 = firstEventTypes(expr.left, assocT, assoc, threshold)
				var evTypes2 = firstEventTypes(expr.right, assocT, assoc, threshold)
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
				var evTypes1 = firstEventTypes(expr.left, assocT, assoc, threshold)
				return evTypes1
			}
			
		} else if(expr instanceof SeqExpr){
			if(expr.seqExpr.typeSeq.channel === null || Double.valueOf(expr.seqExpr.typeSeq.channel.reliability) >= threshold){
				var eventTypes = new ArrayList<EventType>()
				eventTypes.add(expr.seqExpr.typeSeq)
				return eventTypes
			} else{
				return firstEventTypes(expr.seqExpr.bodySeq, assocT, assoc, threshold)
			}
		} else if(expr instanceof FilterExpr){
			return firstEventTypes(expr.filterExpr.bodyFilter, assocT, assoc, threshold)
		} else if(expr instanceof VarExpr){
			return firstEventTypes(expr.varExpr.bodyVar, assocT, assoc, threshold)
		} else{
			return new ArrayList<EventType>()
		}
	}
	
	def static List<EventType> lastEventTypes(Expression expr, HashMap<String, Expression> assocT, HashMap<String, Expression> assoc, double threshold){
		if(expr instanceof TerminalExpr){
			if(expr.terminalExpr.expr !== null){
				return lastEventTypes(expr.terminalExpr.expr, assocT, assoc, threshold)
			}
			if(expr.terminalExpr.term !== null){
				if(assoc.get(expr.terminalExpr.term.name) !== null){
					return new ArrayList<EventType>()
				}
				assoc.put(expr.terminalExpr.term.name, expr)
				return lastEventTypes(assocT.get(expr.terminalExpr.term.name), assocT, assoc, threshold)
			} else{
				return new ArrayList<EventType>()
			}
		} else if(expr instanceof ShuffleExpr){
			var evTypes1 = lastEventTypes(expr.left, assocT, assoc, threshold)
			var evTypes2 = lastEventTypes(expr.right, assocT, assoc, threshold)
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
			var evTypes1 = lastEventTypes(expr.left, assocT, assoc, threshold)
			var evTypes2 = lastEventTypes(expr.right, assocT, assoc, threshold)
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
			var evTypes1 = lastEventTypes(expr.left, assocT, assoc, threshold)
			var evTypes2 = lastEventTypes(expr.right, assocT, assoc, threshold)
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
			var evTypes2 = lastEventTypes(expr.right, assocT, assoc, threshold)
			return evTypes2
		} else if(expr instanceof SeqExpr){		
			if(mayHalt(expr.seqExpr.bodySeq, assocT, new HashMap<String, Expression>()) 
				&& (expr.seqExpr.typeSeq.channel === null || Double.valueOf(expr.typeSeq.channel.reliability) >= threshold)){
				var evTypes2 = lastEventTypes(expr.seqExpr.bodySeq, assocT, assoc, threshold)
				var evTypes1 = new ArrayList<EventType>()
				evTypes1.add(expr.seqExpr.typeSeq)
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
			} else{
				return lastEventTypes(expr.seqExpr.bodySeq, assocT, assoc, threshold)
			}
		} else if(expr instanceof FilterExpr){
			return lastEventTypes(expr.filterExpr.bodyFilter, assocT, assoc, threshold)
		} else if(expr instanceof VarExpr){
			return lastEventTypes(expr.varExpr.bodyVar, assocT, assoc, threshold)
		} else{
			return new ArrayList<EventType>()
		}
	}
	
	def static getRolesFromEventType(EventType eventType){
		var roles = new TreeSet<String>();
		for(msg : eventType.msgs){
			if(msg.sender !== null && msg.receiver !== null){
				roles.add(msg.sender.name)
				roles.add(msg.receiver.name)	
			} else if(msg.async_sender !== null){
				roles.add(msg.async_sender.name)
				roles.add(msg.receiver.name)
			} else{
				roles.add(msg.sender.name)
				roles.add(msg.async_receiver.name)
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
			var eventTypes1 = firstEventTypes(expr.left, assocT, new HashMap<String, Expression>(), threshold)
			var eventTypes2 = firstEventTypes(expr.right, assocT, new HashMap<String, Expression>(), threshold)
			for(eventType1 : eventTypes1){
				var found = false
				for(eventType2 : eventTypes2){
					for(r1 : getRolesFromEventType(eventType1)){
						for(r2 : getRolesFromEventType(eventType2)){
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
			var eventTypes1 = lastEventTypes(expr.left, assocT, new HashMap<String, Expression>(), threshold)
			var eventTypes2 = firstEventTypes(expr.right, assocT, new HashMap<String, Expression>(), threshold)
			for(eventType1 : eventTypes1){
				var found = false
				for(eventType2 : eventTypes2){
					for(r1 : getRolesFromEventType(eventType1)){
						for(r2 : getRolesFromEventType(eventType2)){
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
			if(expr.seqExpr.typeSeq.channel === null || Double.valueOf(expr.seqExpr.typeSeq.channel.reliability) >= threshold){
				extractCriticalPoints(expr.seqExpr.bodySeq, criticalPoints, assocT, assoc, threshold)
				var eventTypes1 = new ArrayList<EventType>()
				eventTypes1.add(expr.seqExpr.typeSeq)
				var eventTypes2 = firstEventTypes(expr.seqExpr.bodySeq, assocT, new HashMap<String, Expression>(), threshold)
				for(eventType1 : eventTypes1){
					var found = false
					for(eventType2 : eventTypes2){
						for(r1 : getRolesFromEventType(eventType1)){
							for(r2 : getRolesFromEventType(eventType2)){
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