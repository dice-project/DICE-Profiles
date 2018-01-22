/**
 */
package es.unizar.disco.dice.Complex_Data_Types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.PortMapping#getInPort <em>In Port</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.PortMapping#getOutPort <em>Out Port</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getPortMapping()
 * @model
 * @generated
 */
public interface PortMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Port</em>' attribute.
	 * @see #setInPort(int)
	 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getPortMapping_InPort()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getInPort();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Complex_Data_Types.PortMapping#getInPort <em>In Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Port</em>' attribute.
	 * @see #getInPort()
	 * @generated
	 */
	void setInPort(int value);

	/**
	 * Returns the value of the '<em><b>Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Port</em>' attribute.
	 * @see #setOutPort(int)
	 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getPortMapping_OutPort()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getOutPort();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Complex_Data_Types.PortMapping#getOutPort <em>Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' attribute.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(int value);

} // PortMapping
