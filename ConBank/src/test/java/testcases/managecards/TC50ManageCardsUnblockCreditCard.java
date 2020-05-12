package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC50ManageCardsUnblockCreditCard extends wrappers.ProjectWrappers{

	public TC50ManageCardsUnblockCreditCard() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC50 - To verify that user able to unblock the debit card based on supported Intent - unblock Credit card";
		TestDescription="TC50 - To verify that user able to unblock the debit card based on supported Intent - unblock Credit card";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsUnblockCreditCard() throws Exception
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
		.EnterTextArea("Unblock Creditcard")
		.VerifyManageCardConfirmationMessage("Are you sure you want to Unblock your","Ultimate Card.")
		.clickConfirmButton()
		.VerifyManageCardClientMessage("Your card has been unblocked successfully.");
	}
	
}
