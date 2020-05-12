package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC42StatementRequestDownloadForIncorrectCardNumberEnding extends wrappers.ProjectWrappers{

	public TC42StatementRequestDownloadForIncorrectCardNumberEnding() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC42 - To verify that user able to view proper validation message when the user gives incorrect Card number ending";
		TestDescription="To verify that user able to view proper validation message when the user gives incorrect Card number ending";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void StatementRequestForIncorrectCardNumberEndingOne() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my card ending with 8141")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForInvalidCarNumber("Sorry, 8141 is not a valid number.")
		.verifySelectAccountForWrongAccountCases("Please select an account for which you want to download a statement");
	}
	
	@Test(priority=2, enabled=true)
	public void StatementRequestForIncorrectCardNumberEndingTwo() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("View statement of my card ending with 6071")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForInvalidCarNumber("Sorry, 6071 is not a valid number.")
		.verifySelectAccountForWrongAccountCases("Please select an account for which you want to download a statement");
	}
	
}
