/**
 */
package es.unizar.disco.dice.DDSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm OSv Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmOSvContainer#getUser_data <em>User data</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmOSvContainer()
 * @model
 * @generated
 */
public interface DdsmOSvContainer extends DdsmVMsCluster, DdsmInternalComponent {
	/**
	 * Returns the value of the '<em><b>User data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User data</em>' attribute.
	 * @see #setUser_data(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmOSvContainer_User_data()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getUser_data();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmOSvContainer#getUser_data <em>User data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User data</em>' attribute.
	 * @see #getUser_data()
	 * @generated
	 */
	void setUser_data(String value);

} // DdsmOSvContainer
