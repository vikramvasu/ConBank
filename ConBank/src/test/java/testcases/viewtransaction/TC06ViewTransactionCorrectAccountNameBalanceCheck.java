package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC06ViewTransactionCorrectAccountNameBalanceCheck extends wrappers.ProjectWrappers{

	public TC06ViewTransactionCorrectAccountNameBalanceCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC06 -To verify that user able to view the correct Transactions by giving account name in utterances";
		TestDescription="TC06 -To verify that user able to view the correct Transactions by giving account name in utterances";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ViewTransactionCorrectAccountNameBalanceCheck() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transactions of SuperValue Account")
		 .VerifyClientResponseMessage("Here are your transactions")
		 .VerifyViewTransactionCardTitle("SuperValue Account - 5546");
		
	}	
}
