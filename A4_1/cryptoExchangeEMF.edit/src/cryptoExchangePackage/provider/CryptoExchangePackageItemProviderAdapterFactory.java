/**
 */
package cryptoExchangePackage.provider;

import cryptoExchangePackage.util.CryptoExchangePackageAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CryptoExchangePackageItemProviderAdapterFactory extends CryptoExchangePackageAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoExchangePackageItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link cryptoExchangePackage.cryptoExchange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected cryptoExchangeItemProvider cryptoExchangeItemProvider;

	/**
	 * This creates an adapter for a {@link cryptoExchangePackage.cryptoExchange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createcryptoExchangeAdapter() {
		if (cryptoExchangeItemProvider == null) {
			cryptoExchangeItemProvider = new cryptoExchangeItemProvider(this);
		}

		return cryptoExchangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cryptoExchangePackage.Account} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountItemProvider accountItemProvider;

	/**
	 * This creates an adapter for a {@link cryptoExchangePackage.Account}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAccountAdapter() {
		if (accountItemProvider == null) {
			accountItemProvider = new AccountItemProvider(this);
		}

		return accountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cryptoExchangePackage.Order} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemProvider orderItemProvider;

	/**
	 * This creates an adapter for a {@link cryptoExchangePackage.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderAdapter() {
		if (orderItemProvider == null) {
			orderItemProvider = new OrderItemProvider(this);
		}

		return orderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cryptoExchangePackage.SavingOrder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SavingOrderItemProvider savingOrderItemProvider;

	/**
	 * This creates an adapter for a {@link cryptoExchangePackage.SavingOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSavingOrderAdapter() {
		if (savingOrderItemProvider == null) {
			savingOrderItemProvider = new SavingOrderItemProvider(this);
		}

		return savingOrderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cryptoExchangePackage.SubSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSystemItemProvider subSystemItemProvider;

	/**
	 * This creates an adapter for a {@link cryptoExchangePackage.SubSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubSystemAdapter() {
		if (subSystemItemProvider == null) {
			subSystemItemProvider = new SubSystemItemProvider(this);
		}

		return subSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cryptoExchangePackage.Token} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenItemProvider tokenItemProvider;

	/**
	 * This creates an adapter for a {@link cryptoExchangePackage.Token}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenAdapter() {
		if (tokenItemProvider == null) {
			tokenItemProvider = new TokenItemProvider(this);
		}

		return tokenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cryptoExchangePackage.TokenBalance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenBalanceItemProvider tokenBalanceItemProvider;

	/**
	 * This creates an adapter for a {@link cryptoExchangePackage.TokenBalance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenBalanceAdapter() {
		if (tokenBalanceItemProvider == null) {
			tokenBalanceItemProvider = new TokenBalanceItemProvider(this);
		}

		return tokenBalanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cryptoExchangePackage.TokenNetwork} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenNetworkItemProvider tokenNetworkItemProvider;

	/**
	 * This creates an adapter for a {@link cryptoExchangePackage.TokenNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenNetworkAdapter() {
		if (tokenNetworkItemProvider == null) {
			tokenNetworkItemProvider = new TokenNetworkItemProvider(this);
		}

		return tokenNetworkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cryptoExchangePackage.TokenPair} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenPairItemProvider tokenPairItemProvider;

	/**
	 * This creates an adapter for a {@link cryptoExchangePackage.TokenPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenPairAdapter() {
		if (tokenPairItemProvider == null) {
			tokenPairItemProvider = new TokenPairItemProvider(this);
		}

		return tokenPairItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cryptoExchangePackage.TransferRequest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferRequestItemProvider transferRequestItemProvider;

	/**
	 * This creates an adapter for a {@link cryptoExchangePackage.TransferRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransferRequestAdapter() {
		if (transferRequestItemProvider == null) {
			transferRequestItemProvider = new TransferRequestItemProvider(this);
		}

		return transferRequestItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (cryptoExchangeItemProvider != null) cryptoExchangeItemProvider.dispose();
		if (accountItemProvider != null) accountItemProvider.dispose();
		if (orderItemProvider != null) orderItemProvider.dispose();
		if (savingOrderItemProvider != null) savingOrderItemProvider.dispose();
		if (subSystemItemProvider != null) subSystemItemProvider.dispose();
		if (tokenItemProvider != null) tokenItemProvider.dispose();
		if (tokenBalanceItemProvider != null) tokenBalanceItemProvider.dispose();
		if (tokenNetworkItemProvider != null) tokenNetworkItemProvider.dispose();
		if (tokenPairItemProvider != null) tokenPairItemProvider.dispose();
		if (transferRequestItemProvider != null) transferRequestItemProvider.dispose();
	}

}