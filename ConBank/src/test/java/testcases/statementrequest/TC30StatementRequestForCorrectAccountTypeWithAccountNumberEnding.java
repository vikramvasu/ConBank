package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC30StatementRequestForCorrectAccountTypeWithAccountNumberEnding extends wrappers.ProjectWrappers{

	public TC30StatementRequestForCorrectAccountTypeWithAccountNumberEnding() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC30 - To verify that user able to view statement for user giving correct Account Type and Account number utterance";
		TestDescription="To verify that user able to view statement for user giving correct Account Type and Account number utterance";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	
	@Test(priority=1, enabled=true)
	public void StatementRequestForCorrectAccountTypeAndAccountNumberEnding() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my Savings account ending with 5546")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForWrongMonth("Please select the month")
		.SelectMonth("March")
		.verifyDownloadSavingsAccountText("Here is the statement of your SuperValue Account for the month of March. Please click to download the statement");
	}
		
}
