/**
 */
package cryptoExchangePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cryptoExchangePackage.CryptoExchangePackageFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface CryptoExchangePackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cryptoExchangePackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://cryptoExchangePackage/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cryptoExchangePackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CryptoExchangePackagePackage eINSTANCE = cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link cryptoExchangePackage.impl.cryptoExchangeImpl <em>crypto Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangePackage.impl.cryptoExchangeImpl
	 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getcryptoExchange()
	 * @generated
	 */
	int CRYPTO_EXCHANGE = 0;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__IP = 0;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__DOMAIN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Sub System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__SUB_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__TOKENS = 3;

	/**
	 * The feature id for the '<em><b>Token Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__TOKEN_NETWORKS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__NAME = 5;

	/**
	 * The number of structural features of the '<em>crypto Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Check Unique Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE___CHECK_UNIQUE_TOKEN__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>crypto Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link cryptoExchangePackage.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangePackage.impl.AccountImpl
	 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tokens Balance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__TOKENS_BALANCE = 1;

	/**
	 * The feature id for the '<em><b>Transfer Request</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__TRANSFER_REQUEST = 2;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Available Balance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT___AVAILABLE_BALANCE__TOKEN = 0;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link cryptoExchangePackage.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangePackage.impl.OrderImpl
	 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Leverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__LEVERAGE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ACCOUNT = 5;

	/**
	 * The feature id for the '<em><b>Token Pair</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TOKEN_PAIR = 6;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Check Has Amount Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER___CHECK_HAS_AMOUNT_ORDER__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link cryptoExchangePackage.impl.SavingOrderImpl <em>Saving Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangePackage.impl.SavingOrderImpl
	 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getSavingOrder()
	 * @generated
	 */
	int SAVING_ORDER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Mature Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__MATURE_DATE = 2;

	/**
	 * The feature id for the '<em><b>Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__INTEREST = 3;

	/**
	 * The feature id for the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__ACCOUNT = 4;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__TOKEN = 5;

	/**
	 * The number of structural features of the '<em>Saving Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Saving Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangePackage.impl.SubSystemImpl <em>Sub System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangePackage.impl.SubSystemImpl
	 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getSubSystem()
	 * @generated
	 */
	int SUB_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__ACCOUNTS = 1;

	/**
	 * The feature id for the '<em><b>Token Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__TOKEN_PAIRS = 2;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__ORDERS = 3;

	/**
	 * The feature id for the '<em><b>Saving Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__SAVING_ORDERS = 4;

	/**
	 * The number of structural features of the '<em>Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Next Order Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM___GET_NEXT_ORDER_ID__ORDER = 0;

	/**
	 * The operation id for the '<em>Get Next Acc Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM___GET_NEXT_ACC_ID__ACCOUNT = 1;

	/**
	 * The number of operations of the '<em>Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link cryptoExchangePackage.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangePackage.impl.TokenImpl
	 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__DECIMAL = 2;

	/**
	 * The feature id for the '<em><b>Token Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__TOKEN_NETWORK = 3;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangePackage.impl.TokenBalanceImpl <em>Token Balance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangePackage.impl.TokenBalanceImpl
	 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getTokenBalance()
	 * @generated
	 */
	int TOKEN_BALANCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BALANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BALANCE__BALANCE = 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BALANCE__TOKEN = 2;

	/**
	 * The number of structural features of the '<em>Token Balance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BALANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Token Balance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BALANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangePackage.impl.TokenNetworkImpl <em>Token Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangePackage.impl.TokenNetworkImpl
	 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getTokenNetwork()
	 * @generated
	 */
	int TOKEN_NETWORK = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NETWORK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Chain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NETWORK__CHAIN_ID = 1;

	/**
	 * The feature id for the '<em><b>RPC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NETWORK__RPC = 2;

	/**
	 * The number of structural features of the '<em>Token Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NETWORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Token Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangePackage.impl.TokenPairImpl <em>Token Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangePackage.impl.TokenPairImpl
	 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getTokenPair()
	 * @generated
	 */
	int TOKEN_PAIR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Token A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR__TOKEN_A = 2;

	/**
	 * The feature id for the '<em><b>Token B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR__TOKEN_B = 3;

	/**
	 * The number of structural features of the '<em>Token Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Create Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR___CREATE_NAME = 0;

	/**
	 * The number of operations of the '<em>Token Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link cryptoExchangePackage.impl.TransferRequestImpl <em>Transfer Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangePackage.impl.TransferRequestImpl
	 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getTransferRequest()
	 * @generated
	 */
	int TRANSFER_REQUEST = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST__AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST__TOKEN = 3;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST__DESTINATION = 4;

	/**
	 * The number of structural features of the '<em>Transfer Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transfer Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cryptoExchangePackage.OrderType <em>Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangePackage.OrderType
	 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getOrderType()
	 * @generated
	 */
	int ORDER_TYPE = 10;

	/**
	 * The meta object id for the '{@link cryptoExchangePackage.LeverageType <em>Leverage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangePackage.LeverageType
	 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getLeverageType()
	 * @generated
	 */
	int LEVERAGE_TYPE = 11;

	/**
	 * The meta object id for the '{@link cryptoExchangePackage.SubSystemName <em>Sub System Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangePackage.SubSystemName
	 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getSubSystemName()
	 * @generated
	 */
	int SUB_SYSTEM_NAME = 12;

	/**
	 * The meta object id for the '{@link cryptoExchangePackage.TransferType <em>Transfer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cryptoExchangePackage.TransferType
	 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getTransferType()
	 * @generated
	 */
	int TRANSFER_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link cryptoExchangePackage.cryptoExchange <em>crypto Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>crypto Exchange</em>'.
	 * @see cryptoExchangePackage.cryptoExchange
	 * @generated
	 */
	EClass getcryptoExchange();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.cryptoExchange#getIP <em>IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP</em>'.
	 * @see cryptoExchangePackage.cryptoExchange#getIP()
	 * @see #getcryptoExchange()
	 * @generated
	 */
	EAttribute getcryptoExchange_IP();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.cryptoExchange#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see cryptoExchangePackage.cryptoExchange#getDomainName()
	 * @see #getcryptoExchange()
	 * @generated
	 */
	EAttribute getcryptoExchange_DomainName();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangePackage.cryptoExchange#getSubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub System</em>'.
	 * @see cryptoExchangePackage.cryptoExchange#getSubSystem()
	 * @see #getcryptoExchange()
	 * @generated
	 */
	EReference getcryptoExchange_SubSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangePackage.cryptoExchange#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see cryptoExchangePackage.cryptoExchange#getTokens()
	 * @see #getcryptoExchange()
	 * @generated
	 */
	EReference getcryptoExchange_Tokens();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangePackage.cryptoExchange#getTokenNetworks <em>Token Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token Networks</em>'.
	 * @see cryptoExchangePackage.cryptoExchange#getTokenNetworks()
	 * @see #getcryptoExchange()
	 * @generated
	 */
	EReference getcryptoExchange_TokenNetworks();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.cryptoExchange#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cryptoExchangePackage.cryptoExchange#getName()
	 * @see #getcryptoExchange()
	 * @generated
	 */
	EAttribute getcryptoExchange_Name();

	/**
	 * Returns the meta object for the '{@link cryptoExchangePackage.cryptoExchange#checkUniqueToken(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Unique Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Unique Token</em>' operation.
	 * @see cryptoExchangePackage.cryptoExchange#checkUniqueToken(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getcryptoExchange__CheckUniqueToken__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cryptoExchangePackage.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see cryptoExchangePackage.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.Account#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cryptoExchangePackage.Account#getName()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangePackage.Account#getTokensBalance <em>Tokens Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens Balance</em>'.
	 * @see cryptoExchangePackage.Account#getTokensBalance()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_TokensBalance();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangePackage.Account#getTransferRequest <em>Transfer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transfer Request</em>'.
	 * @see cryptoExchangePackage.Account#getTransferRequest()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_TransferRequest();

	/**
	 * Returns the meta object for the '{@link cryptoExchangePackage.Account#availableBalance(cryptoExchangePackage.Token) <em>Available Balance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Available Balance</em>' operation.
	 * @see cryptoExchangePackage.Account#availableBalance(cryptoExchangePackage.Token)
	 * @generated
	 */
	EOperation getAccount__AvailableBalance__Token();

	/**
	 * Returns the meta object for class '{@link cryptoExchangePackage.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see cryptoExchangePackage.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.Order#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cryptoExchangePackage.Order#getName()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Name();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.Order#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see cryptoExchangePackage.Order#getPrice()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Price();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.Order#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see cryptoExchangePackage.Order#getAmount()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Amount();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.Order#getLeverage <em>Leverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leverage</em>'.
	 * @see cryptoExchangePackage.Order#getLeverage()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Leverage();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.Order#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cryptoExchangePackage.Order#getType()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Type();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangePackage.Order#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Account</em>'.
	 * @see cryptoExchangePackage.Order#getAccount()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Account();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangePackage.Order#getTokenPair <em>Token Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token Pair</em>'.
	 * @see cryptoExchangePackage.Order#getTokenPair()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_TokenPair();

	/**
	 * Returns the meta object for the '{@link cryptoExchangePackage.Order#checkHasAmountOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Has Amount Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Has Amount Order</em>' operation.
	 * @see cryptoExchangePackage.Order#checkHasAmountOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOrder__CheckHasAmountOrder__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cryptoExchangePackage.SavingOrder <em>Saving Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Saving Order</em>'.
	 * @see cryptoExchangePackage.SavingOrder
	 * @generated
	 */
	EClass getSavingOrder();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.SavingOrder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cryptoExchangePackage.SavingOrder#getName()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EAttribute getSavingOrder_Name();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.SavingOrder#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see cryptoExchangePackage.SavingOrder#getAmount()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EAttribute getSavingOrder_Amount();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.SavingOrder#getMatureDate <em>Mature Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mature Date</em>'.
	 * @see cryptoExchangePackage.SavingOrder#getMatureDate()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EAttribute getSavingOrder_MatureDate();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.SavingOrder#getInterest <em>Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interest</em>'.
	 * @see cryptoExchangePackage.SavingOrder#getInterest()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EAttribute getSavingOrder_Interest();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangePackage.SavingOrder#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Account</em>'.
	 * @see cryptoExchangePackage.SavingOrder#getAccount()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EReference getSavingOrder_Account();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangePackage.SavingOrder#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see cryptoExchangePackage.SavingOrder#getToken()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EReference getSavingOrder_Token();

	/**
	 * Returns the meta object for class '{@link cryptoExchangePackage.SubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub System</em>'.
	 * @see cryptoExchangePackage.SubSystem
	 * @generated
	 */
	EClass getSubSystem();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.SubSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cryptoExchangePackage.SubSystem#getName()
	 * @see #getSubSystem()
	 * @generated
	 */
	EAttribute getSubSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangePackage.SubSystem#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounts</em>'.
	 * @see cryptoExchangePackage.SubSystem#getAccounts()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_Accounts();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangePackage.SubSystem#getTokenPairs <em>Token Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token Pairs</em>'.
	 * @see cryptoExchangePackage.SubSystem#getTokenPairs()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_TokenPairs();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangePackage.SubSystem#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see cryptoExchangePackage.SubSystem#getOrders()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_Orders();

	/**
	 * Returns the meta object for the containment reference list '{@link cryptoExchangePackage.SubSystem#getSavingOrders <em>Saving Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Saving Orders</em>'.
	 * @see cryptoExchangePackage.SubSystem#getSavingOrders()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_SavingOrders();

	/**
	 * Returns the meta object for the '{@link cryptoExchangePackage.SubSystem#getNextOrderId(cryptoExchangePackage.Order) <em>Get Next Order Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next Order Id</em>' operation.
	 * @see cryptoExchangePackage.SubSystem#getNextOrderId(cryptoExchangePackage.Order)
	 * @generated
	 */
	EOperation getSubSystem__GetNextOrderId__Order();

	/**
	 * Returns the meta object for the '{@link cryptoExchangePackage.SubSystem#getNextAccId(cryptoExchangePackage.Account) <em>Get Next Acc Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next Acc Id</em>' operation.
	 * @see cryptoExchangePackage.SubSystem#getNextAccId(cryptoExchangePackage.Account)
	 * @generated
	 */
	EOperation getSubSystem__GetNextAccId__Account();

	/**
	 * Returns the meta object for class '{@link cryptoExchangePackage.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see cryptoExchangePackage.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.Token#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cryptoExchangePackage.Token#getName()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Name();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.Token#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see cryptoExchangePackage.Token#getAddress()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Address();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.Token#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see cryptoExchangePackage.Token#getDecimal()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Decimal();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangePackage.Token#getTokenNetwork <em>Token Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token Network</em>'.
	 * @see cryptoExchangePackage.Token#getTokenNetwork()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_TokenNetwork();

	/**
	 * Returns the meta object for class '{@link cryptoExchangePackage.TokenBalance <em>Token Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Balance</em>'.
	 * @see cryptoExchangePackage.TokenBalance
	 * @generated
	 */
	EClass getTokenBalance();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.TokenBalance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cryptoExchangePackage.TokenBalance#getName()
	 * @see #getTokenBalance()
	 * @generated
	 */
	EAttribute getTokenBalance_Name();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.TokenBalance#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see cryptoExchangePackage.TokenBalance#getBalance()
	 * @see #getTokenBalance()
	 * @generated
	 */
	EAttribute getTokenBalance_Balance();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangePackage.TokenBalance#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see cryptoExchangePackage.TokenBalance#getToken()
	 * @see #getTokenBalance()
	 * @generated
	 */
	EReference getTokenBalance_Token();

	/**
	 * Returns the meta object for class '{@link cryptoExchangePackage.TokenNetwork <em>Token Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Network</em>'.
	 * @see cryptoExchangePackage.TokenNetwork
	 * @generated
	 */
	EClass getTokenNetwork();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.TokenNetwork#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cryptoExchangePackage.TokenNetwork#getName()
	 * @see #getTokenNetwork()
	 * @generated
	 */
	EAttribute getTokenNetwork_Name();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.TokenNetwork#getChainID <em>Chain ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chain ID</em>'.
	 * @see cryptoExchangePackage.TokenNetwork#getChainID()
	 * @see #getTokenNetwork()
	 * @generated
	 */
	EAttribute getTokenNetwork_ChainID();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.TokenNetwork#getRPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RPC</em>'.
	 * @see cryptoExchangePackage.TokenNetwork#getRPC()
	 * @see #getTokenNetwork()
	 * @generated
	 */
	EAttribute getTokenNetwork_RPC();

	/**
	 * Returns the meta object for class '{@link cryptoExchangePackage.TokenPair <em>Token Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Pair</em>'.
	 * @see cryptoExchangePackage.TokenPair
	 * @generated
	 */
	EClass getTokenPair();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.TokenPair#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cryptoExchangePackage.TokenPair#getName()
	 * @see #getTokenPair()
	 * @generated
	 */
	EAttribute getTokenPair_Name();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.TokenPair#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see cryptoExchangePackage.TokenPair#getPrice()
	 * @see #getTokenPair()
	 * @generated
	 */
	EAttribute getTokenPair_Price();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangePackage.TokenPair#getTokenA <em>Token A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token A</em>'.
	 * @see cryptoExchangePackage.TokenPair#getTokenA()
	 * @see #getTokenPair()
	 * @generated
	 */
	EReference getTokenPair_TokenA();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangePackage.TokenPair#getTokenB <em>Token B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token B</em>'.
	 * @see cryptoExchangePackage.TokenPair#getTokenB()
	 * @see #getTokenPair()
	 * @generated
	 */
	EReference getTokenPair_TokenB();

	/**
	 * Returns the meta object for the '{@link cryptoExchangePackage.TokenPair#createName() <em>Create Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Name</em>' operation.
	 * @see cryptoExchangePackage.TokenPair#createName()
	 * @generated
	 */
	EOperation getTokenPair__CreateName();

	/**
	 * Returns the meta object for class '{@link cryptoExchangePackage.TransferRequest <em>Transfer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Request</em>'.
	 * @see cryptoExchangePackage.TransferRequest
	 * @generated
	 */
	EClass getTransferRequest();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.TransferRequest#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see cryptoExchangePackage.TransferRequest#getID()
	 * @see #getTransferRequest()
	 * @generated
	 */
	EAttribute getTransferRequest_ID();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.TransferRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cryptoExchangePackage.TransferRequest#getType()
	 * @see #getTransferRequest()
	 * @generated
	 */
	EAttribute getTransferRequest_Type();

	/**
	 * Returns the meta object for the attribute '{@link cryptoExchangePackage.TransferRequest#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see cryptoExchangePackage.TransferRequest#getAmount()
	 * @see #getTransferRequest()
	 * @generated
	 */
	EAttribute getTransferRequest_Amount();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangePackage.TransferRequest#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see cryptoExchangePackage.TransferRequest#getToken()
	 * @see #getTransferRequest()
	 * @generated
	 */
	EReference getTransferRequest_Token();

	/**
	 * Returns the meta object for the reference '{@link cryptoExchangePackage.TransferRequest#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see cryptoExchangePackage.TransferRequest#getDestination()
	 * @see #getTransferRequest()
	 * @generated
	 */
	EReference getTransferRequest_Destination();

	/**
	 * Returns the meta object for enum '{@link cryptoExchangePackage.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Type</em>'.
	 * @see cryptoExchangePackage.OrderType
	 * @generated
	 */
	EEnum getOrderType();

	/**
	 * Returns the meta object for enum '{@link cryptoExchangePackage.LeverageType <em>Leverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Leverage Type</em>'.
	 * @see cryptoExchangePackage.LeverageType
	 * @generated
	 */
	EEnum getLeverageType();

	/**
	 * Returns the meta object for enum '{@link cryptoExchangePackage.SubSystemName <em>Sub System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub System Name</em>'.
	 * @see cryptoExchangePackage.SubSystemName
	 * @generated
	 */
	EEnum getSubSystemName();

	/**
	 * Returns the meta object for enum '{@link cryptoExchangePackage.TransferType <em>Transfer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transfer Type</em>'.
	 * @see cryptoExchangePackage.TransferType
	 * @generated
	 */
	EEnum getTransferType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CryptoExchangePackageFactory getCryptoExchangePackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cryptoExchangePackage.impl.cryptoExchangeImpl <em>crypto Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangePackage.impl.cryptoExchangeImpl
		 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getcryptoExchange()
		 * @generated
		 */
		EClass CRYPTO_EXCHANGE = eINSTANCE.getcryptoExchange();

		/**
		 * The meta object literal for the '<em><b>IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRYPTO_EXCHANGE__IP = eINSTANCE.getcryptoExchange_IP();

		/**
		 * The meta object literal for the '<em><b>Domain Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRYPTO_EXCHANGE__DOMAIN_NAME = eINSTANCE.getcryptoExchange_DomainName();

		/**
		 * The meta object literal for the '<em><b>Sub System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYPTO_EXCHANGE__SUB_SYSTEM = eINSTANCE.getcryptoExchange_SubSystem();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYPTO_EXCHANGE__TOKENS = eINSTANCE.getcryptoExchange_Tokens();

		/**
		 * The meta object literal for the '<em><b>Token Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYPTO_EXCHANGE__TOKEN_NETWORKS = eINSTANCE.getcryptoExchange_TokenNetworks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRYPTO_EXCHANGE__NAME = eINSTANCE.getcryptoExchange_Name();

		/**
		 * The meta object literal for the '<em><b>Check Unique Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CRYPTO_EXCHANGE___CHECK_UNIQUE_TOKEN__DIAGNOSTICCHAIN_MAP = eINSTANCE.getcryptoExchange__CheckUniqueToken__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cryptoExchangePackage.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangePackage.impl.AccountImpl
		 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__NAME = eINSTANCE.getAccount_Name();

		/**
		 * The meta object literal for the '<em><b>Tokens Balance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__TOKENS_BALANCE = eINSTANCE.getAccount_TokensBalance();

		/**
		 * The meta object literal for the '<em><b>Transfer Request</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__TRANSFER_REQUEST = eINSTANCE.getAccount_TransferRequest();

		/**
		 * The meta object literal for the '<em><b>Available Balance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCOUNT___AVAILABLE_BALANCE__TOKEN = eINSTANCE.getAccount__AvailableBalance__Token();

		/**
		 * The meta object literal for the '{@link cryptoExchangePackage.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangePackage.impl.OrderImpl
		 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__NAME = eINSTANCE.getOrder_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PRICE = eINSTANCE.getOrder_Price();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__AMOUNT = eINSTANCE.getOrder_Amount();

		/**
		 * The meta object literal for the '<em><b>Leverage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__LEVERAGE = eINSTANCE.getOrder_Leverage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TYPE = eINSTANCE.getOrder_Type();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__ACCOUNT = eINSTANCE.getOrder_Account();

		/**
		 * The meta object literal for the '<em><b>Token Pair</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__TOKEN_PAIR = eINSTANCE.getOrder_TokenPair();

		/**
		 * The meta object literal for the '<em><b>Check Has Amount Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDER___CHECK_HAS_AMOUNT_ORDER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOrder__CheckHasAmountOrder__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cryptoExchangePackage.impl.SavingOrderImpl <em>Saving Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangePackage.impl.SavingOrderImpl
		 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getSavingOrder()
		 * @generated
		 */
		EClass SAVING_ORDER = eINSTANCE.getSavingOrder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVING_ORDER__NAME = eINSTANCE.getSavingOrder_Name();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVING_ORDER__AMOUNT = eINSTANCE.getSavingOrder_Amount();

		/**
		 * The meta object literal for the '<em><b>Mature Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVING_ORDER__MATURE_DATE = eINSTANCE.getSavingOrder_MatureDate();

		/**
		 * The meta object literal for the '<em><b>Interest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVING_ORDER__INTEREST = eINSTANCE.getSavingOrder_Interest();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAVING_ORDER__ACCOUNT = eINSTANCE.getSavingOrder_Account();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAVING_ORDER__TOKEN = eINSTANCE.getSavingOrder_Token();

		/**
		 * The meta object literal for the '{@link cryptoExchangePackage.impl.SubSystemImpl <em>Sub System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangePackage.impl.SubSystemImpl
		 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getSubSystem()
		 * @generated
		 */
		EClass SUB_SYSTEM = eINSTANCE.getSubSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SYSTEM__NAME = eINSTANCE.getSubSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__ACCOUNTS = eINSTANCE.getSubSystem_Accounts();

		/**
		 * The meta object literal for the '<em><b>Token Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__TOKEN_PAIRS = eINSTANCE.getSubSystem_TokenPairs();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__ORDERS = eINSTANCE.getSubSystem_Orders();

		/**
		 * The meta object literal for the '<em><b>Saving Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__SAVING_ORDERS = eINSTANCE.getSubSystem_SavingOrders();

		/**
		 * The meta object literal for the '<em><b>Get Next Order Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUB_SYSTEM___GET_NEXT_ORDER_ID__ORDER = eINSTANCE.getSubSystem__GetNextOrderId__Order();

		/**
		 * The meta object literal for the '<em><b>Get Next Acc Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUB_SYSTEM___GET_NEXT_ACC_ID__ACCOUNT = eINSTANCE.getSubSystem__GetNextAccId__Account();

		/**
		 * The meta object literal for the '{@link cryptoExchangePackage.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangePackage.impl.TokenImpl
		 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__NAME = eINSTANCE.getToken_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__ADDRESS = eINSTANCE.getToken_Address();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__DECIMAL = eINSTANCE.getToken_Decimal();

		/**
		 * The meta object literal for the '<em><b>Token Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__TOKEN_NETWORK = eINSTANCE.getToken_TokenNetwork();

		/**
		 * The meta object literal for the '{@link cryptoExchangePackage.impl.TokenBalanceImpl <em>Token Balance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangePackage.impl.TokenBalanceImpl
		 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getTokenBalance()
		 * @generated
		 */
		EClass TOKEN_BALANCE = eINSTANCE.getTokenBalance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_BALANCE__NAME = eINSTANCE.getTokenBalance_Name();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_BALANCE__BALANCE = eINSTANCE.getTokenBalance_Balance();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_BALANCE__TOKEN = eINSTANCE.getTokenBalance_Token();

		/**
		 * The meta object literal for the '{@link cryptoExchangePackage.impl.TokenNetworkImpl <em>Token Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangePackage.impl.TokenNetworkImpl
		 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getTokenNetwork()
		 * @generated
		 */
		EClass TOKEN_NETWORK = eINSTANCE.getTokenNetwork();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_NETWORK__NAME = eINSTANCE.getTokenNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Chain ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_NETWORK__CHAIN_ID = eINSTANCE.getTokenNetwork_ChainID();

		/**
		 * The meta object literal for the '<em><b>RPC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_NETWORK__RPC = eINSTANCE.getTokenNetwork_RPC();

		/**
		 * The meta object literal for the '{@link cryptoExchangePackage.impl.TokenPairImpl <em>Token Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangePackage.impl.TokenPairImpl
		 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getTokenPair()
		 * @generated
		 */
		EClass TOKEN_PAIR = eINSTANCE.getTokenPair();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_PAIR__NAME = eINSTANCE.getTokenPair_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_PAIR__PRICE = eINSTANCE.getTokenPair_Price();

		/**
		 * The meta object literal for the '<em><b>Token A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_PAIR__TOKEN_A = eINSTANCE.getTokenPair_TokenA();

		/**
		 * The meta object literal for the '<em><b>Token B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_PAIR__TOKEN_B = eINSTANCE.getTokenPair_TokenB();

		/**
		 * The meta object literal for the '<em><b>Create Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN_PAIR___CREATE_NAME = eINSTANCE.getTokenPair__CreateName();

		/**
		 * The meta object literal for the '{@link cryptoExchangePackage.impl.TransferRequestImpl <em>Transfer Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangePackage.impl.TransferRequestImpl
		 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getTransferRequest()
		 * @generated
		 */
		EClass TRANSFER_REQUEST = eINSTANCE.getTransferRequest();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_REQUEST__ID = eINSTANCE.getTransferRequest_ID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_REQUEST__TYPE = eINSTANCE.getTransferRequest_Type();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_REQUEST__AMOUNT = eINSTANCE.getTransferRequest_Amount();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_REQUEST__TOKEN = eINSTANCE.getTransferRequest_Token();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_REQUEST__DESTINATION = eINSTANCE.getTransferRequest_Destination();

		/**
		 * The meta object literal for the '{@link cryptoExchangePackage.OrderType <em>Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangePackage.OrderType
		 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getOrderType()
		 * @generated
		 */
		EEnum ORDER_TYPE = eINSTANCE.getOrderType();

		/**
		 * The meta object literal for the '{@link cryptoExchangePackage.LeverageType <em>Leverage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangePackage.LeverageType
		 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getLeverageType()
		 * @generated
		 */
		EEnum LEVERAGE_TYPE = eINSTANCE.getLeverageType();

		/**
		 * The meta object literal for the '{@link cryptoExchangePackage.SubSystemName <em>Sub System Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangePackage.SubSystemName
		 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getSubSystemName()
		 * @generated
		 */
		EEnum SUB_SYSTEM_NAME = eINSTANCE.getSubSystemName();

		/**
		 * The meta object literal for the '{@link cryptoExchangePackage.TransferType <em>Transfer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cryptoExchangePackage.TransferType
		 * @see cryptoExchangePackage.impl.CryptoExchangePackagePackageImpl#getTransferType()
		 * @generated
		 */
		EEnum TRANSFER_TYPE = eINSTANCE.getTransferType();

	}

} //CryptoExchangePackagePackage
