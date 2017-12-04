/**
 */
package es.unizar.disco.dice.DDSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Spark Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmSparkCluster#getDriver_memory <em>Driver memory</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmSparkCluster#getDriver_cores <em>Driver cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmSparkCluster#getMax_result_size <em>Max result size</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmSparkCluster#getUi_port <em>Ui port</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmSparkCluster#getExecutor_memory <em>Executor memory</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmSparkCluster#getExecutor_cores <em>Executor cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmSparkCluster#getNum_executors <em>Num executors</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmSparkCluster()
 * @model
 * @generated
 */
public interface DdsmSparkCluster extends DdsmMasterSlavePlatform {

	/**
	 * Returns the value of the '<em><b>Driver memory</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver memory</em>' attribute.
	 * @see #setDriver_memory(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmSparkCluster_Driver_memory()
	 * @model default="5" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDriver_memory();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmSparkCluster#getDriver_memory <em>Driver memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver memory</em>' attribute.
	 * @see #getDriver_memory()
	 * @generated
	 */
	void setDriver_memory(int value);

	/**
	 * Returns the value of the '<em><b>Driver cores</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver cores</em>' attribute.
	 * @see #setDriver_cores(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmSparkCluster_Driver_cores()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDriver_cores();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmSparkCluster#getDriver_cores <em>Driver cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver cores</em>' attribute.
	 * @see #getDriver_cores()
	 * @generated
	 */
	void setDriver_cores(int value);

	/**
	 * Returns the value of the '<em><b>Max result size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max result size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max result size</em>' attribute.
	 * @see #setMax_result_size(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmSparkCluster_Max_result_size()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMax_result_size();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmSparkCluster#getMax_result_size <em>Max result size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max result size</em>' attribute.
	 * @see #getMax_result_size()
	 * @generated
	 */
	void setMax_result_size(int value);

	/**
	 * Returns the value of the '<em><b>Ui port</b></em>' attribute.
	 * The default value is <code>"4040"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui port</em>' attribute.
	 * @see #setUi_port(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmSparkCluster_Ui_port()
	 * @model default="4040" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getUi_port();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmSparkCluster#getUi_port <em>Ui port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui port</em>' attribute.
	 * @see #getUi_port()
	 * @generated
	 */
	void setUi_port(int value);

	/**
	 * Returns the value of the '<em><b>Executor memory</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor memory</em>' attribute.
	 * @see #setExecutor_memory(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmSparkCluster_Executor_memory()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExecutor_memory();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmSparkCluster#getExecutor_memory <em>Executor memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor memory</em>' attribute.
	 * @see #getExecutor_memory()
	 * @generated
	 */
	void setExecutor_memory(int value);

	/**
	 * Returns the value of the '<em><b>Executor cores</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor cores</em>' attribute.
	 * @see #setExecutor_cores(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmSparkCluster_Executor_cores()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExecutor_cores();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmSparkCluster#getExecutor_cores <em>Executor cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor cores</em>' attribute.
	 * @see #getExecutor_cores()
	 * @generated
	 */
	void setExecutor_cores(int value);

	/**
	 * Returns the value of the '<em><b>Num executors</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num executors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num executors</em>' attribute.
	 * @see #setNum_executors(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmSparkCluster_Num_executors()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNum_executors();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmSparkCluster#getNum_executors <em>Num executors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num executors</em>' attribute.
	 * @see #getNum_executors()
	 * @generated
	 */
	void setNum_executors(int value);
} // DdsmSparkCluster
