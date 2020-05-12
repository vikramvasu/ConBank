package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC14ManageCardsInvalidinputwhileBlockTypeselection extends wrappers.ProjectWrappers{

	public TC14ManageCardsInvalidinputwhileBlockTypeselection() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC14 - To verify that user able to view Invalid Input Validation Message when user gives wrong input for first time while selecting Block/Unblock Type slot";
		TestDescription="TC14 - To verify that user able to view Invalid Input Validation Message when user gives wrong input for first time while selecting Block/Unblock Type slot";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsInvalidinputwhileBlockUnblockTypeselection() throws Exception
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
		.VerifyManageCardClientMessage("Invalid input, Please give a valid one");		
	}	
}
