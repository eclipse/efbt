/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.tests;

import junit.textui.TestRunner;

import org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.Data_meta_modelFactory;
import org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.GeneratedEntity;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generated Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratedEntityTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GeneratedEntityTest.class);
	}

	/**
	 * Constructs a new Generated Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Generated Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GeneratedEntity getFixture() {
		return (GeneratedEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Data_meta_modelFactory.eINSTANCE.createGeneratedEntity());
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

} //GeneratedEntityTest
