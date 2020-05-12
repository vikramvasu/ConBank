package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC22ChequeBookRequestbyWrongAccountNumberEndingWith extends wrappers.ProjectWrappers{

	public TC22ChequeBookRequestbyWrongAccountNumberEndingWith() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC22 - To verify that user able to view proper validation message when user gives wrong account number - Account Number which is not linked  Raise Cheque Book Request for Account Number ending with XXXX";
		TestDescription="To verify that user able to view proper validation message when user gives wrong account number - Account Number which is not linked  Raise Cheque Book Request for Account Number ending with XXXX";
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
		.EnterTextArea("Raise Cheque Book Request for Account Number ending with 1111")
		.VerifyChequeBookRequestClientMessage("Sorry, I was not able to find any accounts linked to you.");	
		
	}	
	
}
