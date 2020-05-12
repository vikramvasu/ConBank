package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC12PayCreditCardValidationMessageWhentheUserEntersWrongAccountName extends wrappers.ProjectWrappers{

	public TC12PayCreditCardValidationMessageWhentheUserEntersWrongAccountName() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC12 - To Verify that the user should be allowed to view the proper validation message when the user enters wrong account names while Account selection";
		TestDescription="TC12 - To Verify that the user should be allowed to view the proper validation message when the user enters wrong account names while Account selection";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardValidationMessageWhentheUserEntersWrongAccountName() throws Exception
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
		.EnterTextArea("Wrong Account Name")
		.VerifyNotAbleToFindAccount("Wrong Account Name")
		.VerifyClientResponseMessage("Please choose an account from below.");
	}
	
}
