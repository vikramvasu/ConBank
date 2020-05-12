package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC33FundsTransfertoOwnAccountsbyTOAccountTypeCreditAccount extends wrappers.ProjectWrappers{

	public TC33FundsTransfertoOwnAccountsbyTOAccountTypeCreditAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC33 -Funds Transfer to Own Accounts by TO Account Type - Transfer funds to credit accounts";
		TestDescription="TC33 -Funds Transfer to Own Accounts by TO Account Type - Transfer funds to credit accounts";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundsTransfertoOwnAccountsbyTOAccountTypeCreditAccount() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Transfer funds to credit accounts")
		.verifyTransferText()
		.ClickFundTransferElement("To Own Account")
		.VerifyFromAccountMessage("Please select a debit account from the below list.")
		.VerifyElementPresent("SuperValue Account")
		.VerifyElementPresent("aXcessPlus Account")
		.VerifyElementPresent("Regular Current Account")
		.ClickFundTransferElement("SuperValue Account")
		.VerifyClientResponseMessage("To which account do you want to transfer?")
		.VerifyElementPresent("aXcessPlus Account")
		.VerifyElementPresent("Regular Current Account")
		.ClickFundTransferElement("aXcessPlus Account")
		.VerifyClientResponseMessage("How much would you like to transfer?")
		.EnterTextArea("100")
		.verifyConfirmationMessage("Here you go.")
		.clickConfirmButton()
		.VerifyTransactionSuccessMessage()
		.verifySuccessIcon();
		
	}	
}
