package Com.Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public WebDriver driver;
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

	public static String generaterandomemail() {
		return System.currentTimeMillis() + "@gmail.com";
	}

	public static String generatepassword() {
		return System.currentTimeMillis() + "ab";
	}

}
