/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.tests;

import junit.textui.TestRunner;

import org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.Data_meta_modelFactory;
import org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.OneToManyRelationshipAttribute;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>One To Many Relationship Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OneToManyRelationshipAttributeTest extends RelationshipAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OneToManyRelationshipAttributeTest.class);
	}

	/**
	 * Constructs a new One To Many Relationship Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToManyRelationshipAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this One To Many Relationship Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OneToManyRelationshipAttribute getFixture() {
		return (OneToManyRelationshipAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Data_meta_modelFactory.eINSTANCE.createOneToManyRelationshipAttribute());
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

} //OneToManyRelationshipAttributeTest
