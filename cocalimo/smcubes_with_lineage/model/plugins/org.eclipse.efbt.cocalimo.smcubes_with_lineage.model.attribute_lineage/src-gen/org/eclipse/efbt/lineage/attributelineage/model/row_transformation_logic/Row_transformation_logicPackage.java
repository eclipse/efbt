/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic;

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
 * This package describes the RowCreationApproach's.
 * A RowCreationApproach describes the link between rows in the transformed cube and the source cube(s).
 * An example of a RowCreationApproach is a group by , or a join, and it states how one row in the derived cube is associated with Rows in the source cube(s).
 * We can consider at a high level that the RowCreationApproach creates the rows in the derived cube, and makes sure that these rows know which are the related rows from the source cube (e.g. in a group by currency approach we would have one row in the derived cube per currency, and each of these rows would know which rows from the source cube were being aggregated)
 * 
 * 
 * 
 * 
 *   
 * <!-- end-model-doc -->
 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicFactory
 * @model kind="package"
 *        annotation="license license='Copyright (c) 2020 Bird Software Solutions Ltd\n All rights reserved. This file and the accompanying materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v20.html\n\nSPDX-License-Identifier: EPL-2.0 \n\n Contributors:\n Neil Mackenzie - initial API and implementation\r'"
 * @generated
 */
