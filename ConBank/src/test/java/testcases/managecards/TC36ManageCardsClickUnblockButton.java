package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC36ManageCardsClickUnblockButton extends wrappers.ProjectWrappers{

	public TC36ManageCardsClickUnblockButton() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName= "TC36 - To verify that user able to select the Unblock button from Block/Unblock Type";
		TestDescription="TC36 - To verify that user able to select the Unblock button from Block/Unblock Type";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsClickUnblockButton() throws Exception
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
		.clickUnBlockIcon()
		.VerifyManageCardClientMessage("Sorry, I cannot help you on un-blocking your cards as I dont find any cards linked to you.");
	}
	
}
