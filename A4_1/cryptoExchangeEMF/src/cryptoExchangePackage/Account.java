/**
 */
package cryptoExchangePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.Account#getName <em>Name</em>}</li>
 *   <li>{@link cryptoExchangePackage.Account#getTokensBalance <em>Tokens Balance</em>}</li>
 *   <li>{@link cryptoExchangePackage.Account#getTransferRequest <em>Transfer Request</em>}</li>
 * </ul>
 *
 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getAccount_Name()
	 * @model id="true" required="true" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.Account#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tokens Balance</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangePackage.TokenBalance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens Balance</em>' containment reference list.
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getAccount_TokensBalance()
	 * @model containment="true"
	 * @generated
	 */
	EList<TokenBalance> getTokensBalance();

	/**
	 * Returns the value of the '<em><b>Transfer Request</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangePackage.TransferRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Request</em>' containment reference list.
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getAccount_TransferRequest()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransferRequest> getTransferRequest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" fTokenRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n \t\t\t if(not self.TokensBalance-&gt;select(Token = fToken)-&gt;isEmpty()) then\n \t\t\t\tself.TokensBalance-&gt;select(Token = fToken)-&gt;collect(balance)-&gt;sum().oclAsType(ecore::EFloat[1] )\n\t\t\t else\n\t\t\t \t0\n\t\t\t endif'"
	 * @generated
	 */
	float availableBalance(Token fToken);

} // Account
