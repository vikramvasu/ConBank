package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC35PayCreditCardPayUtteranceBasedOnAccountandCard extends wrappers.ProjectWrappers{

	public TC35PayCreditCardPayUtteranceBasedOnAccountandCard() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC35 - To Verify that the bot should select amount type automatically when user gives utterance based on Account and Card" ; 
		TestDescription="TC35 - To Verify that the bot should select amount type automatically when user gives utterance based on Account and Card";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardPayUtteranceBasedOnAccountandCard() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay Platinum rewards credit card from Regular Current accounts")
	    .VerifyClientResponseMessage("Choose the amount you want to pay?")
		.ClickPaycreditcardElement("Minimum Amount")
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 1000 to Platinum Rewards from your Regular Current Account . Please confirm.");
		
	}	
}
