package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC15VerifyAccountBalUsingAccountNumberEndingUtterance extends wrappers.ProjectWrappers{

	public TC15VerifyAccountBalUsingAccountNumberEndingUtterance() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC15 - To Verify that user is able to view the Account Balance using Account Balance of Account Number Ending Utterance";
		TestDescription="To Verify that user is able to view the valdiation message when the User gives Different Account Type Ending Utterance";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void AccountBalOfAccountNumberEnding() throws Exception
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
		.EnterText("Account Balance of account number ending with 5546")
		.VerifyCardIsPersent("SuperValue Account")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
