package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC21VerifyValidationMessageForUserNotHavingCreditCard extends wrappers.ProjectWrappers{

	public TC21VerifyValidationMessageForUserNotHavingCreditCard() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC21 - To Verify that user is able to view proper validation message when the User gives credit card account balance but does not have any cards";
		TestDescription="To Verify that user is able to view proper validation message when the User gives credit card account balance but does not have any cards";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void ResponseForUserNotHavingCreditCard() throws Exception
	{
		new AccountBalancePage(driver,test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		//.verifyAccountBalanceIcon("Account Balance")
		.EnterText("Login")
		.EnterUserName("user5")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("user5")
		.EnterText("Account Balance of credit cards")
		.verifyNoCreditCardUserText("credit card")
		.verifyAnythingElseText("Is there anything else I can help you with?"); 
	}  

}
