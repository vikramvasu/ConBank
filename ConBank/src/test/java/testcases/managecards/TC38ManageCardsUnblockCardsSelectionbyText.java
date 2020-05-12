package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC38ManageCardsUnblockCardsSelectionbyText extends wrappers.ProjectWrappers{

	public TC38ManageCardsUnblockCardsSelectionbyText() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC38 - To verify that user able to select the cards to unblock by giving as text";
		TestDescription="TC38 - To verify that user able to select the cards to unblock by giving as text";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsUnblockCardsSelectionbyText() throws Exception
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
		.clickConfirmButton()
		.VerifyManageCardClientMessage("Your card has been blocked successfully.")
		.VerifyManageCardClientMessage("Is there anything else I can help you with?")
		.clickRefreshButton()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.EnterTextArea("Unblock Ultimate Card")
		.VerifyManageCardConfirmationMessage("Are you sure you want to Unblock your","Ultimate Card.")
		.clickConfirmButton()
		.VerifyManageCardClientMessage("Your card has been unblocked successfully.");
	}
	
}
