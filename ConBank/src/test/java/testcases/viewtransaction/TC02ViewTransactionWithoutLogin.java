package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC02ViewTransactionWithoutLogin extends wrappers.ProjectWrappers{

	public TC02ViewTransactionWithoutLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC02 - To Verify that user able to View Transactions - Without Login";
		TestDescription="TC02 - To Verify that user able to View Transactions - Without Login";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ViewTransactionWithoutLogin() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("View Transaction")
		 .ClickLogin()
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .verifyWelcomeUserName("Tagit")
		 .VerifyClientResponseMessage("Here are your accounts. Please select an account to view your transactions.");
		
	}	
}
