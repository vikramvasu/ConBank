package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC53ValidationResponseForWrongMonth extends wrappers.ProjectWrappers{

	public TC53ValidationResponseForWrongMonth() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC53 - To verify that user able to view proper validation message when user gives wrong month";
		TestDescription="To verify that user able to view proper validation message when user gives wrong month";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void ResponseForWrongMonth() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of MMM")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyWrongMonthText("Sorry, MMM is not a valid month.")
		.verifyResponseForWrongMonth("Please select the month");
	}
	
}
