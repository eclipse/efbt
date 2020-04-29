package com.birdsoftwaresolutions.oa4rtt.refimp.component.executed_tests;

import java.util.List;


import org.eclipse.efbt.oa4rtt.component.executed_tests.java_interface.ExecutedTests;

import execution_environments.TestExecutionEnvironmentModule;
import test.ExecutedTestModule;
import test.TestModule;

public class ExecutedTestsRefImp implements ExecutedTests{

	@Override
	public List<ExecutedTestModule> getModules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExecutedTestModule getModuleForTestModuleAndExecutionEnvironment(
			TestExecutionEnvironmentModule testEnvironment, TestModule testModule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createNewExecutedTestsModule(TestExecutionEnvironmentModule testEnvironment, TestModule testModule, String version) { 
		// TODO Auto-generated method stub
		
	}

}
