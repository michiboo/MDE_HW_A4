/**
 */
package cryptoExchangePackage.util;

import cryptoExchangePackage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cryptoExchangePackage.CryptoExchangePackagePackage
 * @generated
 */
public class CryptoExchangePackageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CryptoExchangePackagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoExchangePackageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CryptoExchangePackagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CryptoExchangePackageSwitch<Adapter> modelSwitch =
		new CryptoExchangePackageSwitch<Adapter>() {
			@Override
			public Adapter casecryptoExchange(cryptoExchange object) {
				return createcryptoExchangeAdapter();
			}
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter caseOrder(Order object) {
				return createOrderAdapter();
			}
			@Override
			public Adapter caseSavingOrder(SavingOrder object) {
				return createSavingOrderAdapter();
			}
			@Override
			public Adapter caseSubSystem(SubSystem object) {
				return createSubSystemAdapter();
			}
			@Override
			public Adapter caseToken(Token object) {
				return createTokenAdapter();
			}
			@Override
			public Adapter caseTokenBalance(TokenBalance object) {
				return createTokenBalanceAdapter();
			}
			@Override
			public Adapter caseTokenNetwork(TokenNetwork object) {
				return createTokenNetworkAdapter();
			}
			@Override
			public Adapter caseTokenPair(TokenPair object) {
				return createTokenPairAdapter();
			}
			@Override
			public Adapter caseTransferRequest(TransferRequest object) {
				return createTransferRequestAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cryptoExchangePackage.cryptoExchange <em>crypto Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cryptoExchangePackage.cryptoExchange
	 * @generated
	 */
	public Adapter createcryptoExchangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cryptoExchangePackage.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cryptoExchangePackage.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cryptoExchangePackage.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cryptoExchangePackage.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cryptoExchangePackage.SavingOrder <em>Saving Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cryptoExchangePackage.SavingOrder
	 * @generated
	 */
	public Adapter createSavingOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cryptoExchangePackage.SubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cryptoExchangePackage.SubSystem
	 * @generated
	 */
	public Adapter createSubSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cryptoExchangePackage.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cryptoExchangePackage.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cryptoExchangePackage.TokenBalance <em>Token Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cryptoExchangePackage.TokenBalance
	 * @generated
	 */
	public Adapter createTokenBalanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cryptoExchangePackage.TokenNetwork <em>Token Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cryptoExchangePackage.TokenNetwork
	 * @generated
	 */
	public Adapter createTokenNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cryptoExchangePackage.TokenPair <em>Token Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cryptoExchangePackage.TokenPair
	 * @generated
	 */
	public Adapter createTokenPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cryptoExchangePackage.TransferRequest <em>Transfer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cryptoExchangePackage.TransferRequest
	 * @generated
	 */
	public Adapter createTransferRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CryptoExchangePackageAdapterFactory
