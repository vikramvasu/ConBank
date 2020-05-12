package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC32ChequeBookRequestWrongInputTwiceWhileConfirmingRequest extends wrappers.ProjectWrappers{

	public TC32ChequeBookRequestWrongInputTwiceWhileConfirmingRequest() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC32 - ChequeBook Request - Wrong input Twice while Confirming Request";
		TestDescription="ChequeBook Request - Wrong input Twice while Confirming Request";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestWrongInputTwiceWhileConfirmingRequest() throws Exception
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
		.verifyaXcessPlusAccount()
		.verifySuperValueAccount()
		.verifyRegularCurrentAccount()
		.EnterTextArea("Super Value Account")
		.verifyDeliveryAddress()
		.verifyConfirmMessage()
		.verifyConfirmButton()
		.verifyCancelButton()
		.EnterTextArea("Wrong Input")
		.verifyConfirmInvalidInputMessage()
		.EnterTextArea("Second time Wrong input")
		.verifySorryTwoInvalidAttemptMessage();
	}
	
}
