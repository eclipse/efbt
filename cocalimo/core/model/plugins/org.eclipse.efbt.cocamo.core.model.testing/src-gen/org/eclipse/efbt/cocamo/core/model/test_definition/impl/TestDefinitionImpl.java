/**
 */
package org.eclipse.efbt.cocamo.core.model.test_definition.impl;

import org.eclipse.efbt.cocamo.core.model.test_definition.Given;
import org.eclipse.efbt.cocamo.core.model.test_definition.TestContraints;
import org.eclipse.efbt.cocamo.core.model.test_definition.TestDefinition;
import org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage;
import org.eclipse.efbt.cocamo.core.model.test_definition.Then;
import org.eclipse.efbt.cocamo.core.model.test_definition.When;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test_definition.impl.TestDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test_definition.impl.TestDefinitionImpl#getTestContraints <em>Test Contraints</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test_definition.impl.TestDefinitionImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test_definition.impl.TestDefinitionImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test_definition.impl.TestDefinitionImpl#getThen <em>Then</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestDefinitionImpl extends MinimalEObjectImpl.Container implements TestDefinition
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestContraints() <em>Test Contraints</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestContraints()
	 * @generated
	 * @ordered
	 */
	protected TestContraints testContraints;

	/**
	 * The cached value of the '{@link #getGiven() <em>Given</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGiven()
	 * @generated
	 * @ordered
	 */
	protected Given given;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected When when;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected Then then;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestDefinitionImpl()
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
		return Test_definitionPackage.Literals.TEST_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Test_definitionPackage.TEST_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestContraints getTestContraints()
	{
		if (testContraints != null && testContraints.eIsProxy())
		{
			InternalEObject oldTestContraints = (InternalEObject)testContraints;
			testContraints = (TestContraints)eResolveProxy(oldTestContraints);
			if (testContraints != oldTestContraints)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Test_definitionPackage.TEST_DEFINITION__TEST_CONTRAINTS, oldTestContraints, testContraints));
			}
		}
		return testContraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestContraints basicGetTestContraints()
	{
		return testContraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestContraints(TestContraints newTestContraints)
	{
		TestContraints oldTestContraints = testContraints;
		testContraints = newTestContraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Test_definitionPackage.TEST_DEFINITION__TEST_CONTRAINTS, oldTestContraints, testContraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Given getGiven()
	{
		return given;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGiven(Given newGiven, NotificationChain msgs)
	{
		Given oldGiven = given;
		given = newGiven;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Test_definitionPackage.TEST_DEFINITION__GIVEN, oldGiven, newGiven);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGiven(Given newGiven)
	{
		if (newGiven != given)
		{
			NotificationChain msgs = null;
			if (given != null)
				msgs = ((InternalEObject)given).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Test_definitionPackage.TEST_DEFINITION__GIVEN, null, msgs);
			if (newGiven != null)
				msgs = ((InternalEObject)newGiven).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Test_definitionPackage.TEST_DEFINITION__GIVEN, null, msgs);
			msgs = basicSetGiven(newGiven, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Test_definitionPackage.TEST_DEFINITION__GIVEN, newGiven, newGiven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public When getWhen()
	{
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(When newWhen, NotificationChain msgs)
	{
		When oldWhen = when;
		when = newWhen;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Test_definitionPackage.TEST_DEFINITION__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhen(When newWhen)
	{
		if (newWhen != when)
		{
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Test_definitionPackage.TEST_DEFINITION__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Test_definitionPackage.TEST_DEFINITION__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Test_definitionPackage.TEST_DEFINITION__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Then getThen()
	{
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen(Then newThen, NotificationChain msgs)
	{
		Then oldThen = then;
		then = newThen;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Test_definitionPackage.TEST_DEFINITION__THEN, oldThen, newThen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThen(Then newThen)
	{
		if (newThen != then)
		{
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Test_definitionPackage.TEST_DEFINITION__THEN, null, msgs);
			if (newThen != null)
				msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Test_definitionPackage.TEST_DEFINITION__THEN, null, msgs);
			msgs = basicSetThen(newThen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Test_definitionPackage.TEST_DEFINITION__THEN, newThen, newThen));
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
			case Test_definitionPackage.TEST_DEFINITION__GIVEN:
				return basicSetGiven(null, msgs);
			case Test_definitionPackage.TEST_DEFINITION__WHEN:
				return basicSetWhen(null, msgs);
			case Test_definitionPackage.TEST_DEFINITION__THEN:
				return basicSetThen(null, msgs);
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
			case Test_definitionPackage.TEST_DEFINITION__NAME:
				return getName();
			case Test_definitionPackage.TEST_DEFINITION__TEST_CONTRAINTS:
				if (resolve) return getTestContraints();
				return basicGetTestContraints();
			case Test_definitionPackage.TEST_DEFINITION__GIVEN:
				return getGiven();
			case Test_definitionPackage.TEST_DEFINITION__WHEN:
				return getWhen();
			case Test_definitionPackage.TEST_DEFINITION__THEN:
				return getThen();
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
			case Test_definitionPackage.TEST_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case Test_definitionPackage.TEST_DEFINITION__TEST_CONTRAINTS:
				setTestContraints((TestContraints)newValue);
				return;
			case Test_definitionPackage.TEST_DEFINITION__GIVEN:
				setGiven((Given)newValue);
				return;
			case Test_definitionPackage.TEST_DEFINITION__WHEN:
				setWhen((When)newValue);
				return;
			case Test_definitionPackage.TEST_DEFINITION__THEN:
				setThen((Then)newValue);
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
			case Test_definitionPackage.TEST_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Test_definitionPackage.TEST_DEFINITION__TEST_CONTRAINTS:
				setTestContraints((TestContraints)null);
				return;
			case Test_definitionPackage.TEST_DEFINITION__GIVEN:
				setGiven((Given)null);
				return;
			case Test_definitionPackage.TEST_DEFINITION__WHEN:
				setWhen((When)null);
				return;
			case Test_definitionPackage.TEST_DEFINITION__THEN:
				setThen((Then)null);
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
			case Test_definitionPackage.TEST_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Test_definitionPackage.TEST_DEFINITION__TEST_CONTRAINTS:
				return testContraints != null;
			case Test_definitionPackage.TEST_DEFINITION__GIVEN:
				return given != null;
			case Test_definitionPackage.TEST_DEFINITION__WHEN:
				return when != null;
			case Test_definitionPackage.TEST_DEFINITION__THEN:
				return then != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TestDefinitionImpl
