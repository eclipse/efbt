/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl;

import java.util.Collection;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage;

import org.eclipse.efbt.lineage.common.model.advanced_variable_lineagefunctions.ResolvedStructColumnParameter;

import org.eclipse.efbt.lineage.common.model.column_transformation_logic.CubeColumn;
import org.eclipse.efbt.lineage.common.model.column_transformation_logic.ResolvedCubeColumnParameter;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row Creation Approach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachImpl#getDependantCubeColumns <em>Dependant Cube Columns</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachImpl#getCreatedCubeColumns <em>Created Cube Columns</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachImpl#getDependantStructItemColumns <em>Dependant Struct Item Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowCreationApproachImpl extends MinimalEObjectImpl.Container implements RowCreationApproach
{
	/**
	 * The cached value of the '{@link #getDependantCubeColumns() <em>Dependant Cube Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependantCubeColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<ResolvedCubeColumnParameter> dependantCubeColumns;

	/**
	 * The cached value of the '{@link #getCreatedCubeColumns() <em>Created Cube Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedCubeColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<CubeColumn> createdCubeColumns;

	/**
	 * The cached value of the '{@link #getDependantStructItemColumns() <em>Dependant Struct Item Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependantStructItemColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<ResolvedStructColumnParameter> dependantStructItemColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowCreationApproachImpl()
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
		return Row_transformation_logicPackage.Literals.ROW_CREATION_APPROACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResolvedCubeColumnParameter> getDependantCubeColumns()
	{
		if (dependantCubeColumns == null)
		{
			dependantCubeColumns = new EObjectContainmentEList<ResolvedCubeColumnParameter>(ResolvedCubeColumnParameter.class, this, Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS);
		}
		return dependantCubeColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CubeColumn> getCreatedCubeColumns()
	{
		if (createdCubeColumns == null)
		{
			createdCubeColumns = new EObjectContainmentEList<CubeColumn>(CubeColumn.class, this, Row_transformation_logicPackage.ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS);
		}
		return createdCubeColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResolvedStructColumnParameter> getDependantStructItemColumns()
	{
		if (dependantStructItemColumns == null)
		{
			dependantStructItemColumns = new EObjectContainmentEList<ResolvedStructColumnParameter>(ResolvedStructColumnParameter.class, this, Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS);
		}
		return dependantStructItemColumns;
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
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS:
				return ((InternalEList<?>)getDependantCubeColumns()).basicRemove(otherEnd, msgs);
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS:
				return ((InternalEList<?>)getCreatedCubeColumns()).basicRemove(otherEnd, msgs);
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS:
				return ((InternalEList<?>)getDependantStructItemColumns()).basicRemove(otherEnd, msgs);
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
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS:
				return getDependantCubeColumns();
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS:
				return getCreatedCubeColumns();
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS:
				return getDependantStructItemColumns();
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
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS:
				getDependantCubeColumns().clear();
				getDependantCubeColumns().addAll((Collection<? extends ResolvedCubeColumnParameter>)newValue);
				return;
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS:
				getCreatedCubeColumns().clear();
				getCreatedCubeColumns().addAll((Collection<? extends CubeColumn>)newValue);
				return;
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS:
				getDependantStructItemColumns().clear();
				getDependantStructItemColumns().addAll((Collection<? extends ResolvedStructColumnParameter>)newValue);
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
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS:
				getDependantCubeColumns().clear();
				return;
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS:
				getCreatedCubeColumns().clear();
				return;
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS:
				getDependantStructItemColumns().clear();
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
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS:
				return dependantCubeColumns != null && !dependantCubeColumns.isEmpty();
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS:
				return createdCubeColumns != null && !createdCubeColumns.isEmpty();
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS:
				return dependantStructItemColumns != null && !dependantStructItemColumns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RowCreationApproachImpl
