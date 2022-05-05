/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.tests;

import junit.textui.TestRunner;

import org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.Data_meta_modelFactory;
import org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.OneToOneRelationshipAttribute;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>One To One Relationship Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OneToOneRelationshipAttributeTest extends RelationshipAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OneToOneRelationshipAttributeTest.class);
	}

	/**
	 * Constructs a new One To One Relationship Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToOneRelationshipAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this One To One Relationship Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OneToOneRelationshipAttribute getFixture() {
		return (OneToOneRelationshipAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Data_meta_modelFactory.eINSTANCE.createOneToOneRelationshipAttribute());
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

} //OneToOneRelationshipAttributeTest
