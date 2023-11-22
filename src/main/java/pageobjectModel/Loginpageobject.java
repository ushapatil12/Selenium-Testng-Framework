package pageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageobject {
	public WebDriver driver;
	private By emailid=By.xpath("//input[@name='email']");
	private By password=By.xpath("//input[@name='password']");
	private By login=By.xpath("//input[@type='submit']");
	
	public Loginpageobject(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement enteremailid() {
		return driver.findElement(emailid);
	}
    public WebElement enterpassword() {
    	return driver.findElement(password);
    }
    public WebElement clcklogin() {
    	return driver.findElement(login);
    }
    
}
