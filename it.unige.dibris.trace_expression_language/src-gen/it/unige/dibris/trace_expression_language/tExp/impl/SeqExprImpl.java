/**
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.tExp.impl;

import it.unige.dibris.trace_expression_language.tExp.Expression;
import it.unige.dibris.trace_expression_language.tExp.SeqExpr;
import it.unige.dibris.trace_expression_language.tExp.TExpPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seq Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.SeqExprImpl#getSeqExpr <em>Seq Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeqExprImpl extends ExpressionImpl implements SeqExpr
{
  /**
   * The cached value of the '{@link #getSeqExpr() <em>Seq Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeqExpr()
   * @generated
   * @ordered
   */
  protected Expression seqExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SeqExprImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TExpPackage.Literals.SEQ_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSeqExpr()
  {
    return seqExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSeqExpr(Expression newSeqExpr, NotificationChain msgs)
  {
    Expression oldSeqExpr = seqExpr;
    seqExpr = newSeqExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TExpPackage.SEQ_EXPR__SEQ_EXPR, oldSeqExpr, newSeqExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeqExpr(Expression newSeqExpr)
  {
    if (newSeqExpr != seqExpr)
    {
      NotificationChain msgs = null;
      if (seqExpr != null)
        msgs = ((InternalEObject)seqExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TExpPackage.SEQ_EXPR__SEQ_EXPR, null, msgs);
      if (newSeqExpr != null)
        msgs = ((InternalEObject)newSeqExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TExpPackage.SEQ_EXPR__SEQ_EXPR, null, msgs);
      msgs = basicSetSeqExpr(newSeqExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TExpPackage.SEQ_EXPR__SEQ_EXPR, newSeqExpr, newSeqExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TExpPackage.SEQ_EXPR__SEQ_EXPR:
        return basicSetSeqExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TExpPackage.SEQ_EXPR__SEQ_EXPR:
        return getSeqExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TExpPackage.SEQ_EXPR__SEQ_EXPR:
        setSeqExpr((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TExpPackage.SEQ_EXPR__SEQ_EXPR:
        setSeqExpr((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TExpPackage.SEQ_EXPR__SEQ_EXPR:
        return seqExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //SeqExprImpl