/**
 */
package cryptoExchangePackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Balance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.TokenBalance#getName <em>Name</em>}</li>
 *   <li>{@link cryptoExchangePackage.TokenBalance#getBalance <em>Balance</em>}</li>
 *   <li>{@link cryptoExchangePackage.TokenBalance#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getTokenBalance()
 * @model
 * @generated
 */
public interface TokenBalance extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getTokenBalance_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.TokenBalance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(float)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getTokenBalance_Balance()
	 * @model required="true"
	 * @generated
	 */
	float getBalance();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.TokenBalance#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(float value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(Token)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getTokenBalance_Token()
	 * @model required="true"
	 * @generated
	 */
	Token getToken();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.TokenBalance#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Token value);

} // TokenBalance
