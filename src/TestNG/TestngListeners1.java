package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class  TestngListeners1 implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("This is on test start action");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		System.out.println("This is on test success action");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("This is on test failure action");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("This is on test skipped action");
	}

}
