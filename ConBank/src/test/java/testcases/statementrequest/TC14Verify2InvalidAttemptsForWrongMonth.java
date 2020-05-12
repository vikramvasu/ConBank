package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC14Verify2InvalidAttemptsForWrongMonth extends wrappers.ProjectWrappers{

	public TC14Verify2InvalidAttemptsForWrongMonth() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC14 - To verify that user able to view Two Invalid attempts bot response when user give wrong month name twice while month selection";
		TestDescription="To verify that user able to view Two Invalid attempts bot response when user give wrong month name twice while month selection";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1,enabled=true)
	public void VerifyResponseFor2InvalidMonth() throws Exception
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
		.EnterText("SuperValue Account")
		.EnterText("July")
		.verifyWrongMonthText("Sorry, July is not a valid month.")
		.verifyResponseForWrongMonth("Please select the month")
		.EnterText("June")
		.verify2InvalidAttempts("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}
	
}
