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
	public void verifyEuroOptionCurrencyDropDownMenu() {
		Currencywindowpageobjectmodel cpm=new Currencywindowpageobjectmodel(driver);
		cpm.Clickonbutton().click();
		CommonMethods.handleAssertion(cpm.Eurocurrencybutton().getText(),Constants.Eurocurrency);
		
    }
    @Test
    public void verifyPoundSterlingcurrencyDropDownMenu() {
    	Currencywindowpageobjectmodel cpm=new Currencywindowpageobjectmodel(driver);
		CommonMethods.handleAssertion(cpm.poundSterlingclickable().getText(),Constants.poundsterlingcurrency );
		
    }
    public void verifyDollarcurrencyDropDown() {
    	Currencywindowpageobjectmodel cpm=new Currencywindowpageobjectmodel(driver);
		CommonMethods.handleAssertion(cpm.dollarcurrencyclickable().getText(),Constants.dollarcurrency );
    	
    }
 }
