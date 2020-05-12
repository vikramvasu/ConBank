package testcases.recharge_jira;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC44VerifyValidationMessageWhenUserEntersAccountTypeWithWrongAccountNumberEndingTwice extends wrappers.ProjectWrappers{

	public TC44VerifyValidationMessageWhenUserEntersAccountTypeWithWrongAccountNumberEndingTwice() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC44 - To Verify that user is able to view the validation message when he enters Account Type with Wrong Account Number twice";
		TestDescription="Recharge";
		browserName="Chrome";
		Application="ConBank";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void AccountTypeWithWrongAccountNumberEnteredTwice() throws Exception
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
		.EnterText("Recharge from Savings Account ending with 1111")
		.verifyWrongAccountNumberText("1111")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge")
		.EnterText("Recharge from Savings Account ending with 1111")
		.verify2InvalidInput("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}
	
}
