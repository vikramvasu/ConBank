package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC07ChequeBookRequestAccountSelectionByText extends wrappers.ProjectWrappers{

	public TC07ChequeBookRequestAccountSelectionByText() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC07 - To verify that user able to select the accounts from the list of accounts";
		TestDescription="To verify that user able to select the accounts from the list of accounts";
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
		.verifyaXcessPlusAccount()
		.verifySuperValueAccount()
		.verifyRegularCurrentAccount()
		.EnterTextArea("Super Value Account");
		
	}
	
	@Test
	public void ChequeBookRequestAccountSelectionByTextAxcessPlusAccount() throws Exception
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
		.EnterTextArea("Axcess Plus Account");
		
	}
	
	@Test
	public void ChequeBookRequestAccountSelectionByTextRegularCurrentAccount() throws Exception
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
		.EnterTextArea("Regular Current Account");
		
	}
}
