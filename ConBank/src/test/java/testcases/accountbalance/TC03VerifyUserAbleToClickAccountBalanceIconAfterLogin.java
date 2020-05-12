package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC03VerifyUserAbleToClickAccountBalanceIconAfterLogin extends wrappers.ProjectWrappers{

	public TC03VerifyUserAbleToClickAccountBalanceIconAfterLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC03 - Verify User able to click the Account Balance Icon After Login";
		TestDescription="Verify User able to click the Account Balance Icon After Login";
		browserName="chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test
	public void AccountBalanceIconClickAfterLogin() throws Exception
	{
		new AccountBalancePage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.verifyAccountBalanceIcon("Account Balance") 
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		.verifyWelcomeUserName("Tagit")
		.ScrollUpToSelectAccountBal()
		.ClickAccountBalance();
	}
	
}
