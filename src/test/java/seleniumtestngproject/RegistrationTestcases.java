package seleniumtestngproject;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.Resources.Baseclass;
import Com.Resources.CommonMethods;
import Com.Resources.Constants;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import pageobjectModel.Homepageobject;
import pageobjectModel.Registrationpageobject;

public class RegistrationTestcases extends Baseclass {
	public static String randomemailgenerate = "";
    public static String passwordrandomgenerate = "";

	@Test(priority = 1)
	public void verifyregistrationwithblankdata() throws InterruptedException {
		Homepageobject hop = new Homepageobject(driver);
		hop.clickmyacc().click();
		hop.clickRegister().click();
		Registrationpageobject rpo = new Registrationpageobject(driver);
		rpo.enterfirstname().sendKeys("");
		rpo.enterlastname().sendKeys("");
		rpo.enteremail().sendKeys("");
		rpo.entertelephone().sendKeys("");
		rpo.enterpassword().sendKeys("");
		rpo.enterconfirmpass().sendKeys("");
		rpo.entersubsribe().click();
		rpo.policycheckbox().click();
		rpo.clickoncontinue().click();
        CommonMethods.handleAssertion(rpo.firstnameerrormsg().getText(), Constants.firstnameErrormsg);
		CommonMethods.handleAssertion(rpo.lastnameerrormsg().getText(), Constants.lastnameErrormsg);
		CommonMethods.handleAssertion(rpo.emailnameerrormsg().getText(), Constants.emailErrormsg);
		CommonMethods.handleAssertion(rpo.telephoneerrormsg().getText(), Constants.telephoneErrormsg);
		CommonMethods.handleAssertion(rpo.passwordnameerrormsg().getText(), Constants.passwordErrormsg);

	}

	@Test(priority = 2)
	public void verifyregistration() throws IOException, InterruptedException {
		randomemailgenerate = generaterandomemail();
		passwordrandomgenerate = generatepassword();
		Registrationpageobject rpo = new Registrationpageobject(driver);
		CommonMethods.putExplicitwaits(driver, 20, rpo.enterfirstname());
		rpo.enterfirstname().sendKeys(Constants.firstname);
		rpo.enterlastname().sendKeys(Constants.lastname);
		rpo.enteremail().sendKeys(randomemailgenerate);
		rpo.entertelephone().sendKeys(Constants.telephone);
		rpo.enterpassword().sendKeys(passwordrandomgenerate);
		rpo.enterconfirmpass().sendKeys(passwordrandomgenerate);
		rpo.entersubsribe().click();
		// rpo.policycheckbox().click();
		rpo.clickoncontinue().click();
		CommonMethods.handleAssertion(driver.getCurrentUrl(), Constants.regcurrenturl);
	}

}
