package pageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepageobject {
	public WebDriver driver;
	private By myaccount=By.xpath("//i[@class='fa fa-user']");
    private By login=By.xpath("//a[contains(text(),'Login')]");
    private By Register=By.xpath("//a[contains(text(),'Register')]");
    
	public Homepageobject(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement clickmyacc() {
    	return driver.findElement(myaccount);
    }
    public WebElement clicklogin() {
    	return driver.findElement(login);
    }
    public WebElement clickRegister() {
    	return driver.findElement(Register);
    }
}
