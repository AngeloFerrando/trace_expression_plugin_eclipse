/**
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.tExp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Msg Event Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.MsgEventType#getName <em>Name</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.MsgEventType#getExpr <em>Expr</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.MsgEventType#getExprs <em>Exprs</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.MsgEventType#getMsgs <em>Msgs</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.MsgEventType#getChannel <em>Channel</em>}</li>
 * </ul>
 *
 * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getMsgEventType()
 * @model
 * @generated
 */
public interface MsgEventType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getMsgEventType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.unige.dibris.trace_expression_language.tExp.MsgEventType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getMsgEventType_Expr()
   * @model containment="true"
   * @generated
   */
  PrologExpression getExpr();

  /**
   * Sets the value of the '{@link it.unige.dibris.trace_expression_language.tExp.MsgEventType#getExpr <em>Expr</em>}' containment reference.
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
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getMsgEventType_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<PrologExpression> getExprs();

  /**
   * Returns the value of the '<em><b>Msgs</b></em>' containment reference list.
   * The list contents are of type {@link it.unige.dibris.trace_expression_language.tExp.Msg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msgs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msgs</em>' containment reference list.
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getMsgEventType_Msgs()
   * @model containment="true"
   * @generated
   */
  EList<Msg> getMsgs();

  /**
   * Returns the value of the '<em><b>Channel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channel</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channel</em>' reference.
   * @see #setChannel(Channel)
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getMsgEventType_Channel()
   * @model
   * @generated
   */
  Channel getChannel();

  /**
   * Sets the value of the '{@link it.unige.dibris.trace_expression_language.tExp.MsgEventType#getChannel <em>Channel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Channel</em>' reference.
   * @see #getChannel()
   * @generated
   */
  void setChannel(Channel value);

} // MsgEventType