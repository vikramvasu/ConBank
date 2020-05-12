package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC07ViewTransactionWrongAccountName extends wrappers.ProjectWrappers{

	public TC07ViewTransactionWrongAccountName() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC07 -To verify that user able to view validation message for wrong account name in the utterances while viewing View Transactions";
		TestDescription="TC07 - To verify that user able to view validation message for wrong account name in the utterances while viewing View Transactions";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ViewTransactionWrongAccountName() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transactions of Employee Banking Account")
		 .verifyWrongAccountText("employee banking account")
		 .VerifyClientResponseMessage("Here are your accounts. Please select an account to view your transactions.");
		
	}	
}
