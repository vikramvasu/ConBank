package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC14VerifyValidationMessageForDifferentAccountTypeEndingUtterance extends wrappers.ProjectWrappers{

	public TC14VerifyValidationMessageForDifferentAccountTypeEndingUtterance() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC14 - To Verify that user is able to view the valdiation message when the User gives Different Account Type Ending Utterance";
		TestDescription="To Verify that user is able to view the valdiation message when the User gives Different Account Type Ending Utterance";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void AccountBalForDifferentAccountTypeEnding() throws Exception
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
		.EnterText("Account Balance of Current account ending with 5546")
		.ScrollUpForWrongAccountNameText()
		.verifyWrongAccountTypeEndingText("any checking account ending 5546")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
