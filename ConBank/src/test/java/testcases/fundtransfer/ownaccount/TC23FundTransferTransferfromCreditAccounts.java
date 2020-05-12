package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC23FundTransferTransferfromCreditAccounts extends wrappers.ProjectWrappers{

	public TC23FundTransferTransferfromCreditAccounts() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC23 - Funds Transfer - Transfer from Credit Accounts ";
		TestDescription="TC23- To verify that user able to enter Utterance Funds Transfer to Own Accounts by Account Type - Transfer funds from credit accounts ";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferTransferfromCreditAccounts() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Transfer funds from credit Account")
		.verifyTransferText()
		.ClickFundTransferElement("To Own Account")
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
