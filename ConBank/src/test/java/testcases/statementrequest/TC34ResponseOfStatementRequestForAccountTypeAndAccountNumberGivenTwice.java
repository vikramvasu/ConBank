package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC34ResponseOfStatementRequestForAccountTypeAndAccountNumberGivenTwice extends wrappers.ProjectWrappers{

	public TC34ResponseOfStatementRequestForAccountTypeAndAccountNumberGivenTwice() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC34 - To verify that user NOT allowed to select the accounts again when user gives Statement Request by Account Type with Account Number ending utterance";
		TestDescription="To verify that user NOT allowed to select the accounts again when user gives Statement Request by Account Type with Account Number ending utterance";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	
	@Test(priority=1, enabled=true)
	public void StatementRequestForAccountTypeAndAccountNumberGivenTwice() throws Exception
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
		.EnterText("Statement of my Savings account ending with 5546")
		.verifyTextForAccountTypeAndAccountNumberGivenTwice("Sorry, Statement of my Savings account ending with 5546 is not a valid month.")
		.verifyResponseForWrongMonth("Please select the month");	
	}
		
}
