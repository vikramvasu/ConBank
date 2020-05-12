package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC15VerifyAnythingElseStatementInDownloadResponse extends wrappers.ProjectWrappers{

	public TC15VerifyAnythingElseStatementInDownloadResponse() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC15 - To verify that user is able to view 'Is there anything else I can help you with?' in the Download Statement bot response";
		TestDescription="To verify that user is able to view 'Is there anything else I can help you with?' in the Download Statement bot response";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void VerifyAnythingElseStatementInDownloadResponseForUltimateAccount() throws Exception
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
		.verifyDownloadText("Here is the statement of your ultimate card for the month of March. Please click to download the statement")
		.verifyAnythingElseTextinDownloadResponse("Is there anything else I can help you with?");
	}
	
	@Test(priority=2, enabled=true)
	public void VerifyAnythingElseStatementInDownloadResponseForPlatinumRewardsAccount() throws Exception
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
		.verifyDownloadText("Here is the statement of your platinum rewards for the month of March. Please click to download the statement")
		.verifyAnythingElseTextinDownloadResponse("Is there anything else I can help you with?");
	}
	
	@Test(priority=3, enabled=true)
	public void VerifyAnythingElseStatementInDownloadResponseForSuperValueAccount() throws Exception
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
		.verifyDownloadText("Here is the statement of your supervalue account for the month of March. Please click to download the statement")
		.verifyAnythingElseTextinDownloadResponse("Is there anything else I can help you with?");
	}
	
	@Test(priority=4, enabled=true)
	public void VerifyAnythingElseStatementInDownloadResponseForaXcessPlusAccount() throws Exception
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
		.verifyDownloadText("Here is the statement of your axcessplus account for the month of March. Please click to download the statement")
		.verifyAnythingElseTextinDownloadResponse("Is there anything else I can help you with?");
	}
	
	@Test(priority=5, enabled=true)
	public void VerifyAnythingElseStatementInDownloadResponseForRegularCurrentAccount() throws Exception
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
		.verifyDownloadText("Here is the statement of your regular current account for the month of March. Please click to download the statement")
		.verifyAnythingElseTextinDownloadResponse("Is there anything else I can help you with?");
	}
	
}
