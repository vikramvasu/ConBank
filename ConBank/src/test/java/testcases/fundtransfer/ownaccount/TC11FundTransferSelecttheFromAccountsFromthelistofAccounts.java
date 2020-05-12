package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC11FundTransferSelecttheFromAccountsFromthelistofAccounts extends wrappers.ProjectWrappers{

	public TC11FundTransferSelecttheFromAccountsFromthelistofAccounts() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC11 - Funds Transfer - select the From Accounts from the list of Accounts ";
		TestDescription="TC11- To verify that user able to select the From Accounts from the list of Accounts  ";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferSelecttheFromAccountsFromthelistofAccounts() throws Exception
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
		.VerifyElementPresent("SuperValue Account")
		.VerifyElementPresent("aXcessPlus Account")
		.VerifyElementPresent("Regular Current Account")
		.ClickFundTransferElement("SuperValue Account")
		.VerifyClientResponseMessage("To which account do you want to transfer?")
		.VerifyElementPresent("aXcessPlus Account")
		.VerifyElementPresent("Regular Current Account");
		
	}	
}
