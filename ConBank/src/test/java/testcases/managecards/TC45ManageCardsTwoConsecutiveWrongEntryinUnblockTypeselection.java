package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC45ManageCardsTwoConsecutiveWrongEntryinUnblockTypeselection extends wrappers.ProjectWrappers{

	public TC45ManageCardsTwoConsecutiveWrongEntryinUnblockTypeselection() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC45 - To verify that user able to view Two Consecutive Invalid Entry Message when user wrong input twice while selecting Block/Unblock Type Slot";
		TestDescription="TC45 - To verify that user able to view Two Consecutive Invalid Entry Message when user wrong input twice while selecting Block/Unblock Type Slot";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsTwoConsecutiveWrongEntryinBlockUnblockTypeselection() throws Exception
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
		.EnterTextArea("Test-InvalidInput")
		.VerifyManageCardClientMessage("Invalid input, Please give a valid one")		
		.EnterTextArea("Test-Wrong Input twices")
	    .VerifyManageCardClientMessage("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.");	
}
}
