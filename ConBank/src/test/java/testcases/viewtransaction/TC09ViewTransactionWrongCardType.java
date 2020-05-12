package testcases.viewtransaction;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.ViewTransactionPage;


public class TC09ViewTransactionWrongCardType extends wrappers.ProjectWrappers{

	public TC09ViewTransactionWrongCardType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC09 -To verify that user able to view validation message for wrong Card name in the utterances while viewing View Transactions";
		TestDescription="TC09 - To verify that user able to view validation message for wrong Card name in the utterances while viewing View Transactions";
		browserName="chrome";
		Application="View Transaction";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ViewTransactionWrongCardType() throws Exception
	{
		 new ViewTransactionPage(driver,test)
		 .ClickSplashLogo()
		 .EnterTextArea("Login")
		 .EnterUserName("Tagit")
		 .EnterPassword("Tagit@123")
		 .ClickLoginButton()
		 .EnterTextArea("View Transactions of Titanium Credit Card")
		 .verifyWrongAccountText("titanium credit card")
		 .VerifyClientResponseMessage("Here are your accounts. Please select an account to view your transactions.");
		
	}	
}
