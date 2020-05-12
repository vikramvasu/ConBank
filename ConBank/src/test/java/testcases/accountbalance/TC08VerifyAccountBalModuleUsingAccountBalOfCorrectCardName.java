package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC08VerifyAccountBalModuleUsingAccountBalOfCorrectCardName extends wrappers.ProjectWrappers{

	public TC08VerifyAccountBalModuleUsingAccountBalOfCorrectCardName() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC08 - To Verify that user is able to view the Account Balance using Account Balance of Correct Card Name - Supported Intent Utterances";
		TestDescription="To Verify that user is able to view the Account Balance using Account Balance of Correct Card Name - Supported Intent Utterances";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void AccountBalOfCardName() throws Exception
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
		.EnterText("Account Balance of Platinum Rewards")
		.VerifyCardIsPersent("Platinum Rewards")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
