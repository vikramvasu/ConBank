package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC15ChequeBookRequestbyAccountNameCorrectAccountName extends wrappers.ProjectWrappers{

	public TC15ChequeBookRequestbyAccountNameCorrectAccountName() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC15 - To verify that user able to Raise ChequeBook Request based on supported intent type as Chequebook request by Account Name";
		TestDescription="To verify that user able to Raise ChequeBook Request based on supported intent type as Chequebook request by Account Name";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestbyAccountNameCorrectAccountName() throws Exception
	{
		new ChequeBookRequestPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Raise Cheque Book Request for SuperValue Account")
		.verifyDeliveryAddress()
		.verifyConfirmMessage()
		.clickConfirmButton()
		.verifySuccessMessage()
		.verifySuccessIcon()
		.verifyCanHelpYouMessage();
		
	}	
	
}
