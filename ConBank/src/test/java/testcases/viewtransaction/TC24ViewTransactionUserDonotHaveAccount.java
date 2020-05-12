package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC24ViewTransactionUserDonotHaveAccount extends wrappers.ProjectWrappers{

	public TC24ViewTransactionUserDonotHaveAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC24-To verify that user able to view the correct validation message when there is no account ";
		TestDescription="TC24-To verify that user able to view the correct validation message when there is no account ";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ViewTransactionCASAaccountUtterance() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("user4")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transactions")
		 .VerifyMessageIsPresent("Sorry, only transactions for active savings and current accounts are available at this time.")
		 .VerifyClientResponseMessage("Is there anything else I can help you with?");
		
	}	
}
