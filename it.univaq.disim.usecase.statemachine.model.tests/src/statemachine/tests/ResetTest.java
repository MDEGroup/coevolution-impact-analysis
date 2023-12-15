/**
 */
package statemachine.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import statemachine.Reset;
import statemachine.StatemachineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reset</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResetTest extends TestCase {

	/**
	 * The fixture for this Reset test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reset fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResetTest.class);
	}

	/**
	 * Constructs a new Reset test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reset test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Reset fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reset test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reset getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatemachineFactory.eINSTANCE.createReset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ResetTest
