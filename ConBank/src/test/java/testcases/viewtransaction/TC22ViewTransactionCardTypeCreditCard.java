package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC22ViewTransactionCardTypeCreditCard extends wrappers.ProjectWrappers{

	public TC22ViewTransactionCardTypeCreditCard() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC22-To verify that user able to view the View Transactionss for credit cards";
		TestDescription="TC22-To verify that user able to view the View Transactionss for credit cards";
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
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transactions of credit cards")
		 .VerifyClientResponseMessage("Here are your credit account. Please select an account to view your transactions.")
		 .VerifyCardIsPresent("Ultimate Card")
		 .VerifyCardIsPresent("Platinum Rewards")
		 .ClickViewTransactionButton("Ultimate Card")
		 .VerifyViewTransactionCardTitle("Ultimate Card - 8140");
		
	}	
}
