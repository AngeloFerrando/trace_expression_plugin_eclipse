/**
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.tExp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.Event#getExpr <em>Expr</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.Event#getExprs <em>Exprs</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.Event#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(PrologExpression)
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getEvent_Expr()
   * @model containment="true"
   * @generated
   */
  PrologExpression getExpr();

  /**
   * Sets the value of the '{@link it.unige.dibris.trace_expression_language.tExp.Event#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(PrologExpression value);

  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link it.unige.dibris.trace_expression_language.tExp.PrologExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getEvent_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<PrologExpression> getExprs();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference.
   * @see #setConstraints(PrologExpression)
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getEvent_Constraints()
   * @model containment="true"
   * @generated
   */
  PrologExpression getConstraints();

  /**
   * Sets the value of the '{@link it.unige.dibris.trace_expression_language.tExp.Event#getConstraints <em>Constraints</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraints</em>' containment reference.
   * @see #getConstraints()
   * @generated
   */
  void setConstraints(PrologExpression value);

} // Event
