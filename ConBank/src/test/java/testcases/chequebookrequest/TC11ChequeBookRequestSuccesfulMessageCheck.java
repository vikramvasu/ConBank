package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;

public class TC11ChequeBookRequestSuccesfulMessageCheck extends wrappers.ProjectWrappers{

	public TC11ChequeBookRequestSuccesfulMessageCheck() throws IOException {
		super();
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC11 - To verify that user able to view the ChequeBook Request Successful Message";
		TestDescription="To verify that user able to view the ChequeBook Request Successful Message";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestSuccesfulMessageCheck() throws Exception
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
		.VerifyCheckBookRequestIntentAccountDisplayMessage()
		.verifySuperValueAccount()
		.EnterTextArea("Super Value Account")
		.verifyDeliveryAddress()
		.verifyConfirmMessage()
		.clickConfirmButton()
		.verifySuccessMessage()
		.verifySuccessIcon();
		
	}	
	
}
