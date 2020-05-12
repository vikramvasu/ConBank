package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC11ViewTransactionCorrectAccountTypeUserDonotHaveAccount extends wrappers.ProjectWrappers{

	public TC11ViewTransactionCorrectAccountTypeUserDonotHaveAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC11-To verify that user able to view validation message - User Donot have account";
		TestDescription="TC11-To verify that user able to view validation message - User Donot have account";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ViewTransactionCorrectAccountTypeUserDonotHaveAccount() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("user5")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transactions of Savings account")
		 .VerifyClientResponseMessage("Sorry, you have no transactions to display.");
	}	
}
