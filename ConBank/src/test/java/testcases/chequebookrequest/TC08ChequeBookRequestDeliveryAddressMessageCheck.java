package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC08ChequeBookRequestDeliveryAddressMessageCheck extends wrappers.ProjectWrappers{

	public TC08ChequeBookRequestDeliveryAddressMessageCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC08 - To verify that user able to view the Delivery address for the account selected";
		TestDescription="To verify that user able to view the Delivery address for the account selected";
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
		.EnterTextArea("Super Value Account")
		.verifyDeliveryAddress();	
		
	}	
	
}
