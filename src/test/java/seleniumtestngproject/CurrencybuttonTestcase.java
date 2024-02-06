package seleniumtestngproject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import Com.Resources.Baseclass;
import Com.Resources.CommonMethods;
import Com.Resources.Constants;
import pageobjectModel.Currencywindowpageobjectmodel;

public class CurrencybuttonTestcase extends Baseclass {

    @Test
	public void currencybuttonclickable() {
		Currencywindowpageobjectmodel cpm=new Currencywindowpageobjectmodel(driver);
		cpm.Clickonbutton().click();
		Actions a=new Actions(driver);
		String expres=cpm.Eurocurrencybutton().getText();
		CommonMethods.handleAssertion(expres,Constants.Eurocurrency);
		String poundstrlingcurrency=cpm.poundSterlingclickable().getText();
		CommonMethods.handleAssertion(poundstrlingcurrency,Constants.poundsterlingcurrency );
		String dollarcurrency=cpm.dollarcurrencyclickable().getText();
		CommonMethods.handleAssertion(dollarcurrency,Constants.dollarcurrency );
    	
    }
 }
