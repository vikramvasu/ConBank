package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC17ChequeBookRequestbyAccountNameUserDontHave extends wrappers.ProjectWrappers{

	public TC17ChequeBookRequestbyAccountNameUserDontHave() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC17 - To verify that user able to view proper validation message when user gives Account Name which user dont have";
		TestDescription="To verify that user able to view proper validation message when user gives Account Name which user dont have";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestTextAfterLogin() throws Exception
	{
		new ChequeBookRequestPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Cheque Book Request")
		.VerifyCheckBookRequestClientMessage("Cheque Book Request")
		.EnterTextArea("Ultimate Account")
		.verifySorryMessageInvalidAccount();
		
	}
	
	
}
