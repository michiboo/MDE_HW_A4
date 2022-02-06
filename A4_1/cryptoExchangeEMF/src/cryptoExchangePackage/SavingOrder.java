/**
 */
package cryptoExchangePackage;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Saving Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.SavingOrder#getName <em>Name</em>}</li>
 *   <li>{@link cryptoExchangePackage.SavingOrder#getAmount <em>Amount</em>}</li>
 *   <li>{@link cryptoExchangePackage.SavingOrder#getMatureDate <em>Mature Date</em>}</li>
 *   <li>{@link cryptoExchangePackage.SavingOrder#getInterest <em>Interest</em>}</li>
 *   <li>{@link cryptoExchangePackage.SavingOrder#getAccount <em>Account</em>}</li>
 *   <li>{@link cryptoExchangePackage.SavingOrder#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getSavingOrder()
 * @model
 * @generated
 */
public interface SavingOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getSavingOrder_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.SavingOrder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getSavingOrder_Amount()
	 * @model required="true"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.SavingOrder#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Mature Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mature Date</em>' attribute.
	 * @see #setMatureDate(Date)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getSavingOrder_MatureDate()
	 * @model
	 * @generated
	 */
	Date getMatureDate();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.SavingOrder#getMatureDate <em>Mature Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mature Date</em>' attribute.
	 * @see #getMatureDate()
	 * @generated
	 */
	void setMatureDate(Date value);

	/**
	 * Returns the value of the '<em><b>Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interest</em>' attribute.
	 * @see #setInterest(double)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getSavingOrder_Interest()
	 * @model required="true"
	 * @generated
	 */
	double getInterest();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.SavingOrder#getInterest <em>Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interest</em>' attribute.
	 * @see #getInterest()
	 * @generated
	 */
	void setInterest(double value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' reference.
	 * @see #setAccount(Account)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getSavingOrder_Account()
	 * @model required="true"
	 * @generated
	 */
	Account getAccount();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.SavingOrder#getAccount <em>Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(Account value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(Token)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getSavingOrder_Token()
	 * @model required="true"
	 * @generated
	 */
	Token getToken();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.SavingOrder#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Token value);

} // SavingOrder
