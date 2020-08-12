/**
 */
package org.eclipse.efbt.chirp.chirp_program.impl;

import org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage;
import org.eclipse.efbt.chirp.chirp_program.Program;

import org.eclipse.efbt.data_structures.smcubes.model.smcubes_model.SmcubesModel;

import org.eclipse.efbt.functional_design.core.model.functionality_module.FunctionalityModuleModule;

import org.eclipse.efbt.requirements.core.model.requirements_text.RequirementsModule;

import org.eclipse.efbt.testing.common.model.test.TestModule;

import org.eclipse.efbt.testing.common.model.test_definition.TestContraints;
import org.eclipse.efbt.testing.common.model.test_definition.TestDefinitionModule;
import org.eclipse.efbt.testing.common.model.test_definition.TestTemplateModule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.impl.ProgramImpl#getSmCubesModel <em>Sm Cubes Model</em>}</li>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.impl.ProgramImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.impl.ProgramImpl#getTestDefinitions <em>Test Definitions</em>}</li>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.impl.ProgramImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.impl.ProgramImpl#getTestTemplates <em>Test Templates</em>}</li>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.impl.ProgramImpl#getTestConstriants <em>Test Constriants</em>}</li>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.impl.ProgramImpl#getFunctionalityModules <em>Functionality Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
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
	protected TestModule tests;

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
	protected ProgramImpl()
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
		return Chirp_programPackage.Literals.PROGRAM;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Chirp_programPackage.PROGRAM__SM_CUBES_MODEL, oldSmCubesModel, newSmCubesModel);
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
				msgs = ((InternalEObject)smCubesModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Chirp_programPackage.PROGRAM__SM_CUBES_MODEL, null, msgs);
			if (newSmCubesModel != null)
				msgs = ((InternalEObject)newSmCubesModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Chirp_programPackage.PROGRAM__SM_CUBES_MODEL, null, msgs);
			msgs = basicSetSmCubesModel(newSmCubesModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Chirp_programPackage.PROGRAM__SM_CUBES_MODEL, newSmCubesModel, newSmCubesModel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Chirp_programPackage.PROGRAM__REQUIREMENTS, oldRequirements, newRequirements);
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
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Chirp_programPackage.PROGRAM__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Chirp_programPackage.PROGRAM__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Chirp_programPackage.PROGRAM__REQUIREMENTS, newRequirements, newRequirements));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Chirp_programPackage.PROGRAM__TEST_DEFINITIONS, oldTestDefinitions, newTestDefinitions);
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
				msgs = ((InternalEObject)testDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Chirp_programPackage.PROGRAM__TEST_DEFINITIONS, null, msgs);
			if (newTestDefinitions != null)
				msgs = ((InternalEObject)newTestDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Chirp_programPackage.PROGRAM__TEST_DEFINITIONS, null, msgs);
			msgs = basicSetTestDefinitions(newTestDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Chirp_programPackage.PROGRAM__TEST_DEFINITIONS, newTestDefinitions, newTestDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestModule getTests()
	{
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTests(TestModule newTests, NotificationChain msgs)
	{
		TestModule oldTests = tests;
		tests = newTests;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Chirp_programPackage.PROGRAM__TESTS, oldTests, newTests);
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
	public void setTests(TestModule newTests)
	{
		if (newTests != tests)
		{
			NotificationChain msgs = null;
			if (tests != null)
				msgs = ((InternalEObject)tests).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Chirp_programPackage.PROGRAM__TESTS, null, msgs);
			if (newTests != null)
				msgs = ((InternalEObject)newTests).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Chirp_programPackage.PROGRAM__TESTS, null, msgs);
			msgs = basicSetTests(newTests, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Chirp_programPackage.PROGRAM__TESTS, newTests, newTests));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Chirp_programPackage.PROGRAM__TEST_TEMPLATES, oldTestTemplates, newTestTemplates);
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
				msgs = ((InternalEObject)testTemplates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Chirp_programPackage.PROGRAM__TEST_TEMPLATES, null, msgs);
			if (newTestTemplates != null)
				msgs = ((InternalEObject)newTestTemplates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Chirp_programPackage.PROGRAM__TEST_TEMPLATES, null, msgs);
			msgs = basicSetTestTemplates(newTestTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Chirp_programPackage.PROGRAM__TEST_TEMPLATES, newTestTemplates, newTestTemplates));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Chirp_programPackage.PROGRAM__TEST_CONSTRIANTS, oldTestConstriants, newTestConstriants);
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
				msgs = ((InternalEObject)testConstriants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Chirp_programPackage.PROGRAM__TEST_CONSTRIANTS, null, msgs);
			if (newTestConstriants != null)
				msgs = ((InternalEObject)newTestConstriants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Chirp_programPackage.PROGRAM__TEST_CONSTRIANTS, null, msgs);
			msgs = basicSetTestConstriants(newTestConstriants, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Chirp_programPackage.PROGRAM__TEST_CONSTRIANTS, newTestConstriants, newTestConstriants));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Chirp_programPackage.PROGRAM__FUNCTIONALITY_MODULES, oldFunctionalityModules, newFunctionalityModules);
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
				msgs = ((InternalEObject)functionalityModules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Chirp_programPackage.PROGRAM__FUNCTIONALITY_MODULES, null, msgs);
			if (newFunctionalityModules != null)
				msgs = ((InternalEObject)newFunctionalityModules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Chirp_programPackage.PROGRAM__FUNCTIONALITY_MODULES, null, msgs);
			msgs = basicSetFunctionalityModules(newFunctionalityModules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Chirp_programPackage.PROGRAM__FUNCTIONALITY_MODULES, newFunctionalityModules, newFunctionalityModules));
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
			case Chirp_programPackage.PROGRAM__SM_CUBES_MODEL:
				return basicSetSmCubesModel(null, msgs);
			case Chirp_programPackage.PROGRAM__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case Chirp_programPackage.PROGRAM__TEST_DEFINITIONS:
				return basicSetTestDefinitions(null, msgs);
			case Chirp_programPackage.PROGRAM__TESTS:
				return basicSetTests(null, msgs);
			case Chirp_programPackage.PROGRAM__TEST_TEMPLATES:
				return basicSetTestTemplates(null, msgs);
			case Chirp_programPackage.PROGRAM__TEST_CONSTRIANTS:
				return basicSetTestConstriants(null, msgs);
			case Chirp_programPackage.PROGRAM__FUNCTIONALITY_MODULES:
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
			case Chirp_programPackage.PROGRAM__SM_CUBES_MODEL:
				return getSmCubesModel();
			case Chirp_programPackage.PROGRAM__REQUIREMENTS:
				return getRequirements();
			case Chirp_programPackage.PROGRAM__TEST_DEFINITIONS:
				return getTestDefinitions();
			case Chirp_programPackage.PROGRAM__TESTS:
				return getTests();
			case Chirp_programPackage.PROGRAM__TEST_TEMPLATES:
				return getTestTemplates();
			case Chirp_programPackage.PROGRAM__TEST_CONSTRIANTS:
				return getTestConstriants();
			case Chirp_programPackage.PROGRAM__FUNCTIONALITY_MODULES:
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
			case Chirp_programPackage.PROGRAM__SM_CUBES_MODEL:
				setSmCubesModel((SmcubesModel)newValue);
				return;
			case Chirp_programPackage.PROGRAM__REQUIREMENTS:
				setRequirements((RequirementsModule)newValue);
				return;
			case Chirp_programPackage.PROGRAM__TEST_DEFINITIONS:
				setTestDefinitions((TestDefinitionModule)newValue);
				return;
			case Chirp_programPackage.PROGRAM__TESTS:
				setTests((TestModule)newValue);
				return;
			case Chirp_programPackage.PROGRAM__TEST_TEMPLATES:
				setTestTemplates((TestTemplateModule)newValue);
				return;
			case Chirp_programPackage.PROGRAM__TEST_CONSTRIANTS:
				setTestConstriants((TestContraints)newValue);
				return;
			case Chirp_programPackage.PROGRAM__FUNCTIONALITY_MODULES:
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
			case Chirp_programPackage.PROGRAM__SM_CUBES_MODEL:
				setSmCubesModel((SmcubesModel)null);
				return;
			case Chirp_programPackage.PROGRAM__REQUIREMENTS:
				setRequirements((RequirementsModule)null);
				return;
			case Chirp_programPackage.PROGRAM__TEST_DEFINITIONS:
				setTestDefinitions((TestDefinitionModule)null);
				return;
			case Chirp_programPackage.PROGRAM__TESTS:
				setTests((TestModule)null);
				return;
			case Chirp_programPackage.PROGRAM__TEST_TEMPLATES:
				setTestTemplates((TestTemplateModule)null);
				return;
			case Chirp_programPackage.PROGRAM__TEST_CONSTRIANTS:
				setTestConstriants((TestContraints)null);
				return;
			case Chirp_programPackage.PROGRAM__FUNCTIONALITY_MODULES:
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
			case Chirp_programPackage.PROGRAM__SM_CUBES_MODEL:
				return smCubesModel != null;
			case Chirp_programPackage.PROGRAM__REQUIREMENTS:
				return requirements != null;
			case Chirp_programPackage.PROGRAM__TEST_DEFINITIONS:
				return testDefinitions != null;
			case Chirp_programPackage.PROGRAM__TESTS:
				return tests != null;
			case Chirp_programPackage.PROGRAM__TEST_TEMPLATES:
				return testTemplates != null;
			case Chirp_programPackage.PROGRAM__TEST_CONSTRIANTS:
				return testConstriants != null;
			case Chirp_programPackage.PROGRAM__FUNCTIONALITY_MODULES:
				return functionalityModules != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl
