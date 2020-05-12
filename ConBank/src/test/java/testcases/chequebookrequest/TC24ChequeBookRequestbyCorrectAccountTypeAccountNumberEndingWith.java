package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC24ChequeBookRequestbyCorrectAccountTypeAccountNumberEndingWith extends wrappers.ProjectWrappers{

	public TC24ChequeBookRequestbyCorrectAccountTypeAccountNumberEndingWith() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC24 - ChequeBook Request by Account Type ending with - Correct Account Type ending with";
		TestDescription="ChequeBook Request by Account Type ending with - Correct Account Type ending with";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestbyCorrectAccountTypeAccountNumberEndingWith() throws Exception
	{
		new ChequeBookRequestPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Raise Cheque Book Request for Savings Account ending with 5546")
		.verifyDeliveryAddress()
		.verifyConfirmMessage();
		
	}	
	
}
