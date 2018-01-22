/**
 */
package es.unizar.disco.dice.Complex_Data_Types.impl;

import es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage;
import es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable;
import es.unizar.disco.dice.Complex_Data_Types.RequiredAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.impl.EnvironmentVariableImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.impl.EnvironmentVariableImpl#getVariableDefinition <em>Variable Definition</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.impl.EnvironmentVariableImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentVariableImpl extends MinimalEObjectImpl.Container implements EnvironmentVariable {
	/**
	 * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected String variableName = VARIABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariableDefinition() <em>Variable Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDefinition()
	 * @generated
	 * @ordered
	 */
	protected RequiredAttribute variableDefinition;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Complex_Data_TypesPackage.Literals.ENVIRONMENT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableName() {
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		String oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__VARIABLE_NAME, oldVariableName, variableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredAttribute getVariableDefinition() {
		return variableDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDefinition(RequiredAttribute newVariableDefinition, NotificationChain msgs) {
		RequiredAttribute oldVariableDefinition = variableDefinition;
		variableDefinition = newVariableDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__VARIABLE_DEFINITION, oldVariableDefinition, newVariableDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDefinition(RequiredAttribute newVariableDefinition) {
		if (newVariableDefinition != variableDefinition) {
			NotificationChain msgs = null;
			if (variableDefinition != null)
				msgs = ((InternalEObject)variableDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__VARIABLE_DEFINITION, null, msgs);
			if (newVariableDefinition != null)
				msgs = ((InternalEObject)newVariableDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__VARIABLE_DEFINITION, null, msgs);
			msgs = basicSetVariableDefinition(newVariableDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__VARIABLE_DEFINITION, newVariableDefinition, newVariableDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__VARIABLE_DEFINITION:
				return basicSetVariableDefinition(null, msgs);
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
			case Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__VARIABLE_NAME:
				return getVariableName();
			case Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__VARIABLE_DEFINITION:
				return getVariableDefinition();
			case Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__DEFAULT_VALUE:
				return getDefaultValue();
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
			case Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__VARIABLE_NAME:
				setVariableName((String)newValue);
				return;
			case Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__VARIABLE_DEFINITION:
				setVariableDefinition((RequiredAttribute)newValue);
				return;
			case Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
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
			case Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__VARIABLE_NAME:
				setVariableName(VARIABLE_NAME_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__VARIABLE_DEFINITION:
				setVariableDefinition((RequiredAttribute)null);
				return;
			case Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
			case Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__VARIABLE_NAME:
				return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
			case Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__VARIABLE_DEFINITION:
				return variableDefinition != null;
			case Complex_Data_TypesPackage.ENVIRONMENT_VARIABLE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
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
		result.append(" (variableName: ");
		result.append(variableName);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //EnvironmentVariableImpl
