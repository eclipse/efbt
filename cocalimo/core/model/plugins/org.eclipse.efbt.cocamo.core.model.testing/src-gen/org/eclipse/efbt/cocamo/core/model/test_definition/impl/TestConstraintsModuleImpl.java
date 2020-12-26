/**
 */
package org.eclipse.efbt.cocamo.core.model.test_definition.impl;

import java.util.Collection;

import org.eclipse.efbt.cocamo.core.model.module_management.impl.ModuleImpl;

import org.eclipse.efbt.cocamo.core.model.test_definition.TestConstraintsModule;
import org.eclipse.efbt.cocamo.core.model.test_definition.TestContraints;
import org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Constraints Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test_definition.impl.TestConstraintsModuleImpl#getCoverageTestSets <em>Coverage Test Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestConstraintsModuleImpl extends ModuleImpl implements TestConstraintsModule
{
	/**
	 * The cached value of the '{@link #getCoverageTestSets() <em>Coverage Test Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageTestSets()
	 * @generated
	 * @ordered
	 */
	protected EList<TestContraints> coverageTestSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestConstraintsModuleImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Test_definitionPackage.Literals.TEST_CONSTRAINTS_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestContraints> getCoverageTestSets()
	{
		if (coverageTestSets == null)
		{
			coverageTestSets = new EObjectContainmentEList<TestContraints>(TestContraints.class, this, Test_definitionPackage.TEST_CONSTRAINTS_MODULE__COVERAGE_TEST_SETS);
		}
		return coverageTestSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case Test_definitionPackage.TEST_CONSTRAINTS_MODULE__COVERAGE_TEST_SETS:
				return ((InternalEList<?>)getCoverageTestSets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case Test_definitionPackage.TEST_CONSTRAINTS_MODULE__COVERAGE_TEST_SETS:
				return getCoverageTestSets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case Test_definitionPackage.TEST_CONSTRAINTS_MODULE__COVERAGE_TEST_SETS:
				getCoverageTestSets().clear();
				getCoverageTestSets().addAll((Collection<? extends TestContraints>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case Test_definitionPackage.TEST_CONSTRAINTS_MODULE__COVERAGE_TEST_SETS:
				getCoverageTestSets().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case Test_definitionPackage.TEST_CONSTRAINTS_MODULE__COVERAGE_TEST_SETS:
				return coverageTestSets != null && !coverageTestSets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestConstraintsModuleImpl
