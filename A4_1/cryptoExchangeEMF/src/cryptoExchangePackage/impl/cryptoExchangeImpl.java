/**
 */
package cryptoExchangePackage.impl;

import cryptoExchangePackage.CryptoExchangePackagePackage;
import cryptoExchangePackage.CryptoExchangePackageTables;
import cryptoExchangePackage.SubSystem;
import cryptoExchangePackage.Token;
import cryptoExchangePackage.TokenNetwork;
import cryptoExchangePackage.cryptoExchange;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>crypto Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.impl.cryptoExchangeImpl#getIP <em>IP</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.cryptoExchangeImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.cryptoExchangeImpl#getSubSystem <em>Sub System</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.cryptoExchangeImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.cryptoExchangeImpl#getTokenNetworks <em>Token Networks</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.cryptoExchangeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class cryptoExchangeImpl extends MinimalEObjectImpl.Container implements cryptoExchange {
	/**
	 * The default value of the '{@link #getIP() <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIP()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIP() <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIP()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected String domainName = DOMAIN_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubSystem() <em>Sub System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<SubSystem> subSystem;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> tokens;

	/**
	 * The cached value of the '{@link #getTokenNetworks() <em>Token Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<TokenNetwork> tokenNetworks;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected cryptoExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIP() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIP(String newIP) {
		String oldIP = ip;
		ip = newIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.CRYPTO_EXCHANGE__IP, oldIP, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainName(String newDomainName) {
		String oldDomainName = domainName;
		domainName = newDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.CRYPTO_EXCHANGE__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubSystem> getSubSystem() {
		if (subSystem == null) {
			subSystem = new EObjectContainmentEList<SubSystem>(SubSystem.class, this, CryptoExchangePackagePackage.CRYPTO_EXCHANGE__SUB_SYSTEM);
		}
		return subSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getTokens() {
		if (tokens == null) {
			tokens = new EObjectContainmentEList<Token>(Token.class, this, CryptoExchangePackagePackage.CRYPTO_EXCHANGE__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenNetwork> getTokenNetworks() {
		if (tokenNetworks == null) {
			tokenNetworks = new EObjectContainmentEList<TokenNetwork>(TokenNetwork.class, this, CryptoExchangePackagePackage.CRYPTO_EXCHANGE__TOKEN_NETWORKS);
		}
		return tokenNetworks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.CRYPTO_EXCHANGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkUniqueToken(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "cryptoExchange::checkUniqueToken";
		try {
			/**
			 *
			 * inv checkUniqueToken:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.Tokens->isUnique(self)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CryptoExchangePackagePackage.Literals.CRYPTO_EXCHANGE___CHECK_UNIQUE_TOKEN__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CryptoExchangePackageTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Token> Tokens = this.getTokens();
				final /*@NonInvalid*/ OrderedSetValue BOXED_Tokens = idResolver.createOrderedSetOfAll(CryptoExchangePackageTables.ORD_CLSSid_Token, Tokens);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(CryptoExchangePackageTables.ORD_CLSSid_Token);
				Iterator<Object> ITERATOR__1 = BOXED_Tokens.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Token _1 = (Token)ITERATOR__1.next();
					/**
					 * self
					 */
					//
					if (accumulator.includes(this) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator.add(this);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, CryptoExchangePackageTables.INT_0).booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__SUB_SYSTEM:
				return ((InternalEList<?>)getSubSystem()).basicRemove(otherEnd, msgs);
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__TOKENS:
				return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				return ((InternalEList<?>)getTokenNetworks()).basicRemove(otherEnd, msgs);
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
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__IP:
				return getIP();
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__DOMAIN_NAME:
				return getDomainName();
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__SUB_SYSTEM:
				return getSubSystem();
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__TOKENS:
				return getTokens();
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				return getTokenNetworks();
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__NAME:
				return getName();
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
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__IP:
				setIP((String)newValue);
				return;
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__SUB_SYSTEM:
				getSubSystem().clear();
				getSubSystem().addAll((Collection<? extends SubSystem>)newValue);
				return;
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				getTokenNetworks().clear();
				getTokenNetworks().addAll((Collection<? extends TokenNetwork>)newValue);
				return;
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__NAME:
				setName((String)newValue);
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
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__IP:
				setIP(IP_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__SUB_SYSTEM:
				getSubSystem().clear();
				return;
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__TOKENS:
				getTokens().clear();
				return;
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				getTokenNetworks().clear();
				return;
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__NAME:
				setName(NAME_EDEFAULT);
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
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__SUB_SYSTEM:
				return subSystem != null && !subSystem.isEmpty();
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				return tokenNetworks != null && !tokenNetworks.isEmpty();
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CryptoExchangePackagePackage.CRYPTO_EXCHANGE___CHECK_UNIQUE_TOKEN__DIAGNOSTICCHAIN_MAP:
				return checkUniqueToken((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (IP: ");
		result.append(ip);
		result.append(", DomainName: ");
		result.append(domainName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //cryptoExchangeImpl
