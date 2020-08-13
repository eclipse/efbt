/**
 */
package org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.impl;

import org.eclipse.efbt.input_data.smcubes.model.column_structured_data.ColumnStructuredData;

import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.Cell_transformation_logicPackage;
import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.ColumnStructuredDataTag;

import org.eclipse.efbt.requirements.core.model.requirements_text.impl.TagImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Structured Data Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.impl.ColumnStructuredDataTagImpl#getColumnStructuredData <em>Column Structured Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnStructuredDataTagImpl extends TagImpl implements ColumnStructuredDataTag
{
	/**
	 * The cached value of the '{@link #getColumnStructuredData() <em>Column Structured Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnStructuredData()
	 * @generated
	 * @ordered
	 */
	protected ColumnStructuredData columnStructuredData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnStructuredDataTagImpl()
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
		return Cell_transformation_logicPackage.Literals.COLUMN_STRUCTURED_DATA_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnStructuredData getColumnStructuredData()
	{
		if (columnStructuredData != null && columnStructuredData.eIsProxy())
		{
			InternalEObject oldColumnStructuredData = (InternalEObject)columnStructuredData;
			columnStructuredData = (ColumnStructuredData)eResolveProxy(oldColumnStructuredData);
			if (columnStructuredData != oldColumnStructuredData)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cell_transformation_logicPackage.COLUMN_STRUCTURED_DATA_TAG__COLUMN_STRUCTURED_DATA, oldColumnStructuredData, columnStructuredData));
			}
		}
		return columnStructuredData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnStructuredData basicGetColumnStructuredData()
	{
		return columnStructuredData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnStructuredData(ColumnStructuredData newColumnStructuredData)
	{
		ColumnStructuredData oldColumnStructuredData = columnStructuredData;
		columnStructuredData = newColumnStructuredData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cell_transformation_logicPackage.COLUMN_STRUCTURED_DATA_TAG__COLUMN_STRUCTURED_DATA, oldColumnStructuredData, columnStructuredData));
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
			case Cell_transformation_logicPackage.COLUMN_STRUCTURED_DATA_TAG__COLUMN_STRUCTURED_DATA:
				if (resolve) return getColumnStructuredData();
				return basicGetColumnStructuredData();
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
			case Cell_transformation_logicPackage.COLUMN_STRUCTURED_DATA_TAG__COLUMN_STRUCTURED_DATA:
				setColumnStructuredData((ColumnStructuredData)newValue);
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
			case Cell_transformation_logicPackage.COLUMN_STRUCTURED_DATA_TAG__COLUMN_STRUCTURED_DATA:
				setColumnStructuredData((ColumnStructuredData)null);
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
			case Cell_transformation_logicPackage.COLUMN_STRUCTURED_DATA_TAG__COLUMN_STRUCTURED_DATA:
				return columnStructuredData != null;
		}
		return super.eIsSet(featureID);
	}

} //ColumnStructuredDataTagImpl
