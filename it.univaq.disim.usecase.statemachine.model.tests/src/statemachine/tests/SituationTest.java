/**
 */
package statemachine.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import statemachine.Situation;
import statemachine.StatemachineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Situation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SituationTest extends TestCase {

	/**
	 * The fixture for this Situation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Situation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SituationTest.class);
	}

	/**
	 * Constructs a new Situation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Situation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Situation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Situation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Situation getFixture() {
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
		setFixture(StatemachineFactory.eINSTANCE.createSituation());
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

} //SituationTest
