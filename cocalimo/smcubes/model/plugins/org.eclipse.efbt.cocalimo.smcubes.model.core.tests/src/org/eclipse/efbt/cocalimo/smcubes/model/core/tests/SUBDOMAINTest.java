/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.core.tests;

import junit.textui.TestRunner;

import org.eclipse.efbt.cocalimo.smcubes.model.core.CoreFactory;
import org.eclipse.efbt.cocalimo.smcubes.model.core.SUBDOMAIN;

import org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.tests.ClassifierTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SUBDOMAIN</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SUBDOMAINTest extends ClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SUBDOMAINTest.class);
	}

	/**
	 * Constructs a new SUBDOMAIN test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUBDOMAINTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SUBDOMAIN test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SUBDOMAIN getFixture() {
		return (SUBDOMAIN)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createSUBDOMAIN());
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

} //SUBDOMAINTest
