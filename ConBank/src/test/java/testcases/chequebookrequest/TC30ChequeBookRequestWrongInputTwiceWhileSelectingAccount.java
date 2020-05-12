package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC30ChequeBookRequestWrongInputTwiceWhileSelectingAccount extends wrappers.ProjectWrappers{

	public TC30ChequeBookRequestWrongInputTwiceWhileSelectingAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC30 - ChequeBook Request - Wrong input Twice while selecting account";
		TestDescription="ChequeBook Request - Wrong input Twice while selecting account";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestWrongInputTwiceWhileSelectingAccount() throws Exception
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
		.EnterTextArea("ABCD")
		.verifySorryDonotHaveAccountMessage()
		.EnterTextArea("ABCD")
		.verifySorryTwoInvalidAttemptMessage();
		
	}
	
}
