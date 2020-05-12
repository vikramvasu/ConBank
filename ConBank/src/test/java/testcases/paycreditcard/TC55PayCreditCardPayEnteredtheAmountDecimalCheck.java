package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC55PayCreditCardPayEnteredtheAmountDecimalCheck extends wrappers.ProjectWrappers{

	public TC55PayCreditCardPayEnteredtheAmountDecimalCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC55 - To Verify that the user should be allowed to view the proper validation message when the user enters more than two decimal amount values"  ; 
		TestDescription="TC55 - To Verify that the user should be allowed to view the proper validation message when the user enters more than two decimal amount values";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	


	@Test
	public void OtherAmountvalidation() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay Credit Card")
		.VerifyAccountListMessage()
		.VerifyPaycreditcardElementPresent("SuperValue Account")
		.VerifyPaycreditcardElementPresent("aXcessPlus Account")
		.VerifyPaycreditcardElementPresent("Regular Current Account")
		.ClickPaycreditcardElement("Regular Current Account")
		.VerifyClientResponseMessage("Which card do you want to pay?")
		.ClickPaycreditcardElement("Platinum Rewards")
		.VerifyClientResponseMessage("Choose the amount you want to pay?")
		.ClickPaycreditcardElement("Other Amount")
		.VerifyClientResponseMessage("Please enter the amount do you want to pay ?")
		.EnterTextArea("123.123")
		.VerifyClientResponseMessage("Please enter an amount with decimal up to 2 digits.");
	}
	
}
