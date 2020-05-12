package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC32PayCreditCardAccountNumberEndingWith extends wrappers.ProjectWrappers{

	public TC32PayCreditCardAccountNumberEndingWith() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC32 - To Verify that the bot should select the correct account automatically - Pay Credit Card from account number ending with" ; 
		TestDescription="TC32 - To Verify that the bot should select the correct account automatically - Pay Credit Card from account number ending with";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void UtterancebasedonAccountNameSavingAccount() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay Credit Card from account number ending with 5546")
	    .VerifyClientResponseMessage("Which card do you want to pay?")
		.VerifyPaycreditcardElementPresent("Ultimate Card")
		.VerifyPaycreditcardElementPresent("Platinum Rewards");
		
	}	
}
