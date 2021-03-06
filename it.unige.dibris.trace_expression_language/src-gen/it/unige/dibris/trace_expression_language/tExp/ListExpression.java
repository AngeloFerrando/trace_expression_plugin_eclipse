/**
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.tExp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.ListExpression#getHead <em>Head</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.ListExpression#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getListExpression()
 * @model
 * @generated
 */
public interface ListExpression extends PrologExpression
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(PrologExpression)
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getListExpression_Head()
   * @model containment="true"
   * @generated
   */
  PrologExpression getHead();

  /**
   * Sets the value of the '{@link it.unige.dibris.trace_expression_language.tExp.ListExpression#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(PrologExpression value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference.
   * @see #setTail(PrologExpression)
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getListExpression_Tail()
   * @model containment="true"
   * @generated
   */
  PrologExpression getTail();

  /**
   * Sets the value of the '{@link it.unige.dibris.trace_expression_language.tExp.ListExpression#getTail <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' containment reference.
   * @see #getTail()
   * @generated
   */
  void setTail(PrologExpression value);

} // ListExpression
