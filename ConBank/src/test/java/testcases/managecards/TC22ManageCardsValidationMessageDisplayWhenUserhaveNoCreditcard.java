package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC22ManageCardsValidationMessageDisplayWhenUserhaveNoCreditcard extends wrappers.ProjectWrappers{

	public TC22ManageCardsValidationMessageDisplayWhenUserhaveNoCreditcard() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC22 - To verify that user able to view proper validation message when user have NO credit card based on supported Intent - Block card by card Type";
		TestDescription="TC22 - To verify that user able to view proper validation message when user have NO credit card based on supported Intent - Block card by card Type";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";	
	}
	

	@Test
	public void ManageCardsValidationMessageDisplaywhenuserhavenocreditcard() throws Exception
	{
		new ManageCardsPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("user5")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("user5")
		.EnterTextArea("Block CreditCard")
		.VerifyManageCardClientMessage("Sorry, I was not able to find any credit card to block.")
		.VerifyManageCardConfirmationMessage("Are you sure you want to block your","Infinite Debit Card.");				
	}	
}
