package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC16VerifyNoAccountAvailableResponseForAccountSelection extends wrappers.ProjectWrappers{

	public TC16VerifyNoAccountAvailableResponseForAccountSelection() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC16 - To verify that user is able to view No Account available bot response while account selection";
		TestDescription="To verify that user is able to view No Account available bot response while account selection";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void VerifyNoAccountAvailableForAccountSelectionOne() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("I want to see my statement")
		.ClickLoginButton()
		.EnterUserName("user9")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("user9")
		.verifyNoAccountResponse("Sorry, looks like you don't have any active accounts.")
		.verifyAnythingElseTextinDownloadResponse("Is there anything else I can help you with?");
	}
	
	@Test(priority=2, enabled=true)
	public void VerifyNoAccountAvailableForAccountSelectionTwo() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("View Statement")
		.ClickLoginButton()
		.EnterUserName("user9")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("user9")
		.verifyNoAccountResponse("Sorry, looks like you don't have any active accounts.")
		.verifyAnythingElseTextinDownloadResponse("Is there anything else I can help you with?");
	}
	
	@Test(priority=3, enabled=true)
	public void VerifyNoAccountAvailableForAccountSelectionThree() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("I want to view my statement")
		.ClickLoginButton()
		.EnterUserName("user9")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("user9")
		.verifyNoAccountResponse("Sorry, looks like you don't have any active accounts.")
		.verifyAnythingElseTextinDownloadResponse("Is there anything else I can help you with?");
	}
	
}
