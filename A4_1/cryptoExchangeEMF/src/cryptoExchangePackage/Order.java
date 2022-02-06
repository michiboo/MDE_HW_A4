/**
 */
package cryptoExchangePackage;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.Order#getName <em>Name</em>}</li>
 *   <li>{@link cryptoExchangePackage.Order#getPrice <em>Price</em>}</li>
 *   <li>{@link cryptoExchangePackage.Order#getAmount <em>Amount</em>}</li>
 *   <li>{@link cryptoExchangePackage.Order#getLeverage <em>Leverage</em>}</li>
 *   <li>{@link cryptoExchangePackage.Order#getType <em>Type</em>}</li>
 *   <li>{@link cryptoExchangePackage.Order#getAccount <em>Account</em>}</li>
 *   <li>{@link cryptoExchangePackage.Order#getTokenPair <em>Token Pair</em>}</li>
 * </ul>
 *
 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getOrder()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkHasAmountOrder'"
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getOrder_Name()
	 * @model id="true" required="true" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.Order#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getOrder_Price()
	 * @model required="true"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.Order#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getOrder_Amount()
	 * @model required="true"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.Order#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Leverage</b></em>' attribute.
	 * The literals are from the enumeration {@link cryptoExchangePackage.LeverageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leverage</em>' attribute.
	 * @see cryptoExchangePackage.LeverageType
	 * @see #setLeverage(LeverageType)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getOrder_Leverage()
	 * @model
	 * @generated
	 */
	LeverageType getLeverage();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.Order#getLeverage <em>Leverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leverage</em>' attribute.
	 * @see cryptoExchangePackage.LeverageType
	 * @see #getLeverage()
	 * @generated
	 */
	void setLeverage(LeverageType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cryptoExchangePackage.OrderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cryptoExchangePackage.OrderType
	 * @see #setType(OrderType)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getOrder_Type()
	 * @model
	 * @generated
	 */
	OrderType getType();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.Order#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cryptoExchangePackage.OrderType
	 * @see #getType()
	 * @generated
	 */
	void setType(OrderType value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' reference.
	 * @see #setAccount(Account)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getOrder_Account()
	 * @model required="true"
	 * @generated
	 */
	Account getAccount();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.Order#getAccount <em>Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(Account value);

	/**
	 * Returns the value of the '<em><b>Token Pair</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Pair</em>' reference.
	 * @see #setTokenPair(TokenPair)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getOrder_TokenPair()
	 * @model required="true"
	 * @generated
	 */
	TokenPair getTokenPair();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.Order#getTokenPair <em>Token Pair</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Pair</em>' reference.
	 * @see #getTokenPair()
	 * @generated
	 */
	void setTokenPair(TokenPair value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if(not self.Amount-&gt;isEmpty()) then \n\t\t\tself.account.availableBalance(self.TokenPair.TokenA) &gt;= self.Amount\n\t\telse\n\t\t\ttrue\n\t\tendif'"
	 * @generated
	 */
	boolean checkHasAmountOrder(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Order
