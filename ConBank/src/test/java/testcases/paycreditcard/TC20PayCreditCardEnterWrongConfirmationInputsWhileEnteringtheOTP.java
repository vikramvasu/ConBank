package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC20PayCreditCardEnterWrongConfirmationInputsWhileEnteringtheOTP extends wrappers.ProjectWrappers{

	public TC20PayCreditCardEnterWrongConfirmationInputsWhileEnteringtheOTP() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC20 - To Verify that the user should be allowed to view the proper validation message when the user enters wrong confirmation inputs while entering the OTP";
		TestDescription="TC20 - To Verify that the user should be allowed to view the proper validation message when the user enters wrong confirmation inputs while entering the OTP";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardEnterWrongConfirmationInputsWhileEnteringtheOTP() throws Exception
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
		.VerifyClientResponseMessage("Given OTP is invalid, Please re-enter.");
		
	}
	
}
