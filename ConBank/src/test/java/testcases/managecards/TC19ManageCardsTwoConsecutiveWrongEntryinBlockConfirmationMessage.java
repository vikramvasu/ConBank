package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC19ManageCardsTwoConsecutiveWrongEntryinBlockConfirmationMessage extends wrappers.ProjectWrappers{

	public TC19ManageCardsTwoConsecutiveWrongEntryinBlockConfirmationMessage() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC19 - To verify that user able to view Two Consecutive Invalid Entry Message when user wrong input twice during Block Confirmation Message";
		TestDescription="TC19 - To verify that user able to view Two Consecutive Invalid Entry Message when user wrong input twice during Block Confirmation Message";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsTwoConsecutiveWrongEntryinBlockConfirmationMessage() throws Exception
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
		.VerifyBlockIcon()
		.VerifyUnBlockIcon()
		.clickBlockIcon()
		.VerifyManageCardClientMessage("Here are your card details. Which card do you want to block?")
		.EnterTextArea("Ultimate Card")
		.VerifyManageCardConfirmationMessage("Are you sure you want to block your","Ultimate Card.")
		.EnterTextArea("Test")
		.VerifyManageCardInvalidInputCardMessage("is an invalid input. Please select confirm to block your","Ultimate Card","Test")
		.EnterTextArea("Test-Wrong Input twices")
	    .VerifyManageCardClientMessage("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.");
	}	
}
