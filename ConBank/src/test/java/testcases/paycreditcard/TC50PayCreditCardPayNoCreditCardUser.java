package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC50PayCreditCardPayNoCreditCardUser extends wrappers.ProjectWrappers{

	public TC50PayCreditCardPayNoCreditCardUser() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC50 - To Verify that the bot should response no cards to select while paying credit card"  ; 
		TestDescription="TC50 - To Verify that the bot should response no cards to select while paying credit card";
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
	    .EnterTextArea("Pay Credit Card")
		.VerifyClientResponseMessage("Sorry, I was not able to find any enrolled credit cards for payment.");
	}
	
}
