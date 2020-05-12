package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC16PayCreditCardValidationMessageWhentheUserEntersWrongPaymentType extends wrappers.ProjectWrappers{

	public TC16PayCreditCardValidationMessageWhentheUserEntersWrongPaymentType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC16 - To Verify that the user should be allowed to view the proper validation message when the user enters wrong Payment Type while Payment Type selection";
		TestDescription="TC16 - To Verify that the user should be allowed to view the proper validation message when the user enters wrong Payment Type while Payment Type selection";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardValidationMessageWhentheUserEntersWrongPaymentType() throws Exception
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
		.VerifyClientResponseMessage("Choose the amount you want to pay?");
	}
	
}
