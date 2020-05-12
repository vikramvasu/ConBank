package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC34FundsTransfertoOwnAccountsbyTOAccountTypeEndingWith extends wrappers.ProjectWrappers{

	public TC34FundsTransfertoOwnAccountsbyTOAccountTypeEndingWith() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC34 - Funds Transfer to Own Accounts by TO Account Type Ending With";
		TestDescription="TC34 -Funds Transfer to Own Accounts by TO Account Type Ending With - Transfer funds to Savings account ending with 5546";
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
		.EnterTextArea("Transfer funds to Savings account ending with 5546")
		.VerifyFromAccountMessage("Please select a debit account from the below list.")
		.ClickFundTransferElement("aXcessPlus Account")
		.VerifyClientResponseMessage("How much would you like to transfer?")
		.EnterTextArea("100")
		.verifyConfirmationMessage("Here you go.")
		.clickConfirmButton()
		.VerifyTransactionSuccessMessage()
		.verifySuccessIcon();
		
	}	
}
