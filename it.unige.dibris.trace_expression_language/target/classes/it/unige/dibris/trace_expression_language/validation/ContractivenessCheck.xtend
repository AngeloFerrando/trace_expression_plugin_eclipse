package it.unige.dibris.trace_expression_language.validation

import java.util.HashMap
import java.util.LinkedHashMap
import it.unige.dibris.trace_expression_language.tExp.FilterExpr
import it.unige.dibris.trace_expression_language.tExp.SeqExpr
import it.unige.dibris.trace_expression_language.tExp.VarExpr
import it.unige.dibris.trace_expression_language.tExp.TerminalExpr
import it.unige.dibris.trace_expression_language.tExp.Expression
import it.unige.dibris.trace_expression_language.tExp.UnionExpr
import it.unige.dibris.trace_expression_language.tExp.ShuffleExpr
import it.unige.dibris.trace_expression_language.tExp.CatExpr
import it.unige.dibris.trace_expression_language.tExp.AndExpr
import it.unige.dibris.trace_expression_language.tExp.MsgEventType
import it.unige.dibris.trace_expression_language.tExp.TraceExpression
import it.unige.dibris.trace_expression_language.tExp.InteractionTraceExpression

class ContractivenessCheck {
	
	def static isContractive(TraceExpression tExp){
		val terms = tExp.terms
		val assocT = new LinkedHashMap<String, Expression>();
		val assocD = new LinkedHashMap<String, Integer>();
		for(term : terms){
			assocT.put(term.name, term.expr);
		}
		for(term : terms){
			if(term.name.equals("Main") || term.name.equals("main")){
				assocD.put(term.name, 0);
				var threshold = 1.0
				if(tExp instanceof InteractionTraceExpression){
					if(tExp.threshold !== null && tExp.threshold.size > 0){
						threshold = Double.valueOf(tExp.threshold.get(0))
					}
				}
				return isContractive(term.expr, 0, -1, assocT, assocD, threshold)
			}
		}
	}
	
	def static boolean isContractive(Expression expr, int depth, int deepestseq, HashMap<String, Expression> assocT, HashMap<String, Integer> assocD, double threshold){
		if(expr instanceof UnionExpr){
			return isContractive(expr.left, depth + 1, deepestseq, assocT, assocD, threshold) 
					&& isContractive(expr.right, depth + 1, deepestseq, assocT, assocD, threshold)
		} else if(expr instanceof ShuffleExpr){
			return isContractive(expr.left, depth + 1, deepestseq, assocT, assocD, threshold) 
					&& isContractive(expr.right, depth + 1, deepestseq, assocT, assocD, threshold)
		} else if(expr instanceof AndExpr){
			return isContractive(expr.left, depth + 1, deepestseq, assocT, assocD, threshold) 
					&& isContractive(expr.right, depth + 1, deepestseq, assocT, assocD, threshold)
		} else if(expr instanceof CatExpr){
			var b = isContractive(expr.left, depth + 1, deepestseq, assocT, assocD, threshold)
			if(MonitoringSafePartitionCheck.mayHalt(expr.left, assocT, new HashMap<String, Expression>())){
				return b && isContractive(expr.right, depth + 1, deepestseq, assocT, assocD, threshold)
			} else{
				return b && isContractive(expr.right, depth + 1, depth, assocT, assocD, threshold) 
			} 
		} else if(expr instanceof FilterExpr){
			return isContractive(expr.filterExpr.bodyFilter, depth + 1, deepestseq, assocT, assocD, threshold)
		} else if(expr.typeFilter !== null && expr.bodyFilter !== null){
			return isContractive(expr.bodyFilter, depth + 1, deepestseq, assocT, assocD, threshold)
		} else if(expr instanceof SeqExpr){
			if(expr.seqExpr.typeSeq instanceof MsgEventType) {
				var msgEv = expr.seqExpr.typeSeq as MsgEventType
				if (msgEv.channel !== null && msgEv.channel.reliability !== null || Double.valueOf(msgEv.channel.reliability) < threshold)
					return isContractive(expr.seqExpr.bodySeq, depth + 1, deepestseq, assocT, assocD, threshold)
			} 
			return isContractive(expr.seqExpr.bodySeq, depth + 1, depth, assocT, assocD, threshold)
		} 
		//else if(expr.typeSeq !== null && expr.bodySeq !== null){
		//	return isContractive(expr.bodySeq, depth + 1, depth, assocT, assocD, threshold)
		//}
		else if(expr instanceof VarExpr){
			return isContractive(expr.varExpr.bodyVar, depth + 1, deepestseq, assocT, assocD, threshold)
		} else if(expr instanceof TerminalExpr){
			if(expr.terminalExpr.expr !== null){
				return isContractive(expr.terminalExpr.expr, depth, deepestseq, assocT, assocD, threshold)
				/*var e = expr as Expression
				var previous = e
				while(e instanceof TerminalExpr && (e as TerminalExpr).terminalExpr !== null){
					e = (e as TerminalExpr).terminalExpr
					while(e !== null){
						previous = e
						e = e.expr
					}
					e = previous
				}
				if(e.term !== null){
					if(assocD.get(e.term.name) !== null){
						return assocD.get(e.term.name) <= deepestseq
					}
					assocD.put(e.term.name, depth)
					return isContractive(assocT.get(e.term.name), depth, deepestseq, assocT, assocD)
				} else if(e.eps !== null){
					return true;
				} else{
					return false;
				}*/
			} else{
				if(expr.terminalExpr.term !== null){
					if(assocD.get(expr.terminalExpr.term.name) !== null){
						return assocD.get(expr.terminalExpr.term.name) <= deepestseq
					}
					var assocDcopy = new HashMap<String, Integer>(assocD)
					assocDcopy.put(expr.terminalExpr.term.name, depth)
					return isContractive(assocT.get(expr.terminalExpr.term.name), depth, deepestseq, assocT, assocDcopy, threshold)
				} else if(expr.terminalExpr.eps !== null){
					return true;
				} else{
					return false;
				}
			}
		} else if(expr.term !== null){
			if(assocD.get(expr.term.name) !== null){
					return assocD.get(expr.term.name) <= deepestseq
				}
				var assocDcopy = new HashMap<String, Integer>(assocD)
				assocDcopy.put(expr.term.name, depth)
				return isContractive(assocT.get(expr.term.name), depth, deepestseq, assocT, assocDcopy, threshold)
		} else if(expr.eps !== null){
			return true;
		} else{
			return false
		}
	}
	
}