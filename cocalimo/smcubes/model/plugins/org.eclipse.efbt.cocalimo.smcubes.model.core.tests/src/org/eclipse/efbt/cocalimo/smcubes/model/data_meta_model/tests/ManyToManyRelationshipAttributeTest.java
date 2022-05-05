/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.tests;

import junit.textui.TestRunner;

import org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.Data_meta_modelFactory;
import org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.ManyToManyRelationshipAttribute;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Many To Many Relationship Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManyToManyRelationshipAttributeTest extends RelationshipAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ManyToManyRelationshipAttributeTest.class);
	}

	/**
	 * Constructs a new Many To Many Relationship Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToManyRelationshipAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Many To Many Relationship Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ManyToManyRelationshipAttribute getFixture() {
		return (ManyToManyRelationshipAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Data_meta_modelFactory.eINSTANCE.createManyToManyRelationshipAttribute());
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

} //ManyToManyRelationshipAttributeTest
