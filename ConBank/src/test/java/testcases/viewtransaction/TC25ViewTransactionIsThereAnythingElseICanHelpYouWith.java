package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC25ViewTransactionIsThereAnythingElseICanHelpYouWith extends wrappers.ProjectWrappers{

	public TC25ViewTransactionIsThereAnythingElseICanHelpYouWith() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC25-To verify that user able to view the Is There Anything Else I Can Help You With message ";
		TestDescription="TC25-To verify that user able to view the Is There Anything Else I Can Help You With message ";
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
		 .VerifyMessageIsPresent("Sorry, you have no transactions to display.")
		 .VerifyClientResponseMessage("Is there anything else I can help you with?");
		
	}	
}
