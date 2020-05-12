package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC43ManageCardsIsthereanythingelseCheckinUnblockCancellationMessage extends wrappers.ProjectWrappers{

	public TC43ManageCardsIsthereanythingelseCheckinUnblockCancellationMessage() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC43 - To verify that user able to view Is there anything else I can help you with? message in Block Cancellation Message";
		TestDescription="TC43 - To verify that user able to view Is there anything else I can help you with? message in Block Cancellation Message";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsUnblockCancellationMessage() throws Exception
	{
		new ManageCardsPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.EnterTextArea("Manage Cards")
		.clickBlockIcon()
		.VerifyCardIsPresent("Ultimate Card")
		.EnterTextArea("Ultimate Card")
		.VerifyManageCardConfirmationMessage("Are you sure you want to block your","Ultimate Card.")
		.clickConfirmButton()
		.clickRefreshButton()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.EnterTextArea("Manage Cards")
		.VerifyManageCardClientMessage("Would you like to Block or Unblock card")
		.clickUnBlockIcon()
		.VerifyManageCardConfirmationMessage("Are you sure you want to Unblock your","Ultimate Card.")
		.clickCancelButton()
		.VerifyManageCardClientMessage("Your unblock card request has been cancelled.")
		.VerifyManageCardClientMessage("Is there anything else I can help you with?")
		.clickRefreshButton()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.EnterTextArea("Unblock")
		.clickConfirmButton()
		.VerifyManageCardClientMessage("Your card has been unblocked successfully.");
	}
	
}
