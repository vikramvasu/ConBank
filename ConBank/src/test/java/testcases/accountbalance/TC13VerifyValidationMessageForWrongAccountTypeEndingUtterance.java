package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC13VerifyValidationMessageForWrongAccountTypeEndingUtterance extends wrappers.ProjectWrappers{

	public TC13VerifyValidationMessageForWrongAccountTypeEndingUtterance() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC13 - To Verify that user is able to view the valdiation message when the User gives Wrong Account Type Ending Utterance";
		TestDescription="To Verify that user is able to view the valdiation message when the User gives Wrong Account Type Ending Utterance";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void AccountBalForWrongAccountTypeEnding() throws Exception
	{
		new AccountBalancePage(driver,test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		//.verifyAccountBalanceIcon("Account Balance")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.EnterText("Account Balance of Savings account ending with 3333")
		.ScrollUpForWrongAccountNameText()
		.verifyWrongAccountTypeEndingText("any savings account ending 3333")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
