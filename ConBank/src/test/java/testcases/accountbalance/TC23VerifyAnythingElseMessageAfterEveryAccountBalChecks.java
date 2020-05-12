package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC23VerifyAnythingElseMessageAfterEveryAccountBalChecks extends wrappers.ProjectWrappers{

	public TC23VerifyAnythingElseMessageAfterEveryAccountBalChecks() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC23 - To Verify that user is able to view Anything Else message every Account Balance Checks";
		TestDescription="To Verify that user is able to view Anything Else message every Account Balance Checks";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void AnythingElseResponseAfterEveryAccountBalCheck() throws Exception
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
		.EnterText("Account Balance")
		.VerifyCardIsPersent("Regular Current Account")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
