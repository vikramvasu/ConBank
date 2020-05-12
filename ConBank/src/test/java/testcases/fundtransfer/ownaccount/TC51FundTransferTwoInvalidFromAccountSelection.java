package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC51FundTransferTwoInvalidFromAccountSelection extends wrappers.ProjectWrappers{

	public TC51FundTransferTwoInvalidFromAccountSelection() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC51 - Funds Transfer - Two Consecutive Invalid Entries while selecting From Account";
		TestDescription="TC51- To verify that user able to view the Two Consecutive Invalid Entries Message while selecting from account ";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferWrongFromAccountSelection() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Fund Transfer")
		.verifyTransferText()
		.ClickFundTransferElement("To Own Account")
		.VerifyFromAccountMessage("Please select a debit account from the below list.")
		.EnterTextArea("Wrong Account Type")
		.verifyWrongAccountText("Wrong Account Type")
		.EnterTextArea("Wrong Account Type")
		.verifySorryTwoInvalidAttemptMessage();
	}	
}
