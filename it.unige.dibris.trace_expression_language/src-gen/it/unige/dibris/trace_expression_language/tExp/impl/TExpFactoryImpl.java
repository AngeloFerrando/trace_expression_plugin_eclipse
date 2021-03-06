/**
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.tExp.impl;

import it.unige.dibris.trace_expression_language.tExp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TExpFactoryImpl extends EFactoryImpl implements TExpFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TExpFactory init()
  {
    try
    {
      TExpFactory theTExpFactory = (TExpFactory)EPackage.Registry.INSTANCE.getEFactory(TExpPackage.eNS_URI);
      if (theTExpFactory != null)
      {
        return theTExpFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TExpFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TExpFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TExpPackage.DOMAINMODEL: return createDomainmodel();
      case TExpPackage.PROLOG_EXPRESSION: return createPrologExpression();
      case TExpPackage.TRACE_EXPRESSION: return createTraceExpression();
      case TExpPackage.TERM: return createTerm();
      case TExpPackage.EXPRESSION: return createExpression();
      case TExpPackage.EVENT_TYPE: return createEventType();
      case TExpPackage.MSG: return createMsg();
      case TExpPackage.CHANNEL: return createChannel();
      case TExpPackage.ROLE: return createRole();
      case TExpPackage.PARTITION: return createPartition();
      case TExpPackage.TOGETHER: return createTogether();
      case TExpPackage.CONSTRAINT: return createConstraint();
      case TExpPackage.ATOM_EXPRESSION: return createAtomExpression();
      case TExpPackage.VARIABLE_EXPRESSION: return createVariableExpression();
      case TExpPackage.STRING_EXPRESSION: return createStringExpression();
      case TExpPackage.NUMBER_EXPRESSION: return createNumberExpression();
      case TExpPackage.LIST_EXPRESSION: return createListExpression();
      case TExpPackage.SHUFFLE_EXPR: return createShuffleExpr();
      case TExpPackage.UNION_EXPR: return createUnionExpr();
      case TExpPackage.AND_EXPR: return createAndExpr();
      case TExpPackage.CAT_EXPR: return createCatExpr();
      case TExpPackage.SEQ_EXPR: return createSeqExpr();
      case TExpPackage.FILTER_EXPR: return createFilterExpr();
      case TExpPackage.VAR_EXPR: return createVarExpr();
      case TExpPackage.TERMINAL_EXPR: return createTerminalExpr();
      case TExpPackage.SINGLETONS: return createSingletons();
      case TExpPackage.SIZE: return createSize();
      case TExpPackage.CARDINALITY: return createCardinality();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domainmodel createDomainmodel()
  {
    DomainmodelImpl domainmodel = new DomainmodelImpl();
    return domainmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrologExpression createPrologExpression()
  {
    PrologExpressionImpl prologExpression = new PrologExpressionImpl();
    return prologExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceExpression createTraceExpression()
  {
    TraceExpressionImpl traceExpression = new TraceExpressionImpl();
    return traceExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventType createEventType()
  {
    EventTypeImpl eventType = new EventTypeImpl();
    return eventType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Msg createMsg()
  {
    MsgImpl msg = new MsgImpl();
    return msg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Channel createChannel()
  {
    ChannelImpl channel = new ChannelImpl();
    return channel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Partition createPartition()
  {
    PartitionImpl partition = new PartitionImpl();
    return partition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Together createTogether()
  {
    TogetherImpl together = new TogetherImpl();
    return together;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomExpression createAtomExpression()
  {
    AtomExpressionImpl atomExpression = new AtomExpressionImpl();
    return atomExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableExpression createVariableExpression()
  {
    VariableExpressionImpl variableExpression = new VariableExpressionImpl();
    return variableExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringExpression createStringExpression()
  {
    StringExpressionImpl stringExpression = new StringExpressionImpl();
    return stringExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberExpression createNumberExpression()
  {
    NumberExpressionImpl numberExpression = new NumberExpressionImpl();
    return numberExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListExpression createListExpression()
  {
    ListExpressionImpl listExpression = new ListExpressionImpl();
    return listExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShuffleExpr createShuffleExpr()
  {
    ShuffleExprImpl shuffleExpr = new ShuffleExprImpl();
    return shuffleExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnionExpr createUnionExpr()
  {
    UnionExprImpl unionExpr = new UnionExprImpl();
    return unionExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpr createAndExpr()
  {
    AndExprImpl andExpr = new AndExprImpl();
    return andExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatExpr createCatExpr()
  {
    CatExprImpl catExpr = new CatExprImpl();
    return catExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeqExpr createSeqExpr()
  {
    SeqExprImpl seqExpr = new SeqExprImpl();
    return seqExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterExpr createFilterExpr()
  {
    FilterExprImpl filterExpr = new FilterExprImpl();
    return filterExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarExpr createVarExpr()
  {
    VarExprImpl varExpr = new VarExprImpl();
    return varExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalExpr createTerminalExpr()
  {
    TerminalExprImpl terminalExpr = new TerminalExprImpl();
    return terminalExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Singletons createSingletons()
  {
    SingletonsImpl singletons = new SingletonsImpl();
    return singletons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size createSize()
  {
    SizeImpl size = new SizeImpl();
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cardinality createCardinality()
  {
    CardinalityImpl cardinality = new CardinalityImpl();
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TExpPackage getTExpPackage()
  {
    return (TExpPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TExpPackage getPackage()
  {
    return TExpPackage.eINSTANCE;
  }

} //TExpFactoryImpl
