package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC04ClickViewTransactionButton extends wrappers.ProjectWrappers{

	public TC04ClickViewTransactionButton() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC04 -To verify that user able to view transactions by clicking the View Transaction button";
		TestDescription="TC04 -To verify that user able to view transactions by clicking the View Transaction button";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ClickViewTransactionButton() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .verifyWelcomeUserName("Tagit")
		 .EnterTextArea("View Transaction")
		 .VerifyClientResponseMessage("Here are your accounts. Please select an account to view your transactions.")
		 .ClickViewTransactionButton("Ultimate Card")
		 .VerifyClientMessage("View Transactions of my Ultimate Card")
		 .VerifyClientResponseMessage("Here are your transactions")
		 .VerifyViewTransactionCardTitle("Ultimate Card");
		
	}	
}
