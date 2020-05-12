package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC31StatementRequestForCorrectAccountTypeWithInvalidAccountNumberEnding extends wrappers.ProjectWrappers{

	public TC31StatementRequestForCorrectAccountTypeWithInvalidAccountNumberEnding() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC31 - To verify that user able to view proper validation message for user giving correct Account Type and and invalid Account number utterance";
		TestDescription="To verify that user able to view proper validation message for user giving correct Account Type and and invalid Account number utterance";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	
	@Test(priority=1, enabled=true)
	public void StatementRequestForCorrectAccountTypeAndInvalidAccountNumberEnding() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my Savings account ending with 5555")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyTextForCorrectAccountTypeAndInvalidAccountNumber("Sorry, There is no matching account for given account type savings account with number 5555")
		.verifySelectAccountForWrongAccountCases("Please select an account for which you want to download a statement");
	}
		
}
