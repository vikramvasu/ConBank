package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC14ChequeBookRequestIsthereanythingelseinCancellationMessageCheck extends wrappers.ProjectWrappers{

	public TC14ChequeBookRequestIsthereanythingelseinCancellationMessageCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC14 - To verify that user able to view Is there anything else I can help you with Message in ChequeBook Request Cancellation Message";
		TestDescription="To verify that user able to view Is there anything else I can help you with Message in ChequeBook Request Cancellation Message";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestCancellationMessageCheck() throws Exception
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
		.clickCancelButton()
		.verifyCancellationIcon()
		.verifyCancellationMessage()
		.verifyCanHelpYouMessage();
		
	}	
	
}
