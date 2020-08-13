/**
 */
package org.eclipse.efbt.lineage.datalineage.model.data_lineage.impl;

import java.util.Collection;

import org.eclipse.efbt.input_data.smcubes.model.base_column_structured_data.BaseColumnStructuredData;

import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.DerivedColumnStructuredData;

import org.eclipse.efbt.lineage.datalineage.model.data_lineage.Data_lineagePackage;
import org.eclipse.efbt.lineage.datalineage.model.data_lineage.SpreadsheetLineageModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spreadsheet Lineage Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.data_lineage.impl.SpreadsheetLineageModelImpl#getDataTraceableByCell <em>Data Traceable By Cell</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.data_lineage.impl.SpreadsheetLineageModelImpl#getSourceData <em>Source Data</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.data_lineage.impl.SpreadsheetLineageModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpreadsheetLineageModelImpl extends MinimalEObjectImpl.Container implements SpreadsheetLineageModel
{
	/**
	 * The cached value of the '{@link #getDataTraceableByCell() <em>Data Traceable By Cell</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTraceableByCell()
	 * @generated
	 * @ordered
	 */
	protected EList<DerivedColumnStructuredData> dataTraceableByCell;

	/**
	 * The cached value of the '{@link #getSourceData() <em>Source Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceData()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseColumnStructuredData> sourceData;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpreadsheetLineageModelImpl()
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
		return Data_lineagePackage.Literals.SPREADSHEET_LINEAGE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DerivedColumnStructuredData> getDataTraceableByCell()
	{
		if (dataTraceableByCell == null)
		{
			dataTraceableByCell = new EObjectContainmentEList<DerivedColumnStructuredData>(DerivedColumnStructuredData.class, this, Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__DATA_TRACEABLE_BY_CELL);
		}
		return dataTraceableByCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseColumnStructuredData> getSourceData()
	{
		if (sourceData == null)
		{
			sourceData = new EObjectContainmentEList<BaseColumnStructuredData>(BaseColumnStructuredData.class, this, Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__SOURCE_DATA);
		}
		return sourceData;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__NAME, oldName, name));
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
			case Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__DATA_TRACEABLE_BY_CELL:
				return ((InternalEList<?>)getDataTraceableByCell()).basicRemove(otherEnd, msgs);
			case Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__SOURCE_DATA:
				return ((InternalEList<?>)getSourceData()).basicRemove(otherEnd, msgs);
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
			case Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__DATA_TRACEABLE_BY_CELL:
				return getDataTraceableByCell();
			case Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__SOURCE_DATA:
				return getSourceData();
			case Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__NAME:
				return getName();
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
			case Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__DATA_TRACEABLE_BY_CELL:
				getDataTraceableByCell().clear();
				getDataTraceableByCell().addAll((Collection<? extends DerivedColumnStructuredData>)newValue);
				return;
			case Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__SOURCE_DATA:
				getSourceData().clear();
				getSourceData().addAll((Collection<? extends BaseColumnStructuredData>)newValue);
				return;
			case Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__NAME:
				setName((String)newValue);
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
			case Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__DATA_TRACEABLE_BY_CELL:
				getDataTraceableByCell().clear();
				return;
			case Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__SOURCE_DATA:
				getSourceData().clear();
				return;
			case Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__NAME:
				setName(NAME_EDEFAULT);
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
			case Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__DATA_TRACEABLE_BY_CELL:
				return dataTraceableByCell != null && !dataTraceableByCell.isEmpty();
			case Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__SOURCE_DATA:
				return sourceData != null && !sourceData.isEmpty();
			case Data_lineagePackage.SPREADSHEET_LINEAGE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //SpreadsheetLineageModelImpl
