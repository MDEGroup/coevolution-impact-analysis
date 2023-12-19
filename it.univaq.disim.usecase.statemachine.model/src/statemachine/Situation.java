/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Situation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Situation#getName <em>Name</em>}</li>
 *   <li>{@link statemachine.Situation#getActions <em>Actions</em>}</li>
 *   <li>{@link statemachine.Situation#getTranstions <em>Transtions</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getSituation()
 * @model
 * @generated
 */
public interface Situation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see statemachine.StatemachinePackage#getSituation_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link statemachine.Situation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see statemachine.StatemachinePackage#getSituation_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getActions();

	/**
	 * Returns the value of the '<em><b>Transtions</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transtions</em>' containment reference list.
	 * @see statemachine.StatemachinePackage#getSituation_Transtions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTranstions();

} // Situation
