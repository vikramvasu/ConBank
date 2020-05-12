package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC28ChequeBookRequestbyAccountTypeendingwithwhichisnotavailable extends wrappers.ProjectWrappers{

	public TC28ChequeBookRequestbyAccountTypeendingwithwhichisnotavailable() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC28 - ChequeBook Request by Account Number ending with - Correct Account Number ending With";
		TestDescription="ChequeBook Request by Account Number ending with - Correct Account Number ending With";
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
		.EnterTextArea("Raise Cheque Book Request for Saving account ending with 1111")
		.VerifyChequeBookRequestClientMessage("Sorry, I was not able to find any accounts linked to you.");	
		
	}	
	
}
