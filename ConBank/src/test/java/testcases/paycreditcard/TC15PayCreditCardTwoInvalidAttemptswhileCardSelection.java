package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC15PayCreditCardTwoInvalidAttemptswhileCardSelection extends wrappers.ProjectWrappers{

	public TC15PayCreditCardTwoInvalidAttemptswhileCardSelection() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC15 - To Verify that the bot should cancel the conversation when user enters wrong inputs for two invalid attempts while Card selection";
		TestDescription="TC15 - To Verify that the bot should cancel the conversation when user enters wrong inputs for two invalid attempts while Card selection";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardTwoInvalidAttemptswhileCardSelection() throws Exception
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
		.ClickPaycreditcardElement("SuperValue Account")
		.VerifyClientResponseMessage("Which card do you want to pay?")
		.EnterTextArea("Wrong Card Name")
		.VerifyClientResponseMessage("Sorry, Wrong Card Name is an invalid card name.")
		.VerifyClientResponseMessage("Here are your available credit cards for payment.")
		.EnterTextArea("Second Invalid Card")
		.VerifyClientResponseMessage("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.VerifyClientResponseMessage("Is there anything else i can help you with?");
	}
	
}
