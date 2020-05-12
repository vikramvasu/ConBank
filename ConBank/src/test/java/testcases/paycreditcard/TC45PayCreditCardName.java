package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC45PayCreditCardName extends wrappers.ProjectWrappers{

	public TC45PayCreditCardName() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC45 - To Verify that the bot should response Pay Credit card name"  ; 
		TestDescription="TC45 - To Verify that the bot should response Pay Credit card name";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayUltimateCard() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay Ultimate Card")
	    .VerifyAccountListMessage()
		.ClickPaycreditcardElement("Regular Current Account")
		.VerifyClientResponseMessage("Choose the amount you want to pay?")
		.ClickPaycreditcardElement("Other Amount")
		.VerifyClientResponseMessage("Please enter the amount do you want to pay ?")
		.EnterTextArea("99")
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 99 to Ultimate Card from your Regular Current Account . Please confirm.");
	}	
	
	@Test
	public void PayPlatinumRewards() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("Tagit")
	    .EnterTextArea("Pay Platinum Rewards")
	    .VerifyAccountListMessage()
	    .ClickPaycreditcardElement("Regular Current Account")
		.VerifyClientResponseMessage("Choose the amount you want to pay?")
		.ClickPaycreditcardElement("Other Amount")
		.VerifyClientResponseMessage("Please enter the amount do you want to pay ?")
		.EnterTextArea("120")
		.verifyPayCreditCardConfirmationMessage("You will be paying USD 120 to Platinum Rewards from your Regular Current Account . Please confirm.");
	}	
}
