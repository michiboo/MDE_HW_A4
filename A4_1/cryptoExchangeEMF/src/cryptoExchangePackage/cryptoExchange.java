/**
 */
package cryptoExchangePackage;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>crypto Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.cryptoExchange#getIP <em>IP</em>}</li>
 *   <li>{@link cryptoExchangePackage.cryptoExchange#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link cryptoExchangePackage.cryptoExchange#getSubSystem <em>Sub System</em>}</li>
 *   <li>{@link cryptoExchangePackage.cryptoExchange#getTokens <em>Tokens</em>}</li>
 *   <li>{@link cryptoExchangePackage.cryptoExchange#getTokenNetworks <em>Token Networks</em>}</li>
 *   <li>{@link cryptoExchangePackage.cryptoExchange#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getcryptoExchange()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkUniqueToken'"
 * @generated
 */
public interface cryptoExchange extends EObject {
	/**
	 * Returns the value of the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP</em>' attribute.
	 * @see #setIP(String)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getcryptoExchange_IP()
	 * @model
	 * @generated
	 */
	String getIP();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.cryptoExchange#getIP <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP</em>' attribute.
	 * @see #getIP()
	 * @generated
	 */
	void setIP(String value);

	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getcryptoExchange_DomainName()
	 * @model
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.cryptoExchange#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Sub System</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangePackage.SubSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub System</em>' containment reference list.
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getcryptoExchange_SubSystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SubSystem> getSubSystem();

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangePackage.Token}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getcryptoExchange_Tokens()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Token> getTokens();

	/**
	 * Returns the value of the '<em><b>Token Networks</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangePackage.TokenNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Networks</em>' containment reference list.
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getcryptoExchange_TokenNetworks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TokenNetwork> getTokenNetworks();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getcryptoExchange_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.cryptoExchange#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.Tokens-&gt;isUnique(self)'"
	 * @generated
	 */
	boolean checkUniqueToken(DiagnosticChain diagnostics, Map<Object, Object> context);

} // cryptoExchange
