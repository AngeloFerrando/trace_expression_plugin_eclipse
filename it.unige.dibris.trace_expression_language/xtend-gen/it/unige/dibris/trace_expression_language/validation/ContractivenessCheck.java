package it.unige.dibris.trace_expression_language.validation;

import it.unige.dibris.trace_expression_language.tExp.AndExpr;
import it.unige.dibris.trace_expression_language.tExp.CatExpr;
import it.unige.dibris.trace_expression_language.tExp.Expression;
import it.unige.dibris.trace_expression_language.tExp.FilterExpr;
import it.unige.dibris.trace_expression_language.tExp.SeqExpr;
import it.unige.dibris.trace_expression_language.tExp.ShuffleExpr;
import it.unige.dibris.trace_expression_language.tExp.Term;
import it.unige.dibris.trace_expression_language.tExp.TerminalExpr;
import it.unige.dibris.trace_expression_language.tExp.TraceExpression;
import it.unige.dibris.trace_expression_language.tExp.UnionExpr;
import it.unige.dibris.trace_expression_language.tExp.VarExpr;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ContractivenessCheck {
  public static Boolean isContractive(final TraceExpression tExp) {
    final EList<Term> terms = tExp.getTerms();
    final LinkedHashMap<String, Expression> assocT = new LinkedHashMap<String, Expression>();
    final LinkedHashMap<String, Integer> assocD = new LinkedHashMap<String, Integer>();
    for (final Term term : terms) {
      assocT.put(term.getName(), term.getExpr());
    }
    for (final Term term_1 : terms) {
      if ((term_1.getName().equals("Main") || term_1.getName().equals("main"))) {
        assocD.put(term_1.getName(), Integer.valueOf(0));
        return Boolean.valueOf(ContractivenessCheck.isContractive(term_1.getExpr(), 0, (-1), assocT, assocD));
      }
    }
    return null;
  }
  
  public static boolean isContractive(final Expression expr, final int depth, final int deepestseq, final HashMap<String, Expression> assocT, final HashMap<String, Integer> assocD) {
    if ((expr instanceof UnionExpr)) {
      return (ContractivenessCheck.isContractive(((UnionExpr)expr).getLeft(), (depth + 1), deepestseq, assocT, assocD) && ContractivenessCheck.isContractive(((UnionExpr)expr).getRight(), (depth + 1), deepestseq, assocT, assocD));
    } else {
      if ((expr instanceof ShuffleExpr)) {
        return (ContractivenessCheck.isContractive(((ShuffleExpr)expr).getLeft(), (depth + 1), deepestseq, assocT, assocD) && ContractivenessCheck.isContractive(((ShuffleExpr)expr).getRight(), (depth + 1), deepestseq, assocT, assocD));
      } else {
        if ((expr instanceof AndExpr)) {
          return (ContractivenessCheck.isContractive(((AndExpr)expr).getLeft(), (depth + 1), deepestseq, assocT, assocD) && ContractivenessCheck.isContractive(((AndExpr)expr).getRight(), (depth + 1), deepestseq, assocT, assocD));
        } else {
          if ((expr instanceof CatExpr)) {
            return (ContractivenessCheck.isContractive(((CatExpr)expr).getLeft(), (depth + 1), deepestseq, assocT, assocD) && ContractivenessCheck.isContractive(((CatExpr)expr).getRight(), (depth + 1), deepestseq, assocT, assocD));
          } else {
            if ((expr instanceof FilterExpr)) {
              return ContractivenessCheck.isContractive(((FilterExpr)expr).getFilterExpr().getBodyFilter(), (depth + 1), deepestseq, assocT, assocD);
            } else {
              if (((expr.getTypeFilter() != null) && (expr.getBodyFilter() != null))) {
                return ContractivenessCheck.isContractive(expr.getBodyFilter(), (depth + 1), deepestseq, assocT, assocD);
              } else {
                if ((expr instanceof SeqExpr)) {
                  return ContractivenessCheck.isContractive(((SeqExpr)expr).getSeqExpr().getBodySeq(), (depth + 1), depth, assocT, assocD);
                } else {
                  if (((expr.getTypeSeq() != null) && (expr.getBodySeq() != null))) {
                    return ContractivenessCheck.isContractive(expr.getBodySeq(), (depth + 1), depth, assocT, assocD);
                  } else {
                    if ((expr instanceof VarExpr)) {
                      return ContractivenessCheck.isContractive(((VarExpr)expr).getVarExpr().getBodyVar(), (depth + 1), depth, assocT, assocD);
                    } else {
                      if ((expr instanceof TerminalExpr)) {
                        Expression _expr = ((TerminalExpr)expr).getTerminalExpr().getExpr();
                        boolean _tripleNotEquals = (_expr != null);
                        if (_tripleNotEquals) {
                          return ContractivenessCheck.isContractive(((TerminalExpr)expr).getTerminalExpr().getExpr(), depth, deepestseq, assocT, assocD);
                        } else {
                          Term _term = ((TerminalExpr)expr).getTerminalExpr().getTerm();
                          boolean _tripleNotEquals_1 = (_term != null);
                          if (_tripleNotEquals_1) {
                            Integer _get = assocD.get(((TerminalExpr)expr).getTerminalExpr().getTerm().getName());
                            boolean _tripleNotEquals_2 = (_get != null);
                            if (_tripleNotEquals_2) {
                              Integer _get_1 = assocD.get(((TerminalExpr)expr).getTerminalExpr().getTerm().getName());
                              return ((_get_1).intValue() <= deepestseq);
                            }
                            assocD.put(((TerminalExpr)expr).getTerminalExpr().getTerm().getName(), Integer.valueOf(depth));
                            return ContractivenessCheck.isContractive(assocT.get(((TerminalExpr)expr).getTerminalExpr().getTerm().getName()), depth, deepestseq, assocT, assocD);
                          } else {
                            String _eps = ((TerminalExpr)expr).getTerminalExpr().getEps();
                            boolean _tripleNotEquals_3 = (_eps != null);
                            if (_tripleNotEquals_3) {
                              return true;
                            } else {
                              return false;
                            }
                          }
                        }
                      } else {
                        Term _term_1 = expr.getTerm();
                        boolean _tripleNotEquals_4 = (_term_1 != null);
                        if (_tripleNotEquals_4) {
                          Integer _get_2 = assocD.get(expr.getTerm().getName());
                          boolean _tripleNotEquals_5 = (_get_2 != null);
                          if (_tripleNotEquals_5) {
                            Integer _get_3 = assocD.get(expr.getTerm().getName());
                            return ((_get_3).intValue() <= deepestseq);
                          }
                          assocD.put(expr.getTerm().getName(), Integer.valueOf(depth));
                          return ContractivenessCheck.isContractive(assocT.get(expr.getTerm().getName()), depth, deepestseq, assocT, assocD);
                        } else {
                          String _eps_1 = expr.getEps();
                          boolean _tripleNotEquals_6 = (_eps_1 != null);
                          if (_tripleNotEquals_6) {
                            return true;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
