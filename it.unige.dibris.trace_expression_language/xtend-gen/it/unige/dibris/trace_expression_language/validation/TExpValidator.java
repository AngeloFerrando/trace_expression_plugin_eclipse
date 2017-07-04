/**
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.validation;

import com.google.common.base.Objects;
import it.unige.dibris.trace_expression_language.tExp.AndExpr;
import it.unige.dibris.trace_expression_language.tExp.AtomExpression;
import it.unige.dibris.trace_expression_language.tExp.Cardinality;
import it.unige.dibris.trace_expression_language.tExp.CatExpr;
import it.unige.dibris.trace_expression_language.tExp.Channel;
import it.unige.dibris.trace_expression_language.tExp.Constraint;
import it.unige.dibris.trace_expression_language.tExp.EventType;
import it.unige.dibris.trace_expression_language.tExp.Expression;
import it.unige.dibris.trace_expression_language.tExp.FilterExpr;
import it.unige.dibris.trace_expression_language.tExp.Msg;
import it.unige.dibris.trace_expression_language.tExp.PrologExpression;
import it.unige.dibris.trace_expression_language.tExp.Role;
import it.unige.dibris.trace_expression_language.tExp.SeqExpr;
import it.unige.dibris.trace_expression_language.tExp.ShuffleExpr;
import it.unige.dibris.trace_expression_language.tExp.Singletons;
import it.unige.dibris.trace_expression_language.tExp.Size;
import it.unige.dibris.trace_expression_language.tExp.Term;
import it.unige.dibris.trace_expression_language.tExp.TerminalExpr;
import it.unige.dibris.trace_expression_language.tExp.Together;
import it.unige.dibris.trace_expression_language.tExp.TraceExpression;
import it.unige.dibris.trace_expression_language.tExp.UnionExpr;
import it.unige.dibris.trace_expression_language.tExp.VarExpr;
import it.unige.dibris.trace_expression_language.tExp.VariableExpression;
import it.unige.dibris.trace_expression_language.validation.AbstractTExpValidator;
import it.unige.dibris.trace_expression_language.validation.ContractivenessCheck;
import it.unige.dibris.trace_expression_language.validation.MonitoringSafePartitionCheck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class TExpValidator extends AbstractTExpValidator {
  public final static String MainAbsence = "Main absence";
  
  public final static String Contractiveness = "Contractiveness violation";
  
  public final static String FreeVariablesNotUsed = "Free variable not used";
  
  public final static String WrongNumberArguments = "Wrong number of arguments";
  
  public final static String FreeVariables = "Free variables inside the trace expression";
  
  public final static String MessagesConsistency = "Messages must be consistent";
  
  public final static String MinMax = "Minimum must be less than maximum";
  
  public final static String OnlyOne = "Only one field is allowed";
  
  public final static String ConstraintsNotEnabled = "You have to add the \'decentralized\' field";
  
  public final static String PartitionNotEnabled = "You have to add the \'decentralized\' field";
  
  public final static String MinimalNotEnabled = "You have to add the \'decentralized\' field";
  
  public final static String MutuallyExclusive = "Mutually exclusivenesse violation";
  
  public final static String CriticalPoint = "Critical Point";
  
  public final static String RoleAbsenceInPartition = "Role not present inside the chosen partition";
  
  public final static String RangeError = "Range error";
  
  public final static String HeadNotTerminating = "Head of a concatenation which cannot terminate";
  
  @Check
  public void checkMainPresence(final TraceExpression tExp) {
    EList<Term> _terms = tExp.getTerms();
    for (final Term term : _terms) {
      if ((term.getName().equals("Main") || term.getName().equals("main"))) {
        return;
      }
    }
    EList<Term> _terms_1 = tExp.getTerms();
    for (final Term term_1 : _terms_1) {
      {
        final ICompositeNode node = NodeModelUtils.findActualNodeFor(term_1);
        this.getMessageAcceptor().acceptError(
          "You must specify the main term \'Main = ...\'", term_1, 
          node.getOffset(), 
          node.getLength(), 
          TExpValidator.MainAbsence);
      }
    }
  }
  
  @Check
  public void checkConcatenations(final TraceExpression tExp) {
    final HashMap<String, Expression> assocT = new HashMap<String, Expression>();
    EList<Term> _terms = tExp.getTerms();
    for (final Term term : _terms) {
      assocT.put(term.getName(), term.getExpr());
    }
    double threshold = 1.0;
    if (((tExp.getThreshold() != null) && (tExp.getThreshold().size() > 0))) {
      threshold = (Double.valueOf(tExp.getThreshold().get(0))).doubleValue();
    }
    EList<Term> _terms_1 = tExp.getTerms();
    for (final Term term_1 : _terms_1) {
      if ((term_1.getName().equals("Main") || term_1.getName().equals("main"))) {
        Expression _expr = term_1.getExpr();
        HashMap<String, Expression> _hashMap = new HashMap<String, Expression>();
        this.checkConcatenationHead(_expr, assocT, _hashMap, threshold);
        return;
      }
    }
  }
  
  public void checkConcatenationHead(final Expression expr, final HashMap<String, Expression> assocT, final HashMap<String, Expression> assoc, final double threshold) {
    if ((expr instanceof VarExpr)) {
      this.checkConcatenationHead(((VarExpr)expr).getVarExpr().getBodyVar(), assocT, assoc, threshold);
    } else {
      if ((expr instanceof FilterExpr)) {
        this.checkConcatenationHead(((FilterExpr)expr).getFilterExpr().getBodyFilter(), assocT, assoc, threshold);
      } else {
        if (((expr.getTypeFilter() != null) && (expr.getBodyFilter() != null))) {
          this.checkConcatenationHead(expr.getBodyFilter(), assocT, assoc, threshold);
        } else {
          if ((expr instanceof SeqExpr)) {
            this.checkConcatenationHead(((SeqExpr)expr).getSeqExpr().getBodySeq(), assocT, assoc, threshold);
          } else {
            if (((expr.getTypeSeq() != null) && (expr.getBodySeq() != null))) {
              this.checkConcatenationHead(expr.getBodySeq(), assocT, assoc, threshold);
            } else {
              if ((expr instanceof UnionExpr)) {
                Expression _left = ((UnionExpr)expr).getLeft();
                boolean _tripleNotEquals = (_left != null);
                if (_tripleNotEquals) {
                  this.checkConcatenationHead(((UnionExpr)expr).getLeft(), assocT, assoc, threshold);
                }
                Expression _right = ((UnionExpr)expr).getRight();
                boolean _tripleNotEquals_1 = (_right != null);
                if (_tripleNotEquals_1) {
                  this.checkConcatenationHead(((UnionExpr)expr).getRight(), assocT, assoc, threshold);
                }
              } else {
                if ((expr instanceof ShuffleExpr)) {
                  Expression _left_1 = ((ShuffleExpr)expr).getLeft();
                  boolean _tripleNotEquals_2 = (_left_1 != null);
                  if (_tripleNotEquals_2) {
                    this.checkConcatenationHead(((ShuffleExpr)expr).getLeft(), assocT, assoc, threshold);
                  }
                  Expression _right_1 = ((ShuffleExpr)expr).getRight();
                  boolean _tripleNotEquals_3 = (_right_1 != null);
                  if (_tripleNotEquals_3) {
                    this.checkConcatenationHead(((ShuffleExpr)expr).getRight(), assocT, assoc, threshold);
                  }
                } else {
                  if ((expr instanceof AndExpr)) {
                    Expression _left_2 = ((AndExpr)expr).getLeft();
                    boolean _tripleNotEquals_4 = (_left_2 != null);
                    if (_tripleNotEquals_4) {
                      this.checkConcatenationHead(((AndExpr)expr).getLeft(), assocT, assoc, threshold);
                    }
                    Expression _right_2 = ((AndExpr)expr).getRight();
                    boolean _tripleNotEquals_5 = (_right_2 != null);
                    if (_tripleNotEquals_5) {
                      this.checkConcatenationHead(((AndExpr)expr).getRight(), assocT, assoc, threshold);
                    }
                  } else {
                    if ((expr instanceof CatExpr)) {
                      Expression _left_3 = ((CatExpr)expr).getLeft();
                      boolean _tripleNotEquals_6 = (_left_3 != null);
                      if (_tripleNotEquals_6) {
                        if (((!MonitoringSafePartitionCheck.mayHalt(((CatExpr)expr).getLeft(), assocT, new HashMap<String, Expression>())) && 
                          (MonitoringSafePartitionCheck.lastEventTypes(((CatExpr)expr).getLeft(), assocT, new HashMap<String, Expression>(), threshold).size() == 0))) {
                          final ICompositeNode node = NodeModelUtils.findActualNodeFor(((CatExpr)expr).getLeft());
                          this.getMessageAcceptor().acceptWarning(
                            "The head of the concatenation does not terminate, the tail will not ever be consumed", 
                            ((CatExpr)expr).getLeft(), 
                            node.getOffset(), 
                            node.getLength(), 
                            TExpValidator.HeadNotTerminating);
                        }
                      }
                      Expression _right_3 = ((CatExpr)expr).getRight();
                      boolean _tripleNotEquals_7 = (_right_3 != null);
                      if (_tripleNotEquals_7) {
                        this.checkConcatenationHead(((CatExpr)expr).getRight(), assocT, assoc, threshold);
                      }
                    } else {
                      if ((expr instanceof TerminalExpr)) {
                        Expression _expr = ((TerminalExpr)expr).getTerminalExpr().getExpr();
                        boolean _tripleNotEquals_8 = (_expr != null);
                        if (_tripleNotEquals_8) {
                          this.checkConcatenationHead(((TerminalExpr)expr).getTerminalExpr().getExpr(), assocT, assoc, threshold);
                        }
                        Term _term = ((TerminalExpr)expr).getTerminalExpr().getTerm();
                        boolean _tripleNotEquals_9 = (_term != null);
                        if (_tripleNotEquals_9) {
                          Expression _get = assoc.get(((TerminalExpr)expr).getTerminalExpr().getTerm().getName());
                          boolean _tripleEquals = (_get == null);
                          if (_tripleEquals) {
                            assoc.put(((TerminalExpr)expr).getTerminalExpr().getTerm().getName(), expr);
                            this.checkConcatenationHead(assocT.get(((TerminalExpr)expr).getTerminalExpr().getTerm().getName()), assocT, assoc, threshold);
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
  
  @Check
  public void checkSeqFilterExpr(final Expression expr) {
    int count = 0;
    Expression seqExpr = ((Expression) null);
    if ((expr instanceof SeqExpr)) {
      seqExpr = ((SeqExpr)expr).getSeqExpr();
    } else {
      if (((expr.getTypeSeq() != null) && (expr.getBodySeq() != null))) {
        seqExpr = expr;
      }
    }
    Expression filterExpr = ((Expression) null);
    if ((expr instanceof FilterExpr)) {
      filterExpr = ((FilterExpr)expr).getFilterExpr();
    } else {
      if (((expr.getTypeFilter() != null) && (expr.getBodyFilter() != null))) {
        filterExpr = expr;
      }
    }
    if ((seqExpr != null)) {
      PrologExpression _expr = seqExpr.getTypeSeq().getExpr();
      boolean _tripleNotEquals = (_expr != null);
      if (_tripleNotEquals) {
        count++;
      }
      EList<PrologExpression> _exprs = seqExpr.getTypeSeq().getExprs();
      for (final PrologExpression e : _exprs) {
        count++;
      }
      PrologExpression _first = seqExpr.getFirst();
      boolean _tripleNotEquals_1 = (_first != null);
      if (_tripleNotEquals_1) {
        count--;
      }
      EList<PrologExpression> _exprs_1 = seqExpr.getExprs();
      for (final PrologExpression e_1 : _exprs_1) {
        count--;
      }
      if ((count != 0)) {
        final ICompositeNode node = NodeModelUtils.findActualNodeFor(seqExpr);
        ValidationMessageAcceptor _messageAcceptor = this.getMessageAcceptor();
        String _name = seqExpr.getTypeSeq().getName();
        String _plus = ("Wrong number of arguments in " + _name);
        _messageAcceptor.acceptError(_plus, seqExpr, 
          node.getOffset(), 
          node.getLength(), 
          TExpValidator.WrongNumberArguments);
      }
    } else {
      if ((filterExpr != null)) {
        PrologExpression _expr_1 = filterExpr.getTypeFilter().getExpr();
        boolean _tripleNotEquals_2 = (_expr_1 != null);
        if (_tripleNotEquals_2) {
          count++;
        }
        EList<PrologExpression> _exprs_2 = filterExpr.getTypeFilter().getExprs();
        for (final PrologExpression e_2 : _exprs_2) {
          count++;
        }
        PrologExpression _first_1 = filterExpr.getFirst();
        boolean _tripleNotEquals_3 = (_first_1 != null);
        if (_tripleNotEquals_3) {
          count--;
        }
        EList<PrologExpression> _exprs_3 = filterExpr.getExprs();
        for (final PrologExpression e_3 : _exprs_3) {
          count--;
        }
        if ((count != 0)) {
          final ICompositeNode node_1 = NodeModelUtils.findActualNodeFor(filterExpr);
          ValidationMessageAcceptor _messageAcceptor_1 = this.getMessageAcceptor();
          String _name_1 = filterExpr.getTypeFilter().getName();
          String _plus_1 = ("Wrong number of arguments in " + _name_1);
          _messageAcceptor_1.acceptError(_plus_1, filterExpr, 
            node_1.getOffset(), 
            node_1.getLength(), 
            TExpValidator.WrongNumberArguments);
        }
      }
    }
  }
  
  @Check
  public void checkVariablesInsideConditions(final EventType eventType) {
    ArrayList<String> varsET = new ArrayList<String>();
    this.addVariables(eventType.getExpr(), varsET);
    EList<PrologExpression> _exprs = eventType.getExprs();
    for (final PrologExpression expr : _exprs) {
      this.addVariables(eventType.getExpr(), varsET);
    }
    EList<Msg> _msgs = eventType.getMsgs();
    for (final Msg msg : _msgs) {
      {
        ArrayList<String> varsL = new ArrayList<String>();
        ArrayList<String> varsR = new ArrayList<String>();
        this.addVariables(msg.getContent(), varsL);
        this.addVariables(msg.getConditions(), varsR);
        for (final String variable : varsET) {
          if (((!varsL.contains(variable)) && (!varsR.contains(variable)))) {
            final ICompositeNode node = NodeModelUtils.findActualNodeFor(msg);
            this.getMessageAcceptor().acceptWarning(
              (("Free variable " + variable) + " not used"), msg, 
              node.getOffset(), 
              node.getLength(), 
              TExpValidator.FreeVariablesNotUsed);
            return;
          }
        }
      }
    }
  }
  
  public void addVariables(final PrologExpression expr, final List<String> vars) {
    if ((expr == null)) {
      return;
    }
    if ((expr instanceof VariableExpression)) {
      vars.add(((VariableExpression)expr).getName());
    } else {
      if ((expr instanceof AtomExpression)) {
        PrologExpression _terms = ((AtomExpression)expr).getTerms();
        boolean _tripleNotEquals = (_terms != null);
        if (_tripleNotEquals) {
          this.addVariables(((AtomExpression)expr).getTerms(), vars);
        }
      } else {
        PrologExpression _left = expr.getLeft();
        boolean _tripleNotEquals_1 = (_left != null);
        if (_tripleNotEquals_1) {
          this.addVariables(expr.getLeft(), vars);
        }
        PrologExpression _right = expr.getRight();
        boolean _tripleNotEquals_2 = (_right != null);
        if (_tripleNotEquals_2) {
          this.addVariables(expr.getRight(), vars);
        }
      }
    }
  }
  
  public void checkBoundedVariables(final Expression expr, final List<String> vars) {
    if ((expr == null)) {
      return;
    }
    if ((expr instanceof VarExpr)) {
      this.checkBoundedVariables(((VarExpr)expr).getVarExpr().getBodyVar(), vars);
      vars.remove(((VarExpr)expr).getVarExpr().getVariable());
    } else {
      if ((expr instanceof FilterExpr)) {
        this.checkBoundedVariables(((FilterExpr)expr).getFilterExpr().getBodyFilter(), vars);
        this.addVariables(((FilterExpr)expr).getFilterExpr().getFirst(), vars);
        EList<PrologExpression> _exprs = ((FilterExpr)expr).getFilterExpr().getExprs();
        for (final PrologExpression e : _exprs) {
          this.addVariables(e, vars);
        }
      } else {
        if (((expr.getTypeFilter() != null) && (expr.getBodyFilter() != null))) {
          this.checkBoundedVariables(expr.getBodyFilter(), vars);
          this.addVariables(expr.getFirst(), vars);
          EList<PrologExpression> _exprs_1 = expr.getExprs();
          for (final PrologExpression e_1 : _exprs_1) {
            this.addVariables(e_1, vars);
          }
        } else {
          if ((expr instanceof SeqExpr)) {
            this.checkBoundedVariables(((SeqExpr)expr).getSeqExpr().getBodySeq(), vars);
            this.addVariables(((SeqExpr)expr).getSeqExpr().getFirst(), vars);
            EList<PrologExpression> _exprs_2 = ((SeqExpr)expr).getSeqExpr().getExprs();
            for (final PrologExpression e_2 : _exprs_2) {
              this.addVariables(e_2, vars);
            }
          } else {
            if (((expr.getTypeSeq() != null) && (expr.getBodySeq() != null))) {
              this.checkBoundedVariables(expr.getBodySeq(), vars);
              this.addVariables(expr.getFirst(), vars);
              EList<PrologExpression> _exprs_3 = expr.getExprs();
              for (final PrologExpression e_3 : _exprs_3) {
                this.addVariables(e_3, vars);
              }
            } else {
              if ((expr instanceof UnionExpr)) {
                Expression _left = ((UnionExpr)expr).getLeft();
                boolean _tripleNotEquals = (_left != null);
                if (_tripleNotEquals) {
                  this.checkBoundedVariables(((UnionExpr)expr).getLeft(), vars);
                }
                Expression _right = ((UnionExpr)expr).getRight();
                boolean _tripleNotEquals_1 = (_right != null);
                if (_tripleNotEquals_1) {
                  this.checkBoundedVariables(((UnionExpr)expr).getRight(), vars);
                }
              } else {
                if ((expr instanceof ShuffleExpr)) {
                  Expression _left_1 = ((ShuffleExpr)expr).getLeft();
                  boolean _tripleNotEquals_2 = (_left_1 != null);
                  if (_tripleNotEquals_2) {
                    this.checkBoundedVariables(((ShuffleExpr)expr).getLeft(), vars);
                  }
                  Expression _right_1 = ((ShuffleExpr)expr).getRight();
                  boolean _tripleNotEquals_3 = (_right_1 != null);
                  if (_tripleNotEquals_3) {
                    this.checkBoundedVariables(((ShuffleExpr)expr).getRight(), vars);
                  }
                } else {
                  if ((expr instanceof AndExpr)) {
                    Expression _left_2 = ((AndExpr)expr).getLeft();
                    boolean _tripleNotEquals_4 = (_left_2 != null);
                    if (_tripleNotEquals_4) {
                      this.checkBoundedVariables(((AndExpr)expr).getLeft(), vars);
                    }
                    Expression _right_2 = ((AndExpr)expr).getRight();
                    boolean _tripleNotEquals_5 = (_right_2 != null);
                    if (_tripleNotEquals_5) {
                      this.checkBoundedVariables(((AndExpr)expr).getRight(), vars);
                    }
                  } else {
                    if ((expr instanceof CatExpr)) {
                      Expression _left_3 = ((CatExpr)expr).getLeft();
                      boolean _tripleNotEquals_6 = (_left_3 != null);
                      if (_tripleNotEquals_6) {
                        this.checkBoundedVariables(((CatExpr)expr).getLeft(), vars);
                      }
                      Expression _right_3 = ((CatExpr)expr).getRight();
                      boolean _tripleNotEquals_7 = (_right_3 != null);
                      if (_tripleNotEquals_7) {
                        this.checkBoundedVariables(((CatExpr)expr).getRight(), vars);
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
  
  public boolean areAllAsyncMsgs(final TraceExpression tExp) {
    EList<EventType> _types = tExp.getTypes();
    for (final EventType eventType : _types) {
      EList<Msg> _msgs = eventType.getMsgs();
      for (final Msg msg : _msgs) {
        if (((msg.getAsync_sender() == null) && (msg.getAsync_receiver() == null))) {
          return false;
        }
      }
    }
    return true;
  }
  
  public boolean areAllSyncMsgs(final TraceExpression tExp) {
    EList<EventType> _types = tExp.getTypes();
    for (final EventType eventType : _types) {
      EList<Msg> _msgs = eventType.getMsgs();
      for (final Msg msg : _msgs) {
        if (((msg.getAsync_sender() != null) || (msg.getAsync_receiver() != null))) {
          return false;
        }
      }
    }
    return true;
  }
  
  @Check
  public void checkMsgsConsistency(final TraceExpression tExp) {
    final boolean b1 = this.areAllAsyncMsgs(tExp);
    final boolean b2 = this.areAllSyncMsgs(tExp);
    if (((b1 && b2) || ((!b1) && (!b2)))) {
      final ICompositeNode node = NodeModelUtils.findActualNodeFor(tExp);
      this.getMessageAcceptor().acceptError(
        "Trace expression can contain either all sync messages or all async messages", tExp, 
        node.getOffset(), 
        node.getLength(), 
        TExpValidator.MessagesConsistency);
    }
  }
  
  @Check
  public void checkSequenceEventTypeConsistency(final SeqExpr expr) {
    boolean _isEventTypeConsistency = this.isEventTypeConsistency(expr.getSeqExpr().getTypeSeq());
    boolean _not = (!_isEventTypeConsistency);
    if (_not) {
      final ICompositeNode node = NodeModelUtils.findActualNodeFor(expr.getSeqExpr().getTypeSeq());
      this.getMessageAcceptor().acceptError(
        "All messages inside the event type must involve the same set of roles", 
        expr.getSeqExpr().getTypeSeq(), 
        node.getOffset(), 
        node.getLength(), 
        TExpValidator.MessagesConsistency);
    }
  }
  
  public boolean isEventTypeConsistency(final EventType eventType) {
    TreeSet<String> roles = new TreeSet<String>();
    EList<Msg> _msgs = eventType.getMsgs();
    for (final Msg msg : _msgs) {
      {
        Role _async_sender = msg.getAsync_sender();
        boolean _tripleNotEquals = (_async_sender != null);
        if (_tripleNotEquals) {
          roles.add(msg.getAsync_sender().getName());
        }
        Role _async_receiver = msg.getAsync_receiver();
        boolean _tripleNotEquals_1 = (_async_receiver != null);
        if (_tripleNotEquals_1) {
          roles.add(msg.getAsync_receiver().getName());
        }
        Role _sender = msg.getSender();
        boolean _tripleNotEquals_2 = (_sender != null);
        if (_tripleNotEquals_2) {
          roles.add(msg.getSender().getName());
        }
        Role _receiver = msg.getReceiver();
        boolean _tripleNotEquals_3 = (_receiver != null);
        if (_tripleNotEquals_3) {
          roles.add(msg.getReceiver().getName());
        }
      }
    }
    int _size = roles.size();
    return (_size <= 2);
  }
  
  @Check
  public void checkFreeVariables(final TraceExpression tExp) {
    ArrayList<String> freeVars = new ArrayList<String>();
    EList<Term> _terms = tExp.getTerms();
    for (final Term term : _terms) {
      if ((term.getName().equals("Main") || term.getName().equals("main"))) {
        this.checkBoundedVariables(term.getExpr(), freeVars);
        int _size = freeVars.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          final ICompositeNode node = NodeModelUtils.findActualNodeFor(term);
          this.getMessageAcceptor().acceptError(
            "Trace expression cannot contain free variables", term, 
            node.getOffset(), 
            node.getLength(), 
            TExpValidator.FreeVariables);
        }
      }
    }
  }
  
  @Check
  public void checkPartitionCorrectlyEnabled(final TraceExpression tExp) {
    if ((((((tExp.getDecentralized() == null) || (tExp.getDecentralized().size() == 0)) || Objects.equal(tExp.getDecentralized().get(0), "false")) && 
      (tExp.getPartition() != null)) && (tExp.getPartition().size() > 0))) {
      final ICompositeNode node = NodeModelUtils.findActualNodeFor(tExp.getPartition().get(0));
      this.getMessageAcceptor().acceptWarning(
        "Partition will not be considered (to enable add \'decentralized: true\')", 
        tExp.getPartition().get(0), 
        node.getOffset(), 
        node.getLength(), 
        TExpValidator.PartitionNotEnabled);
    }
  }
  
  @Check
  public void checkContractiveness(final TraceExpression tExp) {
    Boolean _isContractive = ContractivenessCheck.isContractive(tExp);
    boolean _not = (!(_isContractive).booleanValue());
    if (_not) {
      EList<Term> _terms = tExp.getTerms();
      for (final Term term : _terms) {
        {
          final ICompositeNode node = NodeModelUtils.findActualNodeFor(term);
          this.getMessageAcceptor().acceptError(
            "Trace expression must be contractive", term, 
            node.getOffset(), 
            node.getLength(), 
            TExpValidator.Contractiveness);
        }
      }
    }
  }
  
  @Check
  public void checkConstraints(final Constraint constraint) {
    if ((constraint instanceof Singletons)) {
      int _minSingletons = ((Singletons)constraint).getMinSingletons();
      int _maxSingletons = ((Singletons)constraint).getMaxSingletons();
      boolean _greaterThan = (_minSingletons > _maxSingletons);
      if (_greaterThan) {
        final ICompositeNode node = NodeModelUtils.findActualNodeFor(constraint);
        this.getMessageAcceptor().acceptError(
          "min must be less than max", constraint, 
          node.getOffset(), 
          node.getLength(), 
          TExpValidator.MinMax);
      }
    } else {
      if ((constraint instanceof Size)) {
        int _minSize = ((Size)constraint).getMinSize();
        int _maxSize = ((Size)constraint).getMaxSize();
        boolean _greaterThan_1 = (_minSize > _maxSize);
        if (_greaterThan_1) {
          final ICompositeNode node_1 = NodeModelUtils.findActualNodeFor(constraint);
          this.getMessageAcceptor().acceptError(
            "min must be less than max", constraint, 
            node_1.getOffset(), 
            node_1.getLength(), 
            TExpValidator.MinMax);
        }
      } else {
        if ((constraint instanceof Cardinality)) {
          int _minCardinality = ((Cardinality)constraint).getMinCardinality();
          int _maxCardinality = ((Cardinality)constraint).getMaxCardinality();
          boolean _greaterThan_2 = (_minCardinality > _maxCardinality);
          if (_greaterThan_2) {
            final ICompositeNode node_2 = NodeModelUtils.findActualNodeFor(constraint);
            this.getMessageAcceptor().acceptError(
              "min must be less than max", constraint, 
              node_2.getOffset(), 
              node_2.getLength(), 
              TExpValidator.MinMax);
          }
        }
      }
    }
  }
  
  @Check
  public void checkNoDuplications(final TraceExpression tExp) {
    if (((tExp.getBodyL() == null) || (tExp.getBodyL().size() != 1))) {
      final ICompositeNode node = NodeModelUtils.findActualNodeFor(tExp);
      this.getMessageAcceptor().acceptError(
        "there must be one \'body:\' field", tExp, 
        node.getOffset(), 
        node.getLength(), 
        TExpValidator.OnlyOne);
    }
    if (((tExp.getRolesL() == null) || (tExp.getRolesL().size() != 1))) {
      final ICompositeNode node_1 = NodeModelUtils.findActualNodeFor(tExp);
      this.getMessageAcceptor().acceptError(
        "there must be one \'roles:\' field", tExp, 
        node_1.getOffset(), 
        node_1.getLength(), 
        TExpValidator.OnlyOne);
    }
    if (((tExp.getTypesL() == null) || (tExp.getTypesL().size() != 1))) {
      final ICompositeNode node_2 = NodeModelUtils.findActualNodeFor(tExp);
      this.getMessageAcceptor().acceptError(
        "there must be one \'types:\' field", tExp, 
        node_2.getOffset(), 
        node_2.getLength(), 
        TExpValidator.OnlyOne);
    }
    if (((tExp.getModules() != null) && (tExp.getModules().size() > 1))) {
      final ICompositeNode node_3 = NodeModelUtils.findActualNodeFor(tExp);
      this.getMessageAcceptor().acceptError(
        "there must be at most one \'modules:\' field", tExp, 
        node_3.getOffset(), 
        node_3.getLength(), 
        TExpValidator.OnlyOne);
    }
    if (((tExp.getDecentralizedL() != null) && (tExp.getDecentralizedL().size() > 1))) {
      final ICompositeNode node_4 = NodeModelUtils.findActualNodeFor(tExp);
      this.getMessageAcceptor().acceptError(
        "there must be at most one \'decentralized:\' field", tExp, 
        node_4.getOffset(), 
        node_4.getLength(), 
        TExpValidator.OnlyOne);
    }
    if (((tExp.getPartitionL() != null) && (tExp.getPartitionL().size() > 1))) {
      final ICompositeNode node_5 = NodeModelUtils.findActualNodeFor(tExp);
      this.getMessageAcceptor().acceptError(
        "there must be at most one \'partition:\' field", tExp, 
        node_5.getOffset(), 
        node_5.getLength(), 
        TExpValidator.OnlyOne);
    }
    if (((tExp.getConstraintsL() != null) && (tExp.getConstraintsL().size() > 1))) {
      final ICompositeNode node_6 = NodeModelUtils.findActualNodeFor(tExp);
      this.getMessageAcceptor().acceptError(
        "there must be at most one \'constraints:\' field", tExp, 
        node_6.getOffset(), 
        node_6.getLength(), 
        TExpValidator.OnlyOne);
    }
    if (((tExp.getGuiL() != null) && (tExp.getGuiL().size() > 1))) {
      final ICompositeNode node_7 = NodeModelUtils.findActualNodeFor(tExp);
      this.getMessageAcceptor().acceptError(
        "only one \'gui:\' field is allowed", tExp, 
        node_7.getOffset(), 
        node_7.getLength(), 
        TExpValidator.OnlyOne);
    }
    if (((tExp.getMinimalL() != null) && (tExp.getMinimalL().size() > 1))) {
      final ICompositeNode node_8 = NodeModelUtils.findActualNodeFor(tExp);
      this.getMessageAcceptor().acceptError(
        "only one \'minimal:\' field is allowed", tExp, 
        node_8.getOffset(), 
        node_8.getLength(), 
        TExpValidator.OnlyOne);
    }
    if (((tExp.getThresholdL() != null) && (tExp.getThresholdL().size() > 1))) {
      final ICompositeNode node_9 = NodeModelUtils.findActualNodeFor(tExp);
      this.getMessageAcceptor().acceptError(
        "only one \'threshold:\' field is allowed", tExp, 
        node_9.getOffset(), 
        node_9.getLength(), 
        TExpValidator.OnlyOne);
    }
    if (((tExp.getChannelsL() != null) && (tExp.getChannelsL().size() > 1))) {
      final ICompositeNode node_10 = NodeModelUtils.findActualNodeFor(tExp);
      this.getMessageAcceptor().acceptError(
        "only one \'channels:\' field is allowed", tExp, 
        node_10.getOffset(), 
        node_10.getLength(), 
        TExpValidator.OnlyOne);
    }
  }
  
  @Check
  public void checkReliabilityRange(final Channel channel) {
    if ((((Double.valueOf(channel.getReliability())).doubleValue() < 0) || ((Double.valueOf(channel.getReliability())).doubleValue() > 1))) {
      final ICompositeNode node = NodeModelUtils.findActualNodeFor(channel);
      this.getMessageAcceptor().acceptError(
        "reliability must be between 0 and 1", channel, 
        node.getOffset(), 
        node.getLength(), 
        TExpValidator.RangeError);
    }
  }
  
  @Check
  public void thresholdMustBePositive(final TraceExpression tExp) {
    if ((((tExp.getThreshold() != null) && (tExp.getThreshold().size() > 0)) && (tExp.getThreshold().get(0).length() > 0))) {
      Double d = Double.valueOf(tExp.getThreshold().get(0));
      if ((((d).doubleValue() < 0) || ((d).doubleValue() > 1))) {
        final ICompositeNode node = NodeModelUtils.findActualNodeFor(tExp);
        this.getMessageAcceptor().acceptError(
          "threshold must be between 0 and 1", tExp, 
          node.getOffset(), 
          node.getLength(), 
          TExpValidator.RangeError);
      }
    }
  }
  
  @Check
  public void checkConstraintsOnlyIfDecentralized(final TraceExpression tExp) {
    if (((((tExp.getDecentralized() == null) || (tExp.getDecentralized().size() == 0)) || Objects.equal(tExp.getDecentralized().get(0), "false")) && ((tExp.getConstraints() != null) && (tExp.getConstraints().size() > 0)))) {
      final ICompositeNode node = NodeModelUtils.findActualNodeFor(tExp);
      this.getMessageAcceptor().acceptWarning(
        "constraints will not be considered (to enable add \'decentralized: true\')", tExp, 
        node.getOffset(), 
        node.getLength(), 
        TExpValidator.ConstraintsNotEnabled);
    }
  }
  
  @Check
  public void checkMinimalOnlyIfDecentralized(final TraceExpression tExp) {
    if (((((tExp.getDecentralized() == null) || (tExp.getDecentralized().size() == 0)) || Objects.equal(tExp.getDecentralized().get(0), "false")) && ((tExp.getMinimal() != null) && (tExp.getMinimal().size() > 0)))) {
      final ICompositeNode node = NodeModelUtils.findActualNodeFor(tExp);
      this.getMessageAcceptor().acceptWarning(
        "minimal will not be considered (to enable add \'decentralized: true\')", tExp, 
        node.getOffset(), 
        node.getLength(), 
        TExpValidator.MinimalNotEnabled);
    }
  }
  
  @Check
  public void checkConstraintsOrPartition(final TraceExpression tExp) {
    if (((((tExp.getConstraints() != null) && (tExp.getConstraints().size() > 0)) && 
      (tExp.getPartition() != null)) && (tExp.getPartition().size() > 0))) {
      ICompositeNode node = NodeModelUtils.findActualNodeFor(tExp.getConstraints().get(0));
      this.getMessageAcceptor().acceptError(
        "constraints and partition are mutually exclusive", 
        tExp.getConstraints().get(0), 
        node.getOffset(), 
        node.getLength(), 
        TExpValidator.MutuallyExclusive);
      node = NodeModelUtils.findActualNodeFor(tExp.getPartition().get(0));
      this.getMessageAcceptor().acceptError(
        "constraints and partition are mutually exclusive", 
        tExp.getConstraints().get(0), 
        node.getOffset(), 
        node.getLength(), 
        TExpValidator.MutuallyExclusive);
    }
  }
  
  @Check
  public void checkMinimalOrPartition(final TraceExpression tExp) {
    if (((((tExp.getPartition() != null) && (tExp.getPartition().size() > 0)) && 
      (tExp.getMinimal() != null)) && (tExp.getMinimal().size() > 0))) {
      ICompositeNode node = NodeModelUtils.findActualNodeFor(tExp.getPartition().get(0));
      this.getMessageAcceptor().acceptError(
        "partition and minimal are mutually exclusive", 
        tExp.getPartition().get(0), 
        node.getOffset(), 
        node.getLength(), 
        TExpValidator.MutuallyExclusive);
    }
  }
  
  @Check
  public void criticalPointsTest(final TraceExpression tExp) {
    if ((((((tExp.getDecentralized() != null) && (tExp.getDecentralized().size() > 0)) && 
      Objects.equal(tExp.getDecentralized().get(0), "true")) && (tExp.getPartition() != null)) && (tExp.getPartition().size() > 0))) {
      ArrayList<MonitoringSafePartitionCheck.CriticalPoint> criticalPoints = MonitoringSafePartitionCheck.isMonitoringSafe(tExp);
      for (final MonitoringSafePartitionCheck.CriticalPoint cp : criticalPoints) {
        {
          final ICompositeNode node = NodeModelUtils.findActualNodeFor(cp.expr());
          ValidationMessageAcceptor _messageAcceptor = this.getMessageAcceptor();
          String _name = cp.evType1().getName();
          String _plus = ("Critical point not handled by the chosen partition: (" + _name);
          String _plus_1 = (_plus + ", ");
          String _name_1 = cp.evType2().getName();
          String _plus_2 = (_plus_1 + _name_1);
          String _plus_3 = (_plus_2 + ")");
          _messageAcceptor.acceptError(_plus_3, 
            cp.expr(), 
            node.getOffset(), 
            node.getLength(), 
            TExpValidator.CriticalPoint);
        }
      }
    }
  }
  
  @Check
  public void checkAllRolesInPartition(final TraceExpression tExp) {
    if (((tExp.getPartition() != null) && (tExp.getPartition().size() > 0))) {
      EList<Role> _roles = tExp.getRoles();
      for (final Role role1 : _roles) {
        {
          boolean found = false;
          EList<Together> _constraints = tExp.getPartition().get(0).getConstraints();
          for (final Together group : _constraints) {
            EList<Role> _roles_1 = group.getRoles();
            for (final Role role2 : _roles_1) {
              String _name = role1.getName();
              String _name_1 = role2.getName();
              boolean _equals = Objects.equal(_name, _name_1);
              if (_equals) {
                found = true;
              }
            }
          }
          if ((!found)) {
            final ICompositeNode node = NodeModelUtils.findActualNodeFor(role1);
            ValidationMessageAcceptor _messageAcceptor = this.getMessageAcceptor();
            String _name_2 = role1.getName();
            String _plus = ("Role " + _name_2);
            String _plus_1 = (_plus + " is not present inside the partition");
            _messageAcceptor.acceptError(_plus_1, role1, 
              node.getOffset(), 
              node.getLength(), 
              TExpValidator.RoleAbsenceInPartition);
          }
        }
      }
    }
  }
}
