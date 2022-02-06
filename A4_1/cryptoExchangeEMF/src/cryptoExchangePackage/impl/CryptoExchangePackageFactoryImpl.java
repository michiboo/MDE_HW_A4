/**
 */
package cryptoExchangePackage.impl;

import cryptoExchangePackage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CryptoExchangePackageFactoryImpl extends EFactoryImpl implements CryptoExchangePackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CryptoExchangePackageFactory init() {
		try {
			CryptoExchangePackageFactory theCryptoExchangePackageFactory = (CryptoExchangePackageFactory)EPackage.Registry.INSTANCE.getEFactory(CryptoExchangePackagePackage.eNS_URI);
			if (theCryptoExchangePackageFactory != null) {
				return theCryptoExchangePackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CryptoExchangePackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoExchangePackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE: return createcryptoExchange();
			case CryptoExchangePackagePackage.ACCOUNT: return createAccount();
			case CryptoExchangePackagePackage.ORDER: return createOrder();
			case CryptoExchangePackagePackage.SAVING_ORDER: return createSavingOrder();
			case CryptoExchangePackagePackage.SUB_SYSTEM: return createSubSystem();
			case CryptoExchangePackagePackage.TOKEN: return createToken();
			case CryptoExchangePackagePackage.TOKEN_BALANCE: return createTokenBalance();
			case CryptoExchangePackagePackage.TOKEN_NETWORK: return createTokenNetwork();
			case CryptoExchangePackagePackage.TOKEN_PAIR: return createTokenPair();
			case CryptoExchangePackagePackage.TRANSFER_REQUEST: return createTransferRequest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CryptoExchangePackagePackage.ORDER_TYPE:
				return createOrderTypeFromString(eDataType, initialValue);
			case CryptoExchangePackagePackage.LEVERAGE_TYPE:
				return createLeverageTypeFromString(eDataType, initialValue);
			case CryptoExchangePackagePackage.SUB_SYSTEM_NAME:
				return createSubSystemNameFromString(eDataType, initialValue);
			case CryptoExchangePackagePackage.TRANSFER_TYPE:
				return createTransferTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CryptoExchangePackagePackage.ORDER_TYPE:
				return convertOrderTypeToString(eDataType, instanceValue);
			case CryptoExchangePackagePackage.LEVERAGE_TYPE:
				return convertLeverageTypeToString(eDataType, instanceValue);
			case CryptoExchangePackagePackage.SUB_SYSTEM_NAME:
				return convertSubSystemNameToString(eDataType, instanceValue);
			case CryptoExchangePackagePackage.TRANSFER_TYPE:
				return convertTransferTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cryptoExchange createcryptoExchange() {
		cryptoExchangeImpl cryptoExchange = new cryptoExchangeImpl();
		return cryptoExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SavingOrder createSavingOrder() {
		SavingOrderImpl savingOrder = new SavingOrderImpl();
		return savingOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem createSubSystem() {
		SubSystemImpl subSystem = new SubSystemImpl();
		return subSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenBalance createTokenBalance() {
		TokenBalanceImpl tokenBalance = new TokenBalanceImpl();
		return tokenBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenNetwork createTokenNetwork() {
		TokenNetworkImpl tokenNetwork = new TokenNetworkImpl();
		return tokenNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenPair createTokenPair() {
		TokenPairImpl tokenPair = new TokenPairImpl();
		return tokenPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferRequest createTransferRequest() {
		TransferRequestImpl transferRequest = new TransferRequestImpl();
		return transferRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType createOrderTypeFromString(EDataType eDataType, String initialValue) {
		OrderType result = OrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeverageType createLeverageTypeFromString(EDataType eDataType, String initialValue) {
		LeverageType result = LeverageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeverageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystemName createSubSystemNameFromString(EDataType eDataType, String initialValue) {
		SubSystemName result = SubSystemName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubSystemNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferType createTransferTypeFromString(EDataType eDataType, String initialValue) {
		TransferType result = TransferType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransferTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoExchangePackagePackage getCryptoExchangePackagePackage() {
		return (CryptoExchangePackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CryptoExchangePackagePackage getPackage() {
		return CryptoExchangePackagePackage.eINSTANCE;
	}

} //CryptoExchangePackageFactoryImpl
