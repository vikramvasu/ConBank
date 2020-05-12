package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC51ValidationResponseForMonthBefore6Months extends wrappers.ProjectWrappers{

	public TC51ValidationResponseForMonthBefore6Months() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC51 - To verify that user able to view proper validation message when user gives month which is not part of 6 months";
		TestDescription="To verify that user able to view proper validation message when user gives month which is not part of 6 months";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void ResponseForMonthGivenBefore6Months() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of May")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyWrongMonthText("Sorry, May is not a valid month.")
		.verifyResponseForWrongMonth("Please select the month");
	}
	
}
