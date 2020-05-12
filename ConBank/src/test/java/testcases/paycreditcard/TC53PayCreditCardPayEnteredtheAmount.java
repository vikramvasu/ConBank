package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC53PayCreditCardPayEnteredtheAmount extends wrappers.ProjectWrappers{

	public TC53PayCreditCardPayEnteredtheAmount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC53 - To Verify that the bot should allow the user to enter the amount"  ; 
		TestDescription="TC53 - To Verify that the bot should allow the user to enter the amount";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	


	@Test
	public void UsertoClickOnOtherAmount() throws Exception
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
		.ClickPaycreditcardElement("Regular Current Account")
		.VerifyClientResponseMessage("Which card do you want to pay?")
		.ClickPaycreditcardElement("Platinum Rewards")
		.VerifyClientResponseMessage("Choose the amount you want to pay?")
		.ClickPaycreditcardElement("Other Amount")
		.VerifyClientResponseMessage("Please enter the amount do you want to pay ?")
		.EnterTextArea("99")
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 99 to Platinum Rewards from your Regular Current Account . Please confirm.");
	}
	
}
