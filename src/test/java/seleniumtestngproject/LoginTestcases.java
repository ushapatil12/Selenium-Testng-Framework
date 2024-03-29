package seleniumtestngproject;

import java.io.IOException;
import org.testng.annotations.Test;
import Com.Resources.Baseclass;
import Com.Resources.CommonMethods;
import Com.Resources.Constants;
import pageobjectModel.Homepageobject;
import pageobjectModel.Loginpageobject;

public class LoginTestcases extends Baseclass {
	@Test(priority=2)
	public void loginwithvaliddata() throws InterruptedException {
		Homepageobject hop = new Homepageobject(driver);
		hop.clickmyacc().click();
		hop.clicklogin().click();
		Loginpageobject lop = new Loginpageobject(driver);
		// lop.enteremailid().clear();
		lop.enteremailid().sendKeys(RegistrationTestcases.randomemailgenerate);
		// lop.enterpassword().clear();
		lop.enterpassword().sendKeys(RegistrationTestcases.passwordrandomgenerate);
		lop.clcklogin().click();
		CommonMethods.handleAssertion(driver.getCurrentUrl(), Constants.Beforeloginurl);
	}
    @Test(priority = 1)
	public void loginwithinvaliddata() throws InterruptedException {
		Thread.sleep(2000);
		Homepageobject hop = new Homepageobject(driver);
		hop.clickmyacc().click();
		hop.clicklogin().click();
		Loginpageobject lop = new Loginpageobject(driver);
		lop.enteremailid().sendKeys(Constants.emailid);
		lop.enterpassword().sendKeys(Constants.password);
		lop.clcklogin().click();
		CommonMethods.handleAssertion(driver.getCurrentUrl(), Constants.Afterloginurl);
	}

}
