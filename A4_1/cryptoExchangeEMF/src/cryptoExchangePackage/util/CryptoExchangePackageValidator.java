/**
 */
package cryptoExchangePackage.util;

import cryptoExchangePackage.*;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see cryptoExchangePackage.CryptoExchangePackagePackage
 * @generated
 */
public class CryptoExchangePackageValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CryptoExchangePackageValidator INSTANCE = new CryptoExchangePackageValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "cryptoExchangePackage";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Unique Token' of 'crypto Exchange'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRYPTO_EXCHANGE__CHECK_UNIQUE_TOKEN = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Has Amount Order' of 'Order'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ORDER__CHECK_HAS_AMOUNT_ORDER = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoExchangePackageValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CryptoExchangePackagePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE:
				return validatecryptoExchange((cryptoExchange)value, diagnostics, context);
			case CryptoExchangePackagePackage.ACCOUNT:
				return validateAccount((Account)value, diagnostics, context);
			case CryptoExchangePackagePackage.ORDER:
				return validateOrder((Order)value, diagnostics, context);
			case CryptoExchangePackagePackage.SAVING_ORDER:
				return validateSavingOrder((SavingOrder)value, diagnostics, context);
			case CryptoExchangePackagePackage.SUB_SYSTEM:
				return validateSubSystem((SubSystem)value, diagnostics, context);
			case CryptoExchangePackagePackage.TOKEN:
				return validateToken((Token)value, diagnostics, context);
			case CryptoExchangePackagePackage.TOKEN_BALANCE:
				return validateTokenBalance((TokenBalance)value, diagnostics, context);
			case CryptoExchangePackagePackage.TOKEN_NETWORK:
				return validateTokenNetwork((TokenNetwork)value, diagnostics, context);
			case CryptoExchangePackagePackage.TOKEN_PAIR:
				return validateTokenPair((TokenPair)value, diagnostics, context);
			case CryptoExchangePackagePackage.TRANSFER_REQUEST:
				return validateTransferRequest((TransferRequest)value, diagnostics, context);
			case CryptoExchangePackagePackage.ORDER_TYPE:
				return validateOrderType((OrderType)value, diagnostics, context);
			case CryptoExchangePackagePackage.LEVERAGE_TYPE:
				return validateLeverageType((LeverageType)value, diagnostics, context);
			case CryptoExchangePackagePackage.SUB_SYSTEM_NAME:
				return validateSubSystemName((SubSystemName)value, diagnostics, context);
			case CryptoExchangePackagePackage.TRANSFER_TYPE:
				return validateTransferType((TransferType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecryptoExchange(cryptoExchange cryptoExchange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cryptoExchange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cryptoExchange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cryptoExchange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cryptoExchange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cryptoExchange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cryptoExchange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cryptoExchange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cryptoExchange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cryptoExchange, diagnostics, context);
		if (result || diagnostics != null) result &= validatecryptoExchange_checkUniqueToken(cryptoExchange, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkUniqueToken constraint of '<em>crypto Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecryptoExchange_checkUniqueToken(cryptoExchange cryptoExchange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cryptoExchange.checkUniqueToken(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccount(Account account, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(account, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(order, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(order, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(order, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(order, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(order, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(order, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(order, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(order, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(order, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrder_checkHasAmountOrder(order, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkHasAmountOrder constraint of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder_checkHasAmountOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return order.checkHasAmountOrder(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSavingOrder(SavingOrder savingOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(savingOrder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubSystem(SubSystem subSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToken(Token token, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(token, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTokenBalance(TokenBalance tokenBalance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tokenBalance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTokenNetwork(TokenNetwork tokenNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tokenNetwork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTokenPair(TokenPair tokenPair, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tokenPair, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferRequest(TransferRequest transferRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transferRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderType(OrderType orderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeverageType(LeverageType leverageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubSystemName(SubSystemName subSystemName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferType(TransferType transferType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CryptoExchangePackageValidator
