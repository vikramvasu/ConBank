package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC30ViewTransactionUI extends wrappers.ProjectWrappers{

	public TC30ViewTransactionUI() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC30-To verify that user able to view the Transactions Details as per UI";
		TestDescription="TC30-To verify that user able to view the Transactions Details as per UI";
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
		 .EnterTextArea("View Transactions")
		 .VerifyMessageIsPresent("Here are your accounts. Please select an account to view your transactions")
		 .VerifyCardIsPresent("SuperValue Account")
		 .VerifyCardIsPresent("Ultimate Card")
		 .VerifyCardIsPresent("aXcessPlus Account")
		 .ClickViewTransactionButton("Ultimate Card")
		 .VerifyViewTransactionCardTitle("Ultimate Card - 8140");
		
	}	
}
