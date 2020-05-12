package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC27PayCreditCardUsertoClickOnOtherAmountEntertheAmount extends wrappers.ProjectWrappers{

	public TC27PayCreditCardUsertoClickOnOtherAmountEntertheAmount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC27 - To Verify that the bot should allow the user to enter the amount ";
		TestDescription="TC27 - To Verify that the bot should allow the user to enter the amount ";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	
	@Test
	public void UsertoClickOnOtherAmountEntertheAmount() throws Exception
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
