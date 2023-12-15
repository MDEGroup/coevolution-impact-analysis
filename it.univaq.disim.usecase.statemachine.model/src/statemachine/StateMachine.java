/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link statemachine.StateMachine#getName <em>Name</em>}</li>
 *   <li>{@link statemachine.StateMachine#getTranstions <em>Transtions</em>}</li>
 *   <li>{@link statemachine.StateMachine#getReset <em>Reset</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see statemachine.StatemachinePackage#getStateMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see statemachine.StatemachinePackage#getStateMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link statemachine.StateMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transtions</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transtions</em>' containment reference list.
	 * @see statemachine.StatemachinePackage#getStateMachine_Transtions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTranstions();

	/**
	 * Returns the value of the '<em><b>Reset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset</em>' containment reference.
	 * @see #setReset(Reset)
	 * @see statemachine.StatemachinePackage#getStateMachine_Reset()
	 * @model containment="true"
	 * @generated
	 */
	Reset getReset();

	/**
	 * Sets the value of the '{@link statemachine.StateMachine#getReset <em>Reset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset</em>' containment reference.
	 * @see #getReset()
	 * @generated
	 */
	void setReset(Reset value);

} // StateMachine
