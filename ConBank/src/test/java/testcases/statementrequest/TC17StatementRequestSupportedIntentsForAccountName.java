package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC17StatementRequestSupportedIntentsForAccountName extends wrappers.ProjectWrappers{

	public TC17StatementRequestSupportedIntentsForAccountName() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC17 - To verify that user able to view statement by Statement Request by Account name - Supported intent utterances";
		TestDescription="To verify that user able to view statement by Statement Request by Account name - Supported intent utterances";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void StatementRequestIntentOneForAccountName() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my Supervalue account")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForWrongMonth("Please select the month")
		.SelectMonth("March")
		.verifyDownloadText("Here is the statement of your supervalue account for the month of March. Please click to download the statement");
	}
	
	@Test(priority=2, enabled=true)
	public void StatementRequestIntentTwoForAccountName() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("View statement of my platinum rewards")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForWrongMonth("Please select the month")
		.SelectMonth("March")
		.verifyDownloadText("Here is the statement of your platinum rewards for the month of March. Please click to download the statement");
	}
	
	@Test(priority=3, enabled=true)
	public void StatementRequestIntentThreeForAccountName() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Show me the statement of my ultimate card")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForWrongMonth("Please select the month")
		.SelectMonth("March")
		.verifyDownloadText("Here is the statement of your ultimate card for the month of March. Please click to download the statement");
	}
	
	@Test(priority=4, enabled=true)
	public void StatementRequestIntentFourForAccountName() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("axcessplus account statement")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForWrongMonth("Please select the month")
		.SelectMonth("March")
		.verifyDownloadText("Here is the statement of your axcessplus account for the month of March. Please click to download the statement");
	}
}
