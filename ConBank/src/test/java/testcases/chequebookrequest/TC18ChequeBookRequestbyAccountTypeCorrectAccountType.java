package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC18ChequeBookRequestbyAccountTypeCorrectAccountType extends wrappers.ProjectWrappers{

	public TC18ChequeBookRequestbyAccountTypeCorrectAccountType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC18 - To verify that user able to Raise ChequeBook Request based on supported intent type as Chequebook request by Account Type";
		TestDescription="To verify that user able to Raise ChequeBook Request based on supported intent type as Chequebook request by Account Type";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestbyAccountTypeCorrectAccountType() throws Exception
	{
		new ChequeBookRequestPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Raise Cheque Book Request for Savings Account")
		.VerifyCheckBookRequestIntentSavingAccountDisplayMessage()
		.clickSuperValueAccount()
		.verifyDeliveryAddress()
		.verifyConfirmMessage()
		.clickConfirmButton()
		.verifySuccessMessage()
		.verifySuccessIcon();
		
	}
	
}
