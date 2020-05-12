package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC02SRIconCheckAfterLogin extends wrappers.ProjectWrappers{

	public TC02SRIconCheckAfterLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC02 - To Verify that user able to click on Statement Request icon - After Login";
		TestDescription="To Verify that user able to click on Statement Request icon - After Login";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test
	public void StatementRequestIconCheckAfterLogin() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.clickStatementRequestLogo()
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		.verifyWelcomeUserName("Tagit");
	}

}
