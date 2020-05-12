package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC27ViewTransactionwhenThereIsNoTransaction extends wrappers.ProjectWrappers{

	public TC27ViewTransactionwhenThereIsNoTransaction() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC27-To verify that user able to view the correct validation message - When there is No Transactions";
		TestDescription="TC27-To verify that user able to view the correct validation message - When there is No Transactions";
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
		 .EnterTextArea("View Transactions")
		 .VerifyMessageIsPresent("Sorry, you have no transactions to display.");
		
	}	
}
