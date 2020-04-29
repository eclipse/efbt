package com.birdsoftwaresolutions.oa4rtt.refimp.component.e2e_functional_test_definitions;

import java.util.List;

import org.eclipse.efbt.oa4rtt.component.e2e_functional_test_definitions.java_interface.E2EFunctionalTestDefinitions;

import functionality_module.FunctionalityModuleModule;
import requirements_based_test_definition.E2ERequirementsBasedTestDefinitionModule;


public class E2EFunctionalTestDefinitionsRefImp implements E2EFunctionalTestDefinitions{

	@Override
	public List<E2ERequirementsBasedTestDefinitionModule> getModules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E2ERequirementsBasedTestDefinitionModule getModuleForVerion(String version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createTrialVersion(E2ERequirementsBasedTestDefinitionModule oldVersion,
			FunctionalityModuleModule dependantVersion, String version) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTrialModuleAsFinal(String version) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeInvalidItemsFromTrialModule(String version) {
		// TODO Auto-generated method stub
		
	}

}
