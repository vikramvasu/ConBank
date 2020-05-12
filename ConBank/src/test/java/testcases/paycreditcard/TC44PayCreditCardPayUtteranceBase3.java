package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC44PayCreditCardPayUtteranceBase3 extends wrappers.ProjectWrappers{

	public TC44PayCreditCardPayUtteranceBase3() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC44 - To Verify that the bot should select amount - Pay Credit Card from current account ending with"  ; 
		TestDescription="TC44 - To Verify that the bot should select amount - Pay Credit Card from current account ending with";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardPayUtteranceBase() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay Credit Card from current account ending with 3968")
	    .VerifyClientResponseMessage("Which card do you want to pay?")
		.ClickPaycreditcardElement("Ultimate Card")
		.VerifyClientResponseMessage("Choose the amount you want to pay?")
		.ClickPaycreditcardElement("Minimum Amount")	
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 1050 to Ultimate Card from your Regular Current Account . Please confirm.");
		
	}	
}
