/**
 */
package cryptoExchangePackage.provider;


import cryptoExchangePackage.CryptoExchangePackageFactory;
import cryptoExchangePackage.CryptoExchangePackagePackage;
import cryptoExchangePackage.cryptoExchange;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link cryptoExchangePackage.cryptoExchange} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class cryptoExchangeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cryptoExchangeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIPPropertyDescriptor(object);
			addDomainNamePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the IP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_cryptoExchange_IP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_cryptoExchange_IP_feature", "_UI_cryptoExchange_type"),
				 CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_cryptoExchange_DomainName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_cryptoExchange_DomainName_feature", "_UI_cryptoExchange_type"),
				 CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__DOMAIN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_cryptoExchange_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_cryptoExchange_name_feature", "_UI_cryptoExchange_type"),
				 CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__SUB_SYSTEM);
			childrenFeatures.add(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__TOKENS);
			childrenFeatures.add(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__TOKEN_NETWORKS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns cryptoExchange.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/cryptoExchange"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((cryptoExchange)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_cryptoExchange_type") :
			getString("_UI_cryptoExchange_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(cryptoExchange.class)) {
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__IP:
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__DOMAIN_NAME:
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__SUB_SYSTEM:
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__TOKENS:
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__SUB_SYSTEM,
				 CryptoExchangePackageFactory.eINSTANCE.createSubSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__TOKENS,
				 CryptoExchangePackageFactory.eINSTANCE.createToken()));

		newChildDescriptors.add
			(createChildParameter
				(CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE__TOKEN_NETWORKS,
				 CryptoExchangePackageFactory.eINSTANCE.createTokenNetwork()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CryptoExchangeModelEditPlugin.INSTANCE;
	}

}
