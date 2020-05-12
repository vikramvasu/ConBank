package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC41PayCreditCardPayNoAccountUserPayCreditCard extends wrappers.ProjectWrappers{

	public TC41PayCreditCardPayNoAccountUserPayCreditCard() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC41 - To Verify that the bot should response no accounts to select while Pay Credit Card from savings account"  ; 
		TestDescription="TC41 - To Verify that the bot should response no accounts to select while Pay Credit Card from savings account";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	


	@Test
	public void UserNoAccount() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("user5")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("user5")
	    .EnterTextArea("Pay Credit Card from savings account")
		.VerifyClientResponseMessage("Sorry, I was not able to find any enrolled credit cards for payment.");
	}
	
}
