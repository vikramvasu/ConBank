package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC19ViewTransactionCardNumberEndingwith extends wrappers.ProjectWrappers{

	public TC19ViewTransactionCardNumberEndingwith() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC19- To verify that user able to view the Transactions for giving Card number ending with in the utterances";
		TestDescription="TC19- To verify that user able to view the Transactions for giving Card number ending with in the utterances";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ViewTransactionAccountTypeEndingwithCorrectCardNumber() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transactions of card number ending with 8140")
		 .VerifyViewTransactionCardTitle("Ultimate Card - 8140");
		
	}	
}
