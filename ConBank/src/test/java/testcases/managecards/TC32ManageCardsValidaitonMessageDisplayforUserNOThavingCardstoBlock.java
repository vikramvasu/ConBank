package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC32ManageCardsValidaitonMessageDisplayforUserNOThavingCardstoBlock extends wrappers.ProjectWrappers{

	public TC32ManageCardsValidaitonMessageDisplayforUserNOThavingCardstoBlock() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC32 - To verify that user able to view proper validation message when user NOT having any cards to Block ";
		TestDescription="TC32 - To verify that user able to view proper validation message when user NOT having any cards to Block ";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsValidaitonMessageDisplayforUserNOThavingCardstoBlock() throws Exception
	{
		new ManageCardsPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("user5")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("user5")
		.EnterTextArea("Manage Cards")
		.VerifyManageCardClientMessage("Would you like to Block or Unblock card")
		.clickBlockIcon()
		.clickConfirmButton()
		.VerifyManageCardClientMessage("Your card has been blocked successfully.")
		.VerifyManageCardClientMessage("Is there anything else I can help you with?")
		.EnterTextArea("Block")
		.VerifyManageCardClientMessage("Sorry, I cannot help you on blocking your cards as I dont find any cards linked to you.")
		.clickRefreshButton()
		.EnterTextArea("Login")
		.EnterUserName("user5")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.EnterTextArea("Manage Cards")
		.VerifyManageCardClientMessage("Would you like to Block or Unblock card")
		.EnterTextArea("Unblock")
		.clickConfirmButton()
		.VerifyManageCardClientMessage("Your card has been unblocked successfully.");
			
	}	
}
