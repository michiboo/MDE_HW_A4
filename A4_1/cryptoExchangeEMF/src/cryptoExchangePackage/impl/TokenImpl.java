/**
 */
package cryptoExchangePackage.impl;

import cryptoExchangePackage.CryptoExchangePackagePackage;
import cryptoExchangePackage.Token;
import cryptoExchangePackage.TokenNetwork;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.impl.TokenImpl#getName <em>Name</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.TokenImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.TokenImpl#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.TokenImpl#getTokenNetwork <em>Token Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenImpl extends MinimalEObjectImpl.Container implements Token {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimal() <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimal()
	 * @generated
	 * @ordered
	 */
	protected static final int DECIMAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDecimal() <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimal()
	 * @generated
	 * @ordered
	 */
	protected int decimal = DECIMAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTokenNetwork() <em>Token Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenNetwork()
	 * @generated
	 * @ordered
	 */
	protected TokenNetwork tokenNetwork;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangePackagePackage.Literals.TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TOKEN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TOKEN__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDecimal() {
		return decimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimal(int newDecimal) {
		int oldDecimal = decimal;
		decimal = newDecimal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TOKEN__DECIMAL, oldDecimal, decimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenNetwork getTokenNetwork() {
		if (tokenNetwork != null && tokenNetwork.eIsProxy()) {
			InternalEObject oldTokenNetwork = (InternalEObject)tokenNetwork;
			tokenNetwork = (TokenNetwork)eResolveProxy(oldTokenNetwork);
			if (tokenNetwork != oldTokenNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptoExchangePackagePackage.TOKEN__TOKEN_NETWORK, oldTokenNetwork, tokenNetwork));
			}
		}
		return tokenNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenNetwork basicGetTokenNetwork() {
		return tokenNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenNetwork(TokenNetwork newTokenNetwork) {
		TokenNetwork oldTokenNetwork = tokenNetwork;
		tokenNetwork = newTokenNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TOKEN__TOKEN_NETWORK, oldTokenNetwork, tokenNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CryptoExchangePackagePackage.TOKEN__NAME:
				return getName();
			case CryptoExchangePackagePackage.TOKEN__ADDRESS:
				return getAddress();
			case CryptoExchangePackagePackage.TOKEN__DECIMAL:
				return getDecimal();
			case CryptoExchangePackagePackage.TOKEN__TOKEN_NETWORK:
				if (resolve) return getTokenNetwork();
				return basicGetTokenNetwork();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CryptoExchangePackagePackage.TOKEN__NAME:
				setName((String)newValue);
				return;
			case CryptoExchangePackagePackage.TOKEN__ADDRESS:
				setAddress((String)newValue);
				return;
			case CryptoExchangePackagePackage.TOKEN__DECIMAL:
				setDecimal((Integer)newValue);
				return;
			case CryptoExchangePackagePackage.TOKEN__TOKEN_NETWORK:
				setTokenNetwork((TokenNetwork)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CryptoExchangePackagePackage.TOKEN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.TOKEN__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.TOKEN__DECIMAL:
				setDecimal(DECIMAL_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.TOKEN__TOKEN_NETWORK:
				setTokenNetwork((TokenNetwork)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CryptoExchangePackagePackage.TOKEN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CryptoExchangePackagePackage.TOKEN__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case CryptoExchangePackagePackage.TOKEN__DECIMAL:
				return decimal != DECIMAL_EDEFAULT;
			case CryptoExchangePackagePackage.TOKEN__TOKEN_NETWORK:
				return tokenNetwork != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", address: ");
		result.append(address);
		result.append(", decimal: ");
		result.append(decimal);
		result.append(')');
		return result.toString();
	}

} //TokenImpl
