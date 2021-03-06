package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC25ChequeBookRequestbyAccountNumberwhichisnotlinkedtotheAccounttype extends wrappers.ProjectWrappers{

	public TC25ChequeBookRequestbyAccountNumberwhichisnotlinkedtotheAccounttype() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC25 - ChequeBook Request by Account Number ending with - Correct Account Number ending With";
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
		.EnterTextArea("Raise Cheque Book Request for Current account ending with 0000")
		.EnterTextArea("Raise Cheque Book Request for Current account ending with 0000")
		.VerifyChequeBookRequestClientMessage("Sorry, I was not able to find any accounts linked to you.");	
		
	}	
	
}
