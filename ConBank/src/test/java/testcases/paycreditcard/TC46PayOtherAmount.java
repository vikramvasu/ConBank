package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC46PayOtherAmount extends wrappers.ProjectWrappers{

	public TC46PayOtherAmount() throws IOException {
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
	    .EnterTextArea("Pay Other Amount")
	    .VerifyAccountListMessage()
		.VerifyPaycreditcardElementPresent("SuperValue Account")
		.VerifyPaycreditcardElementPresent("aXcessPlus Account")
		.VerifyPaycreditcardElementPresent("Regular Current Account")
		.ClickPaycreditcardElement("Regular Current Account")
		.VerifyClientResponseMessage("Which card do you want to pay?")
		.ClickPaycreditcardElement("Platinum Rewards")
		.VerifyClientResponseMessage("Please enter the amount do you want to pay ?")
		.EnterTextArea("99")
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 99 to Platinum Rewards from your Regular Current Account . Please confirm.");
	}	
}
