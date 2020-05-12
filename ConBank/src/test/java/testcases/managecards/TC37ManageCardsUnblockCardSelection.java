package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC37ManageCardsUnblockCardSelection extends wrappers.ProjectWrappers{

	public TC37ManageCardsUnblockCardSelection() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC37 - To verify that user able to select the cards to block by clicking block button";
		TestDescription="TC37 - To verify that user able to select the cards to block by clicking block button";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsUnblockCardSelection() throws Exception
	{
		new ManageCardsPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Manage Cards")
		.VerifyManageCardClientMessage("Would you like to Block or Unblock card")
		.clickBlockIcon()
		.VerifyManageCardClientMessage("Here are your card details. Which card do you want to block?")
		.VerifyCardIsPresent("Ultimate Card")
		.VerifyCardIsPresent("Platinum Rewards")
		.EnterTextArea("Ultimate Card")
		.VerifyManageCardConfirmationMessage("Are you sure you want to block your","Ultimate Card.")
		.clickConfirmButton()
		.VerifyManageCardClientMessage("Your card has been blocked successfully.")
		.VerifyManageCardClientMessage("Is there anything else I can help you with?")
		.clickRefreshButton()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.EnterTextArea("Manage Cards")
		.VerifyManageCardClientMessage("Would you like to Block or Unblock card")
		.clickBlockIcon()
		.VerifyManageCardClientMessage("Here are your card details. Which card do you want to block?")
		.VerifyCardIsPresent("Platinum Rewards")
		.EnterTextArea("Platinum Rewards")
		.VerifyManageCardConfirmationMessage("Are you sure you want to block your","Platinum Rewards.")
		.clickConfirmButton()
		.clickRefreshButton()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.EnterTextArea("Manage Cards")
		.VerifyManageCardClientMessage("Would you like to Block or Unblock card")
		.clickUnBlockIcon()
		.VerifyManageCardClientMessage("Here are your card details. Which card do you want to unblock?")
		.clickUnBlockButton("Ultimate Card")
		.VerifyManageCardConfirmationMessage("Are you sure you want to Unblock your","Ultimate Card.")
		.clickConfirmButton()
		.clickRefreshButton()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.EnterTextArea("Manage Cards")
		.VerifyManageCardClientMessage("Would you like to Block or Unblock card")
		.clickUnBlockIcon()
		.clickConfirmButton()
		.VerifyManageCardClientMessage("Your card has been unblocked successfully.");
	}
	
}
