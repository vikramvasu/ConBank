package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC14ViewTransactionAccountTypeEndingwithCorrectAccountNumber extends wrappers.ProjectWrappers{

	public TC14ViewTransactionAccountTypeEndingwithCorrectAccountNumber() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC14-To verify that user able to view the Transactions of the account type ending with given in the utterances";
		TestDescription="TC14-To verify that user able to view the Transactions of the account type ending with given in the utterances";
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
		 .EnterTextArea("View Transactions of Savings account ending with 5546")
		 .VerifyViewTransactionCardTitle("SuperValue Account - 5546");
		
	}	
}
