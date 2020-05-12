package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC39PayCreditCardPayUtteranceBase extends wrappers.ProjectWrappers{

	public TC39PayCreditCardPayUtteranceBase() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC39 - To Verify that the bot should select amount - Pay Platinum Rewards from Savings Account ending with Invalid Number"  ; 
		TestDescription="TC39 - To Verify that the bot should select amount - Pay Platinum Rewards from Savings Account ending with Invalid Number";
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
	    .EnterTextArea("Pay Platinum Rewards from Savings Account ending with 14341")
	    .VerifyClientResponseMessage("Sorry, this is not a valid account number.")
		.VerifyClientResponseMessage("Please choose an account from below.")
		.VerifyPaycreditcardElementPresent("SuperValue Account")
		.VerifyPaycreditcardElementPresent("aXcessPlus Account")
		.VerifyPaycreditcardElementPresent("Regular Current Account");
		
	}	
}
