package it.unige.dibris.trace_expression_language.validation;

import it.unige.dibris.trace_expression_language.tExp.Expression;
import it.unige.dibris.trace_expression_language.tExp.Term;
import it.unige.dibris.trace_expression_language.tExp.TraceExpression;
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
      String _name = term.getName();
      Expression _expr = term.getExpr();
      assocT.put(_name, _expr);
    }
    for (final Term term_1 : terms) {
      if ((term_1.getName().equals("Main") || term_1.getName().equals("main"))) {
        String _name_1 = term_1.getName();
        assocD.put(_name_1, Integer.valueOf(0));
        Expression _expr_1 = term_1.getExpr();
        return Boolean.valueOf(ContractivenessCheck.isContractive(_expr_1, 0, (-1), assocT, assocD));
      }
    }
    return null;
  }
  
  public static boolean isContractive(final Expression expr, final int depth, final int deepestseq, final HashMap<String, Expression> assocT, final HashMap<String, Integer> assocD) {
    throw new Error("Unresolved compilation problems:"
      + "\nFilterExpr cannot be resolved to a type."
      + "\nSeqExpr cannot be resolved to a type."
      + "\nVarExpr cannot be resolved to a type."
      + "\nTerminalExpr cannot be resolved to a type."
      + "\nThe method or field filterExpr is undefined for the type Expression"
      + "\nThe method or field seqExpr is undefined for the type Expression"
      + "\nThe method or field varExpr is undefined for the type Expression"
      + "\nThe method or field terminalExpr is undefined for the type Expression"
      + "\nThe method or field terminalExpr is undefined for the type Expression"
      + "\nThe method or field terminalExpr is undefined for the type Expression"
      + "\nThe method or field terminalExpr is undefined for the type Expression"
      + "\nThe method or field terminalExpr is undefined for the type Expression"
      + "\nThe method or field terminalExpr is undefined for the type Expression"
      + "\nThe method or field terminalExpr is undefined for the type Expression"
      + "\nThe method or field terminalExpr is undefined for the type Expression"
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nbodyFilter cannot be resolved"
      + "\nbodySeq cannot be resolved"
      + "\nbodyVar cannot be resolved"
      + "\nexpr cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nexpr cannot be resolved"
      + "\nterm cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nterm cannot be resolved"
      + "\nname cannot be resolved"
      + "\nterm cannot be resolved"
      + "\nname cannot be resolved"
      + "\nterm cannot be resolved"
      + "\nname cannot be resolved"
      + "\nterm cannot be resolved"
      + "\nname cannot be resolved"
      + "\neps cannot be resolved"
      + "\n!== cannot be resolved");
  }
}
