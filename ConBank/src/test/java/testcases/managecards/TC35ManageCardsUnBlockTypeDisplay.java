package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC35ManageCardsUnBlockTypeDisplay extends wrappers.ProjectWrappers{

	public TC35ManageCardsUnBlockTypeDisplay() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC35 - To verify that user able to enter Manage Cards by using Manage Cards - Supported intent utterances,Block Card";
		TestDescription="TC35 - To verify that user able to enter Manage Cards by using Manage Cards - Supported intent utterances,Block Card";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsBlockUnblockTypeDisplay() throws Exception
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
		.VerifyUnBlockIcon();
	}
	
}
