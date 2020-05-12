package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC05StatementRequestDisplaysListOfAllAccounts extends wrappers.ProjectWrappers{

	public TC05StatementRequestDisplaysListOfAllAccounts() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC05 - To verify that user able to view list of accounts available to download statement";
		TestDescription="To verify that user able to view list of accounts available to download statement";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1)
	public void StatementRequestViewAccountUsingIntentOne() throws Exception
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
		.VerifyAccount("Ultimate Card")
		.VerifyAccount("Platinum Rewards")
		.VerifyAccount("SuperValue Account")
		.VerifyAccount("aXcessPlus Account")
		.VerifyAccount("Regular Current Account");
	}
	
	@Test(priority=2)
	public void StatementRequestViewAccountUsingIntentTwo() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("View Statement")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.scrollDownforSelectAccountText()
		.verifySelectAccountforSRText("I am happy to help you with that, Please select an account for which you want to download a statement")
		.VerifyAccount("Ultimate Card")
		.VerifyAccount("Platinum Rewards")
		.VerifyAccount("SuperValue Account")
		.VerifyAccount("aXcessPlus Account")
		.VerifyAccount("Regular Current Account");
	}
	
	@Test(priority=3)
	public void StatementRequestViewAccountUsingIntentThree() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("I want to view my statement")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.scrollDownforSelectAccountText()
		.verifySelectAccountforSRText("I am happy to help you with that, Please select an account for which you want to download a statement")
		.VerifyAccount("Ultimate Card")
		.VerifyAccount("Platinum Rewards")
		.VerifyAccount("SuperValue Account")
		.VerifyAccount("aXcessPlus Account")
		.VerifyAccount("Regular Current Account");
	}
	
	@Test(priority=4)
	public void StatementRequestViewAccountUsingIntentFour() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Show me my statement")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.scrollDownforSelectAccountText()
		.verifySelectAccountforSRText("I am happy to help you with that, Please select an account for which you want to download a statement")
		.VerifyAccount("Ultimate Card")
		.VerifyAccount("Platinum Rewards")
		.VerifyAccount("SuperValue Account")
		.VerifyAccount("aXcessPlus Account")
		.VerifyAccount("Regular Current Account");
	}
	
	@Test(priority=5)
	public void StatementRequestViewAccountUsingIntentFive() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Download Statement")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.scrollDownforSelectAccountText()
		.verifySelectAccountforSRText("I am happy to help you with that, Please select an account for which you want to download a statement")
		.VerifyAccount("Ultimate Card")
		.VerifyAccount("Platinum Rewards")
		.VerifyAccount("SuperValue Account")
		.VerifyAccount("aXcessPlus Account")
		.VerifyAccount("Regular Current Account");
	}
	
	@Test(priority=6)
	public void StatementRequestViewAccountUsingIntentSix() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.scrollDownforSelectAccountText()
		.verifySelectAccountforSRText("I am happy to help you with that, Please select an account for which you want to download a statement")
		.VerifyAccount("Ultimate Card")
		.VerifyAccount("Platinum Rewards")
		.VerifyAccount("SuperValue Account")
		.VerifyAccount("aXcessPlus Account")
		.VerifyAccount("Regular Current Account");
	}

}
