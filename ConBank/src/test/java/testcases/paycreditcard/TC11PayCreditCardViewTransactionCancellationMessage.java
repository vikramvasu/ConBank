package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC11PayCreditCardViewTransactionCancellationMessage extends wrappers.ProjectWrappers{

	public TC11PayCreditCardViewTransactionCancellationMessage() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC11 - To Verify that the user able to view the Transaction Cancellation Message";
		TestDescription="TC11 - To Verify that the user able to view the Transaction Cancellation Message";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardViewTransactionCancellationMessage() throws Exception
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
		.ClickPaycreditcardElement("Statement Amount")
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 4000 to Ultimate Card from your SuperValue Account . Please confirm.")
		.clickCancelButton()
		.verifyCancellationIcon()
		.VerifyClientResponseMessage("Is there anything else I can help you with?");
		
	}
	
}
