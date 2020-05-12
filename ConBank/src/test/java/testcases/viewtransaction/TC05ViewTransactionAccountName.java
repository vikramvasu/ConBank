package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC05ViewTransactionAccountName extends wrappers.ProjectWrappers{

	public TC05ViewTransactionAccountName() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC05 -To verify that user able to view transactions by giving the account name";
		TestDescription="TC05 -To verify that user able to view transactions by giving the account name";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ViewTransactionAccountName() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transaction")
		 .VerifyClientResponseMessage("Here are your accounts. Please select an account to view your transactions.")
		 .EnterTextArea("Ultimate Card")
		 .VerifyClientResponseMessage("Here are your transactions")
		 .VerifyViewTransactionCardTitle("Ultimate Card");
		
	}
	
	@Test
	public void ViewTransactionAxcessPlus() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transaction")
		 .VerifyClientResponseMessage("Here are your accounts. Please select an account to view your transactions.")
		 .EnterTextArea("aXcessPlus Account")
		 .VerifyClientResponseMessage("Here are your transactions")
		 .VerifyViewTransactionCardTitle("aXcessPlus Account");
		
	}	
	
	@Test
	public void ViewTransactionSupervalue() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transaction")
		 .VerifyClientResponseMessage("Here are your accounts. Please select an account to view your transactions.")
		 .EnterTextArea("SuperValue Account")
		 .VerifyClientResponseMessage("Here are your transactions")
		 .VerifyViewTransactionCardTitle("SuperValue Account");
		
	}	
}
