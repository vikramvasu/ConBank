package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC09VerifyAccountBalModuleUsingAccountBalOfCorrectCASAAccount extends wrappers.ProjectWrappers{

	public TC09VerifyAccountBalModuleUsingAccountBalOfCorrectCASAAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC09 - To Verify that user is able to view the Account Balance using Account Balance of Correct Account Type - Supported Intent Utterances";
		TestDescription="To Verify that user is able to view the Account Balance using Account Balance of Correct Account Type - Supported Intent Utterances";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void AccountBalOfAccountType() throws Exception
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
		.EnterText("Account Balance of Savings account")
		.VerifyCardIsPersent("aXcessPlus Account")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
