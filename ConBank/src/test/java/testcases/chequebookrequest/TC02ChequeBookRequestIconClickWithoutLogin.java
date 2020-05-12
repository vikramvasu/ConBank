package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC02ChequeBookRequestIconClickWithoutLogin extends wrappers.ProjectWrappers{

	public TC02ChequeBookRequestIconClickWithoutLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC02 - To Verify that user able to click on Cheque Book Request icon  - Without Login";
		TestDescription="To Verify that user able to click on Cheque Book Request icon  - Without Login";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestIconClickWithoutLogin() throws Exception
	{
		new ChequeBookRequestPage(driver, test)
		.ClickSplashLogo()
		.clickChequeBookRequestLogo()
		.VerifyCheckBookRequestClientMessage("Cheque Book Request")
		.ClickLogin()
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("Tagit");
		
	}
	
	
}
