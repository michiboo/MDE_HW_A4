/**
 */
package cryptoExchangePackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sub System Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getSubSystemName()
 * @model
 * @generated
 */
public enum SubSystemName implements Enumerator {
	/**
	 * The '<em><b>Spot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOT_VALUE
	 * @generated
	 * @ordered
	 */
	SPOT(0, "Spot", "Spot"),

	/**
	 * The '<em><b>Future</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUTURE_VALUE
	 * @generated
	 * @ordered
	 */
	FUTURE(1, "Future", "Future"),

	/**
	 * The '<em><b>Margin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARGIN_VALUE
	 * @generated
	 * @ordered
	 */
	MARGIN(2, "Margin", "Margin"),

	/**
	 * The '<em><b>Saving</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAVING_VALUE
	 * @generated
	 * @ordered
	 */
	SAVING(3, "Saving", "Saving");

	/**
	 * The '<em><b>Spot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOT
	 * @model name="Spot"
	 * @generated
	 * @ordered
	 */
	public static final int SPOT_VALUE = 0;

	/**
	 * The '<em><b>Future</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUTURE
	 * @model name="Future"
	 * @generated
	 * @ordered
	 */
	public static final int FUTURE_VALUE = 1;

	/**
	 * The '<em><b>Margin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARGIN
	 * @model name="Margin"
	 * @generated
	 * @ordered
	 */
	public static final int MARGIN_VALUE = 2;

	/**
	 * The '<em><b>Saving</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAVING
	 * @model name="Saving"
	 * @generated
	 * @ordered
	 */
	public static final int SAVING_VALUE = 3;

	/**
	 * An array of all the '<em><b>Sub System Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SubSystemName[] VALUES_ARRAY =
		new SubSystemName[] {
			SPOT,
			FUTURE,
			MARGIN,
			SAVING,
		};

	/**
	 * A public read-only list of all the '<em><b>Sub System Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SubSystemName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sub System Name</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubSystemName get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubSystemName result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sub System Name</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubSystemName getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubSystemName result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sub System Name</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubSystemName get(int value) {
		switch (value) {
			case SPOT_VALUE: return SPOT;
			case FUTURE_VALUE: return FUTURE;
			case MARGIN_VALUE: return MARGIN;
			case SAVING_VALUE: return SAVING;
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
	private SubSystemName(int value, String name, String literal) {
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
	
} //SubSystemName
