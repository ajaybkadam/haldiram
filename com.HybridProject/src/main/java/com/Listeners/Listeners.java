package com.Listeners;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;




public class Listeners implements ITestListener{
	private Logger log=Logger.getLogger( Listeners.class);
	public void onFinish(ITestContext arg0) {
		
		
	}

	public void onStart(ITestContext result) {
		log.info("Test suite is ready to start with the execution");	
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		log.info("Testcase fail with name: "+result.getName());	
		
	}

	public void onTestSkipped(ITestResult result) {
		 log.info("Testcase skiped with name: "+result.getName());	
		
	}

	public void onTestStart(ITestResult result) {
		log.info("Testcase Start with name: "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		log.info("Testcase passed with name: "+result.getName());	
	}

}
