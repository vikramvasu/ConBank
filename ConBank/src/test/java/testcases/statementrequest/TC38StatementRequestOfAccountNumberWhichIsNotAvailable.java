package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC38StatementRequestOfAccountNumberWhichIsNotAvailable extends wrappers.ProjectWrappers{

	public TC38StatementRequestOfAccountNumberWhichIsNotAvailable() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC38 - To verify that user able to view proper validation message when user gives account number ending which is not available";
		TestDescription="To verify that user able to view proper validation message when user gives account number ending which is not available";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	
	@Test(priority=1, enabled=true)
	public void StatementRequestOfAccountNumberWhichIsNotAvailable() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my Account Number ending with 5555")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyTextForAccountNumberEnding("Sorry, 5555 is not a valid number.")
		.verifySelectAccountForWrongAccountCases("Please select an account for which you want to download a statement");
	}
		
}
