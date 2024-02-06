package Com.Resources;

import org.testng.ITestListener;

import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class Listeners extends Extentmanager implements ITestListener {
	public void onTeststart(ITestResult result) {
		test=extent.createTest(result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, "Testcase passed is"+result.getName());
		}
	}
	public void onTestSkip(ITestResult result) {
		if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, "Testcase skipped is"+result.getName());
		}
	}
	public void onTestFail(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, "Testcase failed is"+result.getName());
			test.log(Status.FAIL, "Testcase failed is"+result.getThrowable());//to throw exception
			String screenshotpath=Baseclass.screenShot(Baseclass.driver,result.getName());
			 test.addScreenCaptureFromPath(screenshotpath); //Adding screenshot inside report//To add name in extent report

		}
	}

}
