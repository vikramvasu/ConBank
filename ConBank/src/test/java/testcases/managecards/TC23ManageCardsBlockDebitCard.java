package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC23ManageCardsBlockDebitCard extends wrappers.ProjectWrappers{

	public TC23ManageCardsBlockDebitCard() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC23 - To verify that user is able to block the debit card based on Supported Intent";
		TestDescription="TC23 - To verify that user is able to block the debit card based on Supported Intent";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsBlockCreditCard() throws Exception
	{
		new ManageCardsPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Block Debitcard")
		.VerifyManageCardClientMessage("Sure, Here are your debit card details. Which card do you want to block?")
		.VerifyCardIsPresent("Platinum Debit Card")
		.VerifyCardIsPresent("Priority Debit Card")
		.VerifyCardIsPresent("Infinite Debit Card");				
	}	
}
