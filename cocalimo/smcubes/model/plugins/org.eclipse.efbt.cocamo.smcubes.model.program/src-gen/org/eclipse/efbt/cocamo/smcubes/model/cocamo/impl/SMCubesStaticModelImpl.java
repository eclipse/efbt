/**
 */
package org.eclipse.efbt.cocamo.smcubes.model.cocamo.impl;

import org.eclipse.efbt.cocamo.core.model.functionality_module.FunctionalityModuleModule;

import org.eclipse.efbt.cocamo.core.model.requirements_text.RequirementsModule;

import org.eclipse.efbt.cocamo.core.model.test_definition.TestContraints;
import org.eclipse.efbt.cocamo.core.model.test_definition.TestDefinitionModule;
import org.eclipse.efbt.cocamo.core.model.test_definition.TestTemplateModule;

import org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage;
import org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel;
import org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesTestModule;

import org.eclipse.efbt.cocamo.smcubes.model.smcubes_model.SmcubesModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SM Cubes Static Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.impl.SMCubesStaticModelImpl#getSmCubesModel <em>Sm Cubes Model</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.impl.SMCubesStaticModelImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.impl.SMCubesStaticModelImpl#getTestDefinitions <em>Test Definitions</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.impl.SMCubesStaticModelImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.impl.SMCubesStaticModelImpl#getTestTemplates <em>Test Templates</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.impl.SMCubesStaticModelImpl#getTestConstriants <em>Test Constriants</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.impl.SMCubesStaticModelImpl#getFunctionalityModules <em>Functionality Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SMCubesStaticModelImpl extends StaticModelImpl implements SMCubesStaticModel
{
	/**
	 * The cached value of the '{@link #getSmCubesModel() <em>Sm Cubes Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmCubesModel()
	 * @generated
	 * @ordered
	 */
	protected SmcubesModel smCubesModel;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected RequirementsModule requirements;

	/**
	 * The cached value of the '{@link #getTestDefinitions() <em>Test Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestDefinitions()
	 * @generated
	 * @ordered
	 */
	protected TestDefinitionModule testDefinitions;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected SMCubesTestModule tests;

	/**
	 * The cached value of the '{@link #getTestTemplates() <em>Test Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestTemplates()
	 * @generated
	 * @ordered
	 */
	protected TestTemplateModule testTemplates;

	/**
	 * The cached value of the '{@link #getTestConstriants() <em>Test Constriants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestConstriants()
	 * @generated
	 * @ordered
	 */
	protected TestContraints testConstriants;

	/**
	 * The cached value of the '{@link #getFunctionalityModules() <em>Functionality Modules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalityModules()
	 * @generated
	 * @ordered
	 */
	protected FunctionalityModuleModule functionalityModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SMCubesStaticModelImpl()
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
		return CocamoPackage.Literals.SM_CUBES_STATIC_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmcubesModel getSmCubesModel()
	{
		return smCubesModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmCubesModel(SmcubesModel newSmCubesModel, NotificationChain msgs)
	{
		SmcubesModel oldSmCubesModel = smCubesModel;
		smCubesModel = newSmCubesModel;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CocamoPackage.SM_CUBES_STATIC_MODEL__SM_CUBES_MODEL, oldSmCubesModel, newSmCubesModel);
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
	public void setSmCubesModel(SmcubesModel newSmCubesModel)
	{
		if (newSmCubesModel != smCubesModel)
		{
			NotificationChain msgs = null;
			if (smCubesModel != null)
				msgs = ((InternalEObject)smCubesModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CocamoPackage.SM_CUBES_STATIC_MODEL__SM_CUBES_MODEL, null, msgs);
			if (newSmCubesModel != null)
				msgs = ((InternalEObject)newSmCubesModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CocamoPackage.SM_CUBES_STATIC_MODEL__SM_CUBES_MODEL, null, msgs);
			msgs = basicSetSmCubesModel(newSmCubesModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocamoPackage.SM_CUBES_STATIC_MODEL__SM_CUBES_MODEL, newSmCubesModel, newSmCubesModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsModule getRequirements()
	{
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(RequirementsModule newRequirements, NotificationChain msgs)
	{
		RequirementsModule oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CocamoPackage.SM_CUBES_STATIC_MODEL__REQUIREMENTS, oldRequirements, newRequirements);
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
	public void setRequirements(RequirementsModule newRequirements)
	{
		if (newRequirements != requirements)
		{
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CocamoPackage.SM_CUBES_STATIC_MODEL__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CocamoPackage.SM_CUBES_STATIC_MODEL__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocamoPackage.SM_CUBES_STATIC_MODEL__REQUIREMENTS, newRequirements, newRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestDefinitionModule getTestDefinitions()
	{
		return testDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestDefinitions(TestDefinitionModule newTestDefinitions, NotificationChain msgs)
	{
		TestDefinitionModule oldTestDefinitions = testDefinitions;
		testDefinitions = newTestDefinitions;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_DEFINITIONS, oldTestDefinitions, newTestDefinitions);
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
	public void setTestDefinitions(TestDefinitionModule newTestDefinitions)
	{
		if (newTestDefinitions != testDefinitions)
		{
			NotificationChain msgs = null;
			if (testDefinitions != null)
				msgs = ((InternalEObject)testDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_DEFINITIONS, null, msgs);
			if (newTestDefinitions != null)
				msgs = ((InternalEObject)newTestDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_DEFINITIONS, null, msgs);
			msgs = basicSetTestDefinitions(newTestDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_DEFINITIONS, newTestDefinitions, newTestDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SMCubesTestModule getTests()
	{
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTests(SMCubesTestModule newTests, NotificationChain msgs)
	{
		SMCubesTestModule oldTests = tests;
		tests = newTests;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CocamoPackage.SM_CUBES_STATIC_MODEL__TESTS, oldTests, newTests);
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
	public void setTests(SMCubesTestModule newTests)
	{
		if (newTests != tests)
		{
			NotificationChain msgs = null;
			if (tests != null)
				msgs = ((InternalEObject)tests).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CocamoPackage.SM_CUBES_STATIC_MODEL__TESTS, null, msgs);
			if (newTests != null)
				msgs = ((InternalEObject)newTests).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CocamoPackage.SM_CUBES_STATIC_MODEL__TESTS, null, msgs);
			msgs = basicSetTests(newTests, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocamoPackage.SM_CUBES_STATIC_MODEL__TESTS, newTests, newTests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestTemplateModule getTestTemplates()
	{
		return testTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestTemplates(TestTemplateModule newTestTemplates, NotificationChain msgs)
	{
		TestTemplateModule oldTestTemplates = testTemplates;
		testTemplates = newTestTemplates;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_TEMPLATES, oldTestTemplates, newTestTemplates);
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
	public void setTestTemplates(TestTemplateModule newTestTemplates)
	{
		if (newTestTemplates != testTemplates)
		{
			NotificationChain msgs = null;
			if (testTemplates != null)
				msgs = ((InternalEObject)testTemplates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_TEMPLATES, null, msgs);
			if (newTestTemplates != null)
				msgs = ((InternalEObject)newTestTemplates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_TEMPLATES, null, msgs);
			msgs = basicSetTestTemplates(newTestTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_TEMPLATES, newTestTemplates, newTestTemplates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestContraints getTestConstriants()
	{
		return testConstriants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestConstriants(TestContraints newTestConstriants, NotificationChain msgs)
	{
		TestContraints oldTestConstriants = testConstriants;
		testConstriants = newTestConstriants;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_CONSTRIANTS, oldTestConstriants, newTestConstriants);
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
	public void setTestConstriants(TestContraints newTestConstriants)
	{
		if (newTestConstriants != testConstriants)
		{
			NotificationChain msgs = null;
			if (testConstriants != null)
				msgs = ((InternalEObject)testConstriants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_CONSTRIANTS, null, msgs);
			if (newTestConstriants != null)
				msgs = ((InternalEObject)newTestConstriants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_CONSTRIANTS, null, msgs);
			msgs = basicSetTestConstriants(newTestConstriants, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_CONSTRIANTS, newTestConstriants, newTestConstriants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalityModuleModule getFunctionalityModules()
	{
		return functionalityModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalityModules(FunctionalityModuleModule newFunctionalityModules, NotificationChain msgs)
	{
		FunctionalityModuleModule oldFunctionalityModules = functionalityModules;
		functionalityModules = newFunctionalityModules;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CocamoPackage.SM_CUBES_STATIC_MODEL__FUNCTIONALITY_MODULES, oldFunctionalityModules, newFunctionalityModules);
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
	public void setFunctionalityModules(FunctionalityModuleModule newFunctionalityModules)
	{
		if (newFunctionalityModules != functionalityModules)
		{
			NotificationChain msgs = null;
			if (functionalityModules != null)
				msgs = ((InternalEObject)functionalityModules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CocamoPackage.SM_CUBES_STATIC_MODEL__FUNCTIONALITY_MODULES, null, msgs);
			if (newFunctionalityModules != null)
				msgs = ((InternalEObject)newFunctionalityModules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CocamoPackage.SM_CUBES_STATIC_MODEL__FUNCTIONALITY_MODULES, null, msgs);
			msgs = basicSetFunctionalityModules(newFunctionalityModules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CocamoPackage.SM_CUBES_STATIC_MODEL__FUNCTIONALITY_MODULES, newFunctionalityModules, newFunctionalityModules));
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
			case CocamoPackage.SM_CUBES_STATIC_MODEL__SM_CUBES_MODEL:
				return basicSetSmCubesModel(null, msgs);
			case CocamoPackage.SM_CUBES_STATIC_MODEL__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_DEFINITIONS:
				return basicSetTestDefinitions(null, msgs);
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TESTS:
				return basicSetTests(null, msgs);
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_TEMPLATES:
				return basicSetTestTemplates(null, msgs);
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_CONSTRIANTS:
				return basicSetTestConstriants(null, msgs);
			case CocamoPackage.SM_CUBES_STATIC_MODEL__FUNCTIONALITY_MODULES:
				return basicSetFunctionalityModules(null, msgs);
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
			case CocamoPackage.SM_CUBES_STATIC_MODEL__SM_CUBES_MODEL:
				return getSmCubesModel();
			case CocamoPackage.SM_CUBES_STATIC_MODEL__REQUIREMENTS:
				return getRequirements();
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_DEFINITIONS:
				return getTestDefinitions();
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TESTS:
				return getTests();
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_TEMPLATES:
				return getTestTemplates();
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_CONSTRIANTS:
				return getTestConstriants();
			case CocamoPackage.SM_CUBES_STATIC_MODEL__FUNCTIONALITY_MODULES:
				return getFunctionalityModules();
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
			case CocamoPackage.SM_CUBES_STATIC_MODEL__SM_CUBES_MODEL:
				setSmCubesModel((SmcubesModel)newValue);
				return;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__REQUIREMENTS:
				setRequirements((RequirementsModule)newValue);
				return;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_DEFINITIONS:
				setTestDefinitions((TestDefinitionModule)newValue);
				return;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TESTS:
				setTests((SMCubesTestModule)newValue);
				return;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_TEMPLATES:
				setTestTemplates((TestTemplateModule)newValue);
				return;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_CONSTRIANTS:
				setTestConstriants((TestContraints)newValue);
				return;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__FUNCTIONALITY_MODULES:
				setFunctionalityModules((FunctionalityModuleModule)newValue);
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
			case CocamoPackage.SM_CUBES_STATIC_MODEL__SM_CUBES_MODEL:
				setSmCubesModel((SmcubesModel)null);
				return;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__REQUIREMENTS:
				setRequirements((RequirementsModule)null);
				return;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_DEFINITIONS:
				setTestDefinitions((TestDefinitionModule)null);
				return;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TESTS:
				setTests((SMCubesTestModule)null);
				return;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_TEMPLATES:
				setTestTemplates((TestTemplateModule)null);
				return;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_CONSTRIANTS:
				setTestConstriants((TestContraints)null);
				return;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__FUNCTIONALITY_MODULES:
				setFunctionalityModules((FunctionalityModuleModule)null);
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
			case CocamoPackage.SM_CUBES_STATIC_MODEL__SM_CUBES_MODEL:
				return smCubesModel != null;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__REQUIREMENTS:
				return requirements != null;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_DEFINITIONS:
				return testDefinitions != null;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TESTS:
				return tests != null;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_TEMPLATES:
				return testTemplates != null;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__TEST_CONSTRIANTS:
				return testConstriants != null;
			case CocamoPackage.SM_CUBES_STATIC_MODEL__FUNCTIONALITY_MODULES:
				return functionalityModules != null;
		}
		return super.eIsSet(featureID);
	}

} //SMCubesStaticModelImpl
