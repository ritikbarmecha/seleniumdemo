package Listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener,ISuiteListener {
	
	public void  onTestSuccess(ITestResult result) {
		System.out.println(" test on success "+ result.getName());
	}

	public void  onTestStart(ITestResult result) {
		System.out.println(" test on start "+ result.getName());
	}
	
	public void  onTestFailure(ITestResult result) {
		System.out.println(" test on failure "+ result.getName());
	}
	public void  onTestSkipped(ITestResult result) {
		System.out.println(" test on skip "+ result.getName());
	}
	
	public void  OnTestFinish(ITestResult result) {
		System.out.println(" test on Finnish"+ result.getName());
	}
	
	public void  onTestFailedWithinSuccessPercentage(ITestResult result) {
		System.out.println(" test on failure  percantage"+ result.getName());
	}
	
	public void  onTestFailure(ISuite result) {
		System.out.println(" test on failure "+ result.getName());
	
}
	
}


