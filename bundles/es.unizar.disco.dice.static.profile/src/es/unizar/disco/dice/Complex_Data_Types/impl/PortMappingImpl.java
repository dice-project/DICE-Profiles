/**
 */
package es.unizar.disco.dice.Complex_Data_Types.impl;

import es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage;
import es.unizar.disco.dice.Complex_Data_Types.PortMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.impl.PortMappingImpl#getInPort <em>In Port</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.impl.PortMappingImpl#getOutPort <em>Out Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortMappingImpl extends MinimalEObjectImpl.Container implements PortMapping {
	/**
	 * The default value of the '{@link #getInPort() <em>In Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPort()
	 * @generated
	 * @ordered
	 */
	protected static final int IN_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInPort() <em>In Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPort()
	 * @generated
	 * @ordered
	 */
	protected int inPort = IN_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutPort() <em>Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPort()
	 * @generated
	 * @ordered
	 */
	protected static final int OUT_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOutPort() <em>Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPort()
	 * @generated
	 * @ordered
	 */
	protected int outPort = OUT_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Complex_Data_TypesPackage.Literals.PORT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInPort() {
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInPort(int newInPort) {
		int oldInPort = inPort;
		inPort = newInPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.PORT_MAPPING__IN_PORT, oldInPort, inPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutPort() {
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutPort(int newOutPort) {
		int oldOutPort = outPort;
		outPort = newOutPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.PORT_MAPPING__OUT_PORT, oldOutPort, outPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Complex_Data_TypesPackage.PORT_MAPPING__IN_PORT:
				return getInPort();
			case Complex_Data_TypesPackage.PORT_MAPPING__OUT_PORT:
				return getOutPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Complex_Data_TypesPackage.PORT_MAPPING__IN_PORT:
				setInPort((Integer)newValue);
				return;
			case Complex_Data_TypesPackage.PORT_MAPPING__OUT_PORT:
				setOutPort((Integer)newValue);
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
			case Complex_Data_TypesPackage.PORT_MAPPING__IN_PORT:
				setInPort(IN_PORT_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.PORT_MAPPING__OUT_PORT:
				setOutPort(OUT_PORT_EDEFAULT);
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
			case Complex_Data_TypesPackage.PORT_MAPPING__IN_PORT:
				return inPort != IN_PORT_EDEFAULT;
			case Complex_Data_TypesPackage.PORT_MAPPING__OUT_PORT:
				return outPort != OUT_PORT_EDEFAULT;
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
		result.append(" (inPort: ");
		result.append(inPort);
		result.append(", outPort: ");
		result.append(outPort);
		result.append(')');
		return result.toString();
	}

} //PortMappingImpl
