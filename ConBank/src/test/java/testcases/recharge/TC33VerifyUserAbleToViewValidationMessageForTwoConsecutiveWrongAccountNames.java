package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC33VerifyUserAbleToViewValidationMessageForTwoConsecutiveWrongAccountNames extends wrappers.ProjectWrappers{

	public TC33VerifyUserAbleToViewValidationMessageForTwoConsecutiveWrongAccountNames() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC33 - To Verify that user is able to view proper validation message for Two invalid Wrong Account Names";
		TestDescription="To Verify that user is able to view proper validation message for Two invalid Wrong Account Names";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void wrongAccountNameTwice() throws Exception
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
		.EnterText("Recharge from employee banking account")
		.verifyWrongAccountText("employee banking account")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge")
		.EnterText("Recharge from employee banking account")
		.verifyWrongAccountText("employee banking account")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge")
		.EnterText("Recharge from employee banking account")
		.verify2InvalidInput("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.verifyAnythingElseText("Is there anything else I can help you with?");		
	}
	
}
