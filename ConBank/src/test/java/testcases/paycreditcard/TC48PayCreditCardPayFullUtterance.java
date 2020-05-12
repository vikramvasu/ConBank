package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC48PayCreditCardPayFullUtterance extends wrappers.ProjectWrappers{

	public TC48PayCreditCardPayFullUtterance() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC48 - To Verify that the bot should select amount - Pay Credit Card from Super Account"  ; 
		TestDescription="TC48 - To Verify that the bot should select amount - Pay Credit Card from Super Account";
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
	    .EnterTextArea("Pay Minimum Amount for my Platinum Rewards from SuperValue Account")
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 1000 to Platinum Rewards from your SuperValue Account . Please confirm.");
		
	}	
}
