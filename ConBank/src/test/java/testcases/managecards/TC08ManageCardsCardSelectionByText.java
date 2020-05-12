package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC08ManageCardsCardSelectionByText extends wrappers.ProjectWrappers{

	public TC08ManageCardsCardSelectionByText() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC08 - To verify that user able to select the cards to block by giving as text";
		TestDescription="TC08 - To verify that user able to select the cards to block by giving as text";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsCardSelectionByText() throws Exception
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
		.VerifyCardIsPresent("Ultimate Card")
		.VerifyCardIsPresent("Platinum Rewards")
		.VerifyCardIsPresent("Platinum Debit Card")
		.VerifyCardIsPresent("Priority Debit Card")
		.VerifyCardIsPresent("Infinite Debit Card")
		.EnterTextArea("Ultimate Card")
		.VerifyManageCardConfirmationMessage("Are you sure you want to block your","Ultimate Card.");
		
	}	
}
