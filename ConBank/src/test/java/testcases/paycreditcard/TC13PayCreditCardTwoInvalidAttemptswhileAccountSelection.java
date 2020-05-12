package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC13PayCreditCardTwoInvalidAttemptswhileAccountSelection extends wrappers.ProjectWrappers{

	public TC13PayCreditCardTwoInvalidAttemptswhileAccountSelection() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC13 -To Verify that the bot should cancel the conversation when user enters wrong inputs for two invalid attempts while Account Selection";
		TestDescription="TC13 -To Verify that the bot should cancel the conversation when user enters wrong inputs for two invalid attempts while Account Selection";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardTwoInvalidAttemptswhileAccountSelection() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Pay Credit Card")
		.ClickLogin()
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.VerifyAccountListMessage()
		.VerifyPaycreditcardElementPresent("SuperValue Account")
		.VerifyPaycreditcardElementPresent("aXcessPlus Account")
		.VerifyPaycreditcardElementPresent("Regular Current Account")
		.EnterTextArea("Wrong Account Name")
		.VerifyNotAbleToFindAccount("Wrong Account Name")
		.VerifyClientResponseMessage("Please choose an account from below.")
		.EnterTextArea("Second Invalid Account")
		.VerifyClientResponseMessage("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.VerifyClientResponseMessage("Is there anything else i can help you with?");
	}
	
}
