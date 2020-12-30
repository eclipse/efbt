/**
 */
package org.eclipse.efbt.cocamo.core.model.test.impl;

import org.eclipse.efbt.cocamo.core.model.test.E2ETest;
import org.eclipse.efbt.cocamo.core.model.test.TestPackage;

import org.eclipse.efbt.cocamo.core.model.test_definition.E2ETestDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>E2E Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test.impl.E2ETestImpl#getTestDefinition <em>Test Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class E2ETestImpl extends TestImpl implements E2ETest
{
	/**
	 * The cached value of the '{@link #getTestDefinition() <em>Test Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestDefinition()
	 * @generated
	 * @ordered
	 */
	protected E2ETestDefinition testDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected E2ETestImpl()
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
		return TestPackage.Literals.E2E_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E2ETestDefinition getTestDefinition()
	{
		if (testDefinition != null && testDefinition.eIsProxy())
		{
			InternalEObject oldTestDefinition = (InternalEObject)testDefinition;
			testDefinition = (E2ETestDefinition)eResolveProxy(oldTestDefinition);
			if (testDefinition != oldTestDefinition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.E2E_TEST__TEST_DEFINITION, oldTestDefinition, testDefinition));
			}
		}
		return testDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E2ETestDefinition basicGetTestDefinition()
	{
		return testDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestDefinition(E2ETestDefinition newTestDefinition)
	{
		E2ETestDefinition oldTestDefinition = testDefinition;
		testDefinition = newTestDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.E2E_TEST__TEST_DEFINITION, oldTestDefinition, testDefinition));
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
			case TestPackage.E2E_TEST__TEST_DEFINITION:
				if (resolve) return getTestDefinition();
				return basicGetTestDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackage.E2E_TEST__TEST_DEFINITION:
				setTestDefinition((E2ETestDefinition)newValue);
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
			case TestPackage.E2E_TEST__TEST_DEFINITION:
				setTestDefinition((E2ETestDefinition)null);
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
			case TestPackage.E2E_TEST__TEST_DEFINITION:
				return testDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //E2ETestImpl
