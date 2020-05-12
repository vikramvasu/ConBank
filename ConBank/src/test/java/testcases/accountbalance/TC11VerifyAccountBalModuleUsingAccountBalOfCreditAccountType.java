package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC11VerifyAccountBalModuleUsingAccountBalOfCreditAccountType extends wrappers.ProjectWrappers{

	public TC11VerifyAccountBalModuleUsingAccountBalOfCreditAccountType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC11 - To Verify that user is able to view the Account Balance using Account Balance of Correct Credit Account - Supported Intent Utterances";
		TestDescription="To Verify that user is able to view the Account Balance using Account Balance of Correct Credit Account - Supported Intent Utterances";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void AccountBalOfCreditAccount() throws Exception
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
		.EnterText("Account Balance of credit accounts")
		.VerifyCardIsPersent("Ultimate Card") 
		.verifyAnythingElseText("Is there anything else I can help you with?");
	} 

}
