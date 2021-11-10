/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.cocalimo_smcubes_extension.impl;

import java.util.Collection;

import org.eclipse.efbt.cocalimo.core.model.module_management.impl.ModuleImpl;

import org.eclipse.efbt.cocalimo.smcubes.model.cocalimo_smcubes_extension.Cocalimo_smcubes_extensionPackage;
import org.eclipse.efbt.cocalimo.smcubes.model.cocalimo_smcubes_extension.CubeModule;

import org.eclipse.efbt.cocalimo.smcubes.model.data_definition.CUBE;
import org.eclipse.efbt.cocalimo.smcubes.model.data_definition.CUBE_STRUCTURE;
import org.eclipse.efbt.cocalimo.smcubes.model.data_definition.CUBE_STRUCTURE_ITEM;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cube Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocalimo.smcubes.model.cocalimo_smcubes_extension.impl.CubeModuleImpl#getCubes <em>Cubes</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.smcubes.model.cocalimo_smcubes_extension.impl.CubeModuleImpl#getCubeStructures <em>Cube Structures</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.smcubes.model.cocalimo_smcubes_extension.impl.CubeModuleImpl#getCubeStructureItems <em>Cube Structure Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CubeModuleImpl extends ModuleImpl implements CubeModule {
	/**
	 * The cached value of the '{@link #getCubes() <em>Cubes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubes()
	 * @generated
	 * @ordered
	 */
	protected EList<CUBE> cubes;

	/**
	 * The cached value of the '{@link #getCubeStructures() <em>Cube Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<CUBE_STRUCTURE> cubeStructures;

	/**
	 * The cached value of the '{@link #getCubeStructureItems() <em>Cube Structure Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeStructureItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CUBE_STRUCTURE_ITEM> cubeStructureItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CubeModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cocalimo_smcubes_extensionPackage.Literals.CUBE_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CUBE> getCubes() {
		if (cubes == null) {
			cubes = new EObjectContainmentEList<CUBE>(CUBE.class, this, Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBES);
		}
		return cubes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CUBE_STRUCTURE> getCubeStructures() {
		if (cubeStructures == null) {
			cubeStructures = new EObjectContainmentEList<CUBE_STRUCTURE>(CUBE_STRUCTURE.class, this, Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBE_STRUCTURES);
		}
		return cubeStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CUBE_STRUCTURE_ITEM> getCubeStructureItems() {
		if (cubeStructureItems == null) {
			cubeStructureItems = new EObjectContainmentEList<CUBE_STRUCTURE_ITEM>(CUBE_STRUCTURE_ITEM.class, this, Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBE_STRUCTURE_ITEMS);
		}
		return cubeStructureItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBES:
				return ((InternalEList<?>)getCubes()).basicRemove(otherEnd, msgs);
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBE_STRUCTURES:
				return ((InternalEList<?>)getCubeStructures()).basicRemove(otherEnd, msgs);
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBE_STRUCTURE_ITEMS:
				return ((InternalEList<?>)getCubeStructureItems()).basicRemove(otherEnd, msgs);
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
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBES:
				return getCubes();
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBE_STRUCTURES:
				return getCubeStructures();
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBE_STRUCTURE_ITEMS:
				return getCubeStructureItems();
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
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBES:
				getCubes().clear();
				getCubes().addAll((Collection<? extends CUBE>)newValue);
				return;
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBE_STRUCTURES:
				getCubeStructures().clear();
				getCubeStructures().addAll((Collection<? extends CUBE_STRUCTURE>)newValue);
				return;
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBE_STRUCTURE_ITEMS:
				getCubeStructureItems().clear();
				getCubeStructureItems().addAll((Collection<? extends CUBE_STRUCTURE_ITEM>)newValue);
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
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBES:
				getCubes().clear();
				return;
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBE_STRUCTURES:
				getCubeStructures().clear();
				return;
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBE_STRUCTURE_ITEMS:
				getCubeStructureItems().clear();
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
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBES:
				return cubes != null && !cubes.isEmpty();
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBE_STRUCTURES:
				return cubeStructures != null && !cubeStructures.isEmpty();
			case Cocalimo_smcubes_extensionPackage.CUBE_MODULE__CUBE_STRUCTURE_ITEMS:
				return cubeStructureItems != null && !cubeStructureItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CubeModuleImpl