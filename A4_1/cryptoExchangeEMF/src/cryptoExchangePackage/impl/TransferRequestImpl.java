/**
 */
package cryptoExchangePackage.impl;

import cryptoExchangePackage.Account;
import cryptoExchangePackage.CryptoExchangePackagePackage;
import cryptoExchangePackage.Token;
import cryptoExchangePackage.TransferRequest;
import cryptoExchangePackage.TransferType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.impl.TransferRequestImpl#getID <em>ID</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.TransferRequestImpl#getType <em>Type</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.TransferRequestImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.TransferRequestImpl#getToken <em>Token</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.TransferRequestImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransferRequestImpl extends MinimalEObjectImpl.Container implements TransferRequest {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TransferType TYPE_EDEFAULT = TransferType.INTRA_EXCHANGE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TransferType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected Token token;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Account destination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangePackagePackage.Literals.TRANSFER_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TRANSFER_REQUEST__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TransferType newType) {
		TransferType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TRANSFER_REQUEST__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TRANSFER_REQUEST__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getToken() {
		if (token != null && token.eIsProxy()) {
			InternalEObject oldToken = (InternalEObject)token;
			token = (Token)eResolveProxy(oldToken);
			if (token != oldToken) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptoExchangePackagePackage.TRANSFER_REQUEST__TOKEN, oldToken, token));
			}
		}
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(Token newToken) {
		Token oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TRANSFER_REQUEST__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (Account)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptoExchangePackagePackage.TRANSFER_REQUEST__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Account newDestination) {
		Account oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TRANSFER_REQUEST__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__ID:
				return getID();
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__TYPE:
				return getType();
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__AMOUNT:
				return getAmount();
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__TOKEN:
				if (resolve) return getToken();
				return basicGetToken();
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
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
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__ID:
				setID((String)newValue);
				return;
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__TYPE:
				setType((TransferType)newValue);
				return;
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__AMOUNT:
				setAmount((Float)newValue);
				return;
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__TOKEN:
				setToken((Token)newValue);
				return;
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__DESTINATION:
				setDestination((Account)newValue);
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
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__ID:
				setID(ID_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__TOKEN:
				setToken((Token)null);
				return;
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__DESTINATION:
				setDestination((Account)null);
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
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__TYPE:
				return type != TYPE_EDEFAULT;
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__TOKEN:
				return token != null;
			case CryptoExchangePackagePackage.TRANSFER_REQUEST__DESTINATION:
				return destination != null;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", amount: ");
		result.append(amount);
		result.append(')');
		return result.toString();
	}

} //TransferRequestImpl
