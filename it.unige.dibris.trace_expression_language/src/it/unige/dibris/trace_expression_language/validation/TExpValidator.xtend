/*
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.validation

import it.unige.dibris.trace_expression_language.tExp.AndExpr
import it.unige.dibris.trace_expression_language.tExp.AtomExpression
import it.unige.dibris.trace_expression_language.tExp.Cardinality
import it.unige.dibris.trace_expression_language.tExp.CatExpr
import it.unige.dibris.trace_expression_language.tExp.Channel
import it.unige.dibris.trace_expression_language.tExp.Constraint
import it.unige.dibris.trace_expression_language.tExp.EventType
import it.unige.dibris.trace_expression_language.tExp.Expression
import it.unige.dibris.trace_expression_language.tExp.FilterExpr
import it.unige.dibris.trace_expression_language.tExp.PrologExpression
import it.unige.dibris.trace_expression_language.tExp.SeqExpr
import it.unige.dibris.trace_expression_language.tExp.ShuffleExpr
import it.unige.dibris.trace_expression_language.tExp.Singletons
import it.unige.dibris.trace_expression_language.tExp.Size
import it.unige.dibris.trace_expression_language.tExp.TraceExpression
import it.unige.dibris.trace_expression_language.tExp.UnionExpr
import it.unige.dibris.trace_expression_language.tExp.VarExpr
import it.unige.dibris.trace_expression_language.tExp.VariableExpression
import java.util.ArrayList
import java.util.List
import java.util.TreeSet
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.validation.Check
import java.util.HashMap
import it.unige.dibris.trace_expression_language.tExp.TerminalExpr

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class TExpValidator extends AbstractTExpValidator {

	public static val MainAbsence = 'Main absence'
	public static val Contractiveness = 'Contractiveness violation'
	public static val FreeVariablesNotUsed = 'Free variable not used'
	public static val WrongNumberArguments = 'Wrong number of arguments'
	public static val FreeVariables = 'Free variables inside the trace expression'
	public static val MessagesConsistency = 'Messages must be consistent'
	public static val MinMax = 'Minimum must be less than maximum'
	public static val OnlyOne = 'Only one field is allowed'
	public static val ConstraintsNotEnabled = 'You have to add the \'decentralized\' field'
	public static val PartitionNotEnabled = 'You have to add the \'decentralized\' field'
	public static val MinimalNotEnabled = 'You have to add the \'decentralized\' field'
	public static val MutuallyExclusive = 'Mutually exclusivenesse violation'
	public static val CriticalPoint = 'Critical Point'
	public static val RoleAbsenceInPartition = 'Role not present inside the chosen partition'
	public static val RangeError = 'Range error'
	public static val HeadNotTerminating = 'Head of a concatenation which cannot terminate'
	

	@Check
	def checkMainPresence(TraceExpression tExp) {
		for(term : tExp.terms){
			if(term.name.equals("Main") || term.name.equals("main")) return
		}
		for(term : tExp.terms){
			val node = NodeModelUtils.findActualNodeFor(term)
			messageAcceptor.acceptError(
		                'You must specify the main term \'Main = ...\'',
		                term,
		                node.offset,
		                node.length,
		                MainAbsence
		            )
    	}
	}
	
	@Check
	def checkConcatenations(TraceExpression tExp){
		val assocT = new HashMap<String, Expression>();
		for(term : tExp.terms){
			assocT.put(term.name, term.expr);
		}
		var threshold = 1.0
		if(tExp.threshold !== null && tExp.threshold.size > 0){
			threshold = Double.valueOf(tExp.threshold.get(0))
		}
		for(term : tExp.terms){
			if(term.name.equals("Main") || term.name.equals("main")){
				checkConcatenationHead(term.expr, assocT, new HashMap<String, Expression>(), threshold)
				return
			}
		}
	}

	def void checkConcatenationHead(Expression expr, HashMap<String, Expression> assocT, HashMap<String, Expression> assoc, double threshold){
		if(expr instanceof VarExpr){
			checkConcatenationHead(expr.varExpr.bodyVar, assocT, assoc, threshold)
		} else if(expr instanceof FilterExpr){
			checkConcatenationHead(expr.filterExpr.bodyFilter, assocT, assoc, threshold)
		} else if(expr.typeFilter !== null && expr.bodyFilter !== null){
			checkConcatenationHead(expr.bodyFilter, assocT, assoc, threshold)
		} else if(expr instanceof SeqExpr){
			checkConcatenationHead(expr.seqExpr.bodySeq, assocT, assoc, threshold)
		} else if(expr.typeSeq !== null && expr.bodySeq !== null){
			checkConcatenationHead(expr.bodySeq, assocT, assoc, threshold)
		} else if(expr instanceof UnionExpr){
			if(expr.left !== null){
				checkConcatenationHead(expr.left, assocT, assoc, threshold)
			} 
			if(expr.right !== null){
				checkConcatenationHead(expr.right, assocT, assoc, threshold)
			}
		} else if(expr instanceof ShuffleExpr){
			if(expr.left !== null){
				checkConcatenationHead(expr.left, assocT, assoc, threshold)
			} 
			if(expr.right !== null){
				checkConcatenationHead(expr.right, assocT, assoc, threshold)
			}
		} else if(expr instanceof AndExpr){
			if(expr.left !== null){
				checkConcatenationHead(expr.left, assocT, assoc, threshold)
			} 
			if(expr.right !== null){
				checkConcatenationHead(expr.right, assocT, assoc, threshold)
			}
		} else if(expr instanceof CatExpr){
			if(expr.left !== null){
				if(!MonitoringSafePartitionCheck.mayHalt(expr.left, assocT, new HashMap<String, Expression>()) && 
					MonitoringSafePartitionCheck.lastEventTypes(expr.left, assocT, new HashMap<String, Expression>(), threshold).size == 0
				){
					val node = NodeModelUtils.findActualNodeFor(expr.left)
					messageAcceptor.acceptWarning(
				                'The head of the concatenation does not terminate, the tail will not ever be consumed',
				                expr.left,
				                node.offset,
				                node.length,
				                HeadNotTerminating
				            )
				}
			} 
			if(expr.right !== null){
				checkConcatenationHead(expr.right, assocT, assoc, threshold)
			}
		} else if(expr instanceof TerminalExpr){
			if(expr.terminalExpr.expr !== null){
				checkConcatenationHead(expr.terminalExpr.expr, assocT, assoc, threshold)
			}
			if(expr.terminalExpr.term !== null){
				if(assoc.get(expr.terminalExpr.term.name) === null){
					assoc.put(expr.terminalExpr.term.name, expr)
					checkConcatenationHead(assocT.get(expr.terminalExpr.term.name), assocT, assoc, threshold)
				}
			} 
		}
	}
	
	@Check
	def checkSeqFilterExpr(Expression expr){
		var count = 0
		
		var seqExpr = null as Expression
		
		if(expr instanceof SeqExpr){
			seqExpr = expr.seqExpr
		}
		else if(expr.typeSeq !== null && expr.bodySeq !== null){
			seqExpr = expr
		}
		
		var filterExpr = null as Expression
		
		if(expr instanceof FilterExpr){
			filterExpr = expr.filterExpr
		}
		else if(expr.typeFilter !== null && expr.bodyFilter !== null){
			filterExpr = expr
		}
		
		if(seqExpr !== null){
			if(seqExpr.typeSeq.expr !== null){
				count++
			}
			for(e : seqExpr.typeSeq.exprs){
				count++
			}
			if(seqExpr.first !== null){
				count--
			}
			for(e : seqExpr.exprs){
				count--
			}
			if(count != 0){
				val node = NodeModelUtils.findActualNodeFor(seqExpr)
				messageAcceptor.acceptError(
			                'Wrong number of arguments in ' + seqExpr.typeSeq.name,
			                seqExpr,
			                node.offset,
			                node.length,
			                WrongNumberArguments
			            )
			}
		} else if(filterExpr !== null){
			if(filterExpr.typeFilter.expr !== null){
				count++
			}
			for(e : filterExpr.typeFilter.exprs){
				count++
			}
			if(filterExpr.first !== null){
				count--
			}
			for(e : filterExpr.exprs){
				count--
			}
			if(count != 0){
				val node = NodeModelUtils.findActualNodeFor(filterExpr)
				messageAcceptor.acceptError(
			                'Wrong number of arguments in ' + filterExpr.typeFilter.name,
			                filterExpr,
			                node.offset,
			                node.length,
			                WrongNumberArguments
			            )
			}
		}
	}
	
	@Check
	def checkVariablesInsideConditions(EventType eventType){
		var varsET = new ArrayList<String>
		addVariables(eventType.expr, varsET)
		for(expr : eventType.exprs){
			addVariables(eventType.expr, varsET)
		}
		for(msg : eventType.msgs){
			var varsL = new ArrayList<String>
			var varsR = new ArrayList<String>
			
			addVariables(msg.content, varsL)
			addVariables(msg.conditions, varsR)
			
			for(variable : varsET){
				if(!varsL.contains(variable) && !varsR.contains(variable)){
					val node = NodeModelUtils.findActualNodeFor(msg)
					messageAcceptor.acceptWarning(
			                'Free variable ' + variable + ' not used',
			                msg,
			                node.offset,
			                node.length,
			                FreeVariablesNotUsed
			            )
		            return
				}
			}
		}
	}
	
	def void addVariables(PrologExpression expr, List<String> vars){
		if(expr === null){
			return
		}
		if(expr instanceof VariableExpression){
			vars.add(expr.name)
		}else if(expr instanceof AtomExpression){
			if(expr.terms !== null){
				addVariables(expr.terms, vars)
			} 
		} else{
			if(expr.left !== null){
				addVariables(expr.left, vars)
			} 
			if(expr.right !== null){
				addVariables(expr.right, vars)
			}
		}
	}
	
	def void checkBoundedVariables(Expression expr, List<String> vars){
		if(expr === null){
			return
		}
		if(expr instanceof VarExpr){
			checkBoundedVariables(expr.varExpr.bodyVar, vars)
			vars.remove(expr.varExpr.variable)
		} else if(expr instanceof FilterExpr){
			checkBoundedVariables(expr.filterExpr.bodyFilter, vars)
			addVariables(expr.filterExpr.first, vars)
			for(e : expr.filterExpr.exprs){
				addVariables(e, vars)
			}
		} else if(expr.typeFilter !== null && expr.bodyFilter !== null){
			checkBoundedVariables(expr.bodyFilter, vars)
			addVariables(expr.first, vars)
			for(e : expr.exprs){
				addVariables(e, vars)
			}
		} else if(expr instanceof SeqExpr){
			checkBoundedVariables(expr.seqExpr.bodySeq, vars)
			addVariables(expr.seqExpr.first, vars)
			for(e : expr.seqExpr.exprs){
				addVariables(e, vars)
			}
		} else if(expr.typeSeq !== null && expr.bodySeq !== null){
			checkBoundedVariables(expr.bodySeq, vars)
			addVariables(expr.first, vars)
			for(e : expr.exprs){
				addVariables(e, vars)
			}
		} else if(expr instanceof UnionExpr){
			if(expr.left !== null){
				checkBoundedVariables(expr.left, vars)
			} 
			if(expr.right !== null){
				checkBoundedVariables(expr.right, vars)
			}
		} else if(expr instanceof ShuffleExpr){
			if(expr.left !== null){
				checkBoundedVariables(expr.left, vars)
			} 
			if(expr.right !== null){
				checkBoundedVariables(expr.right, vars)
			}
		} else if(expr instanceof AndExpr){
			if(expr.left !== null){
				checkBoundedVariables(expr.left, vars)
			} 
			if(expr.right !== null){
				checkBoundedVariables(expr.right, vars)
			}
		} else if(expr instanceof CatExpr){
			if(expr.left !== null){
				checkBoundedVariables(expr.left, vars)
			} 
			if(expr.right !== null){
				checkBoundedVariables(expr.right, vars)
			}
		}
	}
	
	def areAllAsyncMsgs(TraceExpression tExp){
		for(eventType : tExp.types){
			for(msg : eventType.msgs){
				if(msg.async_sender === null && msg.async_receiver === null){
					return false
				}
			}
		}
		return true
	}
	
	def areAllSyncMsgs(TraceExpression tExp){
		for(eventType : tExp.types){
			for(msg : eventType.msgs){
				if(msg.async_sender !== null || msg.async_receiver !== null){
					return false
				}
			}
		}
		return true
	}
	
	@Check
	def checkMsgsConsistency(TraceExpression tExp){
		val b1 = areAllAsyncMsgs(tExp) 
		val b2 = areAllSyncMsgs(tExp)
		if(b1 && b2 || !b1 && !b2){
			val node = NodeModelUtils.findActualNodeFor(tExp)
			messageAcceptor.acceptError(
		                'Trace expression can contain either all sync messages or all async messages',
		                tExp,
		                node.offset,
		                node.length,
		                MessagesConsistency
		            )
		}
	}
	
	@Check
	def checkSequenceEventTypeConsistency(SeqExpr expr){
		if(!isEventTypeConsistency(expr.seqExpr.typeSeq)){
			val node = NodeModelUtils.findActualNodeFor(expr.seqExpr.typeSeq)
			messageAcceptor.acceptError(
		                'All messages inside the event type must involve the same set of roles',
		                expr.seqExpr.typeSeq,
		                node.offset,
		                node.length,
		                MessagesConsistency
		            )
		}
	}
	
	def isEventTypeConsistency(EventType eventType){
		var roles = new TreeSet<String>()
		for(msg : eventType.msgs){
			if(msg.async_sender !== null){
				roles.add(msg.async_sender.name)
			}
			if(msg.async_receiver !== null){
				roles.add(msg.async_receiver.name)
			}
			if(msg.sender !== null){
				roles.add(msg.sender.name)
			}
			if(msg.receiver !== null){
				roles.add(msg.receiver.name)
			}
		}
		return roles.size <= 2
	}
	
	@Check
	def checkFreeVariables(TraceExpression tExp){
		var freeVars = new ArrayList<String>
		
		for(term : tExp.terms){
			if(term.name.equals("Main") || term.name.equals("main")){
				checkBoundedVariables(term.expr, freeVars)
				if(freeVars.size > 0){
					val node = NodeModelUtils.findActualNodeFor(term)
					messageAcceptor.acceptError(
				                'Trace expression cannot contain free variables',
				                term,
				                node.offset,
				                node.length,
				                FreeVariables
				            )
				}
			} 
		}
	}
	
	@Check
	def checkPartitionCorrectlyEnabled(TraceExpression tExp){
		if((tExp.decentralized === null || tExp.decentralized.size == 0 || tExp.decentralized.get(0) == 'false') && 
			tExp.partition !== null && tExp.partition.size > 0
		){
			val node = NodeModelUtils.findActualNodeFor(tExp.partition.get(0))
				messageAcceptor.acceptWarning(
			                'Partition will not be considered (to enable add \'decentralized: true\')',
			                tExp.partition.get(0),
			                node.offset,
			                node.length,
			                PartitionNotEnabled
			            )
		}
	}
	
	@Check
	def checkContractiveness(TraceExpression tExp){
		if(!ContractivenessCheck.isContractive(tExp)){
			for(term : tExp.terms){
				val node = NodeModelUtils.findActualNodeFor(term)
				messageAcceptor.acceptError(
			                'Trace expression must be contractive',
			                term,
			                node.offset,
			                node.length,
			                Contractiveness
			            )
    		}
		}
	}
	
	@Check
	def checkConstraints(Constraint constraint){
		if(constraint instanceof Singletons){
			if(constraint.minSingletons > constraint.maxSingletons){
				val node = NodeModelUtils.findActualNodeFor(constraint)
				messageAcceptor.acceptError(
			                'min must be less than max',
			                constraint,
			                node.offset,
			                node.length,
			                MinMax
			            )
			}
		} else if(constraint instanceof Size){
			if(constraint.minSize > constraint.maxSize){
				val node = NodeModelUtils.findActualNodeFor(constraint)
				messageAcceptor.acceptError(
			                'min must be less than max',
			                constraint,
			                node.offset,
			                node.length,
			                MinMax
			            )
			}
		} else if(constraint instanceof Cardinality){
			if(constraint.minCardinality > constraint.maxCardinality){
				val node = NodeModelUtils.findActualNodeFor(constraint)
				messageAcceptor.acceptError(
			                'min must be less than max',
			                constraint,
			                node.offset,
			                node.length,
			                MinMax
			            )
			}
		}
	}
	
	@Check
	def checkNoDuplications(TraceExpression tExp){
		if(tExp.bodyL === null || tExp.bodyL.size != 1){
			val node = NodeModelUtils.findActualNodeFor(tExp)
				messageAcceptor.acceptError(
			                'there must be one \'body:\' field',
			                tExp,
			                node.offset,
			                node.length,
			                OnlyOne
			            )
		}
		if(tExp.rolesL === null || tExp.rolesL.size != 1){
			val node = NodeModelUtils.findActualNodeFor(tExp)
				messageAcceptor.acceptError(
			                'there must be one \'roles:\' field',
			                tExp,
			                node.offset,
			                node.length,
			                OnlyOne
			            )
		}
		if(tExp.typesL === null || tExp.typesL.size != 1){
			val node = NodeModelUtils.findActualNodeFor(tExp)
				messageAcceptor.acceptError(
			                'there must be one \'types:\' field',
			                tExp,
			                node.offset,
			                node.length,
			                OnlyOne
			            )
		}
		if(tExp.modules !== null && tExp.modules.size > 1){
			val node = NodeModelUtils.findActualNodeFor(tExp)
				messageAcceptor.acceptError(
			                'there must be at most one \'modules:\' field',
			                tExp,
			                node.offset,
			                node.length,
			                OnlyOne
			            )
		}
		if(tExp.decentralizedL !== null && tExp.decentralizedL.size > 1){
			val node = NodeModelUtils.findActualNodeFor(tExp)
				messageAcceptor.acceptError(
			                'there must be at most one \'decentralized:\' field',
			                tExp,
			                node.offset,
			                node.length,
			                OnlyOne
			            )
		}
		if(tExp.partitionL !== null && tExp.partitionL.size > 1){
			val node = NodeModelUtils.findActualNodeFor(tExp)
				messageAcceptor.acceptError(
			                'there must be at most one \'partition:\' field',
			                tExp,
			                node.offset,
			                node.length,
			                OnlyOne
			            )
		}
		if(tExp.constraintsL !== null && tExp.constraintsL.size > 1){
			val node = NodeModelUtils.findActualNodeFor(tExp)
				messageAcceptor.acceptError(
			                'there must be at most one \'constraints:\' field',
			                tExp,
			                node.offset,
			                node.length,
			                OnlyOne
			            )
		}
		if(tExp.guiL !== null && tExp.guiL.size > 1){
			val node = NodeModelUtils.findActualNodeFor(tExp)
				messageAcceptor.acceptError(
			                'only one \'gui:\' field is allowed',
			                tExp,
			                node.offset,
			                node.length,
			                OnlyOne
			            )
		}
		if(tExp.minimalL !== null && tExp.minimalL.size > 1){
			val node = NodeModelUtils.findActualNodeFor(tExp)
				messageAcceptor.acceptError(
			                'only one \'minimal:\' field is allowed',
			                tExp,
			                node.offset,
			                node.length,
			                OnlyOne
			            )
		}
		if(tExp.thresholdL !== null && tExp.thresholdL.size > 1){
			val node = NodeModelUtils.findActualNodeFor(tExp)
				messageAcceptor.acceptError(
			                'only one \'threshold:\' field is allowed',
			                tExp,
			                node.offset,
			                node.length,
			                OnlyOne
			            )
		}
		if(tExp.channelsL !== null && tExp.channelsL.size > 1){
			val node = NodeModelUtils.findActualNodeFor(tExp)
				messageAcceptor.acceptError(
			                'only one \'channels:\' field is allowed',
			                tExp,
			                node.offset,
			                node.length,
			                OnlyOne
			            )
		}
	}
	
	@Check
	def checkReliabilityRange(Channel channel){
		if(Double.valueOf(channel.reliability) < 0 || Double.valueOf(channel.reliability) > 1){
			val node = NodeModelUtils.findActualNodeFor(channel)
					messageAcceptor.acceptError(
				                'reliability must be between 0 and 1',
				                channel,
				                node.offset,
				                node.length,
				                RangeError
				            )
		}
	}
	
	@Check
	def thresholdMustBePositive(TraceExpression tExp){
		if(tExp.threshold !== null && tExp.threshold.size > 0 && tExp.threshold.get(0).length > 0){
			var d = Double.valueOf(tExp.threshold.get(0))
			if(d < 0 || d > 1){
				val node = NodeModelUtils.findActualNodeFor(tExp)
					messageAcceptor.acceptError(
				                'threshold must be between 0 and 1',
				                tExp,
				                node.offset,
				                node.length,
				                RangeError
				            )
            }
		}
	}
	
	@Check
	def checkConstraintsOnlyIfDecentralized(TraceExpression tExp){
		if((tExp.decentralized === null || tExp.decentralized.size == 0 || tExp.decentralized.get(0) == 'false')
			&& (tExp.constraints !== null && tExp.constraints.size > 0)
		){
			val node = NodeModelUtils.findActualNodeFor(tExp)
				messageAcceptor.acceptWarning(
			                'constraints will not be considered (to enable add \'decentralized: true\')',
			                tExp,
			                node.offset,
			                node.length,
			                ConstraintsNotEnabled
			            )
		}
	}
	
	@Check
	def checkMinimalOnlyIfDecentralized(TraceExpression tExp){
		if((tExp.decentralized === null || tExp.decentralized.size == 0 || tExp.decentralized.get(0) == 'false')
			&& (tExp.minimal !== null && tExp.minimal.size > 0)
		){
			val node = NodeModelUtils.findActualNodeFor(tExp)
				messageAcceptor.acceptWarning(
			                'minimal will not be considered (to enable add \'decentralized: true\')',
			                tExp,
			                node.offset,
			                node.length,
			                MinimalNotEnabled
			            )
		}
	}
	
	@Check
	def checkConstraintsOrPartition(TraceExpression tExp){
		if(tExp.constraints !== null && tExp.constraints.size > 0 &&
			tExp.partition !== null && tExp.partition.size > 0){
				var node = NodeModelUtils.findActualNodeFor(tExp.constraints.get(0))
				messageAcceptor.acceptError(
			                'constraints and partition are mutually exclusive',
			                tExp.constraints.get(0),
			                node.offset,
			                node.length,
			                MutuallyExclusive
			            )
			    node = NodeModelUtils.findActualNodeFor(tExp.partition.get(0))
				messageAcceptor.acceptError(
			                'constraints and partition are mutually exclusive',
			                tExp.constraints.get(0),
			                node.offset,
			                node.length,
			                MutuallyExclusive
			            )
			}
	}
	
	@Check
	def checkMinimalOrPartition(TraceExpression tExp){
		if(tExp.partition !== null && tExp.partition.size > 0 &&
			tExp.minimal !== null && tExp.minimal.size > 0){
				var node = NodeModelUtils.findActualNodeFor(tExp.partition.get(0))
				messageAcceptor.acceptError(
			                'partition and minimal are mutually exclusive',
			                tExp.partition.get(0),
			                node.offset,
			                node.length,
			                MutuallyExclusive
			            )
			}
	}
	
	@Check
	def criticalPointsTest(TraceExpression tExp){
		if(tExp.decentralized !== null && tExp.decentralized.size > 0 && 
			tExp.decentralized.get(0) == 'true' && tExp.partition !== null && tExp.partition.size > 0
		){
			var criticalPoints = MonitoringSafePartitionCheck.isMonitoringSafe(tExp)
			for(cp : criticalPoints){
				val node = NodeModelUtils.findActualNodeFor(cp.expr)
				messageAcceptor.acceptError(
			                'Critical point not handled by the chosen partition: (' + cp.evType1.name + ', ' + cp.evType2.name + ')',
			                cp.expr,
			                node.offset,
			                node.length,
			                CriticalPoint
			            )
			}
		}
	}
	
	@Check
	def checkAllRolesInPartition(TraceExpression tExp){
		if(tExp.partition !== null && tExp.partition.size > 0){
			for(role1 : tExp.roles){
				var found = false
				for(group : tExp.partition.get(0).constraints){
					for(role2 : group.roles){
						if(role1.name == role2.name){
							found = true
						}
					}
				}
				if(!found){
					val node = NodeModelUtils.findActualNodeFor(role1)
					messageAcceptor.acceptError(
				                'Role ' + role1.name + ' is not present inside the partition',
				                role1,
				                node.offset,
				                node.length,
				                RoleAbsenceInPartition
				            )
				}
			}
		}
	}
	
}
