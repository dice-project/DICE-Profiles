/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Spark Transformation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getSparkTransformation()
 * @model
 * @generated
 */
public enum SparkTransformation implements Enumerator {
	/**
	 * The '<em><b>Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAP_VALUE
	 * @generated
	 * @ordered
	 */
	MAP(0, "Map", "Map"),

	/**
	 * The '<em><b>Filter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILTER_VALUE
	 * @generated
	 * @ordered
	 */
	FILTER(1, "Filter", "Filter"),

	/**
	 * The '<em><b>Sample</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLE(2, "Sample", "Sample"),

	/**
	 * The '<em><b>RDD Set Operation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDD_SET_OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	RDD_SET_OPERATION(3, "RDDSetOperation", "RDDSetOperation"),

	/**
	 * The '<em><b>Union</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNION_VALUE
	 * @generated
	 * @ordered
	 */
	UNION(4, "Union", "Union"),

	/**
	 * The '<em><b>Intersection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	INTERSECTION(5, "Intersection", "Intersection"),

	/**
	 * The '<em><b>Substraction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTRACTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTRACTION(6, "Substraction", "Substraction"),

	/**
	 * The '<em><b>Subtract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	SUBTRACT(7, "Subtract", "Subtract"),

	/**
	 * The '<em><b>Distinct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTINCT_VALUE
	 * @generated
	 * @ordered
	 */
	DISTINCT(8, "Distinct", "Distinct"),

	/**
	 * The '<em><b>By Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BY_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	BY_KEY(9, "ByKey", "ByKey"),

	/**
	 * The '<em><b>Combine By Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMBINE_BY_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	COMBINE_BY_KEY(10, "CombineByKey", "CombineByKey"),

	/**
	 * The '<em><b>Group By Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUP_BY_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	GROUP_BY_KEY(11, "GroupByKey", "GroupByKey"),

	/**
	 * The '<em><b>Reduce By Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDUCE_BY_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	REDUCE_BY_KEY(12, "ReduceByKey", "ReduceByKey"),

	/**
	 * The '<em><b>Sort By Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SORT_BY_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	SORT_BY_KEY(13, "SortByKey", "SortByKey"),

	/**
	 * The '<em><b>Join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	JOIN(14, "Join", "Join"),

	/**
	 * The '<em><b>Cartesian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARTESIAN_VALUE
	 * @generated
	 * @ordered
	 */
	CARTESIAN(15, "Cartesian", "Cartesian"),

	/**
	 * The '<em><b>Repartition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPARTITION_VALUE
	 * @generated
	 * @ordered
	 */
	REPARTITION(16, "Repartition", "Repartition"),

	/**
	 * The '<em><b>Cogroup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COGROUP_VALUE
	 * @generated
	 * @ordered
	 */
	COGROUP(17, "Cogroup", "Cogroup"),

	/**
	 * The '<em><b>Flat Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAT_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	FLAT_MAP(18, "FlatMap", "FlatMap"),

	/**
	 * The '<em><b>Group With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUP_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	GROUP_WITH(19, "GroupWith", "GroupWith"),

	/**
	 * The '<em><b>Keys</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYS_VALUE
	 * @generated
	 * @ordered
	 */
	KEYS(20, "Keys", "Keys"),

	/**
	 * The '<em><b>Map Values</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAP_VALUES_VALUE
	 * @generated
	 * @ordered
	 */
	MAP_VALUES(21, "MapValues", "MapValues"),

	/**
	 * The '<em><b>Partition By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTITION_BY_VALUE
	 * @generated
	 * @ordered
	 */
	PARTITION_BY(22, "PartitionBy", "PartitionBy"),

	/**
	 * The '<em><b>The Values</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THE_VALUES_VALUE
	 * @generated
	 * @ordered
	 */
	THE_VALUES(23, "theValues", "theValues"),

	/**
	 * The '<em><b>Text File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_FILE(24, "TextFile", "TextFile"),

	/**
	 * The '<em><b>Parallelize</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLELIZE_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLELIZE(25, "Parallelize", "Parallelize");

	/**
	 * The '<em><b>Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Map</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAP
	 * @model name="Map"
	 * @generated
	 * @ordered
	 */
	public static final int MAP_VALUE = 0;

