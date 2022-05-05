/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.data_definition.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.efbt.cocalimo.smcubes.model.data_definition.CUBE;
import org.eclipse.efbt.cocalimo.smcubes.model.data_definition.Data_definitionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CUBE</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CUBETest extends TestCase {

	/**
	 * The fixture for this CUBE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CUBE fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CUBETest.class);
	}

	/**
	 * Constructs a new CUBE test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUBETest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this CUBE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CUBE fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this CUBE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CUBE getFixture() {
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
		setFixture(Data_definitionFactory.eINSTANCE.createCUBE());
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

} //CUBETest
