package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;

public class TC01VerifyAccountBalanceIconIsAsPerUI extends wrappers.ProjectWrappers{

	public TC01VerifyAccountBalanceIconIsAsPerUI() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC01 - Verify the Account Balance Icon Is As Per UI";
		TestDescription="Verify the Account Balance Icon Is As Per UI";
		browserName="chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test
	public void verifyAccountBalanceIcon() throws Exception
	{
		new AccountBalancePage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.verifyAccountBalanceIcon("Account Balance");
	}

}
