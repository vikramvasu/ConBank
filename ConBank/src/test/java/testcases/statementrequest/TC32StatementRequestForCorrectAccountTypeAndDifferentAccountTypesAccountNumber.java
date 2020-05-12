package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC32StatementRequestForCorrectAccountTypeAndDifferentAccountTypesAccountNumber extends wrappers.ProjectWrappers{

	public TC32StatementRequestForCorrectAccountTypeAndDifferentAccountTypesAccountNumber() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC32 - To verify that user able to view proper validation message for user giving correct Account Type and different Account Type's Account number";
		TestDescription="To verify that user able to view proper validation message for user giving correct Account Type and different Account Type's Account number";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	
	@Test(priority=1, enabled=true)
	public void StatementRequestForCorrectAccountTypeAndDifferentAccountTypesAccountNumber() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my Savings account ending with 3968")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyTextForCorrectAccountTypeAndDifferentAccountTypesActNumber("Sorry, There is no matching account for given account type savings account with number 3968")
		.verifySelectAccountForWrongAccountCases("Please select an account for which you want to download a statement");
	}
		
}
