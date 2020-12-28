/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproachForCube;

import org.eclipse.efbt.lineage.common.model.column_transformation_logic.ColumnFunctionGroup;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube Transformation Logic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CubeTransformationLogic, is the logic for transforming one or more populated Cubes (the source cobes of the transformation) into a derived Cube
 * It can be considered as very similar to an SQL view which is logic describing a transformation of source SQL tables or views.
 * The CubeTransformationLogic has 2 parts. 
 * The first part is the RowCreationApproach, which describes the link between rows in the transformed cube and the source cube(s).
 * An example of a RowCreationApproach is a group by , or a join, and it states how one row in the derived cube is associated with Rows in the source cube(s).
 * The second part is the ColumnFunctionGroup.
 * The ColumnFunctionGroup is a set of columns, which can create the values required in a row in the derived cube, from the related rows in the source cube(s). 
 * We can consider at a high level that the RowCreationApproach creates the rows in the derived cube, and makes sure that these rows know which are the related rows from the source cube (e.g. in a group by currency approach we would have one row in the derived cube per currency, and each of these rows would know which rows from the source cube were being aggregated)
 * then for each row in the derived cube, the  column functions apply functions to the new row's associated source rows to get the value of the column in the new row.
 * 
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.CubeTransformationLogic#getColumnFunctionGroup <em>Column Function Group</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.CubeTransformationLogic#getRowCreationApproachForCube <em>Row Creation Approach For Cube</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.CubeTransformationLogic#isUsedInSubsets <em>Used In Subsets</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.Cube_transformation_logicPackage#getCubeTransformationLogic()
 * @model
 * @generated
 */
public interface CubeTransformationLogic extends EObject
{
	/**
	 * Returns the value of the '<em><b>Column Function Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ColumnFunctionGroup
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Column Function Group</em>' containment reference.
	 * @see #setColumnFunctionGroup(ColumnFunctionGroup)
	 * @see org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.Cube_transformation_logicPackage#getCubeTransformationLogic_ColumnFunctionGroup()
	 * @model containment="true"
	 * @generated
	 */
	ColumnFunctionGroup getColumnFunctionGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.CubeTransformationLogic#getColumnFunctionGroup <em>Column Function Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Function Group</em>' containment reference.
	 * @see #getColumnFunctionGroup()
	 * @generated
	 */
	void setColumnFunctionGroup(ColumnFunctionGroup value);

	/**
	 * Returns the value of the '<em><b>Row Creation Approach For Cube</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RowCreationApproach
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Row Creation Approach For Cube</em>' containment reference.
	 * @see #setRowCreationApproachForCube(RowCreationApproachForCube)
	 * @see org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.Cube_transformation_logicPackage#getCubeTransformationLogic_RowCreationApproachForCube()
	 * @model containment="true"
	 * @generated
	 */
	RowCreationApproachForCube getRowCreationApproachForCube();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.CubeTransformationLogic#getRowCreationApproachForCube <em>Row Creation Approach For Cube</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Creation Approach For Cube</em>' containment reference.
	 * @see #getRowCreationApproachForCube()
	 * @generated
	 */
	void setRowCreationApproachForCube(RowCreationApproachForCube value);

	/**
	 * Returns the value of the '<em><b>Used In Subsets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This field can be useful in comparing  attribute lineage models
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used In Subsets</em>' attribute.
	 * @see #setUsedInSubsets(boolean)
	 * @see org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.Cube_transformation_logicPackage#getCubeTransformationLogic_UsedInSubsets()
	 * @model
	 * @generated
	 */
	boolean isUsedInSubsets();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.CubeTransformationLogic#isUsedInSubsets <em>Used In Subsets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used In Subsets</em>' attribute.
	 * @see #isUsedInSubsets()
	 * @generated
	 */
	void setUsedInSubsets(boolean value);

} // CubeTransformationLogic
