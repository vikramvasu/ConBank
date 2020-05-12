package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC03ViewTransactionUsingUtterance extends wrappers.ProjectWrappers{

	public TC03ViewTransactionUsingUtterance() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC03 - To Verify that user able to View Transactions - Using Utterance";
		TestDescription="TC03 - To Verify that user able to View Transactions -  Using Utterance";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ViewTransactionUsingUtterance() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .verifyWelcomeUserName("Tagit")
		 .EnterTextArea("View Transaction")
		 .VerifyClientResponseMessage("Here are your accounts. Please select an account to view your transactions.");
		
	}	
}
