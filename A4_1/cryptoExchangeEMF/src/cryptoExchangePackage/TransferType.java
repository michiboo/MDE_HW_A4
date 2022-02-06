/**
 */
package cryptoExchangePackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transfer Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getTransferType()
 * @model
 * @generated
 */
public enum TransferType implements Enumerator {
	/**
	 * The '<em><b>Intra Exchange</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTRA_EXCHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	INTRA_EXCHANGE(0, "IntraExchange", "IntraExchange"),

	/**
	 * The '<em><b>Extra Exchange</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTRA_EXCHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	EXTRA_EXCHANGE(1, "ExtraExchange", "ExtraExchange");

	/**
	 * The '<em><b>Intra Exchange</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTRA_EXCHANGE
	 * @model name="IntraExchange"
	 * @generated
	 * @ordered
	 */
	public static final int INTRA_EXCHANGE_VALUE = 0;

	/**
	 * The '<em><b>Extra Exchange</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTRA_EXCHANGE
	 * @model name="ExtraExchange"
	 * @generated
	 * @ordered
	 */
	public static final int EXTRA_EXCHANGE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Transfer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransferType[] VALUES_ARRAY =
		new TransferType[] {
			INTRA_EXCHANGE,
			EXTRA_EXCHANGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Transfer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransferType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transfer Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransferType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransferType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transfer Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransferType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransferType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transfer Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransferType get(int value) {
		switch (value) {
			case INTRA_EXCHANGE_VALUE: return INTRA_EXCHANGE;
			case EXTRA_EXCHANGE_VALUE: return EXTRA_EXCHANGE;
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
	private TransferType(int value, String name, String literal) {
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
	
} //TransferType
