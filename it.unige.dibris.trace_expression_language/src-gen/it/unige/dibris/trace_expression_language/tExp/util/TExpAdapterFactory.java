/**
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.tExp.util;

import it.unige.dibris.trace_expression_language.tExp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage
 * @generated
 */
public class TExpAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TExpPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TExpAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TExpPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TExpSwitch<Adapter> modelSwitch =
    new TExpSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainmodel(Domainmodel object)
      {
        return createDomainmodelAdapter();
      }
      @Override
      public Adapter casePrologExpression(PrologExpression object)
      {
        return createPrologExpressionAdapter();
      }
      @Override
      public Adapter caseTraceExpression(TraceExpression object)
      {
        return createTraceExpressionAdapter();
      }
      @Override
      public Adapter caseGenericTraceExpression(GenericTraceExpression object)
      {
        return createGenericTraceExpressionAdapter();
      }
      @Override
      public Adapter caseInteractionTraceExpression(InteractionTraceExpression object)
      {
        return createInteractionTraceExpressionAdapter();
      }
      @Override
      public Adapter caseEventType(EventType object)
      {
        return createEventTypeAdapter();
      }
      @Override
      public Adapter caseMsgEventType(MsgEventType object)
      {
        return createMsgEventTypeAdapter();
      }
      @Override
      public Adapter caseGroundTerm(GroundTerm object)
      {
        return createGroundTermAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseMsg(Msg object)
      {
        return createMsgAdapter();
      }
      @Override
      public Adapter caseChannel(Channel object)
      {
        return createChannelAdapter();
      }
      @Override
      public Adapter caseRole(Role object)
      {
        return createRoleAdapter();
      }
      @Override
      public Adapter casePartition(Partition object)
      {
        return createPartitionAdapter();
      }
      @Override
      public Adapter caseTogether(Together object)
      {
        return createTogetherAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseAtomExpression(AtomExpression object)
      {
        return createAtomExpressionAdapter();
      }
      @Override
      public Adapter caseVariableExpression(VariableExpression object)
      {
        return createVariableExpressionAdapter();
      }
      @Override
      public Adapter caseStringExpression(StringExpression object)
      {
        return createStringExpressionAdapter();
      }
      @Override
      public Adapter caseNumberExpression(NumberExpression object)
      {
        return createNumberExpressionAdapter();
      }
      @Override
      public Adapter caseListExpression(ListExpression object)
      {
        return createListExpressionAdapter();
      }
      @Override
      public Adapter caseBasicEvent(BasicEvent object)
      {
        return createBasicEventAdapter();
      }
      @Override
      public Adapter caseDerivedEvent(DerivedEvent object)
      {
        return createDerivedEventAdapter();
      }
      @Override
      public Adapter caseShuffleExpr(ShuffleExpr object)
      {
        return createShuffleExprAdapter();
      }
      @Override
      public Adapter caseUnionExpr(UnionExpr object)
      {
        return createUnionExprAdapter();
      }
      @Override
      public Adapter caseAndExpr(AndExpr object)
      {
        return createAndExprAdapter();
      }
      @Override
      public Adapter caseCatExpr(CatExpr object)
      {
        return createCatExprAdapter();
      }
      @Override
      public Adapter caseSeqExpr(SeqExpr object)
      {
        return createSeqExprAdapter();
      }
      @Override
      public Adapter caseFilterExpr(FilterExpr object)
      {
        return createFilterExprAdapter();
      }
      @Override
      public Adapter caseVarExpr(VarExpr object)
      {
        return createVarExprAdapter();
      }
      @Override
      public Adapter caseTerminalExpr(TerminalExpr object)
      {
        return createTerminalExprAdapter();
      }
      @Override
      public Adapter caseSingletons(Singletons object)
      {
        return createSingletonsAdapter();
      }
      @Override
      public Adapter caseSize(Size object)
      {
        return createSizeAdapter();
      }
      @Override
      public Adapter caseCardinality(Cardinality object)
      {
        return createCardinalityAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.Domainmodel
   * @generated
   */
  public Adapter createDomainmodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.PrologExpression <em>Prolog Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.PrologExpression
   * @generated
   */
  public Adapter createPrologExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.TraceExpression <em>Trace Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.TraceExpression
   * @generated
   */
  public Adapter createTraceExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.GenericTraceExpression <em>Generic Trace Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.GenericTraceExpression
   * @generated
   */
  public Adapter createGenericTraceExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.InteractionTraceExpression <em>Interaction Trace Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.InteractionTraceExpression
   * @generated
   */
  public Adapter createInteractionTraceExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.EventType <em>Event Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.EventType
   * @generated
   */
  public Adapter createEventTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.MsgEventType <em>Msg Event Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.MsgEventType
   * @generated
   */
  public Adapter createMsgEventTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.GroundTerm <em>Ground Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.GroundTerm
   * @generated
   */
  public Adapter createGroundTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.Msg <em>Msg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.Msg
   * @generated
   */
  public Adapter createMsgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.Channel <em>Channel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.Channel
   * @generated
   */
  public Adapter createChannelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.Role
   * @generated
   */
  public Adapter createRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.Partition <em>Partition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.Partition
   * @generated
   */
  public Adapter createPartitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.Together <em>Together</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.Together
   * @generated
   */
  public Adapter createTogetherAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.AtomExpression <em>Atom Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.AtomExpression
   * @generated
   */
  public Adapter createAtomExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.VariableExpression <em>Variable Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.VariableExpression
   * @generated
   */
  public Adapter createVariableExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.StringExpression <em>String Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.StringExpression
   * @generated
   */
  public Adapter createStringExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.NumberExpression <em>Number Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.NumberExpression
   * @generated
   */
  public Adapter createNumberExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.ListExpression <em>List Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.ListExpression
   * @generated
   */
  public Adapter createListExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.BasicEvent <em>Basic Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.BasicEvent
   * @generated
   */
  public Adapter createBasicEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.DerivedEvent <em>Derived Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.DerivedEvent
   * @generated
   */
  public Adapter createDerivedEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.ShuffleExpr <em>Shuffle Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.ShuffleExpr
   * @generated
   */
  public Adapter createShuffleExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.UnionExpr <em>Union Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.UnionExpr
   * @generated
   */
  public Adapter createUnionExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.AndExpr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.AndExpr
   * @generated
   */
  public Adapter createAndExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.CatExpr <em>Cat Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.CatExpr
   * @generated
   */
  public Adapter createCatExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.SeqExpr <em>Seq Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.SeqExpr
   * @generated
   */
  public Adapter createSeqExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.FilterExpr <em>Filter Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.FilterExpr
   * @generated
   */
  public Adapter createFilterExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.VarExpr <em>Var Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.VarExpr
   * @generated
   */
  public Adapter createVarExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.TerminalExpr <em>Terminal Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.TerminalExpr
   * @generated
   */
  public Adapter createTerminalExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.Singletons <em>Singletons</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.Singletons
   * @generated
   */
  public Adapter createSingletonsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.Size
   * @generated
   */
  public Adapter createSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unige.dibris.trace_expression_language.tExp.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unige.dibris.trace_expression_language.tExp.Cardinality
   * @generated
   */
  public Adapter createCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TExpAdapterFactory
