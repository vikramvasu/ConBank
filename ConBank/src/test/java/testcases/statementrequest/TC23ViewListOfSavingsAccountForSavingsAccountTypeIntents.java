package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC23ViewListOfSavingsAccountForSavingsAccountTypeIntents extends wrappers.ProjectWrappers{

	public TC23ViewListOfSavingsAccountForSavingsAccountTypeIntents() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC23 - To verify that user able to view list of savings account to select for using savings account type utterance";
		TestDescription="To verify that user able to view list of savings account to select for using savings account type utterance";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	
	@Test(priority=1, enabled=true)
	public void ViewSavingsAccountForSavingAccountTypeIntentOne() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my Savings account")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.scrollDownforSavingsAccountName()
		.verifySelectAccountforSRText("I am happy to help you with that, Please select an account for which you want to download a statement")
		.VerifyAccount("SuperValue Account")
		.VerifyAccount("aXcessPlus Account");
	}
	
	@Test(priority=2, enabled=true)
	public void ViewSavingsAccountForSavingAccountTypeIntentTwo() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("view my Savings account statement")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.scrollDownforSavingsAccountName()
		.verifySelectAccountforSRText("I am happy to help you with that, Please select an account for which you want to download a statement")
		.VerifyAccount("SuperValue Account")
		.VerifyAccount("aXcessPlus Account");
	}

}
