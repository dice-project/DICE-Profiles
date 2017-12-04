/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Spark Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getSparkAction()
 * @model
 * @generated
 */
public enum SparkAction implements Enumerator {
	/**
	 * The '<em><b>Reduce</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDUCE_VALUE
	 * @generated
	 * @ordered
	 */
	REDUCE(0, "Reduce", "Reduce"),

	/**
	 * The '<em><b>Sample</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLE(1, "Sample", "Sample"),

	/**
	 * The '<em><b>Collect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECT_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECT(2, "Collect", "Collect"),

	/**
	 * The '<em><b>Count</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	COUNT(3, "Count", "Count"),

	/**
	 * The '<em><b>Save As</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAVE_AS_VALUE
	 * @generated
	 * @ordered
	 */
	SAVE_AS(4, "SaveAs", "SaveAs"),

	/**
	 * The '<em><b>Count By Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNT_BY_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	COUNT_BY_KEY(5, "CountByKey", "CountByKey"),

	/**
	 * The '<em><b>For Each</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOR_EACH_VALUE
	 * @generated
	 * @ordered
	 */
	FOR_EACH(6, "ForEach", "ForEach"),

	/**
	 * The '<em><b>Aggregate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATE_VALUE
	 * @generated
	 * @ordered
	 */
	AGGREGATE(7, "Aggregate", "Aggregate"),

	/**
	 * The '<em><b>Collect As Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECT_AS_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECT_AS_MAP(8, "CollectAsMap", "CollectAsMap"),

	/**
	 * The '<em><b>Count By Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNT_BY_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	COUNT_BY_VALUE(9, "CountByValue", "CountByValue"),

	/**
	 * The '<em><b>Fold</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLD_VALUE
	 * @generated
	 * @ordered
	 */
	FOLD(10, "Fold", "Fold"),

	/**
	 * The '<em><b>Lookup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOKUP_VALUE
	 * @generated
	 * @ordered
	 */
	LOOKUP(11, "Lookup", "Lookup"),

	/**
	 * The '<em><b>Take</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAKE_VALUE
	 * @generated
	 * @ordered
	 */
	TAKE(12, "Take", "Take"),

	/**
	 * The '<em><b>Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_VALUE
	 * @generated
	 * @ordered
	 */
	TOP(13, "Top", "Top");

	/**
	 * The '<em><b>Reduce</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reduce</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REDUCE
	 * @model name="Reduce"
	 * @generated
	 * @ordered
	 */
	public static final int REDUCE_VALUE = 0;

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
	public static final int SAMPLE_VALUE = 1;

	/**
	 * The '<em><b>Collect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Collect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLECT
	 * @model name="Collect"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECT_VALUE = 2;

	/**
	 * The '<em><b>Count</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Count</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNT
	 * @model name="Count"
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_VALUE = 3;

	/**
	 * The '<em><b>Save As</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Save As</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAVE_AS
	 * @model name="SaveAs"
	 * @generated
	 * @ordered
	 */
	public static final int SAVE_AS_VALUE = 4;

	/**
	 * The '<em><b>Count By Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Count By Key</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNT_BY_KEY
	 * @model name="CountByKey"
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_BY_KEY_VALUE = 5;

	/**
	 * The '<em><b>For Each</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>For Each</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOR_EACH
	 * @model name="ForEach"
	 * @generated
	 * @ordered
	 */
	public static final int FOR_EACH_VALUE = 6;

	/**
	 * The '<em><b>Aggregate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aggregate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGGREGATE
	 * @model name="Aggregate"
	 * @generated
	 * @ordered
	 */
	public static final int AGGREGATE_VALUE = 7;

	/**
	 * The '<em><b>Collect As Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Collect As Map</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLECT_AS_MAP
	 * @model name="CollectAsMap"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECT_AS_MAP_VALUE = 8;

	/**
	 * The '<em><b>Count By Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Count By Value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNT_BY_VALUE
	 * @model name="CountByValue"
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_BY_VALUE_VALUE = 9;

	/**
	 * The '<em><b>Fold</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fold</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOLD
	 * @model name="Fold"
	 * @generated
	 * @ordered
	 */
	public static final int FOLD_VALUE = 10;

	/**
	 * The '<em><b>Lookup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lookup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOOKUP
	 * @model name="Lookup"
	 * @generated
	 * @ordered
	 */
	public static final int LOOKUP_VALUE = 11;

	/**
	 * The '<em><b>Take</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Take</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAKE
	 * @model name="Take"
	 * @generated
	 * @ordered
	 */
	public static final int TAKE_VALUE = 12;

	/**
	 * The '<em><b>Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Top</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP
	 * @model name="Top"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_VALUE = 13;

	/**
	 * An array of all the '<em><b>Spark Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SparkAction[] VALUES_ARRAY =
		new SparkAction[] {
			REDUCE,
			SAMPLE,
			COLLECT,
			COUNT,
			SAVE_AS,
			COUNT_BY_KEY,
			FOR_EACH,
			AGGREGATE,
			COLLECT_AS_MAP,
			COUNT_BY_VALUE,
			FOLD,
			LOOKUP,
			TAKE,
			TOP,
		};

	/**
	 * A public read-only list of all the '<em><b>Spark Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SparkAction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Spark Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SparkAction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SparkAction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spark Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SparkAction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SparkAction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spark Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SparkAction get(int value) {
		switch (value) {
			case REDUCE_VALUE: return REDUCE;
			case SAMPLE_VALUE: return SAMPLE;
			case COLLECT_VALUE: return COLLECT;
			case COUNT_VALUE: return COUNT;
			case SAVE_AS_VALUE: return SAVE_AS;
			case COUNT_BY_KEY_VALUE: return COUNT_BY_KEY;
			case FOR_EACH_VALUE: return FOR_EACH;
			case AGGREGATE_VALUE: return AGGREGATE;
			case COLLECT_AS_MAP_VALUE: return COLLECT_AS_MAP;
			case COUNT_BY_VALUE_VALUE: return COUNT_BY_VALUE;
			case FOLD_VALUE: return FOLD;
			case LOOKUP_VALUE: return LOOKUP;
			case TAKE_VALUE: return TAKE;
			case TOP_VALUE: return TOP;
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
	private SparkAction(int value, String name, String literal) {
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
	
} //SparkAction
