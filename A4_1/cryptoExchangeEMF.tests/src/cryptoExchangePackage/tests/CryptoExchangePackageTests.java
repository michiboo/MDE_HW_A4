/**
 */
package cryptoExchangePackage.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>cryptoExchangePackage</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CryptoExchangePackageTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CryptoExchangePackageTests("cryptoExchangePackage Tests");
		suite.addTestSuite(cryptoExchangeTest.class);
		suite.addTestSuite(AccountTest.class);
		suite.addTestSuite(OrderTest.class);
		suite.addTestSuite(SubSystemTest.class);
		suite.addTestSuite(TokenPairTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoExchangePackageTests(String name) {
		super(name);
	}

} //CryptoExchangePackageTests
