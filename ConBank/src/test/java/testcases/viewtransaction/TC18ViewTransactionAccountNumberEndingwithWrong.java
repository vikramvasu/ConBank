package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC18ViewTransactionAccountNumberEndingwithWrong extends wrappers.ProjectWrappers{

	public TC18ViewTransactionAccountNumberEndingwithWrong() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC18-To verify that user able to view the validation message for giving wrong account number in the utterances";
		TestDescription="TC18-To verify that user able to view the validation message for giving wrong account number in the utterances";
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
		 .EnterTextArea("View Transactions of account number ending with 3333")
		 .verifyWrongAccountEndingText("account ending 3333")
		 .VerifyClientResponseMessage("Here are your accounts. Please select an account to view your transactions.")
		 .VerifyCardIsPresent("SuperValue Account")
		 .VerifyCardIsPresent("aXcessPlus Account");	
	}	
}
