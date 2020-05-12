package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC50StatementRequestByCorrectMonth extends wrappers.ProjectWrappers{

	public TC50StatementRequestByCorrectMonth() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC50 - To verify that user able to view statement when user gives correct month";
		TestDescription="To verify that user able to view statement when user gives correct month";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void StatementRequestByCorrectMonth() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of March")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.VerifyAccount("Ultimate Card")
		.SelectAccount("Ultimate Card")
		.verifyDownloadText("Here is the statement of your ultimate card for the month of March. Please click to download the statement");
	}
	
}
