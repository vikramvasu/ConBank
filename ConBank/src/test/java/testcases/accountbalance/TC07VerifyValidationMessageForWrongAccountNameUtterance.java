package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC07VerifyValidationMessageForWrongAccountNameUtterance extends wrappers.ProjectWrappers{

	public TC07VerifyValidationMessageForWrongAccountNameUtterance() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC07 - To Verify that user is able to view proper validation message for Wrong Correct Account Name Utterances";
		TestDescription="To Verify that user is able to view proper validation message for Wrong Correct Account Name Utterances";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void ResponseForWrongAccountNameUtterance() throws Exception
	{
		new AccountBalancePage(driver,test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		//.verifyAccountBalanceIcon("Account Balance")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.EnterText("Account Balance of Employee Banking Account")
		.ScrollUpForWrongAccountNameText()
		.verifyWrongAccountText("employee banking")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
