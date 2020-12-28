/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage;

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
 * This package describes the classes for RowCreationApproaches which are used for incremental processing.
 *   
 * <!-- end-model-doc -->
 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.Incremental_row_transformation_logicFactory
 * @model kind="package"
 *        annotation="license license='Copyright (c) 2020 Bird Software Solutions Ltd\n All rights reserved. This file and the accompanying materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v20.html\n\nSPDX-License-Identifier: EPL-2.0 \n\n Contributors:\n Neil Mackenzie - initial API and implementation\r'"
 * @generated
 */
public interface Incremental_row_transformation_logicPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "incremental_row_transformation_logic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/efbt/incremental_row_transformation_logic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "incremental_row_transformation_logic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Incremental_row_transformation_logicPackage eINSTANCE = org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.Incremental_row_transformation_logicPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.BaseViewIncorporatingDeltasRowFunctionImpl <em>Base View Incorporating Deltas Row Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.BaseViewIncorporatingDeltasRowFunctionImpl
	 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.Incremental_row_transformation_logicPackageImpl#getBaseViewIncorporatingDeltasRowFunction()
	 * @generated
	 */
	int BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Dependant Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION__DEPENDANT_CUBE_COLUMNS = Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Created Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION__CREATED_CUBE_COLUMNS = Row_transformation_logicPackage.ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Dependant Struct Item Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION__DEPENDANT_STRUCT_ITEM_COLUMNS = Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS;

	/**
	 * The feature id for the '<em><b>Ultimate Cube Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE = Row_transformation_logicPackage.ROW_CREATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base View Incorporating Deltas Row Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION_FEATURE_COUNT = Row_transformation_logicPackage.ROW_CREATION_APPROACH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base View Incorporating Deltas Row Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION_OPERATION_COUNT = Row_transformation_logicPackage.ROW_CREATION_APPROACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.DeltaAccumulationRowFunctionImpl <em>Delta Accumulation Row Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.DeltaAccumulationRowFunctionImpl
	 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.Incremental_row_transformation_logicPackageImpl#getDeltaAccumulationRowFunction()
	 * @generated
	 */
	int DELTA_ACCUMULATION_ROW_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Dependant Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_ACCUMULATION_ROW_FUNCTION__DEPENDANT_CUBE_COLUMNS = Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Created Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_ACCUMULATION_ROW_FUNCTION__CREATED_CUBE_COLUMNS = Row_transformation_logicPackage.ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Dependant Struct Item Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_ACCUMULATION_ROW_FUNCTION__DEPENDANT_STRUCT_ITEM_COLUMNS = Row_transformation_logicPackage.ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS;

	/**
	 * The feature id for the '<em><b>Ultimate Cube Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_ACCUMULATION_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE = Row_transformation_logicPackage.ROW_CREATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delta Accumulation Row Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_ACCUMULATION_ROW_FUNCTION_FEATURE_COUNT = Row_transformation_logicPackage.ROW_CREATION_APPROACH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delta Accumulation Row Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_ACCUMULATION_ROW_FUNCTION_OPERATION_COUNT = Row_transformation_logicPackage.ROW_CREATION_APPROACH_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.BaseViewIncorporatingDeltasRowFunction <em>Base View Incorporating Deltas Row Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base View Incorporating Deltas Row Function</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.BaseViewIncorporatingDeltasRowFunction
	 * @generated
	 */
	EClass getBaseViewIncorporatingDeltasRowFunction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.BaseViewIncorporatingDeltasRowFunction#getUltimateCubeSource <em>Ultimate Cube Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ultimate Cube Source</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.BaseViewIncorporatingDeltasRowFunction#getUltimateCubeSource()
	 * @see #getBaseViewIncorporatingDeltasRowFunction()
	 * @generated
	 */
	EReference getBaseViewIncorporatingDeltasRowFunction_UltimateCubeSource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.DeltaAccumulationRowFunction <em>Delta Accumulation Row Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delta Accumulation Row Function</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.DeltaAccumulationRowFunction
	 * @generated
	 */
	EClass getDeltaAccumulationRowFunction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.DeltaAccumulationRowFunction#getUltimateCubeSource <em>Ultimate Cube Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ultimate Cube Source</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.DeltaAccumulationRowFunction#getUltimateCubeSource()
	 * @see #getDeltaAccumulationRowFunction()
	 * @generated
	 */
	EReference getDeltaAccumulationRowFunction_UltimateCubeSource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Incremental_row_transformation_logicFactory getIncremental_row_transformation_logicFactory();

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
		 * The meta object literal for the '{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.BaseViewIncorporatingDeltasRowFunctionImpl <em>Base View Incorporating Deltas Row Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.BaseViewIncorporatingDeltasRowFunctionImpl
		 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.Incremental_row_transformation_logicPackageImpl#getBaseViewIncorporatingDeltasRowFunction()
		 * @generated
		 */
		EClass BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION = eINSTANCE.getBaseViewIncorporatingDeltasRowFunction();

		/**
		 * The meta object literal for the '<em><b>Ultimate Cube Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE = eINSTANCE.getBaseViewIncorporatingDeltasRowFunction_UltimateCubeSource();

		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.DeltaAccumulationRowFunctionImpl <em>Delta Accumulation Row Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.DeltaAccumulationRowFunctionImpl
		 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.Incremental_row_transformation_logicPackageImpl#getDeltaAccumulationRowFunction()
		 * @generated
		 */
		EClass DELTA_ACCUMULATION_ROW_FUNCTION = eINSTANCE.getDeltaAccumulationRowFunction();

		/**
		 * The meta object literal for the '<em><b>Ultimate Cube Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELTA_ACCUMULATION_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE = eINSTANCE.getDeltaAccumulationRowFunction_UltimateCubeSource();

	}

} //Incremental_row_transformation_logicPackage
