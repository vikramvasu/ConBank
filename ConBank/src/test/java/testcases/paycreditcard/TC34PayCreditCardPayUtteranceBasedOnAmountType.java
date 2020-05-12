package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC34PayCreditCardPayUtteranceBasedOnAmountType extends wrappers.ProjectWrappers{

	public TC34PayCreditCardPayUtteranceBasedOnAmountType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC34 - To Verify that the bot should select amount type automatically when user gives utterance based on amount type" ; 
		TestDescription="TC34 - To Verify that the bot should select amount type automatically when user gives utterance based on amount type";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardPayPlatinumRewardsMinimumAmount() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay minimum amount for my credit card")
	    .VerifyAccountListMessage()
		.ClickPaycreditcardElement("Regular Current Account")
		.VerifyClientResponseMessage("Which card do you want to pay?")
		.ClickPaycreditcardElement("Platinum Rewards")
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 1000 to Platinum Rewards from your Regular Current Account . Please confirm.");
		
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
		.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay Other amount for my credit card")
	    .VerifyAccountListMessage()
		.ClickPaycreditcardElement("Regular Current Account")
		.VerifyClientResponseMessage("Which card do you want to pay?")
		.ClickPaycreditcardElement("Platinum Rewards")
		.VerifyClientResponseMessage("Please enter the amount do you want to pay ?")
		.EnterTextArea("99")
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 99 to Platinum Rewards from your Regular Current Account . Please confirm.");
		
	}	
	
	@Test
	public void PayCreditCardPayPlatinumRewardsStatementAmount() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay statement amount for my credit card")
	    .VerifyAccountListMessage()
		.ClickPaycreditcardElement("Regular Current Account")
		.VerifyClientResponseMessage("Which card do you want to pay?")
		.ClickPaycreditcardElement("Platinum Rewards")
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 8000.56 to Platinum Rewards from your Regular Current Account . Please confirm.");
		
	}	
}
