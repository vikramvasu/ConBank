package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC28VerifyNoAccountAvailableResponseForUsersNotHavingCurrentAccount extends wrappers.ProjectWrappers{

	public TC28VerifyNoAccountAvailableResponseForUsersNotHavingCurrentAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC28 - To verify that user is able to view No Account available bot response when given Current account is not available";
		TestDescription="To verify that user is able to view No Account available bot response when given Current account is not available";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void VerifyNoAccountAvailableForNoCurrentAccountUser() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my Current account")
		.ClickLoginButton()
		.EnterUserName("user2")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("user2")
		.verifyNoCheckingAccountResponse("Sorry, There is no matching account for given account type checking account")
		.verifySelectAccountForWrongAccountCases("Please select an account for which you want to download a statement");
	}
		
}
