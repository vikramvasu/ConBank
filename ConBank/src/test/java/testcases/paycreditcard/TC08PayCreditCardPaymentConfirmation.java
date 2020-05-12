package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC08PayCreditCardPaymentConfirmation extends wrappers.ProjectWrappers{

	public TC08PayCreditCardPaymentConfirmation() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC08 - To Verify that the user able to select the credit card payment confirmation";
		TestDescription="TC08 - To Verify that the user able to select the credit card payment confirmation";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardPaymentConfirmation() throws Exception
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
		.VerifyClientResponseMessage("Enter the OTP you have received to your registered mobile.");
	}
	
}
