/**
 */
package cryptoExchangePackage.impl;

import cryptoExchangePackage.Account;
import cryptoExchangePackage.CryptoExchangePackageFactory;
import cryptoExchangePackage.CryptoExchangePackagePackage;
import cryptoExchangePackage.LeverageType;
import cryptoExchangePackage.Order;
import cryptoExchangePackage.OrderType;
import cryptoExchangePackage.SavingOrder;
import cryptoExchangePackage.SubSystem;
import cryptoExchangePackage.SubSystemName;
import cryptoExchangePackage.Token;
import cryptoExchangePackage.TokenBalance;
import cryptoExchangePackage.TokenNetwork;
import cryptoExchangePackage.TokenPair;
import cryptoExchangePackage.TransferRequest;
import cryptoExchangePackage.TransferType;
import cryptoExchangePackage.cryptoExchange;
import cryptoExchangePackage.util.CryptoExchangePackageValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CryptoExchangePackagePackageImpl extends EPackageImpl implements CryptoExchangePackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cryptoExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass savingOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenBalanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum leverageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subSystemNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transferTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CryptoExchangePackagePackageImpl() {
		super(eNS_URI, CryptoExchangePackageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CryptoExchangePackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CryptoExchangePackagePackage init() {
		if (isInited) return (CryptoExchangePackagePackage)EPackage.Registry.INSTANCE.getEPackage(CryptoExchangePackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCryptoExchangePackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CryptoExchangePackagePackageImpl theCryptoExchangePackagePackage = registeredCryptoExchangePackagePackage instanceof CryptoExchangePackagePackageImpl ? (CryptoExchangePackagePackageImpl)registeredCryptoExchangePackagePackage : new CryptoExchangePackagePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCryptoExchangePackagePackage.createPackageContents();

		// Initialize created meta-data
		theCryptoExchangePackagePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCryptoExchangePackagePackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CryptoExchangePackageValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCryptoExchangePackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CryptoExchangePackagePackage.eNS_URI, theCryptoExchangePackagePackage);
		return theCryptoExchangePackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcryptoExchange() {
		return cryptoExchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcryptoExchange_IP() {
		return (EAttribute)cryptoExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcryptoExchange_DomainName() {
		return (EAttribute)cryptoExchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcryptoExchange_SubSystem() {
		return (EReference)cryptoExchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcryptoExchange_Tokens() {
		return (EReference)cryptoExchangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcryptoExchange_TokenNetworks() {
		return (EReference)cryptoExchangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcryptoExchange_Name() {
		return (EAttribute)cryptoExchangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcryptoExchange__CheckUniqueToken__DiagnosticChain_Map() {
		return cryptoExchangeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccount() {
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Name() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_TokensBalance() {
		return (EReference)accountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_TransferRequest() {
		return (EReference)accountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAccount__AvailableBalance__Token() {
		return accountEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Name() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Price() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Amount() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Leverage() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Type() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Account() {
		return (EReference)orderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_TokenPair() {
		return (EReference)orderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrder__CheckHasAmountOrder__DiagnosticChain_Map() {
		return orderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSavingOrder() {
		return savingOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSavingOrder_Name() {
		return (EAttribute)savingOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSavingOrder_Amount() {
		return (EAttribute)savingOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSavingOrder_MatureDate() {
		return (EAttribute)savingOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSavingOrder_Interest() {
		return (EAttribute)savingOrderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSavingOrder_Account() {
		return (EReference)savingOrderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSavingOrder_Token() {
		return (EReference)savingOrderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubSystem() {
		return subSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSystem_Name() {
		return (EAttribute)subSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSystem_Accounts() {
		return (EReference)subSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSystem_TokenPairs() {
		return (EReference)subSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSystem_Orders() {
		return (EReference)subSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSystem_SavingOrders() {
		return (EReference)subSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubSystem__GetNextOrderId__Order() {
		return subSystemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubSystem__GetNextAccId__Account() {
		return subSystemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Name() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Address() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Decimal() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_TokenNetwork() {
		return (EReference)tokenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenBalance() {
		return tokenBalanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenBalance_Name() {
		return (EAttribute)tokenBalanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenBalance_Balance() {
		return (EAttribute)tokenBalanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenBalance_Token() {
		return (EReference)tokenBalanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenNetwork() {
		return tokenNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenNetwork_Name() {
		return (EAttribute)tokenNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenNetwork_ChainID() {
		return (EAttribute)tokenNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenNetwork_RPC() {
		return (EAttribute)tokenNetworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenPair() {
		return tokenPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenPair_Name() {
		return (EAttribute)tokenPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenPair_Price() {
		return (EAttribute)tokenPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenPair_TokenA() {
		return (EReference)tokenPairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenPair_TokenB() {
		return (EReference)tokenPairEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTokenPair__CreateName() {
		return tokenPairEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferRequest() {
		return transferRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransferRequest_ID() {
		return (EAttribute)transferRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransferRequest_Type() {
		return (EAttribute)transferRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransferRequest_Amount() {
		return (EAttribute)transferRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferRequest_Token() {
		return (EReference)transferRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferRequest_Destination() {
		return (EReference)transferRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderType() {
		return orderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLeverageType() {
		return leverageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubSystemName() {
		return subSystemNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransferType() {
		return transferTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoExchangePackageFactory getCryptoExchangePackageFactory() {
		return (CryptoExchangePackageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cryptoExchangeEClass = createEClass(CRYPTO_EXCHANGE);
		createEAttribute(cryptoExchangeEClass, CRYPTO_EXCHANGE__IP);
		createEAttribute(cryptoExchangeEClass, CRYPTO_EXCHANGE__DOMAIN_NAME);
		createEReference(cryptoExchangeEClass, CRYPTO_EXCHANGE__SUB_SYSTEM);
		createEReference(cryptoExchangeEClass, CRYPTO_EXCHANGE__TOKENS);
		createEReference(cryptoExchangeEClass, CRYPTO_EXCHANGE__TOKEN_NETWORKS);
		createEAttribute(cryptoExchangeEClass, CRYPTO_EXCHANGE__NAME);
		createEOperation(cryptoExchangeEClass, CRYPTO_EXCHANGE___CHECK_UNIQUE_TOKEN__DIAGNOSTICCHAIN_MAP);

		accountEClass = createEClass(ACCOUNT);
		createEAttribute(accountEClass, ACCOUNT__NAME);
		createEReference(accountEClass, ACCOUNT__TOKENS_BALANCE);
		createEReference(accountEClass, ACCOUNT__TRANSFER_REQUEST);
		createEOperation(accountEClass, ACCOUNT___AVAILABLE_BALANCE__TOKEN);

		orderEClass = createEClass(ORDER);
		createEAttribute(orderEClass, ORDER__NAME);
		createEAttribute(orderEClass, ORDER__PRICE);
		createEAttribute(orderEClass, ORDER__AMOUNT);
		createEAttribute(orderEClass, ORDER__LEVERAGE);
		createEAttribute(orderEClass, ORDER__TYPE);
		createEReference(orderEClass, ORDER__ACCOUNT);
		createEReference(orderEClass, ORDER__TOKEN_PAIR);
		createEOperation(orderEClass, ORDER___CHECK_HAS_AMOUNT_ORDER__DIAGNOSTICCHAIN_MAP);

		savingOrderEClass = createEClass(SAVING_ORDER);
		createEAttribute(savingOrderEClass, SAVING_ORDER__NAME);
		createEAttribute(savingOrderEClass, SAVING_ORDER__AMOUNT);
		createEAttribute(savingOrderEClass, SAVING_ORDER__MATURE_DATE);
		createEAttribute(savingOrderEClass, SAVING_ORDER__INTEREST);
		createEReference(savingOrderEClass, SAVING_ORDER__ACCOUNT);
		createEReference(savingOrderEClass, SAVING_ORDER__TOKEN);

		subSystemEClass = createEClass(SUB_SYSTEM);
		createEAttribute(subSystemEClass, SUB_SYSTEM__NAME);
		createEReference(subSystemEClass, SUB_SYSTEM__ACCOUNTS);
		createEReference(subSystemEClass, SUB_SYSTEM__TOKEN_PAIRS);
		createEReference(subSystemEClass, SUB_SYSTEM__ORDERS);
		createEReference(subSystemEClass, SUB_SYSTEM__SAVING_ORDERS);
		createEOperation(subSystemEClass, SUB_SYSTEM___GET_NEXT_ORDER_ID__ORDER);
		createEOperation(subSystemEClass, SUB_SYSTEM___GET_NEXT_ACC_ID__ACCOUNT);

		tokenEClass = createEClass(TOKEN);
		createEAttribute(tokenEClass, TOKEN__NAME);
		createEAttribute(tokenEClass, TOKEN__ADDRESS);
		createEAttribute(tokenEClass, TOKEN__DECIMAL);
		createEReference(tokenEClass, TOKEN__TOKEN_NETWORK);

		tokenBalanceEClass = createEClass(TOKEN_BALANCE);
		createEAttribute(tokenBalanceEClass, TOKEN_BALANCE__NAME);
		createEAttribute(tokenBalanceEClass, TOKEN_BALANCE__BALANCE);
		createEReference(tokenBalanceEClass, TOKEN_BALANCE__TOKEN);

		tokenNetworkEClass = createEClass(TOKEN_NETWORK);
		createEAttribute(tokenNetworkEClass, TOKEN_NETWORK__NAME);
		createEAttribute(tokenNetworkEClass, TOKEN_NETWORK__CHAIN_ID);
		createEAttribute(tokenNetworkEClass, TOKEN_NETWORK__RPC);

		tokenPairEClass = createEClass(TOKEN_PAIR);
		createEAttribute(tokenPairEClass, TOKEN_PAIR__NAME);
		createEAttribute(tokenPairEClass, TOKEN_PAIR__PRICE);
		createEReference(tokenPairEClass, TOKEN_PAIR__TOKEN_A);
		createEReference(tokenPairEClass, TOKEN_PAIR__TOKEN_B);
		createEOperation(tokenPairEClass, TOKEN_PAIR___CREATE_NAME);

		transferRequestEClass = createEClass(TRANSFER_REQUEST);
		createEAttribute(transferRequestEClass, TRANSFER_REQUEST__ID);
		createEAttribute(transferRequestEClass, TRANSFER_REQUEST__TYPE);
		createEAttribute(transferRequestEClass, TRANSFER_REQUEST__AMOUNT);
		createEReference(transferRequestEClass, TRANSFER_REQUEST__TOKEN);
		createEReference(transferRequestEClass, TRANSFER_REQUEST__DESTINATION);

		// Create enums
		orderTypeEEnum = createEEnum(ORDER_TYPE);
		leverageTypeEEnum = createEEnum(LEVERAGE_TYPE);
		subSystemNameEEnum = createEEnum(SUB_SYSTEM_NAME);
		transferTypeEEnum = createEEnum(TRANSFER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(cryptoExchangeEClass, cryptoExchange.class, "cryptoExchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcryptoExchange_IP(), ecorePackage.getEString(), "IP", null, 0, 1, cryptoExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getcryptoExchange_DomainName(), ecorePackage.getEString(), "DomainName", null, 0, 1, cryptoExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcryptoExchange_SubSystem(), this.getSubSystem(), null, "SubSystem", null, 1, -1, cryptoExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcryptoExchange_Tokens(), this.getToken(), null, "Tokens", null, 1, -1, cryptoExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcryptoExchange_TokenNetworks(), this.getTokenNetwork(), null, "TokenNetworks", null, 1, -1, cryptoExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getcryptoExchange_Name(), ecorePackage.getEString(), "name", null, 0, 1, cryptoExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getcryptoExchange__CheckUniqueToken__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "checkUniqueToken", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(accountEClass, Account.class, "Account", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccount_Name(), ecorePackage.getEString(), "name", null, 1, 1, Account.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAccount_TokensBalance(), this.getTokenBalance(), null, "TokensBalance", null, 0, -1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccount_TransferRequest(), this.getTransferRequest(), null, "transferRequest", null, 0, -1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAccount__AvailableBalance__Token(), ecorePackage.getEFloat(), "availableBalance", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getToken(), "fToken", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrder_Name(), ecorePackage.getEString(), "name", null, 1, 1, Order.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Price(), ecorePackage.getEFloat(), "Price", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Amount(), ecorePackage.getEFloat(), "Amount", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Leverage(), this.getLeverageType(), "leverage", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Type(), this.getOrderType(), "Type", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_Account(), this.getAccount(), null, "account", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_TokenPair(), this.getTokenPair(), null, "TokenPair", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOrder__CheckHasAmountOrder__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "checkHasAmountOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(savingOrderEClass, SavingOrder.class, "SavingOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSavingOrder_Name(), ecorePackage.getEString(), "name", null, 1, 1, SavingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSavingOrder_Amount(), ecorePackage.getEFloat(), "Amount", null, 1, 1, SavingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSavingOrder_MatureDate(), ecorePackage.getEDate(), "MatureDate", null, 0, 1, SavingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSavingOrder_Interest(), ecorePackage.getEDouble(), "Interest", null, 1, 1, SavingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSavingOrder_Account(), this.getAccount(), null, "account", null, 1, 1, SavingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSavingOrder_Token(), this.getToken(), null, "Token", null, 1, 1, SavingOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subSystemEClass, SubSystem.class, "SubSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubSystem_Name(), this.getSubSystemName(), "name", null, 1, 1, SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubSystem_Accounts(), this.getAccount(), null, "accounts", null, 0, -1, SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubSystem_TokenPairs(), this.getTokenPair(), null, "TokenPairs", null, 0, -1, SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubSystem_Orders(), this.getOrder(), null, "Orders", null, 0, -1, SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubSystem_SavingOrders(), this.getSavingOrder(), null, "SavingOrders", null, 0, -1, SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSubSystem__GetNextOrderId__Order(), ecorePackage.getEString(), "getNextOrderId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOrder(), "o", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubSystem__GetNextAccId__Account(), ecorePackage.getEString(), "getNextAccId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAccount(), "a", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToken_Name(), ecorePackage.getEString(), "name", null, 1, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Address(), ecorePackage.getEString(), "address", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Decimal(), ecorePackage.getEInt(), "decimal", null, 1, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToken_TokenNetwork(), this.getTokenNetwork(), null, "TokenNetwork", null, 1, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenBalanceEClass, TokenBalance.class, "TokenBalance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenBalance_Name(), ecorePackage.getEString(), "name", null, 1, 1, TokenBalance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenBalance_Balance(), ecorePackage.getEFloat(), "balance", null, 1, 1, TokenBalance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenBalance_Token(), this.getToken(), null, "Token", null, 1, 1, TokenBalance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenNetworkEClass, TokenNetwork.class, "TokenNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenNetwork_Name(), ecorePackage.getEString(), "name", null, 1, 1, TokenNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenNetwork_ChainID(), ecorePackage.getEInt(), "chainID", null, 1, 1, TokenNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenNetwork_RPC(), ecorePackage.getEString(), "RPC", null, 0, 1, TokenNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenPairEClass, TokenPair.class, "TokenPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenPair_Name(), ecorePackage.getEString(), "name", null, 1, 1, TokenPair.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenPair_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, TokenPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenPair_TokenA(), this.getToken(), null, "TokenA", null, 1, 1, TokenPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenPair_TokenB(), this.getToken(), null, "TokenB", null, 1, 1, TokenPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTokenPair__CreateName(), ecorePackage.getEString(), "createName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transferRequestEClass, TransferRequest.class, "TransferRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransferRequest_ID(), ecorePackage.getEString(), "ID", null, 1, 1, TransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferRequest_Type(), this.getTransferType(), "type", null, 0, 1, TransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferRequest_Amount(), ecorePackage.getEFloat(), "amount", null, 1, 1, TransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferRequest_Token(), this.getToken(), null, "Token", null, 1, 1, TransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferRequest_Destination(), this.getAccount(), null, "Destination", null, 1, 1, TransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(orderTypeEEnum, OrderType.class, "OrderType");
		addEEnumLiteral(orderTypeEEnum, OrderType.BUY);
		addEEnumLiteral(orderTypeEEnum, OrderType.SELL);
		addEEnumLiteral(orderTypeEEnum, OrderType.LEVERAGE_LONG);
		addEEnumLiteral(orderTypeEEnum, OrderType.LEVERAGE_SHORT);

		initEEnum(leverageTypeEEnum, LeverageType.class, "LeverageType");
		addEEnumLiteral(leverageTypeEEnum, LeverageType._1X);
		addEEnumLiteral(leverageTypeEEnum, LeverageType._2X);
		addEEnumLiteral(leverageTypeEEnum, LeverageType._5X);
		addEEnumLiteral(leverageTypeEEnum, LeverageType._10X);

		initEEnum(subSystemNameEEnum, SubSystemName.class, "SubSystemName");
		addEEnumLiteral(subSystemNameEEnum, SubSystemName.SPOT);
		addEEnumLiteral(subSystemNameEEnum, SubSystemName.FUTURE);
		addEEnumLiteral(subSystemNameEEnum, SubSystemName.MARGIN);
		addEEnumLiteral(subSystemNameEEnum, SubSystemName.SAVING);

		initEEnum(transferTypeEEnum, TransferType.class, "TransferType");
		addEEnumLiteral(transferTypeEEnum, TransferType.INTRA_EXCHANGE);
		addEEnumLiteral(transferTypeEEnum, TransferType.EXTRA_EXCHANGE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (cryptoExchangeEClass,
		   source,
		   new String[] {
			   "constraints", "checkUniqueToken"
		   });
		addAnnotation
		  (orderEClass,
		   source,
		   new String[] {
			   "constraints", "checkHasAmountOrder"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getcryptoExchange__CheckUniqueToken__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.Tokens->isUnique(self)"
		   });
		addAnnotation
		  (getAccount__AvailableBalance__Token(),
		   source,
		   new String[] {
			   "body", "\n \t\t\t if(not self.TokensBalance->select(Token = fToken)->isEmpty()) then\n \t\t\t\tself.TokensBalance->select(Token = fToken)->collect(balance)->sum().oclAsType(ecore::EFloat[1] )\n\t\t\t else\n\t\t\t \t0\n\t\t\t endif"
		   });
		addAnnotation
		  (getOrder__CheckHasAmountOrder__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "if(not self.Amount->isEmpty()) then \n\t\t\tself.account.availableBalance(self.TokenPair.TokenA) >= self.Amount\n\t\telse\n\t\t\ttrue\n\t\tendif"
		   });
		addAnnotation
		  (getSubSystem__GetNextOrderId__Order(),
		   source,
		   new String[] {
			   "body", "self.name.toString() + \'_Order_\' + (Orders->indexOf(o)).toString()"
		   });
		addAnnotation
		  (getSubSystem__GetNextAccId__Account(),
		   source,
		   new String[] {
			   "body", "self.name.toString().replaceAll(\'https://cryptoExchangePackage/1.0\\\'::\',\'\') +  \'_Account_\' + (accounts->indexOf(a)).toString()"
		   });
		addAnnotation
		  (getTokenPair__CreateName(),
		   source,
		   new String[] {
			   "body", "\n \t\t\t if(not self.TokenA->isEmpty() and not self.TokenB->isEmpty()) then\n \t\t\t\tself.TokenA.name + \' / \' + self.TokenB.name\n\t\t\t else\n\t\t\t \t\'\'\n\t\t\t endif"
		   });
	}

} //CryptoExchangePackagePackageImpl
