/*******************************************************************************
 * Copyright (c) 2020 Bird Software Solutions Ltd
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Neil Mackenzie - initial API and implementation
 *******************************************************************************/
 package org.eclipse.efbt.controller.trl.vtl_generator.templates


import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.common.util.EList

import java.util.List
import java.util.ArrayList

import org.eclipse.efbt.controller.core.model.platform_call.TranslateTRLToVTL
import org.eclipse.efbt.language.trl.model.transformation.Release
import org.eclipse.efbt.language.trl.model.trl_sql_views.SQLView

/**
 * Generateor tmplate for generating scala files
 */
class JavaBeanTemplate implements IGenerator {

	/**
	 * Generate
	 */
	override doGenerate(Resource input, IFileSystemAccess fsa) {

		
		input.allContents.filter(Release).forEach[
		
			
		    val platformCallName = it.name
			val content2 = generateVTL(it)
		   
			
		]
	
		 
	}
	

	/**
	 * Get the user friendly name of an SQL view
	 */
	def String getToUserFriendlyString(SQLView view)
	{
		return view.eClass.name
	}
	
	/**
	 * Generate the TheCellModelCreator scala class. This class calls all the other Scala classes. 
	 */
	def generateVTL(Release release)  '''
		
		
	 '''
	
	/**
	 * Add backslashes
	 */
	def String addbackslashes(String string) {
		 string.replace("\\","\\\\");
		
	}
	
	
	
	
  

	


}
