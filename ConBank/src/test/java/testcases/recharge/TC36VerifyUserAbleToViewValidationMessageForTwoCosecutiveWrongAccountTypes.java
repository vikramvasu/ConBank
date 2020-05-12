package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC36VerifyUserAbleToViewValidationMessageForTwoCosecutiveWrongAccountTypes extends wrappers.ProjectWrappers{

	public TC36VerifyUserAbleToViewValidationMessageForTwoCosecutiveWrongAccountTypes() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC36 - To Verify that user is able to view proper validation message for Wrong Account Type entered Twice";
		TestDescription="To Verify that user is able to view proper validation message for Wrong Account Type entered Twice";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void wrongAccountTypeTwice() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		//.verifyRechargeIcon("Recharge")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.EnterText("Recharge from esaver account")
		.verifyWrongAccountText("esaver account")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge")
		.EnterText("Recharge from esaver account")
		.verifyWrongAccountText("esaver account")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge")
		.EnterText("Recharge from esaver account")
		.verify2InvalidInput("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}
	
}
