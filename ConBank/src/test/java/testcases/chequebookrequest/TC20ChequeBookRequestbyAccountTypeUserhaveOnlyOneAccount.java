package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC20ChequeBookRequestbyAccountTypeUserhaveOnlyOneAccount extends wrappers.ProjectWrappers{

	public TC20ChequeBookRequestbyAccountTypeUserhaveOnlyOneAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC20 - To verify that user able to Raise ChequeBook Request when user gives Account Type in which user has only one account";
		TestDescription="To verify that user able to Raise ChequeBook Request when user gives Account Type in which user has only one account";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestbyAccountTypeUserhaveOnlyOneAccount() throws Exception
	{
		new ChequeBookRequestPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("user5")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("user5")
		.EnterTextArea("Raise Cheque Book Request for Current Account")
		.verifyDeliveryAddress()
		.verifyConfirmMessage();
		
	}	
	
}
