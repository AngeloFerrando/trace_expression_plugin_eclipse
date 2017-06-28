/**
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.tExp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.Channel#getName <em>Name</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.Channel#getReliability <em>Reliability</em>}</li>
 * </ul>
 *
 * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends EObject
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
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getChannel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.unige.dibris.trace_expression_language.tExp.Channel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Reliability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reliability</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reliability</em>' attribute.
   * @see #setReliability(String)
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getChannel_Reliability()
   * @model
   * @generated
   */
  String getReliability();

  /**
   * Sets the value of the '{@link it.unige.dibris.trace_expression_language.tExp.Channel#getReliability <em>Reliability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reliability</em>' attribute.
   * @see #getReliability()
   * @generated
   */
  void setReliability(String value);

} // Channel
