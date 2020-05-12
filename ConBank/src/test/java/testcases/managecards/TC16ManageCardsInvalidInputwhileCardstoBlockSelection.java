package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC16ManageCardsInvalidInputwhileCardstoBlockSelection extends wrappers.ProjectWrappers{

	public TC16ManageCardsInvalidInputwhileCardstoBlockSelection() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC16 - To verify that user able to view Invalid Input Validation Message when user gives wrong input for first time while selecting cards to block";
		TestDescription="TC16 - To verify that user able to view Invalid Input Validation Message when user gives wrong input for first time while selecting cards to block";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsInvalidInputwhileCardstoBlockSelection() throws Exception
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
		.EnterTextArea("Test Wrong Input")
		.VerifyManageCardNotAbleToFindCardMessage("Sorry, I was not able to find any","Test Wrong Input")
		.VerifyManageCardClientMessage("Here is what I found. Which card do you want to block?");
	}	
}
