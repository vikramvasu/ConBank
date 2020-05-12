package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC12VerifyTwoInvalidAttemptsResponseForWrongAccount extends wrappers.ProjectWrappers{

	public TC12VerifyTwoInvalidAttemptsResponseForWrongAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC12 - To verify that user able to view Two Invalid attempts bot response when user give wrong account name twice while account selection";
		TestDescription="To verify that user able to view Two Invalid attempts bot response when user give wrong account name twice while account selection";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1,enabled=true)
	public void BotResponseFor2InvalidWrongAccount() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("I want to see my statement")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.scrollDownforSelectAccountText()
		.verifySelectAccountforSRText("I am happy to help you with that, Please select an account for which you want to download a statement")
		.EnterText("SCB Account")
		.verifyWrongAccountText("Sorry, There is no matching account for given account name SCB Account")
		.verifySelectAccountForWrongAccount("Please select an account for which you want to download a statement")
		.EnterText("HDFC Bank Account")
		.verify2InvalidAttempts("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}
	
}
