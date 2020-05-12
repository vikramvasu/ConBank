package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC37PayCreditCardPayUtteranceBasedOnAccountType extends wrappers.ProjectWrappers{

	public TC37PayCreditCardPayUtteranceBasedOnAccountType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC37 - To Verify that the bot should select amount type automatically - Pay Platinum Rewards from Savings Account" ; 
		TestDescription="TC37 - To Verify that the bot should select amount type automatically - Pay Platinum Rewards from Savings Account";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardPayPlatinumRewardsOtherAmount() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay Platinum Rewards from Savings Account")
	    .ClickPaycreditcardElement("SuperValue Account")
		.VerifyClientResponseMessage("Choose the amount you want to pay?")
		.ClickPaycreditcardElement("Minimum Amount")
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 1000 to Platinum Rewards from your SuperValue Account . Please confirm.");
		
	}	
}
