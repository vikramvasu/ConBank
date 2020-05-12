package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC47PayPlatinumRewardsfromSavingsAccount extends wrappers.ProjectWrappers{

	public TC47PayPlatinumRewardsfromSavingsAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC47 - To Verify that the bot should select amount - Pay Platinum Rewards from Savings Account"  ; 
		TestDescription="TC47 - To Verify that the bot should select amount - Pay Platinum Rewards from Savings Account";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardPayUtteranceBase() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay Platinum Rewards from Savings Account")
	    .VerifyClientResponseMessage("From which savings account do you want to pay?")
		.ClickPaycreditcardElement("SuperValue Account")
		.VerifyClientResponseMessage("Choose the amount you want to pay?")
		.ClickPaycreditcardElement("Minimum Amount")	
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 1000 to Platinum Rewards from your SuperValue Account . Please confirm.");
		
	}	
}
