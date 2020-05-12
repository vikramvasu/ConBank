package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC10ChequeBookRequestConfirmAndCancelButtonsCheck extends wrappers.ProjectWrappers{

	public TC10ChequeBookRequestConfirmAndCancelButtonsCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC10 - To verify that user able to view Confirm & Cancel buttons in ChequeBook Request Confirmation Message";
		TestDescription="To verify that user able to view Confirm & Cancel buttons in ChequeBook Request Confirmation Message";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestAccountSelectionByTextSuperValueAccount() throws Exception
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
		.verifyConfirmButton()
		.verifyCancelButton();
		
	}	
	
}
