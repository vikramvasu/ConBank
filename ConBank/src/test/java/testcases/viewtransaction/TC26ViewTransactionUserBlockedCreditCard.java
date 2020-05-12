package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC26ViewTransactionUserBlockedCreditCard extends wrappers.ProjectWrappers{

	public TC26ViewTransactionUserBlockedCreditCard() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC26-To verify that user able to view the correct validation message when there is Credit card account ";
		TestDescription="TC26-To verify that user able to view the correct validation message when there is Credit card account ";
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
		 .EnterTextArea("View Transactions of Ultimate Card")
		 .VerifyMessageIsPresent("Sorry, only transactions for active savings and current accounts are available at this time.")
		 .VerifyClientResponseMessage("Is there anything else I can help you with?");
		
	}	
}
