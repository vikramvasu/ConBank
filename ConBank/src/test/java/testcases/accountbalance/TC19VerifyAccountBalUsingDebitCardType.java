package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC19VerifyAccountBalUsingDebitCardType extends wrappers.ProjectWrappers{

	public TC19VerifyAccountBalUsingDebitCardType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC19 - To Verify that user is able to view the Account Balance using Debit Card Type Utterance";
		TestDescription="To Verify that user is able to view the Account Balance using Debit Card Type Utterance";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void AccountBalForDebitCardType() throws Exception
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
		.EnterText("Account Balance of debit cards")
		.VerifyCardIsPersent("SuperValue Account")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
