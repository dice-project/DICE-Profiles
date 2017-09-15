/**
 */
package es.unizar.disco.dice.DTSM.Spark;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkTransformation#getMapType <em>Map Type</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkTransformation()
 * @model
 * @generated
 */
public interface SparkTransformation extends SparkOperation {
	/**
	 * Returns the value of the '<em><b>Map Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.SparkTransformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.SparkTransformation
	 * @see #setMapType(es.unizar.disco.dice.Basic_Enumeration_Types.SparkTransformation)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkTransformation_MapType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	es.unizar.disco.dice.Basic_Enumeration_Types.SparkTransformation getMapType();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkTransformation#getMapType <em>Map Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.SparkTransformation
	 * @see #getMapType()
	 * @generated
	 */
	void setMapType(es.unizar.disco.dice.Basic_Enumeration_Types.SparkTransformation value);

} // SparkTransformation
