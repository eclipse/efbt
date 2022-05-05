/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.core.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.efbt.cocalimo.smcubes.model.core.CoreFactory;
import org.eclipse.efbt.cocalimo.smcubes.model.core.DOMAIN;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>DOMAIN</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DOMAINTest extends TestCase {

	/**
	 * The fixture for this DOMAIN test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DOMAIN fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DOMAINTest.class);
	}

	/**
	 * Constructs a new DOMAIN test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOMAINTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this DOMAIN test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DOMAIN fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this DOMAIN test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DOMAIN getFixture() {
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
		setFixture(CoreFactory.eINSTANCE.createDOMAIN());
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

} //DOMAINTest
