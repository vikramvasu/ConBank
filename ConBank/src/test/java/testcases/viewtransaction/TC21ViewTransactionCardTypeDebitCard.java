package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC21ViewTransactionCardTypeDebitCard extends wrappers.ProjectWrappers{

	public TC21ViewTransactionCardTypeDebitCard() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC21-To verify that user able to view the View Transactionss for Debit cards";
		TestDescription="TC21-To verify that user able to view the View Transactionss for Debit cards";
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
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transactions of debit cards")
		 .VerifyClientResponseMessage("Here are your debit account. Please select an account to view your transactions.")
		 .VerifyCardIsPresent("SuperValue Account")
		 .VerifyCardIsPresent("aXcessPlus Account")
		 .VerifyCardIsPresent("Regular Current Account")
		 .ClickViewTransactionButton("SuperValue Account")
		 .VerifyViewTransactionCardTitle("SuperValue Account - 5546");
		
	}	
}
