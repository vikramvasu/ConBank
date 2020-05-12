package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC25ManageCardsValidationMessageDisplaywhenuserhaveNoDebitcard extends wrappers.ProjectWrappers{

	public TC25ManageCardsValidationMessageDisplaywhenuserhaveNoDebitcard() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC25 - To verify that user able to view proper validation message when user have NO Debit card based on supported Intent - Block Debit card";
		TestDescription="TC25 - To verify that user able to view proper validation message when user have NO Debit card based on supported Intent - Block Debit card";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";	
	}
	

	@Test
	public void ManageCardsValidationMessageDisplaywhenuserhavenoDebitcard() throws Exception
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
