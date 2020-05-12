package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC17ViewTransactionAccountNumberEndingwith extends wrappers.ProjectWrappers{

	public TC17ViewTransactionAccountNumberEndingwith() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC17- To verify that user able to view the Transactions for giving account number ending with in the utterances";
		TestDescription="TC17- To verify that user able to view the Transactions for giving account number ending with in the utterances";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ViewTransactionAccountTypeEndingwithCorrectAccountNumber() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transactions of account number ending with 5546")
		 .VerifyViewTransactionCardTitle("SuperValue Account - 5546");
		
	}	
}
