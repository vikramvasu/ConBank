package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC09ViewTheStatementDownloadResponseForTheMonth extends wrappers.ProjectWrappers{

	public TC09ViewTheStatementDownloadResponseForTheMonth() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC09 - To verify that user able to view the statement download response for the month selected";
		TestDescription="To verify that user able to view the statement download response for the month selected";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1)
	public void viewDownloadTextForUltimateCardAccount() throws Exception
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
		.SelectAccount("Ultimate Card")
		.SelectMonth("March")
		.verifyDownloadText("Here is the statement of your ultimate card for the month of March. Please click to download the statement");
	}
	
	@Test(priority=2)
	public void viewDownloadTextForPlatinumRewardsAccount() throws Exception
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
		.VerifyAccount("Platinum Rewards")
		.SelectAccount("Platinum Rewards")
		.SelectMonth("March")
		.verifyDownloadText("Here is the statement of your platinum rewards for the month of March. Please click to download the statement");
	}
	
	@Test(priority=3)
	public void viewDownloadTextForSuperValueAccount() throws Exception
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
		.VerifyAccount("SuperValue Account")
		.SelectAccount("SuperValue Account")
		.SelectMonth("March")
		.verifyDownloadText("Here is the statement of your supervalue account for the month of March. Please click to download the statement");
	}
	
	@Test(priority=4)
	public void viewDownloadTextForaXcessPlusAccount() throws Exception
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
		.VerifyAccount("aXcessPlus Account")
		.SelectAccount("aXcessPlus Account")
		.SelectMonth("March")
		.verifyDownloadText("Here is the statement of your axcessplus account for the month of March. Please click to download the statement");
	}
	
	@Test(priority=5)
	public void viewDownloadTextForRegularCurrentAccount() throws Exception
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
		.VerifyAccount("Regular Current Account")
		.SelectAccount("Regular Current Account")
		.SelectMonth("March")
		.verifyDownloadText("Here is the statement of your regular current account for the month of March. Please click to download the statement");
	}
	
}
