/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl;

import java.util.Collection;

import org.eclipse.efbt.cocamo.smcubes.model.core.VARIABLE;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.GroupByRowCreationApproach;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage;

import org.eclipse.efbt.lineage.common.model.column_transformation_logic.CubeColumn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group By Row Creation Approach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.GroupByRowCreationApproachImpl#getGroupByColumns <em>Group By Columns</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.GroupByRowCreationApproachImpl#getGroupByCubeColumns <em>Group By Cube Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupByRowCreationApproachImpl extends RowCreationApproachImpl implements GroupByRowCreationApproach
{
	/**
	 * The cached value of the '{@link #getGroupByColumns() <em>Group By Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupByColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<VARIABLE> groupByColumns;

	/**
	 * The cached value of the '{@link #getGroupByCubeColumns() <em>Group By Cube Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupByCubeColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<CubeColumn> groupByCubeColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupByRowCreationApproachImpl()
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
		return Row_transformation_logicPackage.Literals.GROUP_BY_ROW_CREATION_APPROACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VARIABLE> getGroupByColumns()
	{
		if (groupByColumns == null)
		{
			groupByColumns = new EObjectResolvingEList<VARIABLE>(VARIABLE.class, this, Row_transformation_logicPackage.GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_COLUMNS);
		}
		return groupByColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CubeColumn> getGroupByCubeColumns()
	{
		if (groupByCubeColumns == null)
		{
			groupByCubeColumns = new EObjectResolvingEList<CubeColumn>(CubeColumn.class, this, Row_transformation_logicPackage.GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_CUBE_COLUMNS);
		}
		return groupByCubeColumns;
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
			case Row_transformation_logicPackage.GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_COLUMNS:
				return getGroupByColumns();
			case Row_transformation_logicPackage.GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_CUBE_COLUMNS:
				return getGroupByCubeColumns();
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
			case Row_transformation_logicPackage.GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_COLUMNS:
				getGroupByColumns().clear();
				getGroupByColumns().addAll((Collection<? extends VARIABLE>)newValue);
				return;
			case Row_transformation_logicPackage.GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_CUBE_COLUMNS:
				getGroupByCubeColumns().clear();
				getGroupByCubeColumns().addAll((Collection<? extends CubeColumn>)newValue);
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
			case Row_transformation_logicPackage.GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_COLUMNS:
				getGroupByColumns().clear();
				return;
			case Row_transformation_logicPackage.GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_CUBE_COLUMNS:
				getGroupByCubeColumns().clear();
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
			case Row_transformation_logicPackage.GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_COLUMNS:
				return groupByColumns != null && !groupByColumns.isEmpty();
			case Row_transformation_logicPackage.GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_CUBE_COLUMNS:
				return groupByCubeColumns != null && !groupByCubeColumns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupByRowCreationApproachImpl
