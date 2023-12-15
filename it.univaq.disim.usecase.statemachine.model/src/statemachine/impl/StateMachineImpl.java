/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Reset;
import statemachine.Situation;
import statemachine.StateMachine;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getStates <em>States</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getTranstions <em>Transtions</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getReset <em>Reset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends MinimalEObjectImpl.Container implements StateMachine {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<Situation> states;

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
	 * The cached value of the '{@link #getTranstions() <em>Transtions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranstions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transtions;

	/**
	 * The cached value of the '{@link #getReset() <em>Reset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReset()
	 * @generated
	 * @ordered
	 */
	protected Reset reset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Situation> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<Situation>(Situation.class, this, StatemachinePackage.STATE_MACHINE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE_MACHINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTranstions() {
		if (transtions == null) {
			transtions = new EObjectContainmentEList<Transition>(Transition.class, this, StatemachinePackage.STATE_MACHINE__TRANSTIONS);
		}
		return transtions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reset getReset() {
		return reset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReset(Reset newReset, NotificationChain msgs) {
		Reset oldReset = reset;
		reset = newReset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE_MACHINE__RESET, oldReset, newReset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReset(Reset newReset) {
		if (newReset != reset) {
			NotificationChain msgs = null;
			if (reset != null)
				msgs = ((InternalEObject)reset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatemachinePackage.STATE_MACHINE__RESET, null, msgs);
			if (newReset != null)
				msgs = ((InternalEObject)newReset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatemachinePackage.STATE_MACHINE__RESET, null, msgs);
			msgs = basicSetReset(newReset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE_MACHINE__RESET, newReset, newReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatemachinePackage.STATE_MACHINE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__TRANSTIONS:
				return ((InternalEList<?>)getTranstions()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__RESET:
				return basicSetReset(null, msgs);
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
			case StatemachinePackage.STATE_MACHINE__STATES:
				return getStates();
			case StatemachinePackage.STATE_MACHINE__NAME:
				return getName();
			case StatemachinePackage.STATE_MACHINE__TRANSTIONS:
				return getTranstions();
			case StatemachinePackage.STATE_MACHINE__RESET:
				return getReset();
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
			case StatemachinePackage.STATE_MACHINE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends Situation>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__NAME:
				setName((String)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__TRANSTIONS:
				getTranstions().clear();
				getTranstions().addAll((Collection<? extends Transition>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__RESET:
				setReset((Reset)newValue);
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
			case StatemachinePackage.STATE_MACHINE__STATES:
				getStates().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StatemachinePackage.STATE_MACHINE__TRANSTIONS:
				getTranstions().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__RESET:
				setReset((Reset)null);
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
			case StatemachinePackage.STATE_MACHINE__STATES:
				return states != null && !states.isEmpty();
			case StatemachinePackage.STATE_MACHINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StatemachinePackage.STATE_MACHINE__TRANSTIONS:
				return transtions != null && !transtions.isEmpty();
			case StatemachinePackage.STATE_MACHINE__RESET:
				return reset != null;
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
		result.append(')');
		return result.toString();
	}

} //StateMachineImpl
