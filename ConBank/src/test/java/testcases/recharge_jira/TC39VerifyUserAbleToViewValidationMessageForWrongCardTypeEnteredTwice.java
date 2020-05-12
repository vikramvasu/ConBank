package testcases.recharge_jira;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC39VerifyUserAbleToViewValidationMessageForWrongCardTypeEnteredTwice extends wrappers.ProjectWrappers{

	public TC39VerifyUserAbleToViewValidationMessageForWrongCardTypeEnteredTwice() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC39 - To Verify that user is able to view proper validation message for Wrong Card Type entered twice";
		TestDescription="Recharge";
		browserName="Chrome";
		Application="ConBank";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void wrongCardTypeEnteredTwice() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.verifyRechargeIcon("Recharge")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		.verifyWelcomeUserName("Tagit")
		.EnterText("Recharge from esaver card")
		.verifyWrongAccountText("esaver card")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge")
		.EnterText("Recharge from esaver card")
		.verify2InvalidInput("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}
	
}
