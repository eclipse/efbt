/**
 */
package org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.impl;

import java.util.Collection;

import org.eclipse.efbt.cocamo.smcubes.model.column_structured_data.ColumnStructuredData;

import org.eclipse.efbt.cocamo.smcubes.model.column_structured_data.impl.ColumnStructuredDataImpl;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproachForCube;

import org.eclipse.efbt.lineage.common.model.lineagecubes.cubes.DerivedCube;

import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.Cell_transformation_logicPackage;
import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.DerivedCubeData;
import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.DerivedRowData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Cube Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.impl.DerivedCubeDataImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.impl.DerivedCubeDataImpl#getCube <em>Cube</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.impl.DerivedCubeDataImpl#getRowCreationApproachForCube <em>Row Creation Approach For Cube</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.impl.DerivedCubeDataImpl#getSourceCubeData <em>Source Cube Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedCubeDataImpl extends ColumnStructuredDataImpl implements DerivedCubeData
{
	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<DerivedRowData> rows;

	/**
	 * The cached value of the '{@link #getCube() <em>Cube</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCube()
	 * @generated
	 * @ordered
	 */
	protected DerivedCube cube;

	/**
	 * The cached value of the '{@link #getRowCreationApproachForCube() <em>Row Creation Approach For Cube</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowCreationApproachForCube()
	 * @generated
	 * @ordered
	 */
	protected RowCreationApproachForCube rowCreationApproachForCube;

	/**
	 * The cached value of the '{@link #getSourceCubeData() <em>Source Cube Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCubeData()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnStructuredData> sourceCubeData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedCubeDataImpl()
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
		return Cell_transformation_logicPackage.Literals.DERIVED_CUBE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DerivedRowData> getRows()
	{
		if (rows == null)
		{
			rows = new EObjectContainmentEList<DerivedRowData>(DerivedRowData.class, this, Cell_transformation_logicPackage.DERIVED_CUBE_DATA__ROWS);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedCube getCube()
	{
		if (cube != null && cube.eIsProxy())
		{
			InternalEObject oldCube = (InternalEObject)cube;
			cube = (DerivedCube)eResolveProxy(oldCube);
			if (cube != oldCube)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cell_transformation_logicPackage.DERIVED_CUBE_DATA__CUBE, oldCube, cube));
			}
		}
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedCube basicGetCube()
	{
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCube(DerivedCube newCube)
	{
		DerivedCube oldCube = cube;
		cube = newCube;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cell_transformation_logicPackage.DERIVED_CUBE_DATA__CUBE, oldCube, cube));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowCreationApproachForCube getRowCreationApproachForCube()
	{
		if (rowCreationApproachForCube != null && rowCreationApproachForCube.eIsProxy())
		{
			InternalEObject oldRowCreationApproachForCube = (InternalEObject)rowCreationApproachForCube;
			rowCreationApproachForCube = (RowCreationApproachForCube)eResolveProxy(oldRowCreationApproachForCube);
			if (rowCreationApproachForCube != oldRowCreationApproachForCube)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cell_transformation_logicPackage.DERIVED_CUBE_DATA__ROW_CREATION_APPROACH_FOR_CUBE, oldRowCreationApproachForCube, rowCreationApproachForCube));
			}
		}
		return rowCreationApproachForCube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowCreationApproachForCube basicGetRowCreationApproachForCube()
	{
		return rowCreationApproachForCube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowCreationApproachForCube(RowCreationApproachForCube newRowCreationApproachForCube)
	{
		RowCreationApproachForCube oldRowCreationApproachForCube = rowCreationApproachForCube;
		rowCreationApproachForCube = newRowCreationApproachForCube;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cell_transformation_logicPackage.DERIVED_CUBE_DATA__ROW_CREATION_APPROACH_FOR_CUBE, oldRowCreationApproachForCube, rowCreationApproachForCube));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnStructuredData> getSourceCubeData()
	{
		if (sourceCubeData == null)
		{
			sourceCubeData = new EObjectResolvingEList<ColumnStructuredData>(ColumnStructuredData.class, this, Cell_transformation_logicPackage.DERIVED_CUBE_DATA__SOURCE_CUBE_DATA);
		}
		return sourceCubeData;
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
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
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
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__ROWS:
				return getRows();
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__CUBE:
				if (resolve) return getCube();
				return basicGetCube();
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__ROW_CREATION_APPROACH_FOR_CUBE:
				if (resolve) return getRowCreationApproachForCube();
				return basicGetRowCreationApproachForCube();
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__SOURCE_CUBE_DATA:
				return getSourceCubeData();
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
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends DerivedRowData>)newValue);
				return;
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__CUBE:
				setCube((DerivedCube)newValue);
				return;
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__ROW_CREATION_APPROACH_FOR_CUBE:
				setRowCreationApproachForCube((RowCreationApproachForCube)newValue);
				return;
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__SOURCE_CUBE_DATA:
				getSourceCubeData().clear();
				getSourceCubeData().addAll((Collection<? extends ColumnStructuredData>)newValue);
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
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__ROWS:
				getRows().clear();
				return;
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__CUBE:
				setCube((DerivedCube)null);
				return;
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__ROW_CREATION_APPROACH_FOR_CUBE:
				setRowCreationApproachForCube((RowCreationApproachForCube)null);
				return;
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__SOURCE_CUBE_DATA:
				getSourceCubeData().clear();
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
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__ROWS:
				return rows != null && !rows.isEmpty();
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__CUBE:
				return cube != null;
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__ROW_CREATION_APPROACH_FOR_CUBE:
				return rowCreationApproachForCube != null;
			case Cell_transformation_logicPackage.DERIVED_CUBE_DATA__SOURCE_CUBE_DATA:
				return sourceCubeData != null && !sourceCubeData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DerivedCubeDataImpl
