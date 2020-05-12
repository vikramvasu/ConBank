package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC03ChequeBookRequestIconClickAfterLogin extends wrappers.ProjectWrappers{

	public TC03ChequeBookRequestIconClickAfterLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName= "TC03 - To Verify that user able to click on Cheque Book Request icon  - After Login" ;
		TestDescription="To Verify that user able to click on Cheque Book Request icon  - After Login";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestIconClickAfterLogin() throws Exception
	{
		new ChequeBookRequestPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("Tagit")
		.Scrollup()
		.clickChequeBookRequestLogo()
		.VerifyCheckBookRequestClientMessage("Cheque Book Request");		
	}		
}
