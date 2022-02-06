/**
 */
package cryptoExchangePackage.tests;

import cryptoExchangePackage.CryptoExchangePackageFactory;
import cryptoExchangePackage.TokenBalance;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Token Balance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenBalanceTest extends TestCase {

	/**
	 * The fixture for this Token Balance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenBalance fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TokenBalanceTest.class);
	}

	/**
	 * Constructs a new Token Balance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenBalanceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Token Balance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TokenBalance fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Token Balance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenBalance getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CryptoExchangePackageFactory.eINSTANCE.createTokenBalance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TokenBalanceTest
