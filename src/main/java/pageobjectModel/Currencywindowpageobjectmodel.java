package pageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Currencywindowpageobjectmodel {
	public WebDriver driver;
	private By clickonbutton=By.xpath("//span[@class='hidden-xs hidden-sm hidden-md']");
	private By Eurocurrency=By.xpath("(//button[@type='button'])[1]");
	
	private By poundsterlingcurrency=By.xpath("(//button[@type='button'])[2]");
    private By dollarcurrency=By.xpath("(//button[@type='button'])[3]");
   
	public Currencywindowpageobjectmodel(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement Clickonbutton() {
		return driver.findElement(clickonbutton);
		}
	public WebElement Eurocurrencybutton() {
		return driver.findElement(Eurocurrency);
	}
	public WebElement poundSterlingclickable() {
		return driver.findElement(poundsterlingcurrency);
	}
	public WebElement dollarcurrencyclickable() {
		return driver.findElement(dollarcurrency);
	}

	


}
