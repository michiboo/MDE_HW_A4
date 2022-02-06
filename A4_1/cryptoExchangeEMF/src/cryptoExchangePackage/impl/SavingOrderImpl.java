/**
 */
package cryptoExchangePackage.impl;

import cryptoExchangePackage.Account;
import cryptoExchangePackage.CryptoExchangePackagePackage;
import cryptoExchangePackage.SavingOrder;
import cryptoExchangePackage.Token;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Saving Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.impl.SavingOrderImpl#getName <em>Name</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.SavingOrderImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.SavingOrderImpl#getMatureDate <em>Mature Date</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.SavingOrderImpl#getInterest <em>Interest</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.SavingOrderImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.SavingOrderImpl#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SavingOrderImpl extends MinimalEObjectImpl.Container implements SavingOrder {
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
	 * The default value of the '{@link #getMatureDate() <em>Mature Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatureDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date MATURE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatureDate() <em>Mature Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatureDate()
	 * @generated
	 * @ordered
	 */
	protected Date matureDate = MATURE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterest() <em>Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterest()
	 * @generated
	 * @ordered
	 */
	protected static final double INTEREST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInterest() <em>Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterest()
	 * @generated
	 * @ordered
	 */
	protected double interest = INTEREST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected Account account;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SavingOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangePackagePackage.Literals.SAVING_ORDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.SAVING_ORDER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.SAVING_ORDER__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getMatureDate() {
		return matureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatureDate(Date newMatureDate) {
		Date oldMatureDate = matureDate;
		matureDate = newMatureDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.SAVING_ORDER__MATURE_DATE, oldMatureDate, matureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInterest() {
		return interest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterest(double newInterest) {
		double oldInterest = interest;
		interest = newInterest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.SAVING_ORDER__INTEREST, oldInterest, interest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getAccount() {
		if (account != null && account.eIsProxy()) {
			InternalEObject oldAccount = (InternalEObject)account;
			account = (Account)eResolveProxy(oldAccount);
			if (account != oldAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptoExchangePackagePackage.SAVING_ORDER__ACCOUNT, oldAccount, account));
			}
		}
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account basicGetAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(Account newAccount) {
		Account oldAccount = account;
		account = newAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.SAVING_ORDER__ACCOUNT, oldAccount, account));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptoExchangePackagePackage.SAVING_ORDER__TOKEN, oldToken, token));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.SAVING_ORDER__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CryptoExchangePackagePackage.SAVING_ORDER__NAME:
				return getName();
			case CryptoExchangePackagePackage.SAVING_ORDER__AMOUNT:
				return getAmount();
			case CryptoExchangePackagePackage.SAVING_ORDER__MATURE_DATE:
				return getMatureDate();
			case CryptoExchangePackagePackage.SAVING_ORDER__INTEREST:
				return getInterest();
			case CryptoExchangePackagePackage.SAVING_ORDER__ACCOUNT:
				if (resolve) return getAccount();
				return basicGetAccount();
			case CryptoExchangePackagePackage.SAVING_ORDER__TOKEN:
				if (resolve) return getToken();
				return basicGetToken();
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
			case CryptoExchangePackagePackage.SAVING_ORDER__NAME:
				setName((String)newValue);
				return;
			case CryptoExchangePackagePackage.SAVING_ORDER__AMOUNT:
				setAmount((Float)newValue);
				return;
			case CryptoExchangePackagePackage.SAVING_ORDER__MATURE_DATE:
				setMatureDate((Date)newValue);
				return;
			case CryptoExchangePackagePackage.SAVING_ORDER__INTEREST:
				setInterest((Double)newValue);
				return;
			case CryptoExchangePackagePackage.SAVING_ORDER__ACCOUNT:
				setAccount((Account)newValue);
				return;
			case CryptoExchangePackagePackage.SAVING_ORDER__TOKEN:
				setToken((Token)newValue);
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
			case CryptoExchangePackagePackage.SAVING_ORDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.SAVING_ORDER__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.SAVING_ORDER__MATURE_DATE:
				setMatureDate(MATURE_DATE_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.SAVING_ORDER__INTEREST:
				setInterest(INTEREST_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.SAVING_ORDER__ACCOUNT:
				setAccount((Account)null);
				return;
			case CryptoExchangePackagePackage.SAVING_ORDER__TOKEN:
				setToken((Token)null);
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
			case CryptoExchangePackagePackage.SAVING_ORDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CryptoExchangePackagePackage.SAVING_ORDER__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case CryptoExchangePackagePackage.SAVING_ORDER__MATURE_DATE:
				return MATURE_DATE_EDEFAULT == null ? matureDate != null : !MATURE_DATE_EDEFAULT.equals(matureDate);
			case CryptoExchangePackagePackage.SAVING_ORDER__INTEREST:
				return interest != INTEREST_EDEFAULT;
			case CryptoExchangePackagePackage.SAVING_ORDER__ACCOUNT:
				return account != null;
			case CryptoExchangePackagePackage.SAVING_ORDER__TOKEN:
				return token != null;
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
		result.append(", Amount: ");
		result.append(amount);
		result.append(", MatureDate: ");
		result.append(matureDate);
		result.append(", Interest: ");
		result.append(interest);
		result.append(')');
		return result.toString();
	}

} //SavingOrderImpl
