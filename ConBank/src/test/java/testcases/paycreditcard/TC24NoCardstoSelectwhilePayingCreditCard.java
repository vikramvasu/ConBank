package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC24NoCardstoSelectwhilePayingCreditCard extends wrappers.ProjectWrappers{

	public TC24NoCardstoSelectwhilePayingCreditCard() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC24 - To Verify that the bot should display the proper validation message when there is no cards to select while paying credit card"  ; 
		TestDescription="TC24 - To Verify that the bot should display the proper validation message when there is no cards to select while paying credit card";
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
