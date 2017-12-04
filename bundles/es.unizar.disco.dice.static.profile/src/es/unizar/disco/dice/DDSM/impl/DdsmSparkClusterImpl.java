/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmSparkCluster;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Spark Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmSparkClusterImpl#getDriver_memory <em>Driver memory</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmSparkClusterImpl#getDriver_cores <em>Driver cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmSparkClusterImpl#getMax_result_size <em>Max result size</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmSparkClusterImpl#getUi_port <em>Ui port</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmSparkClusterImpl#getExecutor_memory <em>Executor memory</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmSparkClusterImpl#getExecutor_cores <em>Executor cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmSparkClusterImpl#getNum_executors <em>Num executors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmSparkClusterImpl extends DdsmMasterSlavePlatformImpl implements DdsmSparkCluster {
	/**
	 * The default value of the '{@link #getDriver_memory() <em>Driver memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver_memory()
	 * @generated
	 * @ordered
	 */
	protected static final int DRIVER_MEMORY_EDEFAULT = 5;
	/**
	 * The cached value of the '{@link #getDriver_memory() <em>Driver memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver_memory()
	 * @generated
	 * @ordered
	 */
	protected int driver_memory = DRIVER_MEMORY_EDEFAULT;
	/**
	 * The default value of the '{@link #getDriver_cores() <em>Driver cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver_cores()
	 * @generated
	 * @ordered
	 */
	protected static final int DRIVER_CORES_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getDriver_cores() <em>Driver cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver_cores()
	 * @generated
	 * @ordered
	 */
	protected int driver_cores = DRIVER_CORES_EDEFAULT;
	/**
	 * The default value of the '{@link #getMax_result_size() <em>Max result size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_result_size()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_RESULT_SIZE_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getMax_result_size() <em>Max result size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_result_size()
	 * @generated
	 * @ordered
	 */
	protected int max_result_size = MAX_RESULT_SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getUi_port() <em>Ui port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUi_port()
	 * @generated
	 * @ordered
	 */
	protected static final int UI_PORT_EDEFAULT = 4040;
	/**
	 * The cached value of the '{@link #getUi_port() <em>Ui port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUi_port()
	 * @generated
	 * @ordered
	 */
	protected int ui_port = UI_PORT_EDEFAULT;
	/**
	 * The default value of the '{@link #getExecutor_memory() <em>Executor memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor_memory()
	 * @generated
	 * @ordered
	 */
	protected static final int EXECUTOR_MEMORY_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getExecutor_memory() <em>Executor memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor_memory()
	 * @generated
	 * @ordered
	 */
	protected int executor_memory = EXECUTOR_MEMORY_EDEFAULT;
	/**
	 * The default value of the '{@link #getExecutor_cores() <em>Executor cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor_cores()
	 * @generated
	 * @ordered
	 */
	protected static final int EXECUTOR_CORES_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getExecutor_cores() <em>Executor cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor_cores()
	 * @generated
	 * @ordered
	 */
	protected int executor_cores = EXECUTOR_CORES_EDEFAULT;
	/**
	 * The default value of the '{@link #getNum_executors() <em>Num executors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_executors()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_EXECUTORS_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getNum_executors() <em>Num executors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_executors()
	 * @generated
	 * @ordered
	 */
	protected int num_executors = NUM_EXECUTORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmSparkClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_SPARK_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDriver_memory() {
		return driver_memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriver_memory(int newDriver_memory) {
		int oldDriver_memory = driver_memory;
		driver_memory = newDriver_memory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_SPARK_CLUSTER__DRIVER_MEMORY, oldDriver_memory, driver_memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDriver_cores() {
		return driver_cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriver_cores(int newDriver_cores) {
		int oldDriver_cores = driver_cores;
		driver_cores = newDriver_cores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_SPARK_CLUSTER__DRIVER_CORES, oldDriver_cores, driver_cores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax_result_size() {
		return max_result_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_result_size(int newMax_result_size) {
		int oldMax_result_size = max_result_size;
		max_result_size = newMax_result_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_SPARK_CLUSTER__MAX_RESULT_SIZE, oldMax_result_size, max_result_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUi_port() {
		return ui_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUi_port(int newUi_port) {
		int oldUi_port = ui_port;
		ui_port = newUi_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_SPARK_CLUSTER__UI_PORT, oldUi_port, ui_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExecutor_memory() {
		return executor_memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutor_memory(int newExecutor_memory) {
		int oldExecutor_memory = executor_memory;
		executor_memory = newExecutor_memory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_SPARK_CLUSTER__EXECUTOR_MEMORY, oldExecutor_memory, executor_memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExecutor_cores() {
		return executor_cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutor_cores(int newExecutor_cores) {
		int oldExecutor_cores = executor_cores;
		executor_cores = newExecutor_cores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_SPARK_CLUSTER__EXECUTOR_CORES, oldExecutor_cores, executor_cores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNum_executors() {
		return num_executors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNum_executors(int newNum_executors) {
		int oldNum_executors = num_executors;
		num_executors = newNum_executors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_SPARK_CLUSTER__NUM_EXECUTORS, oldNum_executors, num_executors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_SPARK_CLUSTER__DRIVER_MEMORY:
				return getDriver_memory();
			case DDSMPackage.DDSM_SPARK_CLUSTER__DRIVER_CORES:
				return getDriver_cores();
			case DDSMPackage.DDSM_SPARK_CLUSTER__MAX_RESULT_SIZE:
				return getMax_result_size();
			case DDSMPackage.DDSM_SPARK_CLUSTER__UI_PORT:
				return getUi_port();
			case DDSMPackage.DDSM_SPARK_CLUSTER__EXECUTOR_MEMORY:
				return getExecutor_memory();
			case DDSMPackage.DDSM_SPARK_CLUSTER__EXECUTOR_CORES:
				return getExecutor_cores();
			case DDSMPackage.DDSM_SPARK_CLUSTER__NUM_EXECUTORS:
				return getNum_executors();
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
			case DDSMPackage.DDSM_SPARK_CLUSTER__DRIVER_MEMORY:
				setDriver_memory((Integer)newValue);
				return;
			case DDSMPackage.DDSM_SPARK_CLUSTER__DRIVER_CORES:
				setDriver_cores((Integer)newValue);
				return;
			case DDSMPackage.DDSM_SPARK_CLUSTER__MAX_RESULT_SIZE:
				setMax_result_size((Integer)newValue);
				return;
			case DDSMPackage.DDSM_SPARK_CLUSTER__UI_PORT:
				setUi_port((Integer)newValue);
				return;
			case DDSMPackage.DDSM_SPARK_CLUSTER__EXECUTOR_MEMORY:
				setExecutor_memory((Integer)newValue);
				return;
			case DDSMPackage.DDSM_SPARK_CLUSTER__EXECUTOR_CORES:
				setExecutor_cores((Integer)newValue);
				return;
			case DDSMPackage.DDSM_SPARK_CLUSTER__NUM_EXECUTORS:
				setNum_executors((Integer)newValue);
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
			case DDSMPackage.DDSM_SPARK_CLUSTER__DRIVER_MEMORY:
				setDriver_memory(DRIVER_MEMORY_EDEFAULT);
				return;
			case DDSMPackage.DDSM_SPARK_CLUSTER__DRIVER_CORES:
				setDriver_cores(DRIVER_CORES_EDEFAULT);
				return;
			case DDSMPackage.DDSM_SPARK_CLUSTER__MAX_RESULT_SIZE:
				setMax_result_size(MAX_RESULT_SIZE_EDEFAULT);
				return;
			case DDSMPackage.DDSM_SPARK_CLUSTER__UI_PORT:
				setUi_port(UI_PORT_EDEFAULT);
				return;
			case DDSMPackage.DDSM_SPARK_CLUSTER__EXECUTOR_MEMORY:
				setExecutor_memory(EXECUTOR_MEMORY_EDEFAULT);
				return;
			case DDSMPackage.DDSM_SPARK_CLUSTER__EXECUTOR_CORES:
				setExecutor_cores(EXECUTOR_CORES_EDEFAULT);
				return;
			case DDSMPackage.DDSM_SPARK_CLUSTER__NUM_EXECUTORS:
				setNum_executors(NUM_EXECUTORS_EDEFAULT);
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
			case DDSMPackage.DDSM_SPARK_CLUSTER__DRIVER_MEMORY:
				return driver_memory != DRIVER_MEMORY_EDEFAULT;
			case DDSMPackage.DDSM_SPARK_CLUSTER__DRIVER_CORES:
				return driver_cores != DRIVER_CORES_EDEFAULT;
			case DDSMPackage.DDSM_SPARK_CLUSTER__MAX_RESULT_SIZE:
				return max_result_size != MAX_RESULT_SIZE_EDEFAULT;
			case DDSMPackage.DDSM_SPARK_CLUSTER__UI_PORT:
				return ui_port != UI_PORT_EDEFAULT;
			case DDSMPackage.DDSM_SPARK_CLUSTER__EXECUTOR_MEMORY:
				return executor_memory != EXECUTOR_MEMORY_EDEFAULT;
			case DDSMPackage.DDSM_SPARK_CLUSTER__EXECUTOR_CORES:
				return executor_cores != EXECUTOR_CORES_EDEFAULT;
			case DDSMPackage.DDSM_SPARK_CLUSTER__NUM_EXECUTORS:
				return num_executors != NUM_EXECUTORS_EDEFAULT;
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
		result.append(" (driver_memory: ");
		result.append(driver_memory);
		result.append(", driver_cores: ");
		result.append(driver_cores);
		result.append(", max_result_size: ");
		result.append(max_result_size);
		result.append(", ui_port: ");
		result.append(ui_port);
		result.append(", executor_memory: ");
		result.append(executor_memory);
		result.append(", executor_cores: ");
		result.append(executor_cores);
		result.append(", num_executors: ");
		result.append(num_executors);
		result.append(')');
		return result.toString();
	}

} //DdsmSparkClusterImpl
