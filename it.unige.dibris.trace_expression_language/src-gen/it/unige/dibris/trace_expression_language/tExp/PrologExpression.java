/**
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.tExp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prolog Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.PrologExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.PrologExpression#getOp <em>Op</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.PrologExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getPrologExpression()
 * @model
 * @generated
 */
public interface PrologExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(PrologExpression)
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getPrologExpression_Left()
   * @model containment="true"
   * @generated
   */
  PrologExpression getLeft();

  /**
   * Sets the value of the '{@link it.unige.dibris.trace_expression_language.tExp.PrologExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(PrologExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getPrologExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link it.unige.dibris.trace_expression_language.tExp.PrologExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(PrologExpression)
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getPrologExpression_Right()
   * @model containment="true"
   * @generated
   */
  PrologExpression getRight();

  /**
   * Sets the value of the '{@link it.unige.dibris.trace_expression_language.tExp.PrologExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(PrologExpression value);

} // PrologExpression
