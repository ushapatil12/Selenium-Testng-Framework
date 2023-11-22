package Com.Resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonMethods {
	public static void handleAssertion(String actualurl,String expectedurl) {
		SoftAssert as=new SoftAssert();
		as.assertEquals(actualurl, expectedurl);
		as.assertAll();

	}
	public static void putExplicitwaits(WebDriver driver,int sec,WebElement element) {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
		  wait.until(ExpectedConditions.elementToBeClickable(element));
		   
	}
	

}
