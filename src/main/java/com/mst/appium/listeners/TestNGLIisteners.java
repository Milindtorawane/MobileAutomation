package com.mst.appium.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGLIisteners  implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case is started:"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is passed  "+result.getStatus());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("Test case is failed "+result.getTestName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test case suite is started:"+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
