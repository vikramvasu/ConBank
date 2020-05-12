package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC13VerifyWrongMonthSelectedResponseFromBot extends wrappers.ProjectWrappers{

	public TC13VerifyWrongMonthSelectedResponseFromBot() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC13 - To verify that user able to view Wrong Month selected bot response when user give wrong month name while month selection";
		TestDescription="To verify that user able to view Wrong Month selected bot response when user give wrong month name while month selection";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1,enabled=true)
	public void BotResponseForWrongMonth() throws Exception
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
		.verifyResponseForWrongMonth("Please select the month");
	}
	
}
