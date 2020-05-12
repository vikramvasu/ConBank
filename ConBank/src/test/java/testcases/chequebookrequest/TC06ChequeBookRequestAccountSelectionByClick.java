package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC06ChequeBookRequestAccountSelectionByClick extends wrappers.ProjectWrappers{

	public TC06ChequeBookRequestAccountSelectionByClick() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC06 - To verify that user able to select the accounts from the list of accounts ";
		TestDescription="To verify that user able to select the accounts from the list of accounts";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestAccountSelectionByClickSuperValueAccount() throws Exception
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
		.clickSuperValueAccount();
		
	}
	
	@Test
	public void ChequeBookRequestAccountSelectionByClickAxcessPlusAccount() throws Exception
	{
		new ChequeBookRequestPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Cheque Book Request")
		.VerifyCheckBookRequestClientMessage("Cheque Book Request")
		.VerifyCheckBookRequestIntentAccountDisplayMessage()
		.verifyaXcessPlusAccount()
		.verifySuperValueAccount()
		.verifyRegularCurrentAccount()
		.clickaXcessPlusAccount();
		
	}
	
	@Test
	public void ChequeBookRequestAccountSelectionByClickRegularCurrentAccount() throws Exception
	{
		new ChequeBookRequestPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Cheque Book Request")
		.VerifyCheckBookRequestClientMessage("Cheque Book Request")
		.VerifyCheckBookRequestIntentAccountDisplayMessage()
		.verifyaXcessPlusAccount()
		.verifySuperValueAccount()
		.verifyRegularCurrentAccount()
		.clickRegularCurrentAccount();
		
	}
}
