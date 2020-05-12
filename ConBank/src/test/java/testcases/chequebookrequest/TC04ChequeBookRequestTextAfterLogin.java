package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC04ChequeBookRequestTextAfterLogin extends wrappers.ProjectWrappers{

	public TC04ChequeBookRequestTextAfterLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC04 - To Verify that user able to enter Cheque Book Request by Text  - After Login";
		TestDescription="To Verify that user able to enter Cheque Book Request by Text  - After Login";
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
		.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Cheque Book Request")
		.VerifyCheckBookRequestClientMessage("Cheque Book Request");
		
		
	}
	
	
}
