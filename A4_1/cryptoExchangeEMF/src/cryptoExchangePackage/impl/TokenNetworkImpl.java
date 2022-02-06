/**
 */
package cryptoExchangePackage.impl;

import cryptoExchangePackage.CryptoExchangePackagePackage;
import cryptoExchangePackage.TokenNetwork;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.impl.TokenNetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.TokenNetworkImpl#getChainID <em>Chain ID</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.TokenNetworkImpl#getRPC <em>RPC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenNetworkImpl extends MinimalEObjectImpl.Container implements TokenNetwork {
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
	 * The default value of the '{@link #getChainID() <em>Chain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainID()
	 * @generated
	 * @ordered
	 */
	protected static final int CHAIN_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChainID() <em>Chain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainID()
	 * @generated
	 * @ordered
	 */
	protected int chainID = CHAIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRPC() <em>RPC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPC()
	 * @generated
	 * @ordered
	 */
	protected static final String RPC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRPC() <em>RPC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPC()
	 * @generated
	 * @ordered
	 */
	protected String rpc = RPC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangePackagePackage.Literals.TOKEN_NETWORK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TOKEN_NETWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChainID() {
		return chainID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainID(int newChainID) {
		int oldChainID = chainID;
		chainID = newChainID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TOKEN_NETWORK__CHAIN_ID, oldChainID, chainID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRPC() {
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPC(String newRPC) {
		String oldRPC = rpc;
		rpc = newRPC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TOKEN_NETWORK__RPC, oldRPC, rpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CryptoExchangePackagePackage.TOKEN_NETWORK__NAME:
				return getName();
			case CryptoExchangePackagePackage.TOKEN_NETWORK__CHAIN_ID:
				return getChainID();
			case CryptoExchangePackagePackage.TOKEN_NETWORK__RPC:
				return getRPC();
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
			case CryptoExchangePackagePackage.TOKEN_NETWORK__NAME:
				setName((String)newValue);
				return;
			case CryptoExchangePackagePackage.TOKEN_NETWORK__CHAIN_ID:
				setChainID((Integer)newValue);
				return;
			case CryptoExchangePackagePackage.TOKEN_NETWORK__RPC:
				setRPC((String)newValue);
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
			case CryptoExchangePackagePackage.TOKEN_NETWORK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.TOKEN_NETWORK__CHAIN_ID:
				setChainID(CHAIN_ID_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.TOKEN_NETWORK__RPC:
				setRPC(RPC_EDEFAULT);
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
			case CryptoExchangePackagePackage.TOKEN_NETWORK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CryptoExchangePackagePackage.TOKEN_NETWORK__CHAIN_ID:
				return chainID != CHAIN_ID_EDEFAULT;
			case CryptoExchangePackagePackage.TOKEN_NETWORK__RPC:
				return RPC_EDEFAULT == null ? rpc != null : !RPC_EDEFAULT.equals(rpc);
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
		result.append(", chainID: ");
		result.append(chainID);
		result.append(", RPC: ");
		result.append(rpc);
		result.append(')');
		return result.toString();
	}

} //TokenNetworkImpl
