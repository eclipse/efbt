/*******************************************************************************
 * Copyright (c) 2020 Bird Software Solutions Ltd
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Neil Mackenzie - initial API and implementation
 *******************************************************************************/
package org.eclipse.efbt.controller.trl.vtl_generator.engine;


import org.eclipse.efbt.controller.trl.vtl_generator.engine.GeneratorConfig;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.xtext.ISetup;


import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * @author Neil Mackenzie
 *
 */
public class GeneratorStandaloneSetup  implements ISetup {

	
	/**
	 * the injector
	 */
	private Injector injector;
	/**
	 * the config
	 */
	private GeneratorConfig config;
	
	/**
	 * Set the config
	 * @param config
	 */
	public void setConfig(GeneratorConfig config) {
		this.config = config;
	}
	
	/**
	 * setDoInit
	 * @param init
	 */
	public void setDoInit (boolean init) {
		createInjectorAndDoEMFRegistration();
	}
	

	/**
	 * Consrructoe
	 */
	public GeneratorStandaloneSetup () {
	}
	
	/**
	 * Get Dynamic Module
	 * @return
	 */
	private Module getDynamicModule () {
		return new AbstractModule() {
			@Override
			protected void configure() {
				bind(GeneratorConfig.class).toInstance(config);
			}
		};
	}

	/**
	 * create the injector and do EMF registration
	 */
	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		if (injector == null) {
			injector = Guice.createInjector(new FreeBirdToolsGeneratorModule(), getDynamicModule());
			register(injector);
		}
		return injector;
	}

	/**
	 * register. it is important here that we have register all the model packages names,
	 * And that we keep this up to date when new EMF model packages are added deleted or renamed. 
	 * @param injector
	 */
	public void register(Injector injector) {
		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = injector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("data_definition", resourceFactory);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("core", resourceFactory);
		
		
		
		

		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("data_definition", serviceProvider);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("core", serviceProvider);
		
	
		
		addRegisterGeneratedEPackage("platform_call.Platform_callPackage");		
			}
	
	/**
	 * Register Generate EPackage
	 * @param interfacename
	 */
	public void addRegisterGeneratedEPackage(String interfacename) {
		Registry registry  = EPackage.Registry.INSTANCE;
		Class<?> clazz = ResourceLoaderFactory.createResourceLoader().loadClass(interfacename);
		if (clazz == null)
			throw new ConfigurationException("Couldn't find an interface " + interfacename);
		try {
			EPackage pack = (EPackage) clazz.getDeclaredField("eINSTANCE").get(null);
			registry.put(pack.getNsURI(), pack);
			
		}
		catch (Exception e) {
			throw new ConfigurationException("Couldn't register " + interfacename
					+ ". Is it the generated EPackage interface? : " + e.getMessage());
		}
	}
	

	
}
