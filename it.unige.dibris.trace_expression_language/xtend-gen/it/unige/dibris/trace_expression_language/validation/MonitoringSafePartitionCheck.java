package it.unige.dibris.trace_expression_language.validation;

import com.google.common.base.Objects;
import it.unige.dibris.trace_expression_language.tExp.AndExpr;
import it.unige.dibris.trace_expression_language.tExp.CatExpr;
import it.unige.dibris.trace_expression_language.tExp.Expression;
import it.unige.dibris.trace_expression_language.tExp.FilterExpr;
import it.unige.dibris.trace_expression_language.tExp.InteractionTraceExpression;
import it.unige.dibris.trace_expression_language.tExp.Msg;
import it.unige.dibris.trace_expression_language.tExp.MsgEventType;
import it.unige.dibris.trace_expression_language.tExp.Partition;
import it.unige.dibris.trace_expression_language.tExp.Role;
import it.unige.dibris.trace_expression_language.tExp.SeqExpr;
import it.unige.dibris.trace_expression_language.tExp.ShuffleExpr;
import it.unige.dibris.trace_expression_language.tExp.Term;
import it.unige.dibris.trace_expression_language.tExp.TerminalExpr;
import it.unige.dibris.trace_expression_language.tExp.Together;
import it.unige.dibris.trace_expression_language.tExp.UnionExpr;
import it.unige.dibris.trace_expression_language.tExp.VarExpr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class MonitoringSafePartitionCheck {
  public static class CriticalPoint {
    private MsgEventType evType1;
    
    private MsgEventType evType2;
    
    private Expression expr;
    
    public CriticalPoint(final MsgEventType type, final MsgEventType type2, final Expression e) {
      this.evType1 = type;
      this.evType2 = type2;
      this.expr = e;
    }
    
    public MsgEventType evType1() {
      return this.evType1;
    }
    
    public MsgEventType evType2() {
      return this.evType2;
    }
    
    public Expression expr() {
      return this.expr;
    }
  }
  
  public static ArrayList<MonitoringSafePartitionCheck.CriticalPoint> isMonitoringSafe(final InteractionTraceExpression tExp) {
    final EList<Term> terms = tExp.getTerms();
    final LinkedHashMap<String, Expression> assocT = new LinkedHashMap<String, Expression>();
    final LinkedHashMap<String, Expression> assocD = new LinkedHashMap<String, Expression>();
    for (final Term term : terms) {
      assocT.put(term.getName(), term.getExpr());
    }
    for (final Term term_1 : terms) {
      if ((term_1.getName().equals("Main") || term_1.getName().equals("main"))) {
        assocD.put(term_1.getName(), term_1.getExpr());
        ArrayList<MonitoringSafePartitionCheck.CriticalPoint> criticalPoints = new ArrayList<MonitoringSafePartitionCheck.CriticalPoint>();
        ArrayList<MonitoringSafePartitionCheck.CriticalPoint> criticalPointsNotHandledByPartition = new ArrayList<MonitoringSafePartitionCheck.CriticalPoint>();
        double threshold = 1.0;
        if (((tExp.getThreshold() != null) && (tExp.getThreshold().size() > 0))) {
          threshold = (Double.valueOf(tExp.getThreshold().get(0))).doubleValue();
        }
        MonitoringSafePartitionCheck.extractCriticalPoints(term_1.getExpr(), criticalPoints, assocT, assocD, threshold);
        InputOutput.<String>println("[");
        for (final MonitoringSafePartitionCheck.CriticalPoint c : criticalPoints) {
          String _name = c.evType1.getName();
          String _plus = ("(" + _name);
          String _plus_1 = (_plus + ", ");
          String _name_1 = c.evType2.getName();
          String _plus_2 = (_plus_1 + _name_1);
          String _plus_3 = (_plus_2 + ")");
          InputOutput.<String>println(_plus_3);
        }
        InputOutput.<String>println("]");
        for (final MonitoringSafePartitionCheck.CriticalPoint cp : criticalPoints) {
          EList<Partition> _partition = tExp.getPartition();
          for (final Partition p : _partition) {
            {
              boolean solvedL = false;
              boolean solvedR = false;
              EList<Together> _constraints = p.getConstraints();
              for (final Together groups : _constraints) {
                if (((!solvedL) || (!solvedR))) {
                  solvedL = false;
                  solvedR = false;
                  EList<Role> _roles = groups.getRoles();
                  for (final Role r : _roles) {
                    {
                      EList<Msg> _msgs = cp.evType1.getMsgs();
                      for (final Msg msg : _msgs) {
                        Role _async_receiver = msg.getAsync_receiver();
                        boolean _tripleNotEquals = (_async_receiver != null);
                        if (_tripleNotEquals) {
                          String _name_2 = r.getName();
                          String _name_3 = msg.getSender().getName();
                          boolean _equals = Objects.equal(_name_2, _name_3);
                          solvedL = _equals;
                        } else {
                          Role _async_sender = msg.getAsync_sender();
                          boolean _tripleNotEquals_1 = (_async_sender != null);
                          if (_tripleNotEquals_1) {
                            String _name_4 = r.getName();
                            String _name_5 = msg.getReceiver().getName();
                            boolean _equals_1 = Objects.equal(_name_4, _name_5);
                            solvedL = _equals_1;
                          } else {
                            solvedL = (Objects.equal(r.getName(), msg.getSender().getName()) || Objects.equal(r.getName(), msg.getReceiver().getName()));
                          }
                        }
                      }
                      EList<Msg> _msgs_1 = cp.evType2.getMsgs();
                      for (final Msg msg_1 : _msgs_1) {
                        Role _async_receiver_1 = msg_1.getAsync_receiver();
                        boolean _tripleNotEquals_2 = (_async_receiver_1 != null);
                        if (_tripleNotEquals_2) {
                          String _name_6 = r.getName();
                          String _name_7 = msg_1.getSender().getName();
                          boolean _equals_2 = Objects.equal(_name_6, _name_7);
                          solvedR = _equals_2;
                        } else {
                          Role _async_sender_1 = msg_1.getAsync_sender();
                          boolean _tripleNotEquals_3 = (_async_sender_1 != null);
                          if (_tripleNotEquals_3) {
                            String _name_8 = r.getName();
                            String _name_9 = msg_1.getReceiver().getName();
                            boolean _equals_3 = Objects.equal(_name_8, _name_9);
                            solvedR = _equals_3;
                          } else {
                            solvedR = (Objects.equal(r.getName(), msg_1.getSender().getName()) || Objects.equal(r.getName(), msg_1.getReceiver().getName()));
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (((!solvedL) || (!solvedR))) {
                criticalPointsNotHandledByPartition.add(cp);
              }
            }
          }
        }
        return criticalPointsNotHandledByPartition;
      }
    }
    return null;
  }
  
  public static boolean mayHalt(final Expression expr, final HashMap<String, Expression> assocT, final HashMap<String, Expression> assoc) {
    if ((expr instanceof TerminalExpr)) {
      Expression _expr = ((TerminalExpr)expr).getTerminalExpr().getExpr();
      boolean _tripleNotEquals = (_expr != null);
      if (_tripleNotEquals) {
        return MonitoringSafePartitionCheck.mayHalt(((TerminalExpr)expr).getTerminalExpr().getExpr(), assocT, assoc);
      }
      Term _term = ((TerminalExpr)expr).getTerminalExpr().getTerm();
      boolean _tripleNotEquals_1 = (_term != null);
      if (_tripleNotEquals_1) {
        Expression _get = assoc.get(((TerminalExpr)expr).getTerminalExpr().getTerm().getName());
        boolean _tripleNotEquals_2 = (_get != null);
        if (_tripleNotEquals_2) {
          return false;
        }
        assoc.put(((TerminalExpr)expr).getTerminalExpr().getTerm().getName(), expr);
        return MonitoringSafePartitionCheck.mayHalt(assocT.get(((TerminalExpr)expr).getTerminalExpr().getTerm().getName()), assocT, assoc);
      } else {
        return true;
      }
    } else {
      if ((expr instanceof ShuffleExpr)) {
        return (MonitoringSafePartitionCheck.mayHalt(((ShuffleExpr)expr).getLeft(), assocT, assoc) && MonitoringSafePartitionCheck.mayHalt(((ShuffleExpr)expr).getRight(), assocT, assoc));
      } else {
        if ((expr instanceof AndExpr)) {
          return (MonitoringSafePartitionCheck.mayHalt(((AndExpr)expr).getLeft(), assocT, assoc) && MonitoringSafePartitionCheck.mayHalt(((AndExpr)expr).getRight(), assocT, assoc));
        } else {
          if ((expr instanceof UnionExpr)) {
            return (MonitoringSafePartitionCheck.mayHalt(((UnionExpr)expr).getLeft(), assocT, assoc) || MonitoringSafePartitionCheck.mayHalt(((UnionExpr)expr).getRight(), assocT, assoc));
          } else {
            if ((expr instanceof CatExpr)) {
              return (MonitoringSafePartitionCheck.mayHalt(((CatExpr)expr).getLeft(), assocT, assoc) && MonitoringSafePartitionCheck.mayHalt(((CatExpr)expr).getRight(), assocT, assoc));
            } else {
              if ((expr instanceof SeqExpr)) {
                EObject _typeSeq = ((SeqExpr)expr).getSeqExpr().getTypeSeq();
                if ((_typeSeq instanceof MsgEventType)) {
                  EObject _typeSeq_1 = ((SeqExpr)expr).getSeqExpr().getTypeSeq();
                  MsgEventType msgEv = ((MsgEventType) _typeSeq_1);
                  if ((((msgEv.getChannel() != null) && (msgEv.getChannel().getReliability() != null)) && ((Double.valueOf(msgEv.getChannel().getReliability())).doubleValue() < 1))) {
                    return MonitoringSafePartitionCheck.mayHalt(((SeqExpr)expr).getSeqExpr().getBodySeq(), assocT, assoc);
                  }
                }
                return false;
              } else {
                if ((expr instanceof FilterExpr)) {
                  return MonitoringSafePartitionCheck.mayHalt(((FilterExpr)expr).getBodyFilter(), assocT, assoc);
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
  
  public static List<MsgEventType> firstMsgEventTypes(final Expression expr, final HashMap<String, Expression> assocT, final HashMap<String, Expression> assoc, final double threshold) {
    if ((expr instanceof TerminalExpr)) {
      Expression _expr = ((TerminalExpr)expr).getTerminalExpr().getExpr();
      boolean _tripleNotEquals = (_expr != null);
      if (_tripleNotEquals) {
        return MonitoringSafePartitionCheck.firstMsgEventTypes(((TerminalExpr)expr).getTerminalExpr().getExpr(), assocT, assoc, threshold);
      }
      Term _term = ((TerminalExpr)expr).getTerminalExpr().getTerm();
      boolean _tripleNotEquals_1 = (_term != null);
      if (_tripleNotEquals_1) {
        Expression _get = assoc.get(((TerminalExpr)expr).getTerminalExpr().getTerm().getName());
        boolean _tripleNotEquals_2 = (_get != null);
        if (_tripleNotEquals_2) {
          return new ArrayList<MsgEventType>();
        }
        assoc.put(((TerminalExpr)expr).getTerminalExpr().getTerm().getName(), expr);
        return MonitoringSafePartitionCheck.firstMsgEventTypes(assocT.get(((TerminalExpr)expr).getTerminalExpr().getTerm().getName()), assocT, assoc, threshold);
      } else {
        return new ArrayList<MsgEventType>();
      }
    } else {
      if ((expr instanceof ShuffleExpr)) {
        List<MsgEventType> evTypes1 = MonitoringSafePartitionCheck.firstMsgEventTypes(((ShuffleExpr)expr).getLeft(), assocT, assoc, threshold);
        List<MsgEventType> evTypes2 = MonitoringSafePartitionCheck.firstMsgEventTypes(((ShuffleExpr)expr).getRight(), assocT, assoc, threshold);
        for (final MsgEventType evType2 : evTypes2) {
          {
            boolean found = false;
            for (final MsgEventType evType1 : evTypes1) {
              String _name = evType1.getName();
              String _name_1 = evType2.getName();
              boolean _equals = Objects.equal(_name, _name_1);
              if (_equals) {
                found = true;
              }
            }
            if ((!found)) {
              evTypes1.add(evType2);
            }
          }
        }
        return evTypes1;
      } else {
        if ((expr instanceof AndExpr)) {
          List<MsgEventType> evTypes1_1 = MonitoringSafePartitionCheck.firstMsgEventTypes(((AndExpr)expr).getLeft(), assocT, assoc, threshold);
          List<MsgEventType> evTypes2_1 = MonitoringSafePartitionCheck.firstMsgEventTypes(((AndExpr)expr).getRight(), assocT, assoc, threshold);
          for (final MsgEventType evType2_1 : evTypes2_1) {
            {
              boolean found = false;
              for (final MsgEventType evType1 : evTypes1_1) {
                String _name = evType1.getName();
                String _name_1 = evType2_1.getName();
                boolean _equals = Objects.equal(_name, _name_1);
                if (_equals) {
                  found = true;
                }
              }
              if ((!found)) {
                evTypes1_1.add(evType2_1);
              }
            }
          }
          return evTypes1_1;
        } else {
          if ((expr instanceof UnionExpr)) {
            List<MsgEventType> evTypes1_2 = MonitoringSafePartitionCheck.firstMsgEventTypes(((UnionExpr)expr).getLeft(), assocT, assoc, threshold);
            List<MsgEventType> evTypes2_2 = MonitoringSafePartitionCheck.firstMsgEventTypes(((UnionExpr)expr).getRight(), assocT, assoc, threshold);
            for (final MsgEventType evType2_2 : evTypes2_2) {
              {
                boolean found = false;
                for (final MsgEventType evType1 : evTypes1_2) {
                  String _name = evType1.getName();
                  String _name_1 = evType2_2.getName();
                  boolean _equals = Objects.equal(_name, _name_1);
                  if (_equals) {
                    found = true;
                  }
                }
                if ((!found)) {
                  evTypes1_2.add(evType2_2);
                }
              }
            }
            return evTypes1_2;
          } else {
            if ((expr instanceof CatExpr)) {
              HashMap<String, Expression> _hashMap = new HashMap<String, Expression>();
              boolean _mayHalt = MonitoringSafePartitionCheck.mayHalt(expr, assocT, _hashMap);
              if (_mayHalt) {
                List<MsgEventType> evTypes1_3 = MonitoringSafePartitionCheck.firstMsgEventTypes(((CatExpr)expr).getLeft(), assocT, assoc, threshold);
                List<MsgEventType> evTypes2_3 = MonitoringSafePartitionCheck.firstMsgEventTypes(((CatExpr)expr).getRight(), assocT, assoc, threshold);
                for (final MsgEventType evType2_3 : evTypes2_3) {
                  {
                    boolean found = false;
                    for (final MsgEventType evType1 : evTypes1_3) {
                      String _name = evType1.getName();
                      String _name_1 = evType2_3.getName();
                      boolean _equals = Objects.equal(_name, _name_1);
                      if (_equals) {
                        found = true;
                      }
                    }
                    if ((!found)) {
                      evTypes1_3.add(evType2_3);
                    }
                  }
                }
                return evTypes1_3;
              } else {
                List<MsgEventType> evTypes1_4 = MonitoringSafePartitionCheck.firstMsgEventTypes(((CatExpr)expr).getLeft(), assocT, assoc, threshold);
                return evTypes1_4;
              }
            } else {
              if ((expr instanceof SeqExpr)) {
                EObject _typeSeq = ((SeqExpr)expr).getSeqExpr().getTypeSeq();
                boolean _not = (!(_typeSeq instanceof MsgEventType));
                if (_not) {
                  throw new AssertionError("Event type should be a message event type");
                }
                EObject _typeSeq_1 = ((SeqExpr)expr).getSeqExpr().getTypeSeq();
                MsgEventType msgEv = ((MsgEventType) _typeSeq_1);
                if ((((msgEv.getChannel() == null) || (msgEv.getChannel().getReliability() == null)) || ((Double.valueOf(msgEv.getChannel().getReliability())).doubleValue() >= threshold))) {
                  ArrayList<MsgEventType> eventTypes = new ArrayList<MsgEventType>();
                  eventTypes.add(msgEv);
                  return eventTypes;
                } else {
                  Double _valueOf = Double.valueOf(msgEv.getChannel().getReliability());
                  boolean _greaterThan = ((_valueOf).doubleValue() > 0);
                  if (_greaterThan) {
                    List<MsgEventType> evTypes2_4 = MonitoringSafePartitionCheck.firstMsgEventTypes(((SeqExpr)expr).getSeqExpr().getBodySeq(), assocT, assoc, threshold);
                    boolean found = false;
                    for (final MsgEventType evType2_4 : evTypes2_4) {
                      String _name = msgEv.getName();
                      String _name_1 = evType2_4.getName();
                      boolean _equals = Objects.equal(_name, _name_1);
                      if (_equals) {
                        found = true;
                      }
                    }
                    if ((!found)) {
                      evTypes2_4.add(msgEv);
                    }
                    return evTypes2_4;
                  } else {
                    return MonitoringSafePartitionCheck.firstMsgEventTypes(((SeqExpr)expr).getSeqExpr().getBodySeq(), assocT, assoc, threshold);
                  }
                }
              } else {
                if ((expr instanceof FilterExpr)) {
                  return MonitoringSafePartitionCheck.firstMsgEventTypes(((FilterExpr)expr).getFilterExpr().getBodyFilter(), assocT, assoc, threshold);
                } else {
                  if ((expr instanceof VarExpr)) {
                    return MonitoringSafePartitionCheck.firstMsgEventTypes(((VarExpr)expr).getVarExpr().getBodyVar(), assocT, assoc, threshold);
                  } else {
                    return new ArrayList<MsgEventType>();
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static List<MsgEventType> lastMsgEventTypes(final Expression expr, final HashMap<String, Expression> assocT, final HashMap<String, Expression> assoc, final double threshold) {
    if ((expr instanceof TerminalExpr)) {
      Expression _expr = ((TerminalExpr)expr).getTerminalExpr().getExpr();
      boolean _tripleNotEquals = (_expr != null);
      if (_tripleNotEquals) {
        return MonitoringSafePartitionCheck.lastMsgEventTypes(((TerminalExpr)expr).getTerminalExpr().getExpr(), assocT, assoc, threshold);
      }
      Term _term = ((TerminalExpr)expr).getTerminalExpr().getTerm();
      boolean _tripleNotEquals_1 = (_term != null);
      if (_tripleNotEquals_1) {
        Expression _get = assoc.get(((TerminalExpr)expr).getTerminalExpr().getTerm().getName());
        boolean _tripleNotEquals_2 = (_get != null);
        if (_tripleNotEquals_2) {
          return new ArrayList<MsgEventType>();
        }
        assoc.put(((TerminalExpr)expr).getTerminalExpr().getTerm().getName(), expr);
        return MonitoringSafePartitionCheck.lastMsgEventTypes(assocT.get(((TerminalExpr)expr).getTerminalExpr().getTerm().getName()), assocT, assoc, threshold);
      } else {
        return new ArrayList<MsgEventType>();
      }
    } else {
      if ((expr instanceof ShuffleExpr)) {
        List<MsgEventType> evTypes1 = MonitoringSafePartitionCheck.lastMsgEventTypes(((ShuffleExpr)expr).getLeft(), assocT, assoc, threshold);
        List<MsgEventType> evTypes2 = MonitoringSafePartitionCheck.lastMsgEventTypes(((ShuffleExpr)expr).getRight(), assocT, assoc, threshold);
        for (final MsgEventType evType2 : evTypes2) {
          {
            boolean found = false;
            for (final MsgEventType evType1 : evTypes1) {
              String _name = evType1.getName();
              String _name_1 = evType2.getName();
              boolean _equals = Objects.equal(_name, _name_1);
              if (_equals) {
                found = true;
              }
            }
            if ((!found)) {
              evTypes1.add(evType2);
            }
          }
        }
        return evTypes1;
      } else {
        if ((expr instanceof AndExpr)) {
          List<MsgEventType> evTypes1_1 = MonitoringSafePartitionCheck.lastMsgEventTypes(((AndExpr)expr).getLeft(), assocT, assoc, threshold);
          List<MsgEventType> evTypes2_1 = MonitoringSafePartitionCheck.lastMsgEventTypes(((AndExpr)expr).getRight(), assocT, assoc, threshold);
          for (final MsgEventType evType2_1 : evTypes2_1) {
            {
              boolean found = false;
              for (final MsgEventType evType1 : evTypes1_1) {
                String _name = evType1.getName();
                String _name_1 = evType2_1.getName();
                boolean _equals = Objects.equal(_name, _name_1);
                if (_equals) {
                  found = true;
                }
              }
              if ((!found)) {
                evTypes1_1.add(evType2_1);
              }
            }
          }
          return evTypes1_1;
        } else {
          if ((expr instanceof UnionExpr)) {
            List<MsgEventType> evTypes1_2 = MonitoringSafePartitionCheck.lastMsgEventTypes(((UnionExpr)expr).getLeft(), assocT, assoc, threshold);
            List<MsgEventType> evTypes2_2 = MonitoringSafePartitionCheck.lastMsgEventTypes(((UnionExpr)expr).getRight(), assocT, assoc, threshold);
            for (final MsgEventType evType2_2 : evTypes2_2) {
              {
                boolean found = false;
                for (final MsgEventType evType1 : evTypes1_2) {
                  String _name = evType1.getName();
                  String _name_1 = evType2_2.getName();
                  boolean _equals = Objects.equal(_name, _name_1);
                  if (_equals) {
                    found = true;
                  }
                }
                if ((!found)) {
                  evTypes1_2.add(evType2_2);
                }
              }
            }
            return evTypes1_2;
          } else {
            if ((expr instanceof CatExpr)) {
              int _size = MonitoringSafePartitionCheck.lastMsgEventTypes(((CatExpr)expr).getLeft(), assocT, assoc, threshold).size();
              boolean _equals = (_size == 0);
              if (_equals) {
                return new ArrayList<MsgEventType>();
              }
              List<MsgEventType> evTypes2_3 = MonitoringSafePartitionCheck.lastMsgEventTypes(((CatExpr)expr).getRight(), assocT, assoc, threshold);
              return evTypes2_3;
            } else {
              if ((expr instanceof SeqExpr)) {
                Expression _bodySeq = ((SeqExpr)expr).getSeqExpr().getBodySeq();
                HashMap<String, Expression> _hashMap = new HashMap<String, Expression>();
                boolean _mayHalt = MonitoringSafePartitionCheck.mayHalt(_bodySeq, assocT, _hashMap);
                if (_mayHalt) {
                  EObject _typeSeq = ((SeqExpr)expr).getSeqExpr().getTypeSeq();
                  boolean _not = (!(_typeSeq instanceof MsgEventType));
                  if (_not) {
                    throw new AssertionError("Event type should be a message event type");
                  }
                  EObject _typeSeq_1 = ((SeqExpr)expr).getSeqExpr().getTypeSeq();
                  MsgEventType msgEv = ((MsgEventType) _typeSeq_1);
                  if ((((msgEv.getChannel() == null) || (msgEv.getChannel().getReliability() == null)) || ((Double.valueOf(msgEv.getChannel().getReliability())).doubleValue() >= threshold))) {
                    List<MsgEventType> evTypes2_4 = MonitoringSafePartitionCheck.lastMsgEventTypes(((SeqExpr)expr).getSeqExpr().getBodySeq(), assocT, assoc, threshold);
                    ArrayList<MsgEventType> evTypes1_3 = new ArrayList<MsgEventType>();
                    evTypes1_3.add(msgEv);
                    boolean found = false;
                    for (final MsgEventType evType2_3 : evTypes2_4) {
                      String _name = evTypes1_3.get(0).getName();
                      String _name_1 = evType2_3.getName();
                      boolean _equals_1 = Objects.equal(_name, _name_1);
                      if (_equals_1) {
                        found = true;
                      }
                    }
                    if ((!found)) {
                      evTypes2_4.add(evTypes1_3.get(0));
                    }
                    return evTypes2_4;
                  } else {
                    Double _valueOf = Double.valueOf(msgEv.getChannel().getReliability());
                    boolean _greaterThan = ((_valueOf).doubleValue() > 0);
                    if (_greaterThan) {
                      List<MsgEventType> evTypes2_5 = MonitoringSafePartitionCheck.lastMsgEventTypes(((SeqExpr)expr).getSeqExpr().getBodySeq(), assocT, assoc, threshold);
                      boolean found_1 = false;
                      for (final MsgEventType evType2_4 : evTypes2_5) {
                        String _name_2 = msgEv.getName();
                        String _name_3 = evType2_4.getName();
                        boolean _equals_2 = Objects.equal(_name_2, _name_3);
                        if (_equals_2) {
                          found_1 = true;
                        }
                      }
                      if ((!found_1)) {
                        evTypes2_5.add(msgEv);
                      }
                      return evTypes2_5;
                    }
                  }
                }
                return MonitoringSafePartitionCheck.lastMsgEventTypes(((SeqExpr)expr).getSeqExpr().getBodySeq(), assocT, assoc, threshold);
              } else {
                if ((expr instanceof FilterExpr)) {
                  return MonitoringSafePartitionCheck.lastMsgEventTypes(((FilterExpr)expr).getFilterExpr().getBodyFilter(), assocT, assoc, threshold);
                } else {
                  if ((expr instanceof VarExpr)) {
                    return MonitoringSafePartitionCheck.lastMsgEventTypes(((VarExpr)expr).getVarExpr().getBodyVar(), assocT, assoc, threshold);
                  } else {
                    return new ArrayList<MsgEventType>();
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static TreeSet<String> getRolesFromMsgEventType(final MsgEventType eventType) {
    TreeSet<String> roles = new TreeSet<String>();
    EList<Msg> _msgs = eventType.getMsgs();
    for (final Msg msg : _msgs) {
      if (((msg.getSender() != null) && (msg.getReceiver() != null))) {
        roles.add(msg.getSender().getName());
        roles.add(msg.getReceiver().getName());
      } else {
        Role _async_sender = msg.getAsync_sender();
        boolean _tripleNotEquals = (_async_sender != null);
        if (_tripleNotEquals) {
          roles.add(msg.getReceiver().getName());
        } else {
          roles.add(msg.getSender().getName());
        }
      }
    }
    return roles;
  }
  
  public static void extractCriticalPoints(final Expression expr, final List<MonitoringSafePartitionCheck.CriticalPoint> criticalPoints, final HashMap<String, Expression> assocT, final HashMap<String, Expression> assoc, final double threshold) {
    if ((expr instanceof ShuffleExpr)) {
      MonitoringSafePartitionCheck.extractCriticalPoints(((ShuffleExpr)expr).getLeft(), criticalPoints, assocT, assoc, threshold);
      MonitoringSafePartitionCheck.extractCriticalPoints(((ShuffleExpr)expr).getRight(), criticalPoints, assocT, assoc, threshold);
    } else {
      if ((expr instanceof AndExpr)) {
        MonitoringSafePartitionCheck.extractCriticalPoints(((AndExpr)expr).getLeft(), criticalPoints, assocT, assoc, threshold);
        MonitoringSafePartitionCheck.extractCriticalPoints(((AndExpr)expr).getRight(), criticalPoints, assocT, assoc, threshold);
      } else {
        if ((expr instanceof UnionExpr)) {
          MonitoringSafePartitionCheck.extractCriticalPoints(((UnionExpr)expr).getLeft(), criticalPoints, assocT, assoc, threshold);
          MonitoringSafePartitionCheck.extractCriticalPoints(((UnionExpr)expr).getRight(), criticalPoints, assocT, assoc, threshold);
          Expression _left = ((UnionExpr)expr).getLeft();
          HashMap<String, Expression> _hashMap = new HashMap<String, Expression>();
          List<MsgEventType> eventTypes1 = MonitoringSafePartitionCheck.firstMsgEventTypes(_left, assocT, _hashMap, threshold);
          Expression _right = ((UnionExpr)expr).getRight();
          HashMap<String, Expression> _hashMap_1 = new HashMap<String, Expression>();
          List<MsgEventType> eventTypes2 = MonitoringSafePartitionCheck.firstMsgEventTypes(_right, assocT, _hashMap_1, threshold);
          for (final MsgEventType eventType1 : eventTypes1) {
            {
              boolean found = false;
              for (final MsgEventType eventType2 : eventTypes2) {
                {
                  TreeSet<String> _rolesFromMsgEventType = MonitoringSafePartitionCheck.getRolesFromMsgEventType(eventType1);
                  for (final String r1 : _rolesFromMsgEventType) {
                    TreeSet<String> _rolesFromMsgEventType_1 = MonitoringSafePartitionCheck.getRolesFromMsgEventType(eventType2);
                    for (final String r2 : _rolesFromMsgEventType_1) {
                      boolean _equals = Objects.equal(r1, r2);
                      if (_equals) {
                        found = true;
                      }
                    }
                  }
                  if ((!found)) {
                    for (final MonitoringSafePartitionCheck.CriticalPoint c : criticalPoints) {
                      if (((Objects.equal(c.evType1, eventType1) && Objects.equal(c.evType2, eventType2)) || (Objects.equal(c.evType1, eventType2) && Objects.equal(c.evType2, eventType1)))) {
                        found = true;
                      }
                    }
                    if ((!found)) {
                      MonitoringSafePartitionCheck.CriticalPoint _criticalPoint = new MonitoringSafePartitionCheck.CriticalPoint(eventType1, eventType2, expr);
                      criticalPoints.add(_criticalPoint);
                    }
                  }
                }
              }
            }
          }
        } else {
          if ((expr instanceof CatExpr)) {
            MonitoringSafePartitionCheck.extractCriticalPoints(((CatExpr)expr).getLeft(), criticalPoints, assocT, assoc, threshold);
            MonitoringSafePartitionCheck.extractCriticalPoints(((CatExpr)expr).getRight(), criticalPoints, assocT, assoc, threshold);
            Expression _left_1 = ((CatExpr)expr).getLeft();
            HashMap<String, Expression> _hashMap_2 = new HashMap<String, Expression>();
            List<MsgEventType> eventTypes1_1 = MonitoringSafePartitionCheck.lastMsgEventTypes(_left_1, assocT, _hashMap_2, threshold);
            Expression _right_1 = ((CatExpr)expr).getRight();
            HashMap<String, Expression> _hashMap_3 = new HashMap<String, Expression>();
            List<MsgEventType> eventTypes2_1 = MonitoringSafePartitionCheck.firstMsgEventTypes(_right_1, assocT, _hashMap_3, threshold);
            for (final MsgEventType eventType1_1 : eventTypes1_1) {
              {
                boolean found = false;
                for (final MsgEventType eventType2 : eventTypes2_1) {
                  {
                    TreeSet<String> _rolesFromMsgEventType = MonitoringSafePartitionCheck.getRolesFromMsgEventType(eventType1_1);
                    for (final String r1 : _rolesFromMsgEventType) {
                      TreeSet<String> _rolesFromMsgEventType_1 = MonitoringSafePartitionCheck.getRolesFromMsgEventType(eventType2);
                      for (final String r2 : _rolesFromMsgEventType_1) {
                        boolean _equals = Objects.equal(r1, r2);
                        if (_equals) {
                          found = true;
                        }
                      }
                    }
                    if ((!found)) {
                      MonitoringSafePartitionCheck.CriticalPoint _criticalPoint = new MonitoringSafePartitionCheck.CriticalPoint(eventType1_1, eventType2, expr);
                      criticalPoints.add(_criticalPoint);
                    }
                  }
                }
              }
            }
          } else {
            if ((expr instanceof SeqExpr)) {
              EObject _typeSeq = ((SeqExpr)expr).getSeqExpr().getTypeSeq();
              boolean _not = (!(_typeSeq instanceof MsgEventType));
              if (_not) {
                throw new AssertionError("Event type should be a message event type");
              }
              EObject _typeSeq_1 = ((SeqExpr)expr).getSeqExpr().getTypeSeq();
              MsgEventType msgEv = ((MsgEventType) _typeSeq_1);
              if ((((msgEv.getChannel() == null) || (msgEv.getChannel().getReliability() == null)) || ((Double.valueOf(msgEv.getChannel().getReliability())).doubleValue() > 0))) {
                MonitoringSafePartitionCheck.extractCriticalPoints(((SeqExpr)expr).getSeqExpr().getBodySeq(), criticalPoints, assocT, assoc, threshold);
                ArrayList<MsgEventType> eventTypes1_2 = new ArrayList<MsgEventType>();
                eventTypes1_2.add(msgEv);
                Expression _bodySeq = ((SeqExpr)expr).getSeqExpr().getBodySeq();
                HashMap<String, Expression> _hashMap_4 = new HashMap<String, Expression>();
                List<MsgEventType> eventTypes2_2 = MonitoringSafePartitionCheck.firstMsgEventTypes(_bodySeq, assocT, _hashMap_4, threshold);
                for (final MsgEventType eventType1_2 : eventTypes1_2) {
                  for (final MsgEventType eventType2 : eventTypes2_2) {
                    {
                      boolean found = false;
                      TreeSet<String> _rolesFromMsgEventType = MonitoringSafePartitionCheck.getRolesFromMsgEventType(eventType1_2);
                      for (final String r1 : _rolesFromMsgEventType) {
                        TreeSet<String> _rolesFromMsgEventType_1 = MonitoringSafePartitionCheck.getRolesFromMsgEventType(eventType2);
                        for (final String r2 : _rolesFromMsgEventType_1) {
                          boolean _equals = Objects.equal(r1, r2);
                          if (_equals) {
                            found = true;
                          }
                        }
                      }
                      if ((!found)) {
                        MonitoringSafePartitionCheck.CriticalPoint _criticalPoint = new MonitoringSafePartitionCheck.CriticalPoint(eventType1_2, eventType2, expr);
                        criticalPoints.add(_criticalPoint);
                      }
                    }
                  }
                }
              } else {
                MonitoringSafePartitionCheck.extractCriticalPoints(((SeqExpr)expr).getSeqExpr().getBodySeq(), criticalPoints, assocT, assoc, threshold);
              }
            } else {
              if ((expr instanceof FilterExpr)) {
                MonitoringSafePartitionCheck.extractCriticalPoints(((FilterExpr)expr).getFilterExpr().getBodyFilter(), criticalPoints, assocT, assoc, threshold);
              } else {
                if ((expr instanceof VarExpr)) {
                  MonitoringSafePartitionCheck.extractCriticalPoints(((VarExpr)expr).getVarExpr().getBodyVar(), criticalPoints, assocT, assoc, threshold);
                } else {
                  if ((expr instanceof TerminalExpr)) {
                    Expression _expr = ((TerminalExpr)expr).getTerminalExpr().getExpr();
                    boolean _tripleNotEquals = (_expr != null);
                    if (_tripleNotEquals) {
                      MonitoringSafePartitionCheck.extractCriticalPoints(((TerminalExpr)expr).getTerminalExpr().getExpr(), criticalPoints, assocT, assoc, threshold);
                    } else {
                      Term _term = ((TerminalExpr)expr).getTerminalExpr().getTerm();
                      boolean _tripleNotEquals_1 = (_term != null);
                      if (_tripleNotEquals_1) {
                        Expression _get = assoc.get(((TerminalExpr)expr).getTerminalExpr().getTerm().getName());
                        boolean _tripleEquals = (_get == null);
                        if (_tripleEquals) {
                          assoc.put(((TerminalExpr)expr).getTerminalExpr().getTerm().getName(), expr);
                          MonitoringSafePartitionCheck.extractCriticalPoints(assocT.get(((TerminalExpr)expr).getTerminalExpr().getTerm().getName()), criticalPoints, assocT, assoc, threshold);
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
