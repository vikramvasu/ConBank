package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC19PayCreditCardTwoInvalidAttemptsWhileConfirmingthePayment extends wrappers.ProjectWrappers{

	public TC19PayCreditCardTwoInvalidAttemptsWhileConfirmingthePayment() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC19 - To Verify that the user should be allowed to view the proper validation message when the user enters wrong confirmation inputs twice while confirming the payment";
		TestDescription="TC19 - To Verify that the user should be allowed to view the proper validation message when the user enters wrong confirmation inputs twice while confirming the payment";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardUserEntersWrongConfirmationInputWhileConfirmingthePayment() throws Exception
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
		.EnterTextArea("Wrong")
		.verifyPayCreditCardConfirmationMessage("Wrong is an inavlid input. Please select confirm to pay USD 1050 to Ultimate Card from your SuperValue Account or cancel to abort the transaction.")
		.EnterTextArea("Second Invalid Payment Type")
		.VerifyClientResponseMessage("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.VerifyClientResponseMessage("Is there anything else i can help you with?");
	}
	
}
