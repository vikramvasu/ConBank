package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC49StatementRequestByMonthSupportedIntentUtterance extends wrappers.ProjectWrappers{

	public TC49StatementRequestByMonthSupportedIntentUtterance() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC49 - To verify that user able to view statement by Statement Request by Month - Supported intent utterances";
		TestDescription="To verify that user able to view statement by Statement Request by Month - Supported intent utterances";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void StatementRequestIntentOneByMonth() throws Exception
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
		.VerifyAccount("Ultimate Card")
		.SelectAccount("Ultimate Card")
		.verifyDownloadText("Here is the statement of your ultimate card for the month of March. Please click to download the statement");
	}
	
	@Test(priority=2, enabled=true)
	public void StatementRequestIntentTwoByMonth() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("View statement for March month")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.VerifyAccount("Platinum Rewards")
		.SelectAccount("Platinum Rewards")
		.verifyDownloadText("Here is the statement of your platinum rewards for the month of March. Please click to download the statement");
	}
	
	@Test(priority=3, enabled=true)
	public void StatementRequestIntentThreeByMonth() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Show me the statement of March month")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.VerifyAccount("SuperValue Account")
		.SelectAccount("SuperValue Account")
		.verifyDownloadText("Here is the statement of your supervalue account for the month of March. Please click to download the statement");
	}
	
}
