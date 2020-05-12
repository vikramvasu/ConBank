package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC43StatementRequestDownloadForCardNumberNotAvailable extends wrappers.ProjectWrappers{

	public TC43StatementRequestDownloadForCardNumberNotAvailable() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC43 - To verify that user able to view proper validation message when the user gives Card number ending which is not available";
		TestDescription="To verify that user able to view proper validation message when the user gives Card number ending which is not available";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void StatementRequestForCardNumberEndingNotAvailableOne() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my card ending with 2121")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForInvalidCarNumber("Sorry, 2121 is not a valid number.")
		.verifySelectAccountForWrongAccountCases("Please select an account for which you want to download a statement");
	}
	
	@Test(priority=2, enabled=true)
	public void StatementRequestForCardNumberEndingNotAvailableTwo() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("View statement of my card ending with 1212")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForInvalidCarNumber("Sorry, 1212 is not a valid number.")
		.verifySelectAccountForWrongAccountCases("Please select an account for which you want to download a statement");
	}
	
}
