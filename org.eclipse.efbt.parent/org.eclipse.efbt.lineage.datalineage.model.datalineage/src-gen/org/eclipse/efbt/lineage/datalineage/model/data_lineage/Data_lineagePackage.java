/**
 */
package org.eclipse.efbt.lineage.datalineage.model.data_lineage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  This package describes the SpreadsheetLineageModel, SpreadsheetLineageModels store the actaul lineage between calculated results, and input data, with lineage recorded between all the intermediate datasets which may have been calculated to get to the final results.
 * 
 * <!-- end-model-doc -->
 * @see org.eclipse.efbt.lineage.datalineage.model.data_lineage.Data_lineageFactory
 * @model kind="package"
 *        annotation="license license='Copyright (c) 2020 Bird Software Solutions Ltd\n All rights reserved. This file and the accompanying materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v20.html\n\nSPDX-License-Identifier: EPL-2.0 \n\n Contributors:\n Neil Mackenzie - initial API and implementation\r'"
 * @generated
 */
public interface Data_lineagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data_lineage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/data_lineage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data_lineage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Data_lineagePackage eINSTANCE = org.eclipse.efbt.lineage.datalineage.model.data_lineage.impl.Data_lineagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.lineage.datalineage.model.data_lineage.impl.SpreadsheetLineageModelImpl <em>Spreadsheet Lineage Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.lineage.datalineage.model.data_lineage.impl.SpreadsheetLineageModelImpl
	 * @see org.eclipse.efbt.lineage.datalineage.model.data_lineage.impl.Data_lineagePackageImpl#getSpreadsheetLineageModel()
	 * @generated
	 */
	int SPREADSHEET_LINEAGE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Data Traceable By Cell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_LINEAGE_MODEL__DATA_TRACEABLE_BY_CELL = 0;

	/**
	 * The feature id for the '<em><b>Source Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_LINEAGE_MODEL__SOURCE_DATA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_LINEAGE_MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Spreadsheet Lineage Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_LINEAGE_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Spreadsheet Lineage Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_LINEAGE_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.lineage.datalineage.model.data_lineage.SpreadsheetLineageModel <em>Spreadsheet Lineage Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spreadsheet Lineage Model</em>'.
	 * @see org.eclipse.efbt.lineage.datalineage.model.data_lineage.SpreadsheetLineageModel
	 * @generated
	 */
	EClass getSpreadsheetLineageModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.lineage.datalineage.model.data_lineage.SpreadsheetLineageModel#getDataTraceableByCell <em>Data Traceable By Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Traceable By Cell</em>'.
	 * @see org.eclipse.efbt.lineage.datalineage.model.data_lineage.SpreadsheetLineageModel#getDataTraceableByCell()
	 * @see #getSpreadsheetLineageModel()
	 * @generated
	 */
	EReference getSpreadsheetLineageModel_DataTraceableByCell();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.lineage.datalineage.model.data_lineage.SpreadsheetLineageModel#getSourceData <em>Source Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Data</em>'.
	 * @see org.eclipse.efbt.lineage.datalineage.model.data_lineage.SpreadsheetLineageModel#getSourceData()
	 * @see #getSpreadsheetLineageModel()
	 * @generated
	 */
	EReference getSpreadsheetLineageModel_SourceData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.lineage.datalineage.model.data_lineage.SpreadsheetLineageModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.lineage.datalineage.model.data_lineage.SpreadsheetLineageModel#getName()
	 * @see #getSpreadsheetLineageModel()
	 * @generated
	 */
	EAttribute getSpreadsheetLineageModel_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Data_lineageFactory getData_lineageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.lineage.datalineage.model.data_lineage.impl.SpreadsheetLineageModelImpl <em>Spreadsheet Lineage Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.lineage.datalineage.model.data_lineage.impl.SpreadsheetLineageModelImpl
		 * @see org.eclipse.efbt.lineage.datalineage.model.data_lineage.impl.Data_lineagePackageImpl#getSpreadsheetLineageModel()
		 * @generated
		 */
		EClass SPREADSHEET_LINEAGE_MODEL = eINSTANCE.getSpreadsheetLineageModel();

		/**
		 * The meta object literal for the '<em><b>Data Traceable By Cell</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_LINEAGE_MODEL__DATA_TRACEABLE_BY_CELL = eINSTANCE.getSpreadsheetLineageModel_DataTraceableByCell();

		/**
		 * The meta object literal for the '<em><b>Source Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREADSHEET_LINEAGE_MODEL__SOURCE_DATA = eINSTANCE.getSpreadsheetLineageModel_SourceData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_LINEAGE_MODEL__NAME = eINSTANCE.getSpreadsheetLineageModel_Name();

	}

} //Data_lineagePackage
