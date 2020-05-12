package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC54StatementRequestByCorrectMonthTwice extends wrappers.ProjectWrappers{

	public TC54StatementRequestByCorrectMonthTwice() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC54 - To verify that user NOT allowed to select the month again when user gives Statement Request by Month utterance";
		TestDescription="To verify that user NOT allowed to select the month again when user gives Statement Request by Month utterance";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void ResponseForCorrectMonthTwice() throws Exception
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
		.EnterText("Statement of March")
		.verifyTextForCorrectMonthTwice("Sorry, There is no matching account for given account name Statement of March");
	}
	
}
