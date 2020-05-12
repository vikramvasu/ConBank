package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC31PayCreditCardUserGivesUtterancebasedonAccountType extends wrappers.ProjectWrappers{

	public TC31PayCreditCardUserGivesUtterancebasedonAccountType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC31 - To Verify that the bot should select the correct account automatically - Pay Credit Card from Savings account" ; 
		TestDescription="TC31 - To Verify that the bot should select the correct account automatically - Pay Credit Card from Savings account";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void UtterancebasedonAccountNameSavingAccount() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay Credit Card from Savings Account")
		.VerifyClientResponseMessage("From which savings account do you want to pay?")
		.VerifyPaycreditcardElementPresent("SuperValue Account")
		.VerifyPaycreditcardElementPresent("aXcessPlus Account");
		
	}
	
	@Test
	public void UtterancebasedonAccountNameAxcessPlusAccount() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay credit card from current account")
	    .VerifyClientResponseMessage("Paying from your Regular Current Account.")
		.VerifyClientResponseMessage("Which card do you want to pay?")
		.VerifyPaycreditcardElementPresent("Ultimate Card")
		.VerifyPaycreditcardElementPresent("Platinum Rewards");
		
	}
	
	
}
