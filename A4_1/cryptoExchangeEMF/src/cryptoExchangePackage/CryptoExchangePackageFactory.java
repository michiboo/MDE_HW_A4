/**
 */
package cryptoExchangePackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cryptoExchangePackage.CryptoExchangePackagePackage
 * @generated
 */
public interface CryptoExchangePackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CryptoExchangePackageFactory eINSTANCE = cryptoExchangePackage.impl.CryptoExchangePackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>crypto Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>crypto Exchange</em>'.
	 * @generated
	 */
	cryptoExchange createcryptoExchange();

	/**
	 * Returns a new object of class '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account</em>'.
	 * @generated
	 */
	Account createAccount();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Saving Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Saving Order</em>'.
	 * @generated
	 */
	SavingOrder createSavingOrder();

	/**
	 * Returns a new object of class '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub System</em>'.
	 * @generated
	 */
	SubSystem createSubSystem();

	/**
	 * Returns a new object of class '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token</em>'.
	 * @generated
	 */
	Token createToken();

	/**
	 * Returns a new object of class '<em>Token Balance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Balance</em>'.
	 * @generated
	 */
	TokenBalance createTokenBalance();

	/**
	 * Returns a new object of class '<em>Token Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Network</em>'.
	 * @generated
	 */
	TokenNetwork createTokenNetwork();

	/**
	 * Returns a new object of class '<em>Token Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Pair</em>'.
	 * @generated
	 */
	TokenPair createTokenPair();

	/**
	 * Returns a new object of class '<em>Transfer Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transfer Request</em>'.
	 * @generated
	 */
	TransferRequest createTransferRequest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CryptoExchangePackagePackage getCryptoExchangePackagePackage();

} //CryptoExchangePackageFactory
