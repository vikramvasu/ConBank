package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC09ChequeBookRequestAccountNameDisplayinConfirmationMessage extends wrappers.ProjectWrappers{

	public TC09ChequeBookRequestAccountNameDisplayinConfirmationMessage() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC09 - To verify that user able to view the selected account name in ChequeBook Request Confirmation Message for the account selected ";
		TestDescription="To verify that user able to view the selected account name in ChequeBook Request Confirmation Message for the account selected";
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
		.verifyConfirmMessage();
		
	}	
	
}
