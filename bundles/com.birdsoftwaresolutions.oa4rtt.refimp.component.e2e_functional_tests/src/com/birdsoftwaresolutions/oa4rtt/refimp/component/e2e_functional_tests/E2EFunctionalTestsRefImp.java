package com.birdsoftwaresolutions.oa4rtt.refimp.component.e2e_functional_tests;

import java.util.List;

import org.eclipse.efbt.oa4rtt.component.e2e_functional_tests.java_interface.E2EFunctionalTests;


import execution_environments.TestExecutionEnvironmentModule;
import requirements_based_test_definition.E2ERequirementsBasedTestDefinitionModule;
import test.TestModule;


public class E2EFunctionalTestsRefImp implements E2EFunctionalTests{

	@Override
	public List<TestModule> getModules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TestModule getModuleForVerion(String version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createTrialVersion(TestModule oldVersion, 
			E2ERequirementsBasedTestDefinitionModule dependantTestDefintionVersion,
			TestExecutionEnvironmentModule dependantExecutionEnvironmnt,
			String version) {
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
