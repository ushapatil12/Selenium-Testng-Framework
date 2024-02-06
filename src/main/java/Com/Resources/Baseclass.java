package Com.Resources;

import java.io.File;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static WebDriver driver;
	Properties prop;

	public void initializedriver() throws IOException {
		// to read data of properties
		FileInputStream fos = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Com\\Resources\\data.properties");
		// create object of properties to access to properties
		prop = new Properties();
		// to load fos
		prop.load(fos);
		String browsername = prop.getProperty("Browser");
		// this for future use if anyone wants to test in different browser
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("edgedriver")) {
			driver = new EdgeDriver();
		}

	}

	@BeforeClass
	public void launchbrowser() throws IOException {
		initializedriver();
		driver.get(prop.getProperty("launchurl"));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void quitbrowser() {
		driver.quit();
	}

	public static String generaterandomemail() {
		return System.currentTimeMillis() + "@gmail.com";
	}

	public static String generatepassword() {
		return System.currentTimeMillis() + "ab";
	}
	@BeforeSuite
	public void ExtentReport() {
		Extentmanager.setup();
	}
	@AfterSuite
	public void endReport() {
		Extentmanager.endReport();
	}
	 
	 //To take the screenshot and store in one folder-
	  public static String screenShot(WebDriver driver, String filename) {
	   String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	                                                   //  202312120744
	   
	   TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	   File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
	   String destination = System.getProperty("user.dir") + "\\ScreenShot\\" + filename + "_" + dateName + ".png";
	   File finalDestination = new File(destination);
	   try {
	    FileUtils.copyFile(source, finalDestination);
	   } catch (Exception e) {
	    e.getMessage();
	   }
	   return destination;
	  }

}
