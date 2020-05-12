package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC02VerifyUserAbleToClickAccountBalanceIconWithoutLogin extends wrappers.ProjectWrappers{

	public TC02VerifyUserAbleToClickAccountBalanceIconWithoutLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC02 - Verify User able to click the Account Balance Icon Without Login";
		TestDescription="Account Balance";
		browserName="chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test
	public void AccountBalanceIconWithoutLogin() throws Exception
	{
		new AccountBalancePage(driver, test) 
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.verifyAccountBalanceIcon("Account Balance")
		.ClickAccountBalance();
	}
	
}
