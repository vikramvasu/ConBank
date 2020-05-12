package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC15ViewTransactionAccountTypeEndingwithWrongAccountnumber extends wrappers.ProjectWrappers{

	public TC15ViewTransactionAccountTypeEndingwithWrongAccountnumber() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC15-To verify that user able to view the validation message for giving account type ending number with different account type in the utterances.";
		TestDescription="TC15-To verify that user able to view the validation message for giving account type ending number with different account type in the utterances.";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ViewTransactionAccountTypeEndingwithWrongAccountnumber() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transactions of Savings account ending with 3333")
		 .verifyWrongAccountEndingText("savings account ending 3333")
		 .VerifyClientResponseMessage("Here are your savings account. Please select an account to view your transactions.")
		 .VerifyCardIsPresent("SuperValue Account")
		 .VerifyCardIsPresent("aXcessPlus Account")
		 .ClickViewTransactionButton("SuperValue Account")
		 .VerifyViewTransactionCardTitle("SuperValue Account - 5546");
		
	}	
}
