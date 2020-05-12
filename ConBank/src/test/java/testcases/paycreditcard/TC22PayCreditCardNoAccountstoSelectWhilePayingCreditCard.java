package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC22PayCreditCardNoAccountstoSelectWhilePayingCreditCard extends wrappers.ProjectWrappers{

	public TC22PayCreditCardNoAccountstoSelectWhilePayingCreditCard() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC22 - To Verify that the bot should display the proper validation message when there is no accounts to select while paying credit card";
		TestDescription="TC22 - To Verify that the bot should display the proper validation message when there is no accounts to select while paying credit card";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void NoAccountstoSelectWhilePayingCreditCard() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Pay Credit Card")
		.ClickLogin()
		.EnterUserName("user5")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("user5")
		.VerifyClientResponseMessage("Sorry, I was not able to find any enrolled credit cards for payment.")
		.VerifyClientResponseMessage("Is there anything else I can help you with?");
		
	}
	
}
