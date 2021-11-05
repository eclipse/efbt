/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl;

import java.util.Collection;

import org.eclipse.efbt.cocalimo.core.model.module_management.impl.ModuleImpl;

import org.eclipse.efbt.cocalimo.smcubes.model.bpmn_lite.SubProcess;

import org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.LogicalTransformationModule;
import org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.Logical_transformationsPackage;
import org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.TaskTag;

import org.eclipse.efbt.cocalimo.smcubes.model.scenarios.ScenarioSetTag;
import org.eclipse.efbt.cocalimo.smcubes.model.scenarios.ScenarioTag;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Transformation Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.LogicalTransformationModuleImpl#getTaskTags <em>Task Tags</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.LogicalTransformationModuleImpl#getScenarioTags <em>Scenario Tags</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.LogicalTransformationModuleImpl#getScenarioSetTags <em>Scenario Set Tags</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.LogicalTransformationModuleImpl#getSubProcesses <em>Sub Processes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalTransformationModuleImpl extends ModuleImpl implements LogicalTransformationModule {
	/**
	 * The cached value of the '{@link #getTaskTags() <em>Task Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskTags()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskTag> taskTags;

	/**
	 * The cached value of the '{@link #getScenarioTags() <em>Scenario Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioTags()
	 * @generated
	 * @ordered
	 */
	protected EList<ScenarioTag> scenarioTags;

	/**
	 * The cached value of the '{@link #getScenarioSetTags() <em>Scenario Set Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioSetTags()
	 * @generated
	 * @ordered
	 */
	protected EList<ScenarioSetTag> scenarioSetTags;

	/**
	 * The cached value of the '{@link #getSubProcesses() <em>Sub Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<SubProcess> subProcesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalTransformationModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Logical_transformationsPackage.Literals.LOGICAL_TRANSFORMATION_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskTag> getTaskTags() {
		if (taskTags == null) {
			taskTags = new EObjectContainmentEList<TaskTag>(TaskTag.class, this, Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__TASK_TAGS);
		}
		return taskTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScenarioTag> getScenarioTags() {
		if (scenarioTags == null) {
			scenarioTags = new EObjectContainmentEList<ScenarioTag>(ScenarioTag.class, this, Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SCENARIO_TAGS);
		}
		return scenarioTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScenarioSetTag> getScenarioSetTags() {
		if (scenarioSetTags == null) {
			scenarioSetTags = new EObjectContainmentEList<ScenarioSetTag>(ScenarioSetTag.class, this, Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SCENARIO_SET_TAGS);
		}
		return scenarioSetTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubProcess> getSubProcesses() {
		if (subProcesses == null) {
			subProcesses = new EObjectContainmentEList<SubProcess>(SubProcess.class, this, Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SUB_PROCESSES);
		}
		return subProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__TASK_TAGS:
				return ((InternalEList<?>)getTaskTags()).basicRemove(otherEnd, msgs);
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SCENARIO_TAGS:
				return ((InternalEList<?>)getScenarioTags()).basicRemove(otherEnd, msgs);
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SCENARIO_SET_TAGS:
				return ((InternalEList<?>)getScenarioSetTags()).basicRemove(otherEnd, msgs);
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SUB_PROCESSES:
				return ((InternalEList<?>)getSubProcesses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__TASK_TAGS:
				return getTaskTags();
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SCENARIO_TAGS:
				return getScenarioTags();
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SCENARIO_SET_TAGS:
				return getScenarioSetTags();
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SUB_PROCESSES:
				return getSubProcesses();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__TASK_TAGS:
				getTaskTags().clear();
				getTaskTags().addAll((Collection<? extends TaskTag>)newValue);
				return;
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SCENARIO_TAGS:
				getScenarioTags().clear();
				getScenarioTags().addAll((Collection<? extends ScenarioTag>)newValue);
				return;
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SCENARIO_SET_TAGS:
				getScenarioSetTags().clear();
				getScenarioSetTags().addAll((Collection<? extends ScenarioSetTag>)newValue);
				return;
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SUB_PROCESSES:
				getSubProcesses().clear();
				getSubProcesses().addAll((Collection<? extends SubProcess>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__TASK_TAGS:
				getTaskTags().clear();
				return;
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SCENARIO_TAGS:
				getScenarioTags().clear();
				return;
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SCENARIO_SET_TAGS:
				getScenarioSetTags().clear();
				return;
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SUB_PROCESSES:
				getSubProcesses().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__TASK_TAGS:
				return taskTags != null && !taskTags.isEmpty();
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SCENARIO_TAGS:
				return scenarioTags != null && !scenarioTags.isEmpty();
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SCENARIO_SET_TAGS:
				return scenarioSetTags != null && !scenarioSetTags.isEmpty();
			case Logical_transformationsPackage.LOGICAL_TRANSFORMATION_MODULE__SUB_PROCESSES:
				return subProcesses != null && !subProcesses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalTransformationModuleImpl