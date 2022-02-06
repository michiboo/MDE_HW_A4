/**
 */
package cryptoExchangePackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.TokenNetwork#getName <em>Name</em>}</li>
 *   <li>{@link cryptoExchangePackage.TokenNetwork#getChainID <em>Chain ID</em>}</li>
 *   <li>{@link cryptoExchangePackage.TokenNetwork#getRPC <em>RPC</em>}</li>
 * </ul>
 *
 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getTokenNetwork()
 * @model
 * @generated
 */
public interface TokenNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getTokenNetwork_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.TokenNetwork#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Chain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain ID</em>' attribute.
	 * @see #setChainID(int)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getTokenNetwork_ChainID()
	 * @model required="true"
	 * @generated
	 */
	int getChainID();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.TokenNetwork#getChainID <em>Chain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain ID</em>' attribute.
	 * @see #getChainID()
	 * @generated
	 */
	void setChainID(int value);

	/**
	 * Returns the value of the '<em><b>RPC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RPC</em>' attribute.
	 * @see #setRPC(String)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getTokenNetwork_RPC()
	 * @model
	 * @generated
	 */
	String getRPC();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.TokenNetwork#getRPC <em>RPC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RPC</em>' attribute.
	 * @see #getRPC()
	 * @generated
	 */
	void setRPC(String value);

} // TokenNetwork
