package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC21PayCreditCardTwoInvalidAttemptsWhileEnteringtheOTP extends wrappers.ProjectWrappers{

	public TC21PayCreditCardTwoInvalidAttemptsWhileEnteringtheOTP() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC21 - To Verify that the bot should cancel the conversation when user enters wrong inputs for two invalid attempts while entering the OTP";
		TestDescription="TC21 - To Verify that the bot should cancel the conversation when user enters wrong inputs for two invalid attempts while entering the OTP";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void TwoInvalidAttemptswhileAccountSelection() throws Exception
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
		.ClickPaycreditcardElement("Minimum Amount")
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 1050 to Ultimate Card from your SuperValue Account . Please confirm.")
		.clickConfirmButton()
		.VerifyClientResponseMessage("Enter the OTP you have received to your registered mobile.")
		.EnterTextArea("ABC123456")
		.VerifyClientResponseMessage("Given OTP is invalid, Please re-enter.")
		.EnterTextArea("ABC123")
		.VerifyClientResponseMessage("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.VerifyClientResponseMessage("Is there anything else i can help you with?");
		
	}
	
}
