package testcases.chequebookrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChequeBookRequestPage;


public class TC01ChequeBookRequestIconCheck extends wrappers.ProjectWrappers{

	public TC01ChequeBookRequestIconCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC01 - To verify that Cheque Book Request icon is displayed as per UI/UX shared";
		TestDescription="To verify that Cheque Book Request icon is displayed as per UI/UX shared";
		browserName="chrome";
		Application="Cheque Book Request";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ChequeBookRequestIconCheck() throws Exception
	{
		new ChequeBookRequestPage(driver, test)
		.ClickSplashLogo()
		.clickChequeBookRequestLogo()
		.VerifyCheckBookRequestClientMessage("Cheque Book Request");
		
	}
	
	
}
