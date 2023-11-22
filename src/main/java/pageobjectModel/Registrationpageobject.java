package pageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registrationpageobject {
	public WebDriver driver;
	private By firstname = By.xpath("//input[@name='firstname']");
	private By lastname = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By telephone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By passwordconf = By.xpath("//input[@name='confirm']");
	private By subscribe = By.xpath("(//input[@name='newsletter'])[2]");
	private By privacypolicycheck = By.xpath("//input[@type='checkbox']");
	private By continuebutton = By.xpath("//input[@type='submit']");
	private By firstnamErrormsg = By.xpath("(//div[@class='text-danger'])[1]");
	private By lastnameErrormsg = By.xpath("(//div[@class='text-danger'])[2]");
	private By emailErrormsg = By.xpath("(//div[@class='text-danger'])[3]");
	private By TelephoneErrormsg = By.xpath("(//div[@class='text-danger'])[4]");
	private By passwordErrormsg = By.xpath("(//div[@class='text-danger'])[5]");

	public Registrationpageobject(WebDriver driver) {
		this.driver = driver;
	}

	// create method for all private xpathes
	public WebElement enterfirstname() {
		return driver.findElement(firstname);
	}

	public WebElement enterlastname() {
		return driver.findElement(lastname);
	}

	public WebElement enteremail() {
		return driver.findElement(email);
	}

	public WebElement entertelephone() {
		return driver.findElement(telephone);
	}

	public WebElement enterpassword() {
		return driver.findElement(password);
	}

	public WebElement enterconfirmpass() {
		return driver.findElement(passwordconf);
	}

	public WebElement entersubsribe() {
		return driver.findElement(subscribe);
	}

	public WebElement policycheckbox() {
		return driver.findElement(privacypolicycheck);
	}

	public WebElement clickoncontinue() {
		return driver.findElement(continuebutton);
	}

	public WebElement firstnameerrormsg() {
		return driver.findElement(firstnamErrormsg);
	}

	public WebElement lastnameerrormsg() {
		return driver.findElement(lastnameErrormsg);
	}

	public WebElement emailnameerrormsg() {
		return driver.findElement(emailErrormsg);
	}

	public WebElement telephoneerrormsg() {
		return driver.findElement(TelephoneErrormsg);
	}

	public WebElement passwordnameerrormsg() {
		return driver.findElement(passwordErrormsg);
	}

}
