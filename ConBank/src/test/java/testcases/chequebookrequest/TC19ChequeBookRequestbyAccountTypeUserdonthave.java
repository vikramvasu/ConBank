package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC19ChequeBookRequestbyAccountTypeUserdonthave extends wrappers.ProjectWrappers{

	public TC19ChequeBookRequestbyAccountTypeUserdonthave() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC19 - To verify that user able to view proper validation message when user gives Account Type in which user dont have any accounts";
		TestDescription="To verify that user able to view proper validation message when user gives Account Type in which user dont have any accounts";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestbyAccountTypeCorrectAccountType() throws Exception
	{
		new ChequeBookRequestPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("user5")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("user5")
		.EnterTextArea("Raise Cheque Book Request for Savings Account")
		.VerifyChequeBookRequestClientMessage("Sorry, I was not able to find any accounts linked to you.");
		
	}
	
}
