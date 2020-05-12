package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC16ViewTransactionAccountTypeEndingwithOtherAccountTypeNumber extends wrappers.ProjectWrappers{

	public TC16ViewTransactionAccountTypeEndingwithOtherAccountTypeNumber() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC16-To verify that user able to view the validation message for giving account type ending number with different account type in the utterances";
		TestDescription="TC16-To verify that user able to view the validation message for giving account type ending number with different account type in the utterances";
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
		 .EnterTextArea("View Transactions of Current account ending with 5546")
		 .verifyWrongAccountEndingText("checking account ending 5546")
		 .VerifyClientResponseMessage("Here are your transactions")
		 .VerifyViewTransactionCardTitle("Regular Current Account - 3968");		
	}	
}
