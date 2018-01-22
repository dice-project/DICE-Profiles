/**
 */
package es.unizar.disco.dice.DDSM;

import es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable;
import es.unizar.disco.dice.Complex_Data_Types.PortMapping;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Docker Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmDockerContainer#getImage <em>Image</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmDockerContainer#getTag <em>Tag</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmDockerContainer#getPortMappings <em>Port Mappings</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmDockerContainer#getNetwork <em>Network</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmDockerContainer#getEnvVariables <em>Env Variables</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmDockerContainer()
 * @model
 * @generated
 */
public interface DdsmDockerContainer extends DdsmInternalComponent {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmDockerContainer_Image()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmDockerContainer#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmDockerContainer_Tag()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmDockerContainer#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Port Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.Complex_Data_Types.PortMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Mappings</em>' containment reference list.
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmDockerContainer_PortMappings()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PortMapping> getPortMappings();

	/**
	 * Returns the value of the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' attribute.
	 * @see #setNetwork(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmDockerContainer_Network()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getNetwork();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmDockerContainer#getNetwork <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' attribute.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(String value);

	/**
	 * Returns the value of the '<em><b>Env Variables</b></em>' containment reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Variables</em>' containment reference list.
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmDockerContainer_EnvVariables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EnvironmentVariable> getEnvVariables();

} // DdsmDockerContainer
