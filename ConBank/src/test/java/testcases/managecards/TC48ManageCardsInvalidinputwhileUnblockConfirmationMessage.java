package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC48ManageCardsInvalidinputwhileUnblockConfirmationMessage extends wrappers.ProjectWrappers{

	public TC48ManageCardsInvalidinputwhileUnblockConfirmationMessage() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC48 - To verify that user able to view Invalid Input Validation Message when user gives wrong input for first time during unblock Confirmation Message";
		TestDescription="TC48 - To verify that user able to view Invalid Input Validation Message when user gives wrong input for first time during unblock Confirmation Message";
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
