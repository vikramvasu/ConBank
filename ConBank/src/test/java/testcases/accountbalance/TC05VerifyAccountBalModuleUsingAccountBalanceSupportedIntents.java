package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC05VerifyAccountBalModuleUsingAccountBalanceSupportedIntents extends wrappers.ProjectWrappers{

	public TC05VerifyAccountBalModuleUsingAccountBalanceSupportedIntents() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC05 - To Verify that user is able to view the Account Balance using Account Balance - Supported Intent Utterances";
		TestDescription="To Verify that user is able to view the Account Balance using Account Balance - Supported Intent Utterances";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void AccountBalByAccountType() throws Exception
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
		.EnterText("Show me my Account Balance")
		.VerifyCardIsPersent("SuperValue")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	} 

}
