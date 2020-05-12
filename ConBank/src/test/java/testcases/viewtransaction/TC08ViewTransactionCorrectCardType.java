package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC08ViewTransactionCorrectCardType extends wrappers.ProjectWrappers{

	public TC08ViewTransactionCorrectCardType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC08-To verify that user able to view the correct View Transactions by giving card name in utterances";
		TestDescription="TC08-To verify that user able to view the correct View Transactions by giving card name in utterances";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ViewTransactionCorrectCardType() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transaction of Platium Rewards")
		 .VerifyViewTransactionCardTitle("Platinum Rewards - 6070");
		
	}	
}
