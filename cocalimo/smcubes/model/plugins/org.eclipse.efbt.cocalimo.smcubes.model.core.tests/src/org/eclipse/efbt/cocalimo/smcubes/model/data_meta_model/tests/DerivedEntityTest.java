/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.tests;

import junit.textui.TestRunner;

import org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.Data_meta_modelFactory;
import org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.DerivedEntity;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Derived Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DerivedEntityTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DerivedEntityTest.class);
	}

	/**
	 * Constructs a new Derived Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Derived Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DerivedEntity getFixture() {
		return (DerivedEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Data_meta_modelFactory.eINSTANCE.createDerivedEntity());
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

} //DerivedEntityTest
