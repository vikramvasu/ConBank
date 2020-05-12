package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC27ManageCardsBlockCreditCardbyCardName extends wrappers.ProjectWrappers{

	public TC27ManageCardsBlockCreditCardbyCardName() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC27 - To verify that user able to block the credit card based on supported Intent - Block card by card name- Block Platinum Rewards"; 	    
		TestDescription="TC27 - To verify that user able to block the credit card based on supported Intent - Block card by card name- Block Platinum Rewards";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsBlockDebitCardbyCardName() throws Exception
	{
		new ManageCardsPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Block Platinum Rewards")
		.VerifyManageCardConfirmationMessage("Are you sure you want to block your","Platinum Rewards.")
		.clickConfirmButton()
		.VerifyManageCardClientMessage("Your card has been blocked successfully.")
		.VerifyManageCardClientMessage("Is there anything else I can help you with?")
		.clickRefreshButton()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Manage Cards")
		.VerifyManageCardClientMessage("Would you like to Block or Unblock card")
		.EnterTextArea("Unblock")
		.clickConfirmButton()
		.VerifyManageCardClientMessage("Your card has been unblocked successfully.");
			
	}	
}
