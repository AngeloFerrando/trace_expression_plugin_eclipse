/**
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.tExp.impl;

import it.unige.dibris.trace_expression_language.tExp.Expression;
import it.unige.dibris.trace_expression_language.tExp.FilterExpr;
import it.unige.dibris.trace_expression_language.tExp.TExpPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.FilterExprImpl#getFilterExpr <em>Filter Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterExprImpl extends ExpressionImpl implements FilterExpr
{
  /**
   * The cached value of the '{@link #getFilterExpr() <em>Filter Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilterExpr()
   * @generated
   * @ordered
   */
  protected Expression filterExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilterExprImpl()
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
    return TExpPackage.Literals.FILTER_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getFilterExpr()
  {
    return filterExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilterExpr(Expression newFilterExpr, NotificationChain msgs)
  {
    Expression oldFilterExpr = filterExpr;
    filterExpr = newFilterExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TExpPackage.FILTER_EXPR__FILTER_EXPR, oldFilterExpr, newFilterExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilterExpr(Expression newFilterExpr)
  {
    if (newFilterExpr != filterExpr)
    {
      NotificationChain msgs = null;
      if (filterExpr != null)
        msgs = ((InternalEObject)filterExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TExpPackage.FILTER_EXPR__FILTER_EXPR, null, msgs);
      if (newFilterExpr != null)
        msgs = ((InternalEObject)newFilterExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TExpPackage.FILTER_EXPR__FILTER_EXPR, null, msgs);
      msgs = basicSetFilterExpr(newFilterExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TExpPackage.FILTER_EXPR__FILTER_EXPR, newFilterExpr, newFilterExpr));
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
      case TExpPackage.FILTER_EXPR__FILTER_EXPR:
        return basicSetFilterExpr(null, msgs);
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
      case TExpPackage.FILTER_EXPR__FILTER_EXPR:
        return getFilterExpr();
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
      case TExpPackage.FILTER_EXPR__FILTER_EXPR:
        setFilterExpr((Expression)newValue);
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
      case TExpPackage.FILTER_EXPR__FILTER_EXPR:
        setFilterExpr((Expression)null);
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
      case TExpPackage.FILTER_EXPR__FILTER_EXPR:
        return filterExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //FilterExprImpl
