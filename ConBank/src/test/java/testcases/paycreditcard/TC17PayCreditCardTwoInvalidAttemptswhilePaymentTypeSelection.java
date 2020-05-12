package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC17PayCreditCardTwoInvalidAttemptswhilePaymentTypeSelection extends wrappers.ProjectWrappers{

	public TC17PayCreditCardTwoInvalidAttemptswhilePaymentTypeSelection() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC17 - To Verify that the bot should cancel the conversation when user enters wrong inputs for two invalid attempts while payment type selection";
		TestDescription="TC17 - To Verify that the bot should cancel the conversation when user enters wrong inputs for two invalid attempts while payment type selection";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardTwoInvalidAttemptswhilePaymentTypeSelection() throws Exception
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
		.ClickPaycreditcardElement("Ultimate Card")
		.VerifyClientResponseMessage("Choose the amount you want to pay?")
		.EnterTextArea("Wrong Payment Type")
		.VerifyClientResponseMessage("Given type is not a valid payment.")
		.VerifyClientResponseMessage("Choose the amount you want to pay?")
		.EnterTextArea("Second Invalid Payment Type")
		.VerifyClientResponseMessage("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.VerifyClientResponseMessage("Is there anything else i can help you with?");
	}
	
}
