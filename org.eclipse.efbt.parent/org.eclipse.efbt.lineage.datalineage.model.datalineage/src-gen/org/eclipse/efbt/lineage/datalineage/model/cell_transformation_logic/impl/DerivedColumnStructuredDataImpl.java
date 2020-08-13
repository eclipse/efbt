/**
 */
package org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.impl;

import java.util.Collection;

import org.eclipse.efbt.input_data.smcubes.model.column_structured_data.ColumnStructuredData;

import org.eclipse.efbt.input_data.smcubes.model.column_structured_data.impl.ColumnStructuredDataImpl;

import org.eclipse.efbt.lineage.common.model.cubes.FreeBirdToolsCube;

import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.Cell_transformation_logicPackage;
import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.DerivedColumnStructuredData;
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
 * An implementation of the model object '<em><b>Derived Column Structured Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.impl.DerivedColumnStructuredDataImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.impl.DerivedColumnStructuredDataImpl#getCube <em>Cube</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.impl.DerivedColumnStructuredDataImpl#getSourceColumnStructuredData <em>Source Column Structured Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedColumnStructuredDataImpl extends ColumnStructuredDataImpl implements DerivedColumnStructuredData
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
	protected FreeBirdToolsCube cube;

	/**
	 * The cached value of the '{@link #getSourceColumnStructuredData() <em>Source Column Structured Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumnStructuredData()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnStructuredData> sourceColumnStructuredData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedColumnStructuredDataImpl()
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
		return Cell_transformation_logicPackage.Literals.DERIVED_COLUMN_STRUCTURED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DerivedRowData> getRows()
	{
		if (rows == null)
		{
			rows = new EObjectContainmentEList<DerivedRowData>(DerivedRowData.class, this, Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__ROWS);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreeBirdToolsCube getCube()
	{
		if (cube != null && cube.eIsProxy())
		{
			InternalEObject oldCube = (InternalEObject)cube;
			cube = (FreeBirdToolsCube)eResolveProxy(oldCube);
			if (cube != oldCube)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__CUBE, oldCube, cube));
			}
		}
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeBirdToolsCube basicGetCube()
	{
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCube(FreeBirdToolsCube newCube)
	{
		FreeBirdToolsCube oldCube = cube;
		cube = newCube;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__CUBE, oldCube, cube));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ColumnStructuredData> getSourceColumnStructuredData()
	{
		if (sourceColumnStructuredData == null)
		{
			sourceColumnStructuredData = new EObjectResolvingEList<ColumnStructuredData>(ColumnStructuredData.class, this, Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__SOURCE_COLUMN_STRUCTURED_DATA);
		}
		return sourceColumnStructuredData;
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
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__ROWS:
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
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__ROWS:
				return getRows();
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__CUBE:
				if (resolve) return getCube();
				return basicGetCube();
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__SOURCE_COLUMN_STRUCTURED_DATA:
				return getSourceColumnStructuredData();
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
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends DerivedRowData>)newValue);
				return;
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__CUBE:
				setCube((FreeBirdToolsCube)newValue);
				return;
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__SOURCE_COLUMN_STRUCTURED_DATA:
				getSourceColumnStructuredData().clear();
				getSourceColumnStructuredData().addAll((Collection<? extends ColumnStructuredData>)newValue);
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
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__ROWS:
				getRows().clear();
				return;
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__CUBE:
				setCube((FreeBirdToolsCube)null);
				return;
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__SOURCE_COLUMN_STRUCTURED_DATA:
				getSourceColumnStructuredData().clear();
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
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__ROWS:
				return rows != null && !rows.isEmpty();
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__CUBE:
				return cube != null;
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA__SOURCE_COLUMN_STRUCTURED_DATA:
				return sourceColumnStructuredData != null && !sourceColumnStructuredData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DerivedColumnStructuredDataImpl
