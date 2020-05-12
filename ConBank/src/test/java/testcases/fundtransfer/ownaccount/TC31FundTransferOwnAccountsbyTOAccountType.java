package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC31FundTransferOwnAccountsbyTOAccountType extends wrappers.ProjectWrappers{

	public TC31FundTransferOwnAccountsbyTOAccountType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC31 -Funds Transfer to Own Accounts by TO Account Type - Transfer funds to Savings account";
		TestDescription="TC31- To verify that user able to enter Utterance Funds Transfer to Own Accounts by TO Account Type - Transfer funds to Savings account ";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferWrongAccountNameTransferCheck() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Transfer funds to Savings account")
		.ClickFundTransferElement("SuperValue Account")
		.VerifyClientResponseMessage("How much would you like to transfer?")
		.EnterTextArea("100")
		.verifyConfirmationMessage("Here you go.")
		.clickConfirmButton()
		.VerifyTransactionSuccessMessage()
		.verifySuccessIcon();
	}	
}
