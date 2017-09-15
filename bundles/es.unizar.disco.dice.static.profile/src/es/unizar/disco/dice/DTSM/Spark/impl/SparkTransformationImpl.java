/**
 */
package es.unizar.disco.dice.DTSM.Spark.impl;

import es.unizar.disco.dice.DTSM.Spark.SparkPackage;
import es.unizar.disco.dice.DTSM.Spark.SparkTransformation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkTransformationImpl#getMapType <em>Map Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparkTransformationImpl extends SparkOperationImpl implements SparkTransformation {
	/**
	 * The default value of the '{@link #getMapType() <em>Map Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapType()
	 * @generated
	 * @ordered
	 */
	protected static final es.unizar.disco.dice.Basic_Enumeration_Types.SparkTransformation MAP_TYPE_EDEFAULT = es.unizar.disco.dice.Basic_Enumeration_Types.SparkTransformation.MAP;

	/**
	 * The cached value of the '{@link #getMapType() <em>Map Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapType()
	 * @generated
	 * @ordered
	 */
	protected es.unizar.disco.dice.Basic_Enumeration_Types.SparkTransformation mapType = MAP_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SparkTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SparkPackage.Literals.SPARK_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public es.unizar.disco.dice.Basic_Enumeration_Types.SparkTransformation getMapType() {
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapType(es.unizar.disco.dice.Basic_Enumeration_Types.SparkTransformation newMapType) {
		es.unizar.disco.dice.Basic_Enumeration_Types.SparkTransformation oldMapType = mapType;
		mapType = newMapType == null ? MAP_TYPE_EDEFAULT : newMapType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_TRANSFORMATION__MAP_TYPE, oldMapType, mapType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SparkPackage.SPARK_TRANSFORMATION__MAP_TYPE:
				return getMapType();
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
			case SparkPackage.SPARK_TRANSFORMATION__MAP_TYPE:
				setMapType((es.unizar.disco.dice.Basic_Enumeration_Types.SparkTransformation)newValue);
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
			case SparkPackage.SPARK_TRANSFORMATION__MAP_TYPE:
				setMapType(MAP_TYPE_EDEFAULT);
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
			case SparkPackage.SPARK_TRANSFORMATION__MAP_TYPE:
				return mapType != MAP_TYPE_EDEFAULT;
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
		result.append(" (MapType: ");
		result.append(mapType);
		result.append(')');
		return result.toString();
	}

} //SparkTransformationImpl