	/**
	 * The '<em><b>Filter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Filter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILTER
	 * @model name="Filter"
	 * @generated
	 * @ordered
	 */
	public static final int FILTER_VALUE = 1;

	/**
	 * The '<em><b>Sample</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sample</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAMPLE
	 * @model name="Sample"
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLE_VALUE = 2;

	/**
	 * The '<em><b>RDD Set Operation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RDD Set Operation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RDD_SET_OPERATION
	 * @model name="RDDSetOperation"
	 * @generated
	 * @ordered
	 */
	public static final int RDD_SET_OPERATION_VALUE = 3;

	/**
	 * The '<em><b>Union</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Union</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNION
	 * @model name="Union"
	 * @generated
	 * @ordered
	 */
	public static final int UNION_VALUE = 4;

	/**
	 * The '<em><b>Intersection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intersection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERSECTION
	 * @model name="Intersection"
	 * @generated
	 * @ordered
	 */
	public static final int INTERSECTION_VALUE = 5;

	/**
	 * The '<em><b>Substraction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substraction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTRACTION
	 * @model name="Substraction"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTRACTION_VALUE = 6;

	/**
	 * The '<em><b>Subtract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subtract</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBTRACT
	 * @model name="Subtract"
	 * @generated
	 * @ordered
	 */
	public static final int SUBTRACT_VALUE = 7;

	/**
	 * The '<em><b>Distinct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distinct</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTINCT
	 * @model name="Distinct"
	 * @generated
	 * @ordered
	 */
	public static final int DISTINCT_VALUE = 8;

	/**
	 * The '<em><b>By Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>By Key</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BY_KEY
	 * @model name="ByKey"
	 * @generated
	 * @ordered
	 */
	public static final int BY_KEY_VALUE = 9;

	/**
	 * The '<em><b>Combine By Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Combine By Key</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMBINE_BY_KEY
	 * @model name="CombineByKey"
	 * @generated
	 * @ordered
	 */
	public static final int COMBINE_BY_KEY_VALUE = 10;

	/**
	 * The '<em><b>Group By Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Group By Key</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROUP_BY_KEY
	 * @model name="GroupByKey"
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_BY_KEY_VALUE = 11;

	/**
	 * The '<em><b>Reduce By Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reduce By Key</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REDUCE_BY_KEY
	 * @model name="ReduceByKey"
	 * @generated
	 * @ordered
	 */
	public static final int REDUCE_BY_KEY_VALUE = 12;

	/**
	 * The '<em><b>Sort By Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sort By Key</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SORT_BY_KEY
	 * @model name="SortByKey"
	 * @generated
	 * @ordered
	 */
	public static final int SORT_BY_KEY_VALUE = 13;

	/**
	 * The '<em><b>Join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOIN
	 * @model name="Join"
	 * @generated
	 * @ordered
	 */
	public static final int JOIN_VALUE = 14;

	/**
	 * The '<em><b>Cartesian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cartesian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARTESIAN
	 * @model name="Cartesian"
	 * @generated
	 * @ordered
	 */
	public static final int CARTESIAN_VALUE = 15;

	/**
	 * The '<em><b>Repartition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Repartition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPARTITION
	 * @model name="Repartition"
	 * @generated
	 * @ordered
	 */
	public static final int REPARTITION_VALUE = 16;

	/**
	 * The '<em><b>Cogroup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cogroup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COGROUP
	 * @model name="Cogroup"
	 * @generated
	 * @ordered
	 */
	public static final int COGROUP_VALUE = 17;

	/**
	 * The '<em><b>Flat Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flat Map</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLAT_MAP
	 * @model name="FlatMap"
	 * @generated
	 * @ordered
	 */
	public static final int FLAT_MAP_VALUE = 18;

