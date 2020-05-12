package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC04VerifyAccountBalanceTextAfterLogin extends wrappers.ProjectWrappers{

	public TC04VerifyAccountBalanceTextAfterLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC04 - To Verify that user is able to enter Account Balance by Text - After Login";
		TestDescription="To Verify that user is able to enter Account Balance by Text - After Login";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram"; 
	}
	
	@Test
	public void AccountBalanceTextAfterLogin() throws Exception
	{
		new AccountBalancePage(driver,test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.verifyAccountBalanceIcon("Account Balance")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		.verifyWelcomeUserName("Tagit")
		.EnterText("Account Balance")
		.VerifyCardIsPersent("Ultimate Card")
		.VerifyCardIsPersent("Platinum Rewards")
		.VerifyCardIsPersent("SuperValue")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
