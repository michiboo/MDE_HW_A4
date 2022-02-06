/**
 */
package cryptoExchangePackage.impl;

import cryptoExchangePackage.CryptoExchangePackagePackage;
import cryptoExchangePackage.CryptoExchangePackageTables;
import cryptoExchangePackage.Token;
import cryptoExchangePackage.TokenPair;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.impl.TokenPairImpl#getName <em>Name</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.TokenPairImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.TokenPairImpl#getTokenA <em>Token A</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.TokenPairImpl#getTokenB <em>Token B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenPairImpl extends MinimalEObjectImpl.Container implements TokenPair {
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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTokenA() <em>Token A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenA()
	 * @generated
	 * @ordered
	 */
	protected Token tokenA;

	/**
	 * The cached value of the '{@link #getTokenB() <em>Token B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenB()
	 * @generated
	 * @ordered
	 */
	protected Token tokenB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangePackagePackage.Literals.TOKEN_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		/**
		 * self.createName()
		 */
		final /*@NonInvalid*/ String createName = this.createName();
		return createName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		// TODO: implement this method to set the 'Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TOKEN_PAIR__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getTokenA() {
		if (tokenA != null && tokenA.eIsProxy()) {
			InternalEObject oldTokenA = (InternalEObject)tokenA;
			tokenA = (Token)eResolveProxy(oldTokenA);
			if (tokenA != oldTokenA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptoExchangePackagePackage.TOKEN_PAIR__TOKEN_A, oldTokenA, tokenA));
			}
		}
		return tokenA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetTokenA() {
		return tokenA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenA(Token newTokenA) {
		Token oldTokenA = tokenA;
		tokenA = newTokenA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TOKEN_PAIR__TOKEN_A, oldTokenA, tokenA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getTokenB() {
		if (tokenB != null && tokenB.eIsProxy()) {
			InternalEObject oldTokenB = (InternalEObject)tokenB;
			tokenB = (Token)eResolveProxy(oldTokenB);
			if (tokenB != oldTokenB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptoExchangePackagePackage.TOKEN_PAIR__TOKEN_B, oldTokenB, tokenB));
			}
		}
		return tokenB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetTokenB() {
		return tokenB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenB(Token newTokenB) {
		Token oldTokenB = tokenB;
		tokenB = newTokenB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.TOKEN_PAIR__TOKEN_B, oldTokenB, tokenB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createName() {
		/**
		 *
		 * if not self.TokenA->isEmpty() and not self.TokenB->isEmpty()
		 * then self.TokenA.name + ' / ' + self.TokenB.name
		 * else ''
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ Token TokenA_0 = this.getTokenA();
		final /*@NonInvalid*/ Token TokenB_0 = this.getTokenB();
		final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, CryptoExchangePackageTables.SET_CLSSid_Token, TokenA_0);
		final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(oclAsSet).booleanValue();
		final /*@NonInvalid*/ Boolean not;
		if (!isEmpty) {
			not = ValueUtil.TRUE_VALUE;
		}
		else {
			if (isEmpty) {
				not = ValueUtil.FALSE_VALUE;
			}
			else {
				not = null;
			}
		}
		final /*@Thrown*/ Boolean and;
		if (not == ValueUtil.FALSE_VALUE) {
			and = ValueUtil.FALSE_VALUE;
		}
		else {
			final /*@NonInvalid*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, CryptoExchangePackageTables.SET_CLSSid_Token, TokenB_0);
			final /*@NonInvalid*/ boolean isEmpty_0 = CollectionIsEmptyOperation.INSTANCE.evaluate(oclAsSet_0).booleanValue();
			final /*@NonInvalid*/ Boolean not_0;
			if (!isEmpty_0) {
				not_0 = ValueUtil.TRUE_VALUE;
			}
			else {
				if (isEmpty_0) {
					not_0 = ValueUtil.FALSE_VALUE;
				}
				else {
					not_0 = null;
				}
			}
			if (not_0 == ValueUtil.FALSE_VALUE) {
				and = ValueUtil.FALSE_VALUE;
			}
			else {
				if ((not == null) || (not_0 == null)) {
					and = null;
				}
				else {
					and = ValueUtil.TRUE_VALUE;
				}
			}
		}
		if (and == null) {
			throw new InvalidValueException("Null if condition");
		}
		/*@NonInvalid*/ String symbol_0;
		if (and) {
			final /*@NonInvalid*/ String name = TokenA_0.getName();
			final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(name, CryptoExchangePackageTables.STR__32_s_32);
			final /*@NonInvalid*/ String name_0 = TokenB_0.getName();
			final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, name_0);
			symbol_0 = sum_0;
		}
		else {
			symbol_0 = CryptoExchangePackageTables.STR_;
		}
		return symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CryptoExchangePackagePackage.TOKEN_PAIR__NAME:
				return getName();
			case CryptoExchangePackagePackage.TOKEN_PAIR__PRICE:
				return getPrice();
			case CryptoExchangePackagePackage.TOKEN_PAIR__TOKEN_A:
				if (resolve) return getTokenA();
				return basicGetTokenA();
			case CryptoExchangePackagePackage.TOKEN_PAIR__TOKEN_B:
				if (resolve) return getTokenB();
				return basicGetTokenB();
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
			case CryptoExchangePackagePackage.TOKEN_PAIR__NAME:
				setName((String)newValue);
				return;
			case CryptoExchangePackagePackage.TOKEN_PAIR__PRICE:
				setPrice((Float)newValue);
				return;
			case CryptoExchangePackagePackage.TOKEN_PAIR__TOKEN_A:
				setTokenA((Token)newValue);
				return;
			case CryptoExchangePackagePackage.TOKEN_PAIR__TOKEN_B:
				setTokenB((Token)newValue);
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
			case CryptoExchangePackagePackage.TOKEN_PAIR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.TOKEN_PAIR__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.TOKEN_PAIR__TOKEN_A:
				setTokenA((Token)null);
				return;
			case CryptoExchangePackagePackage.TOKEN_PAIR__TOKEN_B:
				setTokenB((Token)null);
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
			case CryptoExchangePackagePackage.TOKEN_PAIR__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CryptoExchangePackagePackage.TOKEN_PAIR__PRICE:
				return price != PRICE_EDEFAULT;
			case CryptoExchangePackagePackage.TOKEN_PAIR__TOKEN_A:
				return tokenA != null;
			case CryptoExchangePackagePackage.TOKEN_PAIR__TOKEN_B:
				return tokenB != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CryptoExchangePackagePackage.TOKEN_PAIR___CREATE_NAME:
				return createName();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //TokenPairImpl
