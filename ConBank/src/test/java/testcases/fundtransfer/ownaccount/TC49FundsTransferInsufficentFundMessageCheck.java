package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC49FundsTransferInsufficentFundMessageCheck extends wrappers.ProjectWrappers{

	public TC49FundsTransferInsufficentFundMessageCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC49 - Funds Transfer - Insufficent Fund message check ";
		TestDescription="TC49-  To verify that user able to view the correct validation message when user enters the amount which is more than what is available in the account ";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundsTransferfromSavingAccountEndWithWrongtoSavingAccountEndWithWrongNumber() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Transfer 70000")
		.verifyTransferText()
		.ClickFundTransferElement("To Own Account")
		.VerifyFromAccountMessage("Please select a debit account from the below list.")
		.ClickFundTransferElement("SuperValue Account")
		.VerifyInsufficendFundMessage();
	}	
}
