package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC41StatementRequestDownloadForCorrectCardNumberEnding extends wrappers.ProjectWrappers{

	public TC41StatementRequestDownloadForCorrectCardNumberEnding() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC41 - To verify that user able to view statement when user gives correct Card number ending";
		TestDescription="To verify that user able to view statement when user gives correct Card number ending";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void StatementRequestForCorrectCardNumberEndingOne() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my card ending with 8140")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForWrongMonth("Please select the month")
		.SelectMonth("March")
		.verifyDownloadText("Here is the statement of your ultimate card for the month of March. Please click to download the statement");
	}
	
	@Test(priority=2, enabled=true)
	public void StatementRequestForCorrectCardNumberEndingTwo() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("View statement of my card ending with 6070")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForWrongMonth("Please select the month")
		.SelectMonth("March")
		.verifyDownloadText("Here is the statement of your platinum rewards for the month of March. Please click to download the statement");
	}
	
}
