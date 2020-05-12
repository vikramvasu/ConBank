package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC41VerifyUserAbleToRechargeUsingAccountTypeWithWrongAccountNumberEnding extends wrappers.ProjectWrappers{

	public TC41VerifyUserAbleToRechargeUsingAccountTypeWithWrongAccountNumberEnding() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC41 - To Verify that user is able to Recharge by using Account Type with Wrong Account Number";
		TestDescription="To Verify that user is able to Recharge by using Account Type with Wrong Account Number";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void AccountTypeWithWrongAccountNumber() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		//.verifyRechargeIcon("Recharge")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.EnterText("Recharge from Savings Account ending with 1111")
		.verifyWrongAccountNumberText("1111")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
}