	/**
	 * The '<em><b>Group With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Group With</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROUP_WITH
	 * @model name="GroupWith"
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_WITH_VALUE = 19;

	/**
	 * The '<em><b>Keys</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Keys</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYS
	 * @model name="Keys"
	 * @generated
	 * @ordered
	 */
	public static final int KEYS_VALUE = 20;

	/**
	 * The '<em><b>Map Values</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Map Values</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAP_VALUES
	 * @model name="MapValues"
	 * @generated
	 * @ordered
	 */
	public static final int MAP_VALUES_VALUE = 21;

	/**
	 * The '<em><b>Partition By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Partition By</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTITION_BY
	 * @model name="PartitionBy"
	 * @generated
	 * @ordered
	 */
	public static final int PARTITION_BY_VALUE = 22;

	/**
	 * The '<em><b>The Values</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>The Values</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THE_VALUES
	 * @model name="theValues"
	 * @generated
	 * @ordered
	 */
	public static final int THE_VALUES_VALUE = 23;

	/**
	 * The '<em><b>Text File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text File</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT_FILE
	 * @model name="TextFile"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_FILE_VALUE = 24;

	/**
	 * The '<em><b>Parallelize</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parallelize</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLELIZE
	 * @model name="Parallelize"
	 * @generated
	 * @ordered
	 */
	public static final int PARALLELIZE_VALUE = 25;

	/**
	 * An array of all the '<em><b>Spark Transformation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SparkTransformation[] VALUES_ARRAY =
		new SparkTransformation[] {
			MAP,
			FILTER,
			SAMPLE,
			RDD_SET_OPERATION,
			UNION,
			INTERSECTION,
			SUBSTRACTION,
			SUBTRACT,
			DISTINCT,
			BY_KEY,
			COMBINE_BY_KEY,
			GROUP_BY_KEY,
			REDUCE_BY_KEY,
			SORT_BY_KEY,
			JOIN,
			CARTESIAN,
			REPARTITION,
			COGROUP,
			FLAT_MAP,
			GROUP_WITH,
			KEYS,
			MAP_VALUES,
			PARTITION_BY,
			THE_VALUES,
			TEXT_FILE,
			PARALLELIZE,
		};

	/**
	 * A public read-only list of all the '<em><b>Spark Transformation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SparkTransformation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Spark Transformation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SparkTransformation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SparkTransformation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spark Transformation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SparkTransformation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SparkTransformation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spark Transformation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SparkTransformation get(int value) {
		switch (value) {
			case MAP_VALUE: return MAP;
			case FILTER_VALUE: return FILTER;
			case SAMPLE_VALUE: return SAMPLE;
			case RDD_SET_OPERATION_VALUE: return RDD_SET_OPERATION;
			case UNION_VALUE: return UNION;
			case INTERSECTION_VALUE: return INTERSECTION;
			case SUBSTRACTION_VALUE: return SUBSTRACTION;
			case SUBTRACT_VALUE: return SUBTRACT;
			case DISTINCT_VALUE: return DISTINCT;
			case BY_KEY_VALUE: return BY_KEY;
			case COMBINE_BY_KEY_VALUE: return COMBINE_BY_KEY;
			case GROUP_BY_KEY_VALUE: return GROUP_BY_KEY;
			case REDUCE_BY_KEY_VALUE: return REDUCE_BY_KEY;
			case SORT_BY_KEY_VALUE: return SORT_BY_KEY;
			case JOIN_VALUE: return JOIN;
			case CARTESIAN_VALUE: return CARTESIAN;
			case REPARTITION_VALUE: return REPARTITION;
			case COGROUP_VALUE: return COGROUP;
			case FLAT_MAP_VALUE: return FLAT_MAP;
			case GROUP_WITH_VALUE: return GROUP_WITH;
			case KEYS_VALUE: return KEYS;
			case MAP_VALUES_VALUE: return MAP_VALUES;
			case PARTITION_BY_VALUE: return PARTITION_BY;
			case THE_VALUES_VALUE: return THE_VALUES;
			case TEXT_FILE_VALUE: return TEXT_FILE;
			case PARALLELIZE_VALUE: return PARALLELIZE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SparkTransformation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SparkTransformation
