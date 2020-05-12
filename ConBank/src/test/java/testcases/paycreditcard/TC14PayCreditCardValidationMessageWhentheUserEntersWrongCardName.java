package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC14PayCreditCardValidationMessageWhentheUserEntersWrongCardName extends wrappers.ProjectWrappers{

	public TC14PayCreditCardValidationMessageWhentheUserEntersWrongCardName() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC14 - To Verify that the user should be allowed to view the proper validation message when the user enters wrong card names while Card selection";
		TestDescription="TC14 - To Verify that the user should be allowed to view the proper validation message when the user enters wrong card names while Card selection";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardValidationMessageWhentheUserEntersWrongCardName() throws Exception
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
		.VerifyClientResponseMessage("Here are your available credit cards for payment.");
	}
	
}
