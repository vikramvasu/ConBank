package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC21ChequeBookRequestbyCorrectAccountNumberEndingWith extends wrappers.ProjectWrappers{

	public TC21ChequeBookRequestbyCorrectAccountNumberEndingWith() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC21 - To verify that user able to Raise ChequeBook Request based on supported intent type as Chequebook request by Account Number ending with Raise Cheque Book Request for Account Number ending with XXXX";
		TestDescription="To verify that user able to Raise ChequeBook Request based on supported intent type as Chequebook request by Account Number ending with Raise Cheque Book Request for Account Number ending with XXXX";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestbyCorrectAccountNumberEndingWith() throws Exception
	{
		new ChequeBookRequestPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Raise Cheque Book Request for Account Number ending with 5546")
		.verifyDeliveryAddress()
		.verifyConfirmMessage();
		
	}	
	
}
