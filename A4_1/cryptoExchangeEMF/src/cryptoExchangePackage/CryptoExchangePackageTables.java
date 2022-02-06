/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /cryptoExchangeEMF/model/cryptoExchangeModel.ecore
 * using:
 *   /cryptoExchangeEMF/model/cryptoExchangeModel.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package cryptoExchangePackage;

// import cryptoExchangePackage.CryptoExchangePackagePackage;
// import cryptoExchangePackage.CryptoExchangePackageTables;
import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * CryptoExchangePackageTables provides the dispatch tables for the cryptoExchangePackage for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class CryptoExchangePackageTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(CryptoExchangePackagePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_cryptoExchangePackage_s_1_0 = IdManager.getNsURIPackageId("https://cryptoExchangePackage/1.0", null, CryptoExchangePackagePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Account = CryptoExchangePackageTables.PACKid_https_c_s_s_cryptoExchangePackage_s_1_0.getClassId("Account", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = CryptoExchangePackageTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OclElement = CryptoExchangePackageTables.PACKid_$metamodel$.getClassId("OclElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Order = CryptoExchangePackageTables.PACKid_https_c_s_s_cryptoExchangePackage_s_1_0.getClassId("Order", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SavingOrder = CryptoExchangePackageTables.PACKid_https_c_s_s_cryptoExchangePackage_s_1_0.getClassId("SavingOrder", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SubSystem = CryptoExchangePackageTables.PACKid_https_c_s_s_cryptoExchangePackage_s_1_0.getClassId("SubSystem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Token = CryptoExchangePackageTables.PACKid_https_c_s_s_cryptoExchangePackage_s_1_0.getClassId("Token", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TokenBalance = CryptoExchangePackageTables.PACKid_https_c_s_s_cryptoExchangePackage_s_1_0.getClassId("TokenBalance", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TokenNetwork = CryptoExchangePackageTables.PACKid_https_c_s_s_cryptoExchangePackage_s_1_0.getClassId("TokenNetwork", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TokenPair = CryptoExchangePackageTables.PACKid_https_c_s_s_cryptoExchangePackage_s_1_0.getClassId("TokenPair", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TransferRequest = CryptoExchangePackageTables.PACKid_https_c_s_s_cryptoExchangePackage_s_1_0.getClassId("TransferRequest", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_cryptoExchange = CryptoExchangePackageTables.PACKid_https_c_s_s_cryptoExchangePackage_s_1_0.getClassId("cryptoExchange", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = CryptoExchangePackageTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = CryptoExchangePackageTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = CryptoExchangePackageTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = CryptoExchangePackageTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_LeverageType = CryptoExchangePackageTables.PACKid_https_c_s_s_cryptoExchangePackage_s_1_0.getEnumerationId("LeverageType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_OrderType = CryptoExchangePackageTables.PACKid_https_c_s_s_cryptoExchangePackage_s_1_0.getEnumerationId("OrderType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_SubSystemName = CryptoExchangePackageTables.PACKid_https_c_s_s_cryptoExchangePackage_s_1_0.getEnumerationId("SubSystemName");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TransferType = CryptoExchangePackageTables.PACKid_https_c_s_s_cryptoExchangePackage_s_1_0.getEnumerationId("TransferType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ String STR_ = "";
	public static final /*@NonInvalid*/ String STR__32_s_32 = " / ";
	public static final /*@NonInvalid*/ String STR__Account_ = "_Account_";
	public static final /*@NonInvalid*/ String STR__Order_ = "_Order_";
	public static final /*@NonInvalid*/ String STR_https_c_s_s_cryptoExchangePackage_s_1_0_39_c_c = "https://cryptoExchangePackage/1.0\'::";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Order = TypeId.BAG.getSpecializedId(CryptoExchangePackageTables.CLSSid_Order);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_SavingOrder = TypeId.BAG.getSpecializedId(CryptoExchangePackageTables.CLSSid_SavingOrder);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Token = TypeId.BAG.getSpecializedId(CryptoExchangePackageTables.CLSSid_Token);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_TokenBalance = TypeId.BAG.getSpecializedId(CryptoExchangePackageTables.CLSSid_TokenBalance);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_TokenPair = TypeId.BAG.getSpecializedId(CryptoExchangePackageTables.CLSSid_TokenPair);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_TransferRequest = TypeId.BAG.getSpecializedId(CryptoExchangePackageTables.CLSSid_TransferRequest);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Account = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangePackageTables.CLSSid_Account);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Order = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangePackageTables.CLSSid_Order);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SavingOrder = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangePackageTables.CLSSid_SavingOrder);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SubSystem = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangePackageTables.CLSSid_SubSystem);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Token = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangePackageTables.CLSSid_Token);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TokenBalance = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangePackageTables.CLSSid_TokenBalance);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TokenNetwork = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangePackageTables.CLSSid_TokenNetwork);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TokenPair = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangePackageTables.CLSSid_TokenPair);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TransferRequest = TypeId.ORDERED_SET.getSpecializedId(CryptoExchangePackageTables.CLSSid_TransferRequest);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EFloat = TypeId.SEQUENCE.getSpecializedId(CryptoExchangePackageTables.DATAid_EFloat);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Token = TypeId.SET.getSpecializedId(CryptoExchangePackageTables.CLSSid_Token);
	public static final /*@NonInvalid*/ CollectionTypeId SET_DATAid_EFloat = TypeId.SET.getSpecializedId(CryptoExchangePackageTables.DATAid_EFloat);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			CryptoExchangePackageTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangePackageTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Account = new EcoreExecutorType(CryptoExchangePackagePackage.Literals.ACCOUNT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _LeverageType = new EcoreExecutorEnumeration(CryptoExchangePackagePackage.Literals.LEVERAGE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Order = new EcoreExecutorType(CryptoExchangePackagePackage.Literals.ORDER, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _OrderType = new EcoreExecutorEnumeration(CryptoExchangePackagePackage.Literals.ORDER_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _SavingOrder = new EcoreExecutorType(CryptoExchangePackagePackage.Literals.SAVING_ORDER, PACKAGE, 0);
		public static final EcoreExecutorType _SubSystem = new EcoreExecutorType(CryptoExchangePackagePackage.Literals.SUB_SYSTEM, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _SubSystemName = new EcoreExecutorEnumeration(CryptoExchangePackagePackage.Literals.SUB_SYSTEM_NAME, PACKAGE, 0);
		public static final EcoreExecutorType _Token = new EcoreExecutorType(CryptoExchangePackagePackage.Literals.TOKEN, PACKAGE, 0);
		public static final EcoreExecutorType _TokenBalance = new EcoreExecutorType(CryptoExchangePackagePackage.Literals.TOKEN_BALANCE, PACKAGE, 0);
		public static final EcoreExecutorType _TokenNetwork = new EcoreExecutorType(CryptoExchangePackagePackage.Literals.TOKEN_NETWORK, PACKAGE, 0);
		public static final EcoreExecutorType _TokenPair = new EcoreExecutorType(CryptoExchangePackagePackage.Literals.TOKEN_PAIR, PACKAGE, 0);
		public static final EcoreExecutorType _TransferRequest = new EcoreExecutorType(CryptoExchangePackagePackage.Literals.TRANSFER_REQUEST, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TransferType = new EcoreExecutorEnumeration(CryptoExchangePackagePackage.Literals.TRANSFER_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _cryptoExchange = new EcoreExecutorType(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Account,
			_LeverageType,
			_Order,
			_OrderType,
			_SavingOrder,
			_SubSystem,
			_SubSystemName,
			_Token,
			_TokenBalance,
			_TokenNetwork,
			_TokenPair,
			_TransferRequest,
			_TransferType,
			_cryptoExchange
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangePackageTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Account__Account = new ExecutorFragment(Types._Account, CryptoExchangePackageTables.Types._Account);
		private static final ExecutorFragment _Account__OclAny = new ExecutorFragment(Types._Account, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Account__OclElement = new ExecutorFragment(Types._Account, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LeverageType__LeverageType = new ExecutorFragment(Types._LeverageType, CryptoExchangePackageTables.Types._LeverageType);
		private static final ExecutorFragment _LeverageType__OclAny = new ExecutorFragment(Types._LeverageType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LeverageType__OclElement = new ExecutorFragment(Types._LeverageType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _LeverageType__OclEnumeration = new ExecutorFragment(Types._LeverageType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _LeverageType__OclType = new ExecutorFragment(Types._LeverageType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Order__OclAny = new ExecutorFragment(Types._Order, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Order__OclElement = new ExecutorFragment(Types._Order, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Order__Order = new ExecutorFragment(Types._Order, CryptoExchangePackageTables.Types._Order);

		private static final ExecutorFragment _OrderType__OclAny = new ExecutorFragment(Types._OrderType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OrderType__OclElement = new ExecutorFragment(Types._OrderType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OrderType__OclEnumeration = new ExecutorFragment(Types._OrderType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _OrderType__OclType = new ExecutorFragment(Types._OrderType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _OrderType__OrderType = new ExecutorFragment(Types._OrderType, CryptoExchangePackageTables.Types._OrderType);

		private static final ExecutorFragment _SavingOrder__OclAny = new ExecutorFragment(Types._SavingOrder, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SavingOrder__OclElement = new ExecutorFragment(Types._SavingOrder, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SavingOrder__SavingOrder = new ExecutorFragment(Types._SavingOrder, CryptoExchangePackageTables.Types._SavingOrder);

		private static final ExecutorFragment _SubSystem__OclAny = new ExecutorFragment(Types._SubSystem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SubSystem__OclElement = new ExecutorFragment(Types._SubSystem, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SubSystem__SubSystem = new ExecutorFragment(Types._SubSystem, CryptoExchangePackageTables.Types._SubSystem);

		private static final ExecutorFragment _SubSystemName__OclAny = new ExecutorFragment(Types._SubSystemName, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SubSystemName__OclElement = new ExecutorFragment(Types._SubSystemName, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SubSystemName__OclEnumeration = new ExecutorFragment(Types._SubSystemName, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _SubSystemName__OclType = new ExecutorFragment(Types._SubSystemName, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _SubSystemName__SubSystemName = new ExecutorFragment(Types._SubSystemName, CryptoExchangePackageTables.Types._SubSystemName);

		private static final ExecutorFragment _Token__OclAny = new ExecutorFragment(Types._Token, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Token__OclElement = new ExecutorFragment(Types._Token, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Token__Token = new ExecutorFragment(Types._Token, CryptoExchangePackageTables.Types._Token);

		private static final ExecutorFragment _TokenBalance__OclAny = new ExecutorFragment(Types._TokenBalance, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TokenBalance__OclElement = new ExecutorFragment(Types._TokenBalance, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TokenBalance__TokenBalance = new ExecutorFragment(Types._TokenBalance, CryptoExchangePackageTables.Types._TokenBalance);

		private static final ExecutorFragment _TokenNetwork__OclAny = new ExecutorFragment(Types._TokenNetwork, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TokenNetwork__OclElement = new ExecutorFragment(Types._TokenNetwork, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TokenNetwork__TokenNetwork = new ExecutorFragment(Types._TokenNetwork, CryptoExchangePackageTables.Types._TokenNetwork);

		private static final ExecutorFragment _TokenPair__OclAny = new ExecutorFragment(Types._TokenPair, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TokenPair__OclElement = new ExecutorFragment(Types._TokenPair, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TokenPair__TokenPair = new ExecutorFragment(Types._TokenPair, CryptoExchangePackageTables.Types._TokenPair);

		private static final ExecutorFragment _TransferRequest__OclAny = new ExecutorFragment(Types._TransferRequest, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TransferRequest__OclElement = new ExecutorFragment(Types._TransferRequest, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TransferRequest__TransferRequest = new ExecutorFragment(Types._TransferRequest, CryptoExchangePackageTables.Types._TransferRequest);

		private static final ExecutorFragment _TransferType__OclAny = new ExecutorFragment(Types._TransferType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TransferType__OclElement = new ExecutorFragment(Types._TransferType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TransferType__OclEnumeration = new ExecutorFragment(Types._TransferType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TransferType__OclType = new ExecutorFragment(Types._TransferType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TransferType__TransferType = new ExecutorFragment(Types._TransferType, CryptoExchangePackageTables.Types._TransferType);

		private static final ExecutorFragment _cryptoExchange__OclAny = new ExecutorFragment(Types._cryptoExchange, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _cryptoExchange__OclElement = new ExecutorFragment(Types._cryptoExchange, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _cryptoExchange__cryptoExchange = new ExecutorFragment(Types._cryptoExchange, CryptoExchangePackageTables.Types._cryptoExchange);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangePackageTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _Account = TypeUtil.createParameterTypes(CryptoExchangePackageTables.Types._Account);
		public static final ParameterTypes _Order = TypeUtil.createParameterTypes(CryptoExchangePackageTables.Types._Order);
		public static final ParameterTypes _Token = TypeUtil.createParameterTypes(CryptoExchangePackageTables.Types._Token);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangePackageTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Account__availableBalance = new ExecutorOperation("availableBalance", Parameters._Token, Types._Account,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _SubSystem__getNextAccId = new ExecutorOperation("getNextAccId", Parameters._Account, Types._SubSystem,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _SubSystem__getNextOrderId = new ExecutorOperation("getNextOrderId", Parameters._Order, Types._SubSystem,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _TokenPair__createName = new ExecutorOperation("createName", TypeUtil.EMPTY_PARAMETER_TYPES, Types._TokenPair,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangePackageTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Account__TokensBalance = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.ACCOUNT__TOKENS_BALANCE, Types._Account, 0);
		public static final ExecutorProperty _Account__name = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.ACCOUNT__NAME, Types._Account, 1);
		public static final ExecutorProperty _Account__transferRequest = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.ACCOUNT__TRANSFER_REQUEST, Types._Account, 2);
		public static final ExecutorProperty _Account__Order__account = new ExecutorPropertyWithImplementation("Order", Types._Account, 3, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.ORDER__ACCOUNT));
		public static final ExecutorProperty _Account__SavingOrder__account = new ExecutorPropertyWithImplementation("SavingOrder", Types._Account, 4, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.SAVING_ORDER__ACCOUNT));
		public static final ExecutorProperty _Account__SubSystem__accounts = new ExecutorPropertyWithImplementation("SubSystem", Types._Account, 5, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.SUB_SYSTEM__ACCOUNTS));
		public static final ExecutorProperty _Account__TransferRequest__Destination = new ExecutorPropertyWithImplementation("TransferRequest", Types._Account, 6, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.TRANSFER_REQUEST__DESTINATION));

		public static final ExecutorProperty _Order__Amount = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.ORDER__AMOUNT, Types._Order, 0);
		public static final ExecutorProperty _Order__Price = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.ORDER__PRICE, Types._Order, 1);
		public static final ExecutorProperty _Order__TokenPair = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.ORDER__TOKEN_PAIR, Types._Order, 2);
		public static final ExecutorProperty _Order__Type = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.ORDER__TYPE, Types._Order, 3);
		public static final ExecutorProperty _Order__account = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.ORDER__ACCOUNT, Types._Order, 4);
		public static final ExecutorProperty _Order__leverage = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.ORDER__LEVERAGE, Types._Order, 5);
		public static final ExecutorProperty _Order__name = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.ORDER__NAME, Types._Order, 6);
		public static final ExecutorProperty _Order__SubSystem__Orders = new ExecutorPropertyWithImplementation("SubSystem", Types._Order, 7, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.SUB_SYSTEM__ORDERS));

		public static final ExecutorProperty _SavingOrder__Amount = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.SAVING_ORDER__AMOUNT, Types._SavingOrder, 0);
		public static final ExecutorProperty _SavingOrder__Interest = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.SAVING_ORDER__INTEREST, Types._SavingOrder, 1);
		public static final ExecutorProperty _SavingOrder__MatureDate = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.SAVING_ORDER__MATURE_DATE, Types._SavingOrder, 2);
		public static final ExecutorProperty _SavingOrder__Token = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.SAVING_ORDER__TOKEN, Types._SavingOrder, 3);
		public static final ExecutorProperty _SavingOrder__account = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.SAVING_ORDER__ACCOUNT, Types._SavingOrder, 4);
		public static final ExecutorProperty _SavingOrder__name = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.SAVING_ORDER__NAME, Types._SavingOrder, 5);
		public static final ExecutorProperty _SavingOrder__SubSystem__SavingOrders = new ExecutorPropertyWithImplementation("SubSystem", Types._SavingOrder, 6, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.SUB_SYSTEM__SAVING_ORDERS));

		public static final ExecutorProperty _SubSystem__Orders = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.SUB_SYSTEM__ORDERS, Types._SubSystem, 0);
		public static final ExecutorProperty _SubSystem__SavingOrders = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.SUB_SYSTEM__SAVING_ORDERS, Types._SubSystem, 1);
		public static final ExecutorProperty _SubSystem__TokenPairs = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.SUB_SYSTEM__TOKEN_PAIRS, Types._SubSystem, 2);
		public static final ExecutorProperty _SubSystem__accounts = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.SUB_SYSTEM__ACCOUNTS, Types._SubSystem, 3);
		public static final ExecutorProperty _SubSystem__name = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.SUB_SYSTEM__NAME, Types._SubSystem, 4);
		public static final ExecutorProperty _SubSystem__cryptoExchange__SubSystem = new ExecutorPropertyWithImplementation("cryptoExchange", Types._SubSystem, 5, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__SUB_SYSTEM));

		public static final ExecutorProperty _Token__TokenNetwork = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TOKEN__TOKEN_NETWORK, Types._Token, 0);
		public static final ExecutorProperty _Token__address = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TOKEN__ADDRESS, Types._Token, 1);
		public static final ExecutorProperty _Token__decimal = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TOKEN__DECIMAL, Types._Token, 2);
		public static final ExecutorProperty _Token__name = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TOKEN__NAME, Types._Token, 3);
		public static final ExecutorProperty _Token__SavingOrder__Token = new ExecutorPropertyWithImplementation("SavingOrder", Types._Token, 4, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.SAVING_ORDER__TOKEN));
		public static final ExecutorProperty _Token__TokenBalance__Token = new ExecutorPropertyWithImplementation("TokenBalance", Types._Token, 5, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.TOKEN_BALANCE__TOKEN));
		public static final ExecutorProperty _Token__TokenPair__TokenA = new ExecutorPropertyWithImplementation("TokenPair", Types._Token, 6, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.TOKEN_PAIR__TOKEN_A));
		public static final ExecutorProperty _Token__TokenPair__TokenB = new ExecutorPropertyWithImplementation("TokenPair", Types._Token, 7, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.TOKEN_PAIR__TOKEN_B));
		public static final ExecutorProperty _Token__TransferRequest__Token = new ExecutorPropertyWithImplementation("TransferRequest", Types._Token, 8, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.TRANSFER_REQUEST__TOKEN));
		public static final ExecutorProperty _Token__cryptoExchange__Tokens = new ExecutorPropertyWithImplementation("cryptoExchange", Types._Token, 9, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__TOKENS));

		public static final ExecutorProperty _TokenBalance__Token = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TOKEN_BALANCE__TOKEN, Types._TokenBalance, 0);
		public static final ExecutorProperty _TokenBalance__balance = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TOKEN_BALANCE__BALANCE, Types._TokenBalance, 1);
		public static final ExecutorProperty _TokenBalance__name = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TOKEN_BALANCE__NAME, Types._TokenBalance, 2);
		public static final ExecutorProperty _TokenBalance__Account__TokensBalance = new ExecutorPropertyWithImplementation("Account", Types._TokenBalance, 3, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.ACCOUNT__TOKENS_BALANCE));

		public static final ExecutorProperty _TokenNetwork__RPC = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TOKEN_NETWORK__RPC, Types._TokenNetwork, 0);
		public static final ExecutorProperty _TokenNetwork__chainID = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TOKEN_NETWORK__CHAIN_ID, Types._TokenNetwork, 1);
		public static final ExecutorProperty _TokenNetwork__name = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TOKEN_NETWORK__NAME, Types._TokenNetwork, 2);
		public static final ExecutorProperty _TokenNetwork__Token__TokenNetwork = new ExecutorPropertyWithImplementation("Token", Types._TokenNetwork, 3, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.TOKEN__TOKEN_NETWORK));
		public static final ExecutorProperty _TokenNetwork__cryptoExchange__TokenNetworks = new ExecutorPropertyWithImplementation("cryptoExchange", Types._TokenNetwork, 4, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__TOKEN_NETWORKS));

		public static final ExecutorProperty _TokenPair__TokenA = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TOKEN_PAIR__TOKEN_A, Types._TokenPair, 0);
		public static final ExecutorProperty _TokenPair__TokenB = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TOKEN_PAIR__TOKEN_B, Types._TokenPair, 1);
		public static final ExecutorProperty _TokenPair__name = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TOKEN_PAIR__NAME, Types._TokenPair, 2);
		public static final ExecutorProperty _TokenPair__price = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TOKEN_PAIR__PRICE, Types._TokenPair, 3);
		public static final ExecutorProperty _TokenPair__Order__TokenPair = new ExecutorPropertyWithImplementation("Order", Types._TokenPair, 4, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.ORDER__TOKEN_PAIR));
		public static final ExecutorProperty _TokenPair__SubSystem__TokenPairs = new ExecutorPropertyWithImplementation("SubSystem", Types._TokenPair, 5, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.SUB_SYSTEM__TOKEN_PAIRS));

		public static final ExecutorProperty _TransferRequest__Destination = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TRANSFER_REQUEST__DESTINATION, Types._TransferRequest, 0);
		public static final ExecutorProperty _TransferRequest__ID = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TRANSFER_REQUEST__ID, Types._TransferRequest, 1);
		public static final ExecutorProperty _TransferRequest__Token = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TRANSFER_REQUEST__TOKEN, Types._TransferRequest, 2);
		public static final ExecutorProperty _TransferRequest__amount = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TRANSFER_REQUEST__AMOUNT, Types._TransferRequest, 3);
		public static final ExecutorProperty _TransferRequest__type = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.TRANSFER_REQUEST__TYPE, Types._TransferRequest, 4);
		public static final ExecutorProperty _TransferRequest__Account__transferRequest = new ExecutorPropertyWithImplementation("Account", Types._TransferRequest, 5, new EcoreLibraryOppositeProperty(CryptoExchangePackagePackage.Literals.ACCOUNT__TRANSFER_REQUEST));

		public static final ExecutorProperty _cryptoExchange__DomainName = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__DOMAIN_NAME, Types._cryptoExchange, 0);
		public static final ExecutorProperty _cryptoExchange__IP = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__IP, Types._cryptoExchange, 1);
		public static final ExecutorProperty _cryptoExchange__SubSystem = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__SUB_SYSTEM, Types._cryptoExchange, 2);
		public static final ExecutorProperty _cryptoExchange__TokenNetworks = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__TOKEN_NETWORKS, Types._cryptoExchange, 3);
		public static final ExecutorProperty _cryptoExchange__Tokens = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__TOKENS, Types._cryptoExchange, 4);
		public static final ExecutorProperty _cryptoExchange__name = new EcoreExecutorProperty(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__NAME, Types._cryptoExchange, 5);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangePackageTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Account =
			{
				Fragments._Account__OclAny /* 0 */,
				Fragments._Account__OclElement /* 1 */,
				Fragments._Account__Account /* 2 */
			};
		private static final int /*@NonNull*/ [] __Account = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LeverageType =
			{
				Fragments._LeverageType__OclAny /* 0 */,
				Fragments._LeverageType__OclElement /* 1 */,
				Fragments._LeverageType__OclType /* 2 */,
				Fragments._LeverageType__OclEnumeration /* 3 */,
				Fragments._LeverageType__LeverageType /* 4 */
			};
		private static final int /*@NonNull*/ [] __LeverageType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Order =
			{
				Fragments._Order__OclAny /* 0 */,
				Fragments._Order__OclElement /* 1 */,
				Fragments._Order__Order /* 2 */
			};
		private static final int /*@NonNull*/ [] __Order = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OrderType =
			{
				Fragments._OrderType__OclAny /* 0 */,
				Fragments._OrderType__OclElement /* 1 */,
				Fragments._OrderType__OclType /* 2 */,
				Fragments._OrderType__OclEnumeration /* 3 */,
				Fragments._OrderType__OrderType /* 4 */
			};
		private static final int /*@NonNull*/ [] __OrderType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SavingOrder =
			{
				Fragments._SavingOrder__OclAny /* 0 */,
				Fragments._SavingOrder__OclElement /* 1 */,
				Fragments._SavingOrder__SavingOrder /* 2 */
			};
		private static final int /*@NonNull*/ [] __SavingOrder = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SubSystem =
			{
				Fragments._SubSystem__OclAny /* 0 */,
				Fragments._SubSystem__OclElement /* 1 */,
				Fragments._SubSystem__SubSystem /* 2 */
			};
		private static final int /*@NonNull*/ [] __SubSystem = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SubSystemName =
			{
				Fragments._SubSystemName__OclAny /* 0 */,
				Fragments._SubSystemName__OclElement /* 1 */,
				Fragments._SubSystemName__OclType /* 2 */,
				Fragments._SubSystemName__OclEnumeration /* 3 */,
				Fragments._SubSystemName__SubSystemName /* 4 */
			};
		private static final int /*@NonNull*/ [] __SubSystemName = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Token =
			{
				Fragments._Token__OclAny /* 0 */,
				Fragments._Token__OclElement /* 1 */,
				Fragments._Token__Token /* 2 */
			};
		private static final int /*@NonNull*/ [] __Token = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TokenBalance =
			{
				Fragments._TokenBalance__OclAny /* 0 */,
				Fragments._TokenBalance__OclElement /* 1 */,
				Fragments._TokenBalance__TokenBalance /* 2 */
			};
		private static final int /*@NonNull*/ [] __TokenBalance = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TokenNetwork =
			{
				Fragments._TokenNetwork__OclAny /* 0 */,
				Fragments._TokenNetwork__OclElement /* 1 */,
				Fragments._TokenNetwork__TokenNetwork /* 2 */
			};
		private static final int /*@NonNull*/ [] __TokenNetwork = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TokenPair =
			{
				Fragments._TokenPair__OclAny /* 0 */,
				Fragments._TokenPair__OclElement /* 1 */,
				Fragments._TokenPair__TokenPair /* 2 */
			};
		private static final int /*@NonNull*/ [] __TokenPair = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TransferRequest =
			{
				Fragments._TransferRequest__OclAny /* 0 */,
				Fragments._TransferRequest__OclElement /* 1 */,
				Fragments._TransferRequest__TransferRequest /* 2 */
			};
		private static final int /*@NonNull*/ [] __TransferRequest = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TransferType =
			{
				Fragments._TransferType__OclAny /* 0 */,
				Fragments._TransferType__OclElement /* 1 */,
				Fragments._TransferType__OclType /* 2 */,
				Fragments._TransferType__OclEnumeration /* 3 */,
				Fragments._TransferType__TransferType /* 4 */
			};
		private static final int /*@NonNull*/ [] __TransferType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _cryptoExchange =
			{
				Fragments._cryptoExchange__OclAny /* 0 */,
				Fragments._cryptoExchange__OclElement /* 1 */,
				Fragments._cryptoExchange__cryptoExchange /* 2 */
			};
		private static final int /*@NonNull*/ [] __cryptoExchange = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Account.initFragments(_Account, __Account);
			Types._LeverageType.initFragments(_LeverageType, __LeverageType);
			Types._Order.initFragments(_Order, __Order);
			Types._OrderType.initFragments(_OrderType, __OrderType);
			Types._SavingOrder.initFragments(_SavingOrder, __SavingOrder);
			Types._SubSystem.initFragments(_SubSystem, __SubSystem);
			Types._SubSystemName.initFragments(_SubSystemName, __SubSystemName);
			Types._Token.initFragments(_Token, __Token);
			Types._TokenBalance.initFragments(_TokenBalance, __TokenBalance);
			Types._TokenNetwork.initFragments(_TokenNetwork, __TokenNetwork);
			Types._TokenPair.initFragments(_TokenPair, __TokenPair);
			Types._TransferRequest.initFragments(_TransferRequest, __TransferRequest);
			Types._TransferType.initFragments(_TransferType, __TransferType);
			Types._cryptoExchange.initFragments(_cryptoExchange, __cryptoExchange);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangePackageTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Account__Account = {
			CryptoExchangePackageTables.Operations._Account__availableBalance /* availableBalance(Token[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Account__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Account__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LeverageType__LeverageType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LeverageType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LeverageType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LeverageType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LeverageType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Order__Order = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OrderType__OrderType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SavingOrder__SavingOrder = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SavingOrder__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SavingOrder__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SubSystem__SubSystem = {
			CryptoExchangePackageTables.Operations._SubSystem__getNextAccId /* getNextAccId(Account[1]) */,
			CryptoExchangePackageTables.Operations._SubSystem__getNextOrderId /* getNextOrderId(Order[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubSystem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubSystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SubSystemName__SubSystemName = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubSystemName__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubSystemName__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubSystemName__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubSystemName__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Token__Token = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Token__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Token__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TokenBalance__TokenBalance = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TokenBalance__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TokenBalance__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TokenNetwork__TokenNetwork = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TokenNetwork__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TokenNetwork__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TokenPair__TokenPair = {
			CryptoExchangePackageTables.Operations._TokenPair__createName /* createName() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TokenPair__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TokenPair__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TransferRequest__TransferRequest = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TransferRequest__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TransferRequest__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TransferType__TransferType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TransferType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TransferType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TransferType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TransferType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _cryptoExchange__cryptoExchange = {};
		private static final ExecutorOperation /*@NonNull*/ [] _cryptoExchange__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _cryptoExchange__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Account__Account.initOperations(_Account__Account);
			Fragments._Account__OclAny.initOperations(_Account__OclAny);
			Fragments._Account__OclElement.initOperations(_Account__OclElement);

			Fragments._LeverageType__LeverageType.initOperations(_LeverageType__LeverageType);
			Fragments._LeverageType__OclAny.initOperations(_LeverageType__OclAny);
			Fragments._LeverageType__OclElement.initOperations(_LeverageType__OclElement);
			Fragments._LeverageType__OclEnumeration.initOperations(_LeverageType__OclEnumeration);
			Fragments._LeverageType__OclType.initOperations(_LeverageType__OclType);

			Fragments._Order__OclAny.initOperations(_Order__OclAny);
			Fragments._Order__OclElement.initOperations(_Order__OclElement);
			Fragments._Order__Order.initOperations(_Order__Order);

			Fragments._OrderType__OclAny.initOperations(_OrderType__OclAny);
			Fragments._OrderType__OclElement.initOperations(_OrderType__OclElement);
			Fragments._OrderType__OclEnumeration.initOperations(_OrderType__OclEnumeration);
			Fragments._OrderType__OclType.initOperations(_OrderType__OclType);
			Fragments._OrderType__OrderType.initOperations(_OrderType__OrderType);

			Fragments._SavingOrder__OclAny.initOperations(_SavingOrder__OclAny);
			Fragments._SavingOrder__OclElement.initOperations(_SavingOrder__OclElement);
			Fragments._SavingOrder__SavingOrder.initOperations(_SavingOrder__SavingOrder);

			Fragments._SubSystem__OclAny.initOperations(_SubSystem__OclAny);
			Fragments._SubSystem__OclElement.initOperations(_SubSystem__OclElement);
			Fragments._SubSystem__SubSystem.initOperations(_SubSystem__SubSystem);

			Fragments._SubSystemName__OclAny.initOperations(_SubSystemName__OclAny);
			Fragments._SubSystemName__OclElement.initOperations(_SubSystemName__OclElement);
			Fragments._SubSystemName__OclEnumeration.initOperations(_SubSystemName__OclEnumeration);
			Fragments._SubSystemName__OclType.initOperations(_SubSystemName__OclType);
			Fragments._SubSystemName__SubSystemName.initOperations(_SubSystemName__SubSystemName);

			Fragments._Token__OclAny.initOperations(_Token__OclAny);
			Fragments._Token__OclElement.initOperations(_Token__OclElement);
			Fragments._Token__Token.initOperations(_Token__Token);

			Fragments._TokenBalance__OclAny.initOperations(_TokenBalance__OclAny);
			Fragments._TokenBalance__OclElement.initOperations(_TokenBalance__OclElement);
			Fragments._TokenBalance__TokenBalance.initOperations(_TokenBalance__TokenBalance);

			Fragments._TokenNetwork__OclAny.initOperations(_TokenNetwork__OclAny);
			Fragments._TokenNetwork__OclElement.initOperations(_TokenNetwork__OclElement);
			Fragments._TokenNetwork__TokenNetwork.initOperations(_TokenNetwork__TokenNetwork);

			Fragments._TokenPair__OclAny.initOperations(_TokenPair__OclAny);
			Fragments._TokenPair__OclElement.initOperations(_TokenPair__OclElement);
			Fragments._TokenPair__TokenPair.initOperations(_TokenPair__TokenPair);

			Fragments._TransferRequest__OclAny.initOperations(_TransferRequest__OclAny);
			Fragments._TransferRequest__OclElement.initOperations(_TransferRequest__OclElement);
			Fragments._TransferRequest__TransferRequest.initOperations(_TransferRequest__TransferRequest);

			Fragments._TransferType__OclAny.initOperations(_TransferType__OclAny);
			Fragments._TransferType__OclElement.initOperations(_TransferType__OclElement);
			Fragments._TransferType__OclEnumeration.initOperations(_TransferType__OclEnumeration);
			Fragments._TransferType__OclType.initOperations(_TransferType__OclType);
			Fragments._TransferType__TransferType.initOperations(_TransferType__TransferType);

			Fragments._cryptoExchange__OclAny.initOperations(_cryptoExchange__OclAny);
			Fragments._cryptoExchange__OclElement.initOperations(_cryptoExchange__OclElement);
			Fragments._cryptoExchange__cryptoExchange.initOperations(_cryptoExchange__cryptoExchange);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangePackageTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Account = {
			CryptoExchangePackageTables.Properties._Account__TokensBalance,
			CryptoExchangePackageTables.Properties._Account__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CryptoExchangePackageTables.Properties._Account__transferRequest
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LeverageType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Order = {
			CryptoExchangePackageTables.Properties._Order__Amount,
			CryptoExchangePackageTables.Properties._Order__Price,
			CryptoExchangePackageTables.Properties._Order__TokenPair,
			CryptoExchangePackageTables.Properties._Order__Type,
			CryptoExchangePackageTables.Properties._Order__account,
			CryptoExchangePackageTables.Properties._Order__leverage,
			CryptoExchangePackageTables.Properties._Order__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OrderType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SavingOrder = {
			CryptoExchangePackageTables.Properties._SavingOrder__Amount,
			CryptoExchangePackageTables.Properties._SavingOrder__Interest,
			CryptoExchangePackageTables.Properties._SavingOrder__MatureDate,
			CryptoExchangePackageTables.Properties._SavingOrder__Token,
			CryptoExchangePackageTables.Properties._SavingOrder__account,
			CryptoExchangePackageTables.Properties._SavingOrder__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SubSystem = {
			CryptoExchangePackageTables.Properties._SubSystem__Orders,
			CryptoExchangePackageTables.Properties._SubSystem__SavingOrders,
			CryptoExchangePackageTables.Properties._SubSystem__TokenPairs,
			CryptoExchangePackageTables.Properties._SubSystem__accounts,
			CryptoExchangePackageTables.Properties._SubSystem__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SubSystemName = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Token = {
			CryptoExchangePackageTables.Properties._Token__TokenNetwork,
			CryptoExchangePackageTables.Properties._Token__address,
			CryptoExchangePackageTables.Properties._Token__decimal,
			CryptoExchangePackageTables.Properties._Token__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TokenBalance = {
			CryptoExchangePackageTables.Properties._TokenBalance__Token,
			CryptoExchangePackageTables.Properties._TokenBalance__balance,
			CryptoExchangePackageTables.Properties._TokenBalance__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TokenNetwork = {
			CryptoExchangePackageTables.Properties._TokenNetwork__RPC,
			CryptoExchangePackageTables.Properties._TokenNetwork__chainID,
			CryptoExchangePackageTables.Properties._TokenNetwork__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TokenPair = {
			CryptoExchangePackageTables.Properties._TokenPair__TokenA,
			CryptoExchangePackageTables.Properties._TokenPair__TokenB,
			CryptoExchangePackageTables.Properties._TokenPair__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CryptoExchangePackageTables.Properties._TokenPair__price
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TransferRequest = {
			CryptoExchangePackageTables.Properties._TransferRequest__Destination,
			CryptoExchangePackageTables.Properties._TransferRequest__ID,
			CryptoExchangePackageTables.Properties._TransferRequest__Token,
			CryptoExchangePackageTables.Properties._TransferRequest__amount,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CryptoExchangePackageTables.Properties._TransferRequest__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TransferType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _cryptoExchange = {
			CryptoExchangePackageTables.Properties._cryptoExchange__DomainName,
			CryptoExchangePackageTables.Properties._cryptoExchange__IP,
			CryptoExchangePackageTables.Properties._cryptoExchange__SubSystem,
			CryptoExchangePackageTables.Properties._cryptoExchange__TokenNetworks,
			CryptoExchangePackageTables.Properties._cryptoExchange__Tokens,
			CryptoExchangePackageTables.Properties._cryptoExchange__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Account__Account.initProperties(_Account);
			Fragments._LeverageType__LeverageType.initProperties(_LeverageType);
			Fragments._Order__Order.initProperties(_Order);
			Fragments._OrderType__OrderType.initProperties(_OrderType);
			Fragments._SavingOrder__SavingOrder.initProperties(_SavingOrder);
			Fragments._SubSystem__SubSystem.initProperties(_SubSystem);
			Fragments._SubSystemName__SubSystemName.initProperties(_SubSystemName);
			Fragments._Token__Token.initProperties(_Token);
			Fragments._TokenBalance__TokenBalance.initProperties(_TokenBalance);
			Fragments._TokenNetwork__TokenNetwork.initProperties(_TokenNetwork);
			Fragments._TokenPair__TokenPair.initProperties(_TokenPair);
			Fragments._TransferRequest__TransferRequest.initProperties(_TransferRequest);
			Fragments._TransferType__TransferType.initProperties(_TransferType);
			Fragments._cryptoExchange__cryptoExchange.initProperties(_cryptoExchange);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangePackageTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _LeverageType___1x = new EcoreExecutorEnumerationLiteral(CryptoExchangePackagePackage.Literals.LEVERAGE_TYPE.getEEnumLiteral("_1x"), Types._LeverageType, 0);
		public static final EcoreExecutorEnumerationLiteral _LeverageType___2x = new EcoreExecutorEnumerationLiteral(CryptoExchangePackagePackage.Literals.LEVERAGE_TYPE.getEEnumLiteral("_2x"), Types._LeverageType, 1);
		public static final EcoreExecutorEnumerationLiteral _LeverageType___5x = new EcoreExecutorEnumerationLiteral(CryptoExchangePackagePackage.Literals.LEVERAGE_TYPE.getEEnumLiteral("_5x"), Types._LeverageType, 2);
		public static final EcoreExecutorEnumerationLiteral _LeverageType___10x = new EcoreExecutorEnumerationLiteral(CryptoExchangePackagePackage.Literals.LEVERAGE_TYPE.getEEnumLiteral("_10x"), Types._LeverageType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _LeverageType = {
			_LeverageType___1x,
			_LeverageType___2x,
			_LeverageType___5x,
			_LeverageType___10x
		};

		public static final EcoreExecutorEnumerationLiteral _OrderType__buy = new EcoreExecutorEnumerationLiteral(CryptoExchangePackagePackage.Literals.ORDER_TYPE.getEEnumLiteral("buy"), Types._OrderType, 0);
		public static final EcoreExecutorEnumerationLiteral _OrderType__sell = new EcoreExecutorEnumerationLiteral(CryptoExchangePackagePackage.Literals.ORDER_TYPE.getEEnumLiteral("sell"), Types._OrderType, 1);
		public static final EcoreExecutorEnumerationLiteral _OrderType__leverageLong = new EcoreExecutorEnumerationLiteral(CryptoExchangePackagePackage.Literals.ORDER_TYPE.getEEnumLiteral("leverageLong"), Types._OrderType, 2);
		public static final EcoreExecutorEnumerationLiteral _OrderType__leverageShort = new EcoreExecutorEnumerationLiteral(CryptoExchangePackagePackage.Literals.ORDER_TYPE.getEEnumLiteral("leverageShort"), Types._OrderType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _OrderType = {
			_OrderType__buy,
			_OrderType__sell,
			_OrderType__leverageLong,
			_OrderType__leverageShort
		};

		public static final EcoreExecutorEnumerationLiteral _SubSystemName__Spot = new EcoreExecutorEnumerationLiteral(CryptoExchangePackagePackage.Literals.SUB_SYSTEM_NAME.getEEnumLiteral("Spot"), Types._SubSystemName, 0);
		public static final EcoreExecutorEnumerationLiteral _SubSystemName__Future = new EcoreExecutorEnumerationLiteral(CryptoExchangePackagePackage.Literals.SUB_SYSTEM_NAME.getEEnumLiteral("Future"), Types._SubSystemName, 1);
		public static final EcoreExecutorEnumerationLiteral _SubSystemName__Margin = new EcoreExecutorEnumerationLiteral(CryptoExchangePackagePackage.Literals.SUB_SYSTEM_NAME.getEEnumLiteral("Margin"), Types._SubSystemName, 2);
		public static final EcoreExecutorEnumerationLiteral _SubSystemName__Saving = new EcoreExecutorEnumerationLiteral(CryptoExchangePackagePackage.Literals.SUB_SYSTEM_NAME.getEEnumLiteral("Saving"), Types._SubSystemName, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _SubSystemName = {
			_SubSystemName__Spot,
			_SubSystemName__Future,
			_SubSystemName__Margin,
			_SubSystemName__Saving
		};

		public static final EcoreExecutorEnumerationLiteral _TransferType__IntraExchange = new EcoreExecutorEnumerationLiteral(CryptoExchangePackagePackage.Literals.TRANSFER_TYPE.getEEnumLiteral("IntraExchange"), Types._TransferType, 0);
		public static final EcoreExecutorEnumerationLiteral _TransferType__ExtraExchange = new EcoreExecutorEnumerationLiteral(CryptoExchangePackagePackage.Literals.TRANSFER_TYPE.getEEnumLiteral("ExtraExchange"), Types._TransferType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TransferType = {
			_TransferType__IntraExchange,
			_TransferType__ExtraExchange
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._LeverageType.initLiterals(_LeverageType);
			Types._OrderType.initLiterals(_OrderType);
			Types._SubSystemName.initLiterals(_SubSystemName);
			Types._TransferType.initLiterals(_TransferType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CryptoExchangePackageTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new CryptoExchangePackageTables();
	}

	private CryptoExchangePackageTables() {
		super(CryptoExchangePackagePackage.eNS_URI);
	}
}
