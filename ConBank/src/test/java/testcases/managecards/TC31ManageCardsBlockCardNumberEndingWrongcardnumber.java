package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC31ManageCardsBlockCardNumberEndingWrongcardnumber extends wrappers.ProjectWrappers{

	public TC31ManageCardsBlockCardNumberEndingWrongcardnumber() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC31 - To verify that user able to view proper validation message when user gives wrong card number based on supported Intent - Block card by card number ending with"; 	    
		TestDescription="TC31 - To verify that user able to view proper validation message when user gives wrong card number based on supported Intent - Block card by card number ending with";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsBlockCardNumberEndingWrongcardnumber() throws Exception
	{
		new ManageCardsPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Block card number ending with 1111")
		.VerifyManageCardNotAbleToFindCardMessage("Sorry, I was not able to find any card","ending 1111")
		.VerifyManageCardClientMessage("Here is what I found. Which card do you want to block?");
	}	
}
