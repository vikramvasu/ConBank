package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC18StatementRequestForSavingAccountType extends wrappers.ProjectWrappers{

	public TC18StatementRequestForSavingAccountType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC18 - To verify that user able to view statement for user entering account name from savings account type";
		TestDescription="To verify that user able to view statement for user entering account name from savings account type";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void StatementRequestIntentOneForSavingAccountType() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my SuperValue account")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForWrongMonth("Please select the month")
		.SelectMonth("March")
		.verifyDownloadText("Here is the statement of your supervalue account for the month of March. Please click to download the statement");
	}
	
	@Test(priority=2, enabled=true)
	public void StatementRequestIntentTwoForSavingAccountType() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("View statement of my axcessplus account")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.verifyResponseForWrongMonth("Please select the month")
		.SelectMonth("March")
		.verifyDownloadText("Here is the statement of your axcessplus account for the month of March. Please click to download the statement");
	}
	
	@Test(priority=3, enabled=true)
	public void StatementRequestIntentThreeForSavingAccountType() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my Saving account")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.scrollDownforSavingsAccountName()
		.SelectAccount("SuperValue Account")
		.verifyResponseForWrongMonth("Please select the month")
		.SelectMonth("March")
		.verifyDownloadText("Here is the statement of your supervalue account for the month of March. Please click to download the statement");
	}

}
