/**
 */
package es.unizar.disco.dice.Complex_Data_Types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable#getVariableDefinition <em>Variable Definition</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getEnvironmentVariable()
 * @model
 * @generated
 */
public interface EnvironmentVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getEnvironmentVariable_VariableName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Variable Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Definition</em>' containment reference.
	 * @see #setVariableDefinition(RequiredAttribute)
	 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getEnvironmentVariable_VariableDefinition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	RequiredAttribute getVariableDefinition();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable#getVariableDefinition <em>Variable Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Definition</em>' containment reference.
	 * @see #getVariableDefinition()
	 * @generated
	 */
	void setVariableDefinition(RequiredAttribute value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getEnvironmentVariable_DefaultValue()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

} // EnvironmentVariable
