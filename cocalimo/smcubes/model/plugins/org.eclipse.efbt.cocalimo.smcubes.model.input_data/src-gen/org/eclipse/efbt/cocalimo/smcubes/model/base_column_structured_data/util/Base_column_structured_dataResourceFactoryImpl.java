/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.base_column_structured_data.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.emfjson.jackson.resource.JsonResourceFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.cocalimo.smcubes.model.base_column_structured_data.util.Base_column_structured_dataResourceImpl
 * @generated NOT
 */
public class Base_column_structured_dataResourceFactoryImpl extends JsonResourceFactory {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Base_column_structured_dataResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new Base_column_structured_dataResourceImpl(uri, getMapper());
		return result;
	}

} //Base_column_structured_dataResourceFactoryImpl
