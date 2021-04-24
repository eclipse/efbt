/**
 */
package org.eclipse.efbt.cocalimo.core.model.test_definition.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.efbt.cocalimo.core.model.test_definition.Param;
import org.eclipse.efbt.cocalimo.core.model.test_definition.Test_definitionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParamTest extends TestCase {

	/**
	 * The fixture for this Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Param fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParamTest.class);
	}

	/**
	 * Constructs a new Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Param fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Param getFixture() {
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
		setFixture(Test_definitionFactory.eINSTANCE.createParam());
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

} //ParamTest