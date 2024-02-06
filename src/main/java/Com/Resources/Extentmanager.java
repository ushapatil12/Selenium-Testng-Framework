package Com.Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentmanager {
	//here ExtentSparkReporter,extent,ExtentTest are classes which are globally declared
	public static ExtentSparkReporter htmlreporter; //responsible for look of report
	public static ExtentReports extent; //responsible for entries 
	public static ExtentTest test; //responsible for testcase pass or fail
	
	public static void setup(){
		ExtentSparkReporter htmlreporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/myreport.html");
		htmlreporter.config().setDocumentTitle("Automation Report");
		  htmlreporter.config().setReportName("Functional Report");
		  htmlreporter.config().setTheme(Theme.DARK);
		  
		  extent=new ExtentReports();
		  extent.attachReporter(htmlreporter);
		  extent.setSystemInfo("hostname", "LocalHost");
		  extent.setSystemInfo("os", "windows10.1");
		  extent.setSystemInfo("browserName", "Chrome");
		  extent.setSystemInfo("testername", "Usha");
		  }
	 public static void endReport() {
		  extent.flush();
		 }
	

}
