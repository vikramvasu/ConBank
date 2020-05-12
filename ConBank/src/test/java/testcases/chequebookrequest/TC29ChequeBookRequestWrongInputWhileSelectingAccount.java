package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC29ChequeBookRequestWrongInputWhileSelectingAccount extends wrappers.ProjectWrappers{

	public TC29ChequeBookRequestWrongInputWhileSelectingAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC29 - ChequeBook Request - Wrong input while selecting account";
		TestDescription="ChequeBook Request - Wrong input while selecting account";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}

	@Test
	public void ChequeBookRequestWrongInputWhileSelectingAccount() throws Exception
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
		.verifySorryDonotHaveAccountMessage();			
		
	}
	
}
