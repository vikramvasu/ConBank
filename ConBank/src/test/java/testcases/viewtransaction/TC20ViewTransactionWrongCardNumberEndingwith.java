package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC20ViewTransactionWrongCardNumberEndingwith extends wrappers.ProjectWrappers{

	public TC20ViewTransactionWrongCardNumberEndingwith() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC20-To verify that user able to view the validation message for giving wrong card number in the utterances";
		TestDescription="TC20-To verify that user able to view the validation message for giving wrong card number in the utterances";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ViewTransactionWrongCardNumberEndingwith() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transactions of card number ending with 4444")
		 .verifyWrongAccountEndingText("credit account ending 4444")
		 .VerifyClientResponseMessage("Here are your credit account. Please select an account to view your transactions.");	
		
	}	
}
