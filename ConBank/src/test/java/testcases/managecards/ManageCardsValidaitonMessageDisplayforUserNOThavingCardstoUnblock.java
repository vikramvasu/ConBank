package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class ManageCardsValidaitonMessageDisplayforUserNOThavingCardstoUnblock extends wrappers.ProjectWrappers{

	public ManageCardsValidaitonMessageDisplayforUserNOThavingCardstoUnblock() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="To verify that user able to view proper validation message when user NOT having any cards to unblock ";
		TestDescription="To verify that user able to view proper validation message when user NOT having any cards to unblock ";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsValidaitonMessageDisplayforUserNOThavingCardstooUnblock() throws Exception
	{
		new ManageCardsPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("user5")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("user5")
		.EnterTextArea("Manage Cards")
		.VerifyManageCardClientMessage("Would you like to Block or Unblock card")
		.EnterTextArea("Unblock")
		.VerifyManageCardClientMessage("Sorry, I cannot help you on un-blocking your cards as I dont find any cards linked to you.");
			
	}	
}
