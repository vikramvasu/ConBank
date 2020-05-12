package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC28ManageCardsValidationMessageDisplayforWrongCardName extends wrappers.ProjectWrappers{

	public TC28ManageCardsValidationMessageDisplayforWrongCardName() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC28 - To verify that user able to view proper validation message when user gives wrong card name based on supported Intent - Block card by card name- Block Wrong Card"; 			    
		TestDescription="TC28 - To verify that user able to view proper validation message when user gives wrong card name based on supported Intent - Block card by card name- Block Wrong Card";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsValidationMessageDisplayforWrongCardName() throws Exception
	{
		new ManageCardsPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Block Wrong Card")
		.VerifyManageCardClientMessage("Here are your card details. Which card do you want to block?")
		.VerifyCardIsPresent("Ultimate Card")
		.VerifyCardIsPresent("Platinum Rewards")
		.VerifyCardIsPresent("Platinum Debit Card")
		.VerifyCardIsPresent("Priority Debit Card")
		.VerifyCardIsPresent("Infinite Debit Card");
			
	}	
}
