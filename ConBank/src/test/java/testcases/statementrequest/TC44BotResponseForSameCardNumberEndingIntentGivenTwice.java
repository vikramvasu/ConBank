package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC44BotResponseForSameCardNumberEndingIntentGivenTwice extends wrappers.ProjectWrappers{

	public TC44BotResponseForSameCardNumberEndingIntentGivenTwice() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC44 - To verify that user NOT allowed to select the cards again when user gives Statement Request by Card number ending utterance";
		TestDescription="To verify that user NOT allowed to select the cards again when user gives Statement Request by Card number ending utterance";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void StatementRequestOneForCardNumberEndingIntentTwice() throws Exception
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
		.EnterText("Statement of my card ending with 8140")
		.verifyResponseOneForSameCardNumberEndingIntentAgain("Sorry, Statement of my card ending with 8140 is not a valid month.")
		.verifyResponseForWrongMonth("Please select the month");
	}
	
	@Test(priority=2, enabled=true)
	public void StatementRequestTwoForCardNumberEndingIntentTwice() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my card ending with 6070")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.EnterText("Statement of my card ending with 6070")
		.verifyResponseTwoForSameCardNumberEndingIntentAgain("Sorry, Statement of my card ending with 6070 is not a valid month.")
		.verifyResponseForWrongMonth("Please select the month");
	}
}
