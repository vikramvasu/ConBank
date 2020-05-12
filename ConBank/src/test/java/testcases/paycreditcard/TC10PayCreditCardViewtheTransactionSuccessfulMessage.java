package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC10PayCreditCardViewtheTransactionSuccessfulMessage extends wrappers.ProjectWrappers{

	public TC10PayCreditCardViewtheTransactionSuccessfulMessage() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC10 - To Verify that the user able to view the Transaction Successful Message";
		TestDescription="TC10 - To Verify that the user able to view the Transaction Successful Message";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardViewtheTransactionSuccessfulMessage() throws Exception
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
		.clickConfirmButton()
		.VerifyClientResponseMessage("Enter the OTP you have received to your registered mobile.")
		.EnterTextArea("123456")
		.verifySuccessIcon()
		.VerifyTransactionSuccessMessage();
	}
	
}
