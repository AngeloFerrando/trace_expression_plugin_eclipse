/**
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.tExp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.Cardinality#getMinCardinality <em>Min Cardinality</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.Cardinality#getMaxCardinality <em>Max Cardinality</em>}</li>
 * </ul>
 *
 * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getCardinality()
 * @model
 * @generated
 */
public interface Cardinality extends Constraint
{
  /**
   * Returns the value of the '<em><b>Min Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Cardinality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Cardinality</em>' attribute.
   * @see #setMinCardinality(int)
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getCardinality_MinCardinality()
   * @model
   * @generated
   */
  int getMinCardinality();

  /**
   * Sets the value of the '{@link it.unige.dibris.trace_expression_language.tExp.Cardinality#getMinCardinality <em>Min Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Cardinality</em>' attribute.
   * @see #getMinCardinality()
   * @generated
   */
  void setMinCardinality(int value);

  /**
   * Returns the value of the '<em><b>Max Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Cardinality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Cardinality</em>' attribute.
   * @see #setMaxCardinality(int)
   * @see it.unige.dibris.trace_expression_language.tExp.TExpPackage#getCardinality_MaxCardinality()
   * @model
   * @generated
   */
  int getMaxCardinality();

  /**
   * Sets the value of the '{@link it.unige.dibris.trace_expression_language.tExp.Cardinality#getMaxCardinality <em>Max Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Cardinality</em>' attribute.
   * @see #getMaxCardinality()
   * @generated
   */
  void setMaxCardinality(int value);

} // Cardinality
