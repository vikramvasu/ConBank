package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC33StatementRequestOfAccountTypeAndAccountNumberForUserNotHavingAccountType extends wrappers.ProjectWrappers{

	public TC33StatementRequestOfAccountTypeAndAccountNumberForUserNotHavingAccountType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC33 - To verify that user able to view proper validation message for user giving account type and Account number of User not having Account Type";
		TestDescription="To verify that user able to view proper validation message for user giving account type and Account number of User not having Account Type";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	
	@Test(priority=1, enabled=true)
	public void StatementRequestOfAccountTypeAndAccountNumberForUserNotHavingAccountType() throws Exception
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
