package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC35StatementRequestByAccountNumberEndingSupportedIntents extends wrappers.ProjectWrappers{

	public TC35StatementRequestByAccountNumberEndingSupportedIntents() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC35 - To verify that user able to view statement by Statement Request by Account number ending - Supported intent utterances";
		TestDescription="To verify that user able to view statement by Statement Request by Account number ending - Supported intent utterances";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void StatementRequestIntentOneForAccountNumberEnding() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my Account number ending with 5546")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForWrongMonth("Please select the month")
		.SelectMonth("March")
		.verifyDownloadSavingsAccountText("Here is the statement of your SuperValue Account for the month of March. Please click to download the statement");
	}
	
	@Test(priority=2, enabled=true)
	public void StatementRequestIntentTwoForAccountNumberEnding() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("View statement of my account ending with 3968")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForWrongMonth("Please select the month")
		.SelectMonth("March")
		.verifyDownloadCheckingAccountText("Here is the statement of your Regular Current Account for the month of March. Please click to download the statement");
	}
	
	@Test(priority=3, enabled=true)
	public void StatementRequestIntentThreeForAccountNumberEnding() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Show me the statement of account ending with 3968")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForWrongMonth("Please select the month")
		.SelectMonth("March")
		.verifyDownloadCurrentAccountText("Here is the statement of your Regular Current Account for the month of March. Please click to download the statement");
	}
	
}
