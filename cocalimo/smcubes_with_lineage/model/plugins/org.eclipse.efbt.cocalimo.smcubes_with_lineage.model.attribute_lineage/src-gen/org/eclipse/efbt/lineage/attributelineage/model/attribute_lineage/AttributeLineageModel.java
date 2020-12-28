/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage;

import org.eclipse.efbt.cocamo.functions.model.functions.FunctionSpec;

import org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.CubeTransformationLogic;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.BaseRowStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Lineage Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AttributeLineageModel is a set of related CubeTransformationLogics and BaseRowStructures. It provides full traceability, between the columns
 *     of each CubeTransformationLogic and BaseRowStructures. Every column is either  a column in a BaseRowStructure  or a column which is derived from other columns via a ColumnFunctions.
 *     Some required FunctionsSpecs are also included in the AttributeLineageModel definition.
 *     
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.AttributeLineageModel#getRowTransformations <em>Row Transformations</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.AttributeLineageModel#getBaseSchemas <em>Base Schemas</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.AttributeLineageModel#getSpecialFunctionSpecs <em>Special Function Specs</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.AttributeLineageModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.Attribute_lineagePackage#getAttributeLineageModel()
 * @model extendedMetaData="name='AttributeLineageModel' kind='elementOnly'"
 * @generated
 */
public interface AttributeLineageModel extends EObject
{
	/**
	 * Returns the value of the '<em><b>Row Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.CubeTransformationLogic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cube  transformations
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Row Transformations</em>' containment reference list.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.Attribute_lineagePackage#getAttributeLineageModel_RowTransformations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rowTransformations'"
	 * @generated
	 */
	EList<CubeTransformationLogic> getRowTransformations();

	/**
	 * Returns the value of the '<em><b>Base Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.BaseRowStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base schemas
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Schemas</em>' containment reference list.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.Attribute_lineagePackage#getAttributeLineageModel_BaseSchemas()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='baseSchemas'"
	 * @generated
	 */
	EList<BaseRowStructure> getBaseSchemas();

	/**
	 * Returns the value of the '<em><b>Special Function Specs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.cocamo.functions.model.functions.FunctionSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FunctionSpecs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Function Specs</em>' containment reference list.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.Attribute_lineagePackage#getAttributeLineageModel_SpecialFunctionSpecs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialFunctionSpecs'"
	 * @generated
	 */
	EList<FunctionSpec> getSpecialFunctionSpecs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the AttributeLineageModel
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.Attribute_lineagePackage#getAttributeLineageModel_Name()
	 * @model id="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.AttributeLineageModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AttributeLineageModel
