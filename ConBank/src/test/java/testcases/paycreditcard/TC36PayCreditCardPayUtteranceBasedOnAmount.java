package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC36PayCreditCardPayUtteranceBasedOnAmount extends wrappers.ProjectWrappers{

	public TC36PayCreditCardPayUtteranceBasedOnAmount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC36 - To Verify that the bot should select amount type automatically when user gives utterance based on amount" ; 
		TestDescription="TC36 - To Verify that the bot should select amount type automatically when user gives utterance based on amount";
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
	    .EnterTextArea("Pay 99")
	    .VerifyAccountListMessage()
		.ClickPaycreditcardElement("Regular Current Account")
		.VerifyClientResponseMessage("Which card do you want to pay?")
		.ClickPaycreditcardElement("Platinum Rewards")
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 99 to Platinum Rewards from your Regular Current Account . Please confirm.");
		
	}	
}