public interface Row_transformation_logicPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "row_transformation_logic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/efbt/row_transformation_logic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "row_transformation_logic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Row_transformation_logicPackage eINSTANCE = org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.BaseRowStructureImpl <em>Base Row Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.BaseRowStructureImpl
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getBaseRowStructure()
	 * @generated
	 */
	int BASE_ROW_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROW_STRUCTURE__COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Cube</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROW_STRUCTURE__CUBE = 1;

	/**
	 * The feature id for the '<em><b>Used In Subsets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROW_STRUCTURE__USED_IN_SUBSETS = 2;

	/**
	 * The number of structural features of the '<em>Base Row Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROW_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Base Row Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROW_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachImpl <em>Row Creation Approach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachImpl
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getRowCreationApproach()
	 * @generated
	 */
	int ROW_CREATION_APPROACH = 6;

	/**
	 * The feature id for the '<em><b>Dependant Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Created Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Dependant Struct Item Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS = 2;

	/**
	 * The number of structural features of the '<em>Row Creation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CREATION_APPROACH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Row Creation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CREATION_APPROACH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.CustomRowCreationApproachImpl <em>Custom Row Creation Approach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.CustomRowCreationApproachImpl
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getCustomRowCreationApproach()
	 * @generated
	 */
	int CUSTOM_ROW_CREATION_APPROACH = 1;

	/**
	 * The feature id for the '<em><b>Dependant Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS = ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Created Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS = ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Dependant Struct Item Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS = ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS;

	/**
	 * The feature id for the '<em><b>Dependant Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ROW_CREATION_APPROACH__DEPENDANT_VARIABLES = ROW_CREATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Row Creation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ROW_CREATION_APPROACH_FEATURE_COUNT = ROW_CREATION_APPROACH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Custom Row Creation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ROW_CREATION_APPROACH_OPERATION_COUNT = ROW_CREATION_APPROACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.FilterAndGroupToOneRowCreationApproachImpl <em>Filter And Group To One Row Creation Approach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.FilterAndGroupToOneRowCreationApproachImpl
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getFilterAndGroupToOneRowCreationApproach()
	 * @generated
	 */
	int FILTER_AND_GROUP_TO_ONE_ROW_CREATION_APPROACH = 2;

	/**
	 * The feature id for the '<em><b>Dependant Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_AND_GROUP_TO_ONE_ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS = ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Created Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_AND_GROUP_TO_ONE_ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS = ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Dependant Struct Item Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_AND_GROUP_TO_ONE_ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS = ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS;

	/**
	 * The feature id for the '<em><b>Filter Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_AND_GROUP_TO_ONE_ROW_CREATION_APPROACH__FILTER_FUNCTION = ROW_CREATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group By Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_AND_GROUP_TO_ONE_ROW_CREATION_APPROACH__GROUP_BY_VARIABLES = ROW_CREATION_APPROACH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Filter And Group To One Row Creation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_AND_GROUP_TO_ONE_ROW_CREATION_APPROACH_FEATURE_COUNT = ROW_CREATION_APPROACH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Filter And Group To One Row Creation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_AND_GROUP_TO_ONE_ROW_CREATION_APPROACH_OPERATION_COUNT = ROW_CREATION_APPROACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachForCubeImpl <em>Row Creation Approach For Cube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachForCubeImpl
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getRowCreationApproachForCube()
	 * @generated
	 */
	int ROW_CREATION_APPROACH_FOR_CUBE = 3;

	/**
	 * The feature id for the '<em><b>Row Creation Approach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CREATION_APPROACH_FOR_CUBE__ROW_CREATION_APPROACH = 0;

	/**
	 * The feature id for the '<em><b>Cube</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CREATION_APPROACH_FOR_CUBE__CUBE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CREATION_APPROACH_FOR_CUBE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Row Creation Approach For Cube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CREATION_APPROACH_FOR_CUBE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Row Creation Approach For Cube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_CREATION_APPROACH_FOR_CUBE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.OneToOneRowCreationApproachImpl <em>One To One Row Creation Approach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.OneToOneRowCreationApproachImpl
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getOneToOneRowCreationApproach()
	 * @generated
	 */
	int ONE_TO_ONE_ROW_CREATION_APPROACH = 4;

	/**
	 * The feature id for the '<em><b>Dependant Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS = ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Created Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS = ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Dependant Struct Item Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS = ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS;

	/**
	 * The number of structural features of the '<em>One To One Row Creation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_ROW_CREATION_APPROACH_FEATURE_COUNT = ROW_CREATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>One To One Row Creation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_ROW_CREATION_APPROACH_OPERATION_COUNT = ROW_CREATION_APPROACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.FilterRowCreationApproachImpl <em>Filter Row Creation Approach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.FilterRowCreationApproachImpl
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getFilterRowCreationApproach()
	 * @generated
	 */
	int FILTER_ROW_CREATION_APPROACH = 5;

	/**
	 * The feature id for the '<em><b>Dependant Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS = ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Created Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS = ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Dependant Struct Item Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS = ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS;

	/**
	 * The feature id for the '<em><b>Filter Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ROW_CREATION_APPROACH__FILTER_FUNCTION = ROW_CREATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Row Creation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ROW_CREATION_APPROACH_FEATURE_COUNT = ROW_CREATION_APPROACH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filter Row Creation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ROW_CREATION_APPROACH_OPERATION_COUNT = ROW_CREATION_APPROACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.GroupByRowCreationApproachImpl <em>Group By Row Creation Approach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.GroupByRowCreationApproachImpl
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getGroupByRowCreationApproach()
	 * @generated
	 */
	int GROUP_BY_ROW_CREATION_APPROACH = 7;

	/**
	 * The feature id for the '<em><b>Dependant Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BY_ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS = ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Created Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BY_ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS = ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Dependant Struct Item Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BY_ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS = ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS;

	/**
	 * The feature id for the '<em><b>Group By Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_COLUMNS = ROW_CREATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group By Cube Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_CUBE_COLUMNS = ROW_CREATION_APPROACH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group By Row Creation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BY_ROW_CREATION_APPROACH_FEATURE_COUNT = ROW_CREATION_APPROACH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Group By Row Creation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BY_ROW_CREATION_APPROACH_OPERATION_COUNT = ROW_CREATION_APPROACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowJoinFunctionImpl <em>Row Join Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowJoinFunctionImpl
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getRowJoinFunction()
	 * @generated
	 */
	int ROW_JOIN_FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Dependant Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_JOIN_FUNCTION__DEPENDANT_CUBE_COLUMNS = ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Created Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_JOIN_FUNCTION__CREATED_CUBE_COLUMNS = ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Dependant Struct Item Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_JOIN_FUNCTION__DEPENDANT_STRUCT_ITEM_COLUMNS = ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS;

	/**
	 * The feature id for the '<em><b>Join Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_JOIN_FUNCTION__JOIN_FUNCTION = ROW_CREATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Row Join Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_JOIN_FUNCTION_FEATURE_COUNT = ROW_CREATION_APPROACH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Row Join Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_JOIN_FUNCTION_OPERATION_COUNT = ROW_CREATION_APPROACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.UnionRowCreationApproachImpl <em>Union Row Creation Approach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.UnionRowCreationApproachImpl
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getUnionRowCreationApproach()
	 * @generated
	 */
	int UNION_ROW_CREATION_APPROACH = 9;

	/**
	 * The feature id for the '<em><b>Dependant Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS = ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Created Cube Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS = ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS;

	/**
	 * The feature id for the '<em><b>Dependant Struct Item Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS = ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS;

	/**
	 * The number of structural features of the '<em>Union Row Creation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_ROW_CREATION_APPROACH_FEATURE_COUNT = ROW_CREATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Union Row Creation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_ROW_CREATION_APPROACH_OPERATION_COUNT = ROW_CREATION_APPROACH_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.BaseRowStructure <em>Base Row Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Row Structure</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.BaseRowStructure
	 * @generated
	 */
	EClass getBaseRowStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.BaseRowStructure#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.BaseRowStructure#getColumns()
	 * @see #getBaseRowStructure()
	 * @generated
	 */
	EReference getBaseRowStructure_Columns();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.BaseRowStructure#getCube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cube</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.BaseRowStructure#getCube()
	 * @see #getBaseRowStructure()
	 * @generated
	 */
	EReference getBaseRowStructure_Cube();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.BaseRowStructure#isUsedInSubsets <em>Used In Subsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used In Subsets</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.BaseRowStructure#isUsedInSubsets()
	 * @see #getBaseRowStructure()
	 * @generated
	 */
	EAttribute getBaseRowStructure_UsedInSubsets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.CustomRowCreationApproach <em>Custom Row Creation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Row Creation Approach</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.CustomRowCreationApproach
	 * @generated
	 */
	EClass getCustomRowCreationApproach();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.CustomRowCreationApproach#getDependantVariables <em>Dependant Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependant Variables</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.CustomRowCreationApproach#getDependantVariables()
	 * @see #getCustomRowCreationApproach()
	 * @generated
	 */
	EReference getCustomRowCreationApproach_DependantVariables();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.FilterAndGroupToOneRowCreationApproach <em>Filter And Group To One Row Creation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter And Group To One Row Creation Approach</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.FilterAndGroupToOneRowCreationApproach
	 * @generated
	 */
	EClass getFilterAndGroupToOneRowCreationApproach();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.FilterAndGroupToOneRowCreationApproach#getFilterFunction <em>Filter Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Function</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.FilterAndGroupToOneRowCreationApproach#getFilterFunction()
	 * @see #getFilterAndGroupToOneRowCreationApproach()
	 * @generated
	 */
	EReference getFilterAndGroupToOneRowCreationApproach_FilterFunction();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.FilterAndGroupToOneRowCreationApproach#getGroupByVariables <em>Group By Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group By Variables</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.FilterAndGroupToOneRowCreationApproach#getGroupByVariables()
	 * @see #getFilterAndGroupToOneRowCreationApproach()
	 * @generated
	 */
	EReference getFilterAndGroupToOneRowCreationApproach_GroupByVariables();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproachForCube <em>Row Creation Approach For Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Creation Approach For Cube</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproachForCube
	 * @generated
	 */
	EClass getRowCreationApproachForCube();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproachForCube#getRowCreationApproach <em>Row Creation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Row Creation Approach</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproachForCube#getRowCreationApproach()
	 * @see #getRowCreationApproachForCube()
	 * @generated
	 */
	EReference getRowCreationApproachForCube_RowCreationApproach();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproachForCube#getCube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cube</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproachForCube#getCube()
	 * @see #getRowCreationApproachForCube()
	 * @generated
	 */
	EReference getRowCreationApproachForCube_Cube();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproachForCube#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproachForCube#getName()
	 * @see #getRowCreationApproachForCube()
	 * @generated
	 */
	EAttribute getRowCreationApproachForCube_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.OneToOneRowCreationApproach <em>One To One Row Creation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To One Row Creation Approach</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.OneToOneRowCreationApproach
	 * @generated
	 */
	EClass getOneToOneRowCreationApproach();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.FilterRowCreationApproach <em>Filter Row Creation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Row Creation Approach</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.FilterRowCreationApproach
	 * @generated
	 */
	EClass getFilterRowCreationApproach();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.FilterRowCreationApproach#getFilterFunction <em>Filter Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Function</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.FilterRowCreationApproach#getFilterFunction()
	 * @see #getFilterRowCreationApproach()
	 * @generated
	 */
	EReference getFilterRowCreationApproach_FilterFunction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach <em>Row Creation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Creation Approach</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach
	 * @generated
	 */
	EClass getRowCreationApproach();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach#getDependantCubeColumns <em>Dependant Cube Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependant Cube Columns</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach#getDependantCubeColumns()
	 * @see #getRowCreationApproach()
	 * @generated
	 */
	EReference getRowCreationApproach_DependantCubeColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach#getCreatedCubeColumns <em>Created Cube Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Created Cube Columns</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach#getCreatedCubeColumns()
	 * @see #getRowCreationApproach()
	 * @generated
	 */
	EReference getRowCreationApproach_CreatedCubeColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach#getDependantStructItemColumns <em>Dependant Struct Item Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependant Struct Item Columns</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach#getDependantStructItemColumns()
	 * @see #getRowCreationApproach()
	 * @generated
	 */
	EReference getRowCreationApproach_DependantStructItemColumns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.GroupByRowCreationApproach <em>Group By Row Creation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group By Row Creation Approach</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.GroupByRowCreationApproach
	 * @generated
	 */
	EClass getGroupByRowCreationApproach();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.GroupByRowCreationApproach#getGroupByColumns <em>Group By Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group By Columns</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.GroupByRowCreationApproach#getGroupByColumns()
	 * @see #getGroupByRowCreationApproach()
	 * @generated
	 */
	EReference getGroupByRowCreationApproach_GroupByColumns();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.GroupByRowCreationApproach#getGroupByCubeColumns <em>Group By Cube Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group By Cube Columns</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.GroupByRowCreationApproach#getGroupByCubeColumns()
	 * @see #getGroupByRowCreationApproach()
	 * @generated
	 */
	EReference getGroupByRowCreationApproach_GroupByCubeColumns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowJoinFunction <em>Row Join Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Join Function</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowJoinFunction
	 * @generated
	 */
	EClass getRowJoinFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowJoinFunction#getJoinFunction <em>Join Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Function</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowJoinFunction#getJoinFunction()
	 * @see #getRowJoinFunction()
	 * @generated
	 */
	EReference getRowJoinFunction_JoinFunction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.UnionRowCreationApproach <em>Union Row Creation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Row Creation Approach</em>'.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.UnionRowCreationApproach
	 * @generated
	 */
	EClass getUnionRowCreationApproach();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Row_transformation_logicFactory getRow_transformation_logicFactory();

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
		 * The meta object literal for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.BaseRowStructureImpl <em>Base Row Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.BaseRowStructureImpl
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getBaseRowStructure()
		 * @generated
		 */
		EClass BASE_ROW_STRUCTURE = eINSTANCE.getBaseRowStructure();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_ROW_STRUCTURE__COLUMNS = eINSTANCE.getBaseRowStructure_Columns();

		/**
		 * The meta object literal for the '<em><b>Cube</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_ROW_STRUCTURE__CUBE = eINSTANCE.getBaseRowStructure_Cube();

		/**
		 * The meta object literal for the '<em><b>Used In Subsets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_ROW_STRUCTURE__USED_IN_SUBSETS = eINSTANCE.getBaseRowStructure_UsedInSubsets();

		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.CustomRowCreationApproachImpl <em>Custom Row Creation Approach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.CustomRowCreationApproachImpl
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getCustomRowCreationApproach()
		 * @generated
		 */
		EClass CUSTOM_ROW_CREATION_APPROACH = eINSTANCE.getCustomRowCreationApproach();

		/**
		 * The meta object literal for the '<em><b>Dependant Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_ROW_CREATION_APPROACH__DEPENDANT_VARIABLES = eINSTANCE.getCustomRowCreationApproach_DependantVariables();

		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.FilterAndGroupToOneRowCreationApproachImpl <em>Filter And Group To One Row Creation Approach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.FilterAndGroupToOneRowCreationApproachImpl
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getFilterAndGroupToOneRowCreationApproach()
		 * @generated
		 */
		EClass FILTER_AND_GROUP_TO_ONE_ROW_CREATION_APPROACH = eINSTANCE.getFilterAndGroupToOneRowCreationApproach();

		/**
		 * The meta object literal for the '<em><b>Filter Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_AND_GROUP_TO_ONE_ROW_CREATION_APPROACH__FILTER_FUNCTION = eINSTANCE.getFilterAndGroupToOneRowCreationApproach_FilterFunction();

		/**
		 * The meta object literal for the '<em><b>Group By Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_AND_GROUP_TO_ONE_ROW_CREATION_APPROACH__GROUP_BY_VARIABLES = eINSTANCE.getFilterAndGroupToOneRowCreationApproach_GroupByVariables();

		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachForCubeImpl <em>Row Creation Approach For Cube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachForCubeImpl
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getRowCreationApproachForCube()
		 * @generated
		 */
		EClass ROW_CREATION_APPROACH_FOR_CUBE = eINSTANCE.getRowCreationApproachForCube();

		/**
		 * The meta object literal for the '<em><b>Row Creation Approach</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_CREATION_APPROACH_FOR_CUBE__ROW_CREATION_APPROACH = eINSTANCE.getRowCreationApproachForCube_RowCreationApproach();

		/**
		 * The meta object literal for the '<em><b>Cube</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_CREATION_APPROACH_FOR_CUBE__CUBE = eINSTANCE.getRowCreationApproachForCube_Cube();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_CREATION_APPROACH_FOR_CUBE__NAME = eINSTANCE.getRowCreationApproachForCube_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.OneToOneRowCreationApproachImpl <em>One To One Row Creation Approach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.OneToOneRowCreationApproachImpl
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getOneToOneRowCreationApproach()
		 * @generated
		 */
		EClass ONE_TO_ONE_ROW_CREATION_APPROACH = eINSTANCE.getOneToOneRowCreationApproach();

		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.FilterRowCreationApproachImpl <em>Filter Row Creation Approach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.FilterRowCreationApproachImpl
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getFilterRowCreationApproach()
		 * @generated
		 */
		EClass FILTER_ROW_CREATION_APPROACH = eINSTANCE.getFilterRowCreationApproach();

		/**
		 * The meta object literal for the '<em><b>Filter Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_ROW_CREATION_APPROACH__FILTER_FUNCTION = eINSTANCE.getFilterRowCreationApproach_FilterFunction();

		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachImpl <em>Row Creation Approach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachImpl
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getRowCreationApproach()
		 * @generated
		 */
		EClass ROW_CREATION_APPROACH = eINSTANCE.getRowCreationApproach();

		/**
		 * The meta object literal for the '<em><b>Dependant Cube Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS = eINSTANCE.getRowCreationApproach_DependantCubeColumns();

		/**
		 * The meta object literal for the '<em><b>Created Cube Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS = eINSTANCE.getRowCreationApproach_CreatedCubeColumns();

		/**
		 * The meta object literal for the '<em><b>Dependant Struct Item Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS = eINSTANCE.getRowCreationApproach_DependantStructItemColumns();

		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.GroupByRowCreationApproachImpl <em>Group By Row Creation Approach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.GroupByRowCreationApproachImpl
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getGroupByRowCreationApproach()
		 * @generated
		 */
		EClass GROUP_BY_ROW_CREATION_APPROACH = eINSTANCE.getGroupByRowCreationApproach();

		/**
		 * The meta object literal for the '<em><b>Group By Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_COLUMNS = eINSTANCE.getGroupByRowCreationApproach_GroupByColumns();

		/**
		 * The meta object literal for the '<em><b>Group By Cube Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_CUBE_COLUMNS = eINSTANCE.getGroupByRowCreationApproach_GroupByCubeColumns();

		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowJoinFunctionImpl <em>Row Join Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowJoinFunctionImpl
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getRowJoinFunction()
		 * @generated
		 */
		EClass ROW_JOIN_FUNCTION = eINSTANCE.getRowJoinFunction();

		/**
		 * The meta object literal for the '<em><b>Join Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_JOIN_FUNCTION__JOIN_FUNCTION = eINSTANCE.getRowJoinFunction_JoinFunction();

		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.UnionRowCreationApproachImpl <em>Union Row Creation Approach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.UnionRowCreationApproachImpl
		 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl#getUnionRowCreationApproach()
		 * @generated
		 */
		EClass UNION_ROW_CREATION_APPROACH = eINSTANCE.getUnionRowCreationApproach();

	}

} //Row_transformation_logicPackage
