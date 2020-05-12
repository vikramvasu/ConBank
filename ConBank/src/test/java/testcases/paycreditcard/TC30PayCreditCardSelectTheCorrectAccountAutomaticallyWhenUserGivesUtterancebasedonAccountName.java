package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC30PayCreditCardSelectTheCorrectAccountAutomaticallyWhenUserGivesUtterancebasedonAccountName extends wrappers.ProjectWrappers{

	public TC30PayCreditCardSelectTheCorrectAccountAutomaticallyWhenUserGivesUtterancebasedonAccountName() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC30 - To Verify that the bot should select the correct account automatically - Pay Credit Card from Supervalue account" ; 
		TestDescription="TC30 - To Verify that the bot should select the correct account automatically - Pay Credit Card from Supervalue account";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void UtterancebasedonAccountNameSuperValueAccount() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay Credit Card from Super Value Account")
		.VerifyClientResponseMessage("Which card do you want to pay?")
		.VerifyPaycreditcardElementPresent("Ultimate Card")
		.VerifyPaycreditcardElementPresent("Platinum Rewards");
		
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
	    .EnterTextArea("Pay Credit Card from aXcessPlus Account")
		.VerifyClientResponseMessage("Which card do you want to pay?")
		.VerifyPaycreditcardElementPresent("Ultimate Card")
		.VerifyPaycreditcardElementPresent("Platinum Rewards");
		
	}
	
	@Test
	public void UtterancebasedonAccountNameRegularCurrentAccount() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay Credit Card from Regular Current Account")
		.VerifyClientResponseMessage("Which card do you want to pay?")
		.VerifyPaycreditcardElementPresent("Ultimate Card")
		.VerifyPaycreditcardElementPresent("Platinum Rewards");
		
	}
}
