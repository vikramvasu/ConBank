package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC23ViewTransactionCardTypeCreditCardWhenUserDonotHaveCard extends wrappers.ProjectWrappers{

	public TC23ViewTransactionCardTypeCreditCardWhenUserDonotHaveCard() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC23-To verify that user able to view the View Transactionss for credit cards";
		TestDescription="TC23-To verify that user able to view the View Transactionss for credit cards";
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
		 .EnterUserName("user5")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transactions of credit cards")
		 .VerifyClientResponseMessage("Sorry, looks like you don't have any credit card.");
		
	}	
}
