/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.tests;

import junit.textui.TestRunner;

import org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.Data_meta_modelFactory;
import org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.ManyToOneRelationshipAttribute;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Many To One Relationship Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManyToOneRelationshipAttributeTest extends RelationshipAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ManyToOneRelationshipAttributeTest.class);
	}

	/**
	 * Constructs a new Many To One Relationship Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToOneRelationshipAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Many To One Relationship Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ManyToOneRelationshipAttribute getFixture() {
		return (ManyToOneRelationshipAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Data_meta_modelFactory.eINSTANCE.createManyToOneRelationshipAttribute());
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

} //ManyToOneRelationshipAttributeTest
