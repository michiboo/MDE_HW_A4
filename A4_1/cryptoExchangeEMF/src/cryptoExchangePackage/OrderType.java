/**
 */
package cryptoExchangePackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Order Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getOrderType()
 * @model
 * @generated
 */
public enum OrderType implements Enumerator {
	/**
	 * The '<em><b>Buy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUY_VALUE
	 * @generated
	 * @ordered
	 */
	BUY(0, "buy", "buy"),

	/**
	 * The '<em><b>Sell</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELL_VALUE
	 * @generated
	 * @ordered
	 */
	SELL(1, "sell", "sell"),

	/**
	 * The '<em><b>Leverage Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVERAGE_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LEVERAGE_LONG(2, "leverageLong", "leverageLong"),

	/**
	 * The '<em><b>Leverage Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVERAGE_SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	LEVERAGE_SHORT(3, "leverageShort", "leverageShort");

	/**
	 * The '<em><b>Buy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUY
	 * @model name="buy"
	 * @generated
	 * @ordered
	 */
	public static final int BUY_VALUE = 0;

	/**
	 * The '<em><b>Sell</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELL
	 * @model name="sell"
	 * @generated
	 * @ordered
	 */
	public static final int SELL_VALUE = 1;

	/**
	 * The '<em><b>Leverage Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVERAGE_LONG
	 * @model name="leverageLong"
	 * @generated
	 * @ordered
	 */
	public static final int LEVERAGE_LONG_VALUE = 2;

	/**
	 * The '<em><b>Leverage Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVERAGE_SHORT
	 * @model name="leverageShort"
	 * @generated
	 * @ordered
	 */
	public static final int LEVERAGE_SHORT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrderType[] VALUES_ARRAY =
		new OrderType[] {
			BUY,
			SELL,
			LEVERAGE_LONG,
			LEVERAGE_SHORT,
		};

	/**
	 * A public read-only list of all the '<em><b>Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Order Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderType get(int value) {
		switch (value) {
			case BUY_VALUE: return BUY;
			case SELL_VALUE: return SELL;
			case LEVERAGE_LONG_VALUE: return LEVERAGE_LONG;
			case LEVERAGE_SHORT_VALUE: return LEVERAGE_SHORT;
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
	private OrderType(int value, String name, String literal) {
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
	
} //OrderType
