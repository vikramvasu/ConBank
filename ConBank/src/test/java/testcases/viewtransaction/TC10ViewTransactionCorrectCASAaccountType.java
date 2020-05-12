package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC10ViewTransactionCorrectCASAaccountType extends wrappers.ProjectWrappers{

	public TC10ViewTransactionCorrectCASAaccountType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC10-To verify that user able to view the correct Transactions of all the accounts in that account type";
		TestDescription="TC10-To verify that user able to view the correct Transactions of all the accounts in that account type";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ViewTransactionCorrectCASAaccountType() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transactions of Savings account")
		 .VerifyClientResponseMessage("Here are your savings account. Please select an account to view your transactions.")
		 .ClickViewTransactionButton("SuperValue Account")
		 .VerifyViewTransactionCardTitle("SuperValue Account - 5546");
		
	}	
}
