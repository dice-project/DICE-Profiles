/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable;
import es.unizar.disco.dice.Complex_Data_Types.PortMapping;
import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmDockerContainer;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Docker Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmDockerContainerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmDockerContainerImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmDockerContainerImpl#getPortMappings <em>Port Mappings</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmDockerContainerImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmDockerContainerImpl#getEnvVariables <em>Env Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmDockerContainerImpl extends DdsmInternalComponentImpl implements DdsmDockerContainer {
	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortMappings() <em>Port Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<PortMapping> portMappings;

	/**
	 * The default value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected String network = NETWORK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnvVariables() <em>Env Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvironmentVariable> envVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmDockerContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_DOCKER_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_DOCKER_CONTAINER__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_DOCKER_CONTAINER__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortMapping> getPortMappings() {
		if (portMappings == null) {
			portMappings = new EObjectContainmentEList<PortMapping>(PortMapping.class, this, DDSMPackage.DDSM_DOCKER_CONTAINER__PORT_MAPPINGS);
		}
		return portMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(String newNetwork) {
		String oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_DOCKER_CONTAINER__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvironmentVariable> getEnvVariables() {
		if (envVariables == null) {
			envVariables = new EObjectContainmentEList<EnvironmentVariable>(EnvironmentVariable.class, this, DDSMPackage.DDSM_DOCKER_CONTAINER__ENV_VARIABLES);
		}
		return envVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DDSMPackage.DDSM_DOCKER_CONTAINER__PORT_MAPPINGS:
				return ((InternalEList<?>)getPortMappings()).basicRemove(otherEnd, msgs);
			case DDSMPackage.DDSM_DOCKER_CONTAINER__ENV_VARIABLES:
				return ((InternalEList<?>)getEnvVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_DOCKER_CONTAINER__IMAGE:
				return getImage();
			case DDSMPackage.DDSM_DOCKER_CONTAINER__TAG:
				return getTag();
			case DDSMPackage.DDSM_DOCKER_CONTAINER__PORT_MAPPINGS:
				return getPortMappings();
			case DDSMPackage.DDSM_DOCKER_CONTAINER__NETWORK:
				return getNetwork();
			case DDSMPackage.DDSM_DOCKER_CONTAINER__ENV_VARIABLES:
				return getEnvVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DDSMPackage.DDSM_DOCKER_CONTAINER__IMAGE:
				setImage((String)newValue);
				return;
			case DDSMPackage.DDSM_DOCKER_CONTAINER__TAG:
				setTag((String)newValue);
				return;
			case DDSMPackage.DDSM_DOCKER_CONTAINER__PORT_MAPPINGS:
				getPortMappings().clear();
				getPortMappings().addAll((Collection<? extends PortMapping>)newValue);
				return;
			case DDSMPackage.DDSM_DOCKER_CONTAINER__NETWORK:
				setNetwork((String)newValue);
				return;
			case DDSMPackage.DDSM_DOCKER_CONTAINER__ENV_VARIABLES:
				getEnvVariables().clear();
				getEnvVariables().addAll((Collection<? extends EnvironmentVariable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DDSMPackage.DDSM_DOCKER_CONTAINER__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case DDSMPackage.DDSM_DOCKER_CONTAINER__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case DDSMPackage.DDSM_DOCKER_CONTAINER__PORT_MAPPINGS:
				getPortMappings().clear();
				return;
			case DDSMPackage.DDSM_DOCKER_CONTAINER__NETWORK:
				setNetwork(NETWORK_EDEFAULT);
				return;
			case DDSMPackage.DDSM_DOCKER_CONTAINER__ENV_VARIABLES:
				getEnvVariables().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DDSMPackage.DDSM_DOCKER_CONTAINER__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case DDSMPackage.DDSM_DOCKER_CONTAINER__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case DDSMPackage.DDSM_DOCKER_CONTAINER__PORT_MAPPINGS:
				return portMappings != null && !portMappings.isEmpty();
			case DDSMPackage.DDSM_DOCKER_CONTAINER__NETWORK:
				return NETWORK_EDEFAULT == null ? network != null : !NETWORK_EDEFAULT.equals(network);
			case DDSMPackage.DDSM_DOCKER_CONTAINER__ENV_VARIABLES:
				return envVariables != null && !envVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (image: ");
		result.append(image);
		result.append(", tag: ");
		result.append(tag);
		result.append(", network: ");
		result.append(network);
		result.append(')');
		return result.toString();
	}

} //DdsmDockerContainerImpl
