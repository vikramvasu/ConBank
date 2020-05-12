package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC10VerifyValidationMessageForWrongAccountType extends wrappers.ProjectWrappers{

	public TC10VerifyValidationMessageForWrongAccountType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC10 - To Verify that user is able to view the validation message for the Account Balance using Wrong Account Type - Supported Intent Utterances";
		TestDescription="To Verify that user is able to view the validation message for the Account Balance using Wrong Account Type - Supported Intent Utterances";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void ValidationMsgForWrongAccountType() throws Exception
	{
		new AccountBalancePage(driver,test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		//.verifyAccountBalanceIcon("Account Balance")
		.EnterText("Login")
		.EnterUserName("user5")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("user5")
		.EnterText("Account Balance of savings account")
		.ScrollUpForWrongAccountNameText()
		.verifyWrongAccountText("savings")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
