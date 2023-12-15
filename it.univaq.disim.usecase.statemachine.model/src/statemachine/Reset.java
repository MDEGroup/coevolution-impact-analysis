/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Reset#getName <em>Name</em>}</li>
 *   <li>{@link statemachine.Reset#getEvents <em>Events</em>}</li>
 *   <li>{@link statemachine.Reset#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getReset()
 * @model
 * @generated
 */
public interface Reset extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see statemachine.StatemachinePackage#getReset_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link statemachine.Reset#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link statemachine.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see statemachine.StatemachinePackage#getReset_Events()
	 * @model
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Situation)
	 * @see statemachine.StatemachinePackage#getReset_Transition()
	 * @model
	 * @generated
	 */
	Situation getTransition();

	/**
	 * Sets the value of the '{@link statemachine.Reset#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Situation value);

} // Reset
