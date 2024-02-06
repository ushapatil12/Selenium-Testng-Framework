package seleniumtestngproject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.Resources.Baseclass;
import Com.Resources.CommonMethods;
import Com.Resources.Constants;
import pageobjectModel.Homepageobject;

public class HomepageLinkTestcase extends Baseclass{
	@Test
	public void VerifyAllLinksonHomepage() throws MalformedURLException, IOException {
		Homepageobject hom=new Homepageobject(driver);
		List<WebElement> allLinks=driver.findElements(By.xpath("//ul[@class='list-unstyled']/li/a"));
		for(WebElement link:allLinks) {
			String url=link.getAttribute("href");//this will give all href attribute value
			HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");//it will give status code not response body
			conn.connect();
			int respCode=conn.getResponseCode();
			CommonMethods.handleAssertions(respCode,Constants.ResponseCode);
			
			
		}
			
			
		
	
	}
	
	

}
