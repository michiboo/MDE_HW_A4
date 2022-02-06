/**
 */
package cryptoExchangePackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Leverage Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getLeverageType()
 * @model
 * @generated
 */
public enum LeverageType implements Enumerator {
	/**
	 * The '<em><b>1x</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1X_VALUE
	 * @generated
	 * @ordered
	 */
	_1X(0, "_1x", "1x"),

	/**
	 * The '<em><b>2x</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2X_VALUE
	 * @generated
	 * @ordered
	 */
	_2X(1, "_2x", "_2x"),

	/**
	 * The '<em><b>5x</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_5X_VALUE
	 * @generated
	 * @ordered
	 */
	_5X(2, "_5x", "_5x"),

	/**
	 * The '<em><b>10x</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10X_VALUE
	 * @generated
	 * @ordered
	 */
	_10X(3, "_10x", "_10x");

	/**
	 * The '<em><b>1x</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1X
	 * @model name="_1x" literal="1x"
	 * @generated
	 * @ordered
	 */
	public static final int _1X_VALUE = 0;

	/**
	 * The '<em><b>2x</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2X
	 * @model name="_2x"
	 * @generated
	 * @ordered
	 */
	public static final int _2X_VALUE = 1;

	/**
	 * The '<em><b>5x</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_5X
	 * @model name="_5x"
	 * @generated
	 * @ordered
	 */
	public static final int _5X_VALUE = 2;

	/**
	 * The '<em><b>10x</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10X
	 * @model name="_10x"
	 * @generated
	 * @ordered
	 */
	public static final int _10X_VALUE = 3;

	/**
	 * An array of all the '<em><b>Leverage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LeverageType[] VALUES_ARRAY =
		new LeverageType[] {
			_1X,
			_2X,
			_5X,
			_10X,
		};

	/**
	 * A public read-only list of all the '<em><b>Leverage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LeverageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Leverage Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LeverageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LeverageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Leverage Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LeverageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LeverageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Leverage Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LeverageType get(int value) {
		switch (value) {
			case _1X_VALUE: return _1X;
			case _2X_VALUE: return _2X;
			case _5X_VALUE: return _5X;
			case _10X_VALUE: return _10X;
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
	private LeverageType(int value, String name, String literal) {
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
	
} //LeverageType
