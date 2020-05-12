package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC12ViewTransactionCASAaccountUtterance extends wrappers.ProjectWrappers{

	public TC12ViewTransactionCASAaccountUtterance() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC12-To verify that user able to view the correct Transactionss of all the accounts in that account type";
		TestDescription="TC12-To verify that user able to view the correct Transactions of all the accounts in that account type";
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
		 .EnterTextArea("View Transactions of CASA account")
		 .VerifyClientResponseMessage("Here are your debit account. Please select an account to view your transactions.")
		 .VerifyCardIsPresent("SuperValue Account")
		 .VerifyCardIsPresent("aXcessPlus Account")
		 .VerifyCardIsPresent("Regular Current Account")
		 .ClickViewTransactionButton("SuperValue Account")
		 .VerifyViewTransactionCardTitle("SuperValue Account - 5546");
		
	}	
}
