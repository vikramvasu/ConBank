package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC21FundTransferCorrectAccountTypeEntryCheck extends wrappers.ProjectWrappers{

	public TC21FundTransferCorrectAccountTypeEntryCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC21 - Funds Transfer - Correct Account Type Entry Check";
		TestDescription="TC21- To verify that user able to enter Utterance Funds Transfer to Own Accounts by Account Type - Transfer funds from Savings Account ";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferCorrectAccountTypeEntryCheck() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Transfer funds from Savings Account")
		.verifyTransferText()
		.ClickFundTransferElement("To Own Account")
		.VerifyClientResponseMessage("Please choose an savings account from below.")
		.VerifyElementPresent("aXcessPlus Account")
		.VerifyElementPresent("SuperValue Account")
		.ClickFundTransferElement("aXcessPlus Account")
		.VerifyClientResponseMessage("To which account do you want to transfer?")
		.ClickFundTransferElement("SuperValue Account")
		.VerifyClientResponseMessage("How much would you like to transfer?")
		.EnterTextArea("100")
		.verifyConfirmationMessage("Here you go.")
		.clickConfirmButton()
		.VerifyTransactionSuccessMessage()
		.verifySuccessIcon();
		
	}	
}
