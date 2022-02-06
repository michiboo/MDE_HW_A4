/**
 */
package cryptoExchangePackage.impl;

import cryptoExchangePackage.Account;
import cryptoExchangePackage.CryptoExchangePackagePackage;
import cryptoExchangePackage.CryptoExchangePackageTables;
import cryptoExchangePackage.SubSystem;
import cryptoExchangePackage.Token;
import cryptoExchangePackage.TokenBalance;
import cryptoExchangePackage.TransferRequest;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.impl.AccountImpl#getName <em>Name</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.AccountImpl#getTokensBalance <em>Tokens Balance</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.AccountImpl#getTransferRequest <em>Transfer Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends MinimalEObjectImpl.Container implements Account {
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
	 * The cached value of the '{@link #getTokensBalance() <em>Tokens Balance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokensBalance()
	 * @generated
	 * @ordered
	 */
	protected EList<TokenBalance> tokensBalance;

	/**
	 * The cached value of the '{@link #getTransferRequest() <em>Transfer Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<TransferRequest> transferRequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangePackagePackage.Literals.ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		/**
		 * self.oclContainer().oclAsType(SubSystem).getNextAccId(self)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cryptoExchangePackage_c_c_SubSystem_0 = idResolver.getClass(CryptoExchangePackageTables.CLSSid_SubSystem, null);
		final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, this);
		final /*@Thrown*/ SubSystem oclAsType = (SubSystem)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer, TYP_cryptoExchangePackage_c_c_SubSystem_0);
		final /*@Thrown*/ String getNextAccId = oclAsType.getNextAccId(this);
		return getNextAccId;
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
	public EList<TokenBalance> getTokensBalance() {
		if (tokensBalance == null) {
			tokensBalance = new EObjectContainmentEList<TokenBalance>(TokenBalance.class, this, CryptoExchangePackagePackage.ACCOUNT__TOKENS_BALANCE);
		}
		return tokensBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransferRequest> getTransferRequest() {
		if (transferRequest == null) {
			transferRequest = new EObjectContainmentEList<TransferRequest>(TransferRequest.class, this, CryptoExchangePackagePackage.ACCOUNT__TRANSFER_REQUEST);
		}
		return transferRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float availableBalance(final Token fToken) {
		/**
		 *
		 * if
		 *   not self.TokensBalance->select((Token = fToken))
		 *   ->isEmpty()
		 * then
		 *   self.TokensBalance->select(Token = fToken)
		 *   ->collect(balance)
		 *   ->sum()
		 *   .oclAsType(ecore::EFloat)
		 * else 0
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<TokenBalance> TokensBalance_0 = this.getTokensBalance();
		final /*@NonInvalid*/ OrderedSetValue BOXED_TokensBalance_0 = idResolver.createOrderedSetOfAll(CryptoExchangePackageTables.ORD_CLSSid_TokenBalance, TokensBalance_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(CryptoExchangePackageTables.ORD_CLSSid_TokenBalance);
		Iterator<Object> ITERATOR__1_0 = BOXED_TokensBalance_0.iterator();
		/*@NonInvalid*/ OrderedSetValue select_0;
		while (true) {
			if (!ITERATOR__1_0.hasNext()) {
				select_0 = accumulator;
				break;
			}
			/*@NonInvalid*/ TokenBalance _1_0 = (TokenBalance)ITERATOR__1_0.next();
			/**
			 * Token = fToken
			 */
			final /*@NonInvalid*/ Token Token_0 = _1_0.getToken();
			final /*@NonInvalid*/ boolean eq_0 = Token_0.equals(fToken);
			//
			if (eq_0) {
				accumulator.add(_1_0);
			}
		}
		final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(select_0).booleanValue();
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
		if (not == null) {
			throw new InvalidValueException("Null if condition");
		}
		/*@Thrown*/ RealValue symbol_0;
		if (not) {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_ecore_c_c_EFloat_0 = idResolver.getClass(CryptoExchangePackageTables.DATAid_EFloat, null);
			/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(CryptoExchangePackageTables.SEQ_DATAid_EFloat);
			Iterator<Object> ITERATOR__1_1 = select_0.iterator();
			/*@NonInvalid*/ SequenceValue collect;
			while (true) {
				if (!ITERATOR__1_1.hasNext()) {
					collect = accumulator_0;
					break;
				}
				/*@NonInvalid*/ TokenBalance _1_1 = (TokenBalance)ITERATOR__1_1.next();
				/**
				 * balance
				 */
				final /*@NonInvalid*/ float balance = _1_1.getBalance();
				final /*@NonInvalid*/ RealValue BOXED_balance = ValueUtil.realValueOf(balance);
				//
				accumulator_0.add(BOXED_balance);
			}
			final /*@NonInvalid*/ RealValue sum = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, CryptoExchangePackageTables.DATAid_EFloat, collect);
			final /*@Thrown*/ RealValue oclAsType = (RealValue)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, sum, TYP_ecore_c_c_EFloat_0);
			symbol_0 = oclAsType;
		}
		else {
			symbol_0 = CryptoExchangePackageTables.INT_0;
		}
		final /*@Thrown*/ float ECORE_symbol_0 = ValueUtil.floatValueOf(symbol_0);
		return ECORE_symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CryptoExchangePackagePackage.ACCOUNT__TOKENS_BALANCE:
				return ((InternalEList<?>)getTokensBalance()).basicRemove(otherEnd, msgs);
			case CryptoExchangePackagePackage.ACCOUNT__TRANSFER_REQUEST:
				return ((InternalEList<?>)getTransferRequest()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CryptoExchangePackagePackage.ACCOUNT__NAME:
				return getName();
			case CryptoExchangePackagePackage.ACCOUNT__TOKENS_BALANCE:
				return getTokensBalance();
			case CryptoExchangePackagePackage.ACCOUNT__TRANSFER_REQUEST:
				return getTransferRequest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CryptoExchangePackagePackage.ACCOUNT__NAME:
				setName((String)newValue);
				return;
			case CryptoExchangePackagePackage.ACCOUNT__TOKENS_BALANCE:
				getTokensBalance().clear();
				getTokensBalance().addAll((Collection<? extends TokenBalance>)newValue);
				return;
			case CryptoExchangePackagePackage.ACCOUNT__TRANSFER_REQUEST:
				getTransferRequest().clear();
				getTransferRequest().addAll((Collection<? extends TransferRequest>)newValue);
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
			case CryptoExchangePackagePackage.ACCOUNT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.ACCOUNT__TOKENS_BALANCE:
				getTokensBalance().clear();
				return;
			case CryptoExchangePackagePackage.ACCOUNT__TRANSFER_REQUEST:
				getTransferRequest().clear();
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
			case CryptoExchangePackagePackage.ACCOUNT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CryptoExchangePackagePackage.ACCOUNT__TOKENS_BALANCE:
				return tokensBalance != null && !tokensBalance.isEmpty();
			case CryptoExchangePackagePackage.ACCOUNT__TRANSFER_REQUEST:
				return transferRequest != null && !transferRequest.isEmpty();
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
			case CryptoExchangePackagePackage.ACCOUNT___AVAILABLE_BALANCE__TOKEN:
				return availableBalance((Token)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AccountImpl
