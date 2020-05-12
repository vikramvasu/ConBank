package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC33PayCreditCardPayPlatinumRewards extends wrappers.ProjectWrappers{

	public TC33PayCreditCardPayPlatinumRewards() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC33 - To Verify that the bot should select the correct account automatically - Pay Platinum Rewards" ; 
		TestDescription="TC33 - To Verify that the bot should select the correct account automatically - Pay Platinum Rewards";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardPayPlatinumRewards() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay Platinum Rewards")
	    .VerifyAccountListMessage()
		.ClickPaycreditcardElement("Regular Current Account")
		.VerifyClientResponseMessage("Choose the amount you want to pay?")
		.ClickPaycreditcardElement("Minimum Amount")
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 1000 to Platinum Rewards from your Regular Current Account . Please confirm.");
		
	}	
}
