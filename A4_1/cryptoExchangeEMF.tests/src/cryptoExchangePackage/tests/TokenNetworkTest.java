/**
 */
package cryptoExchangePackage.tests;

import cryptoExchangePackage.CryptoExchangePackageFactory;
import cryptoExchangePackage.TokenNetwork;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Token Network</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenNetworkTest extends TestCase {

	/**
	 * The fixture for this Token Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenNetwork fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TokenNetworkTest.class);
	}

	/**
	 * Constructs a new Token Network test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenNetworkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Token Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TokenNetwork fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Token Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenNetwork getFixture() {
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
		setFixture(CryptoExchangePackageFactory.eINSTANCE.createTokenNetwork());
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

} //TokenNetworkTest
