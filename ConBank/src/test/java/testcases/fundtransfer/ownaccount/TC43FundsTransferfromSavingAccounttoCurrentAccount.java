package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC43FundsTransferfromSavingAccounttoCurrentAccount extends wrappers.ProjectWrappers{

	public TC43FundsTransferfromSavingAccounttoCurrentAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC43 - Funds Transfer to Own Accounts - Transfer 100 from Saving account to Current account";
		TestDescription="TC43 - Funds Transfer to Own Accounts - Transfer 100 from Saving account to Current account";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundsTransferfromSavingAccounttoCurrentAccount() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Transfer 100 from Saving account to Current account")
		.VerifyClientResponseMessage("Please choose an savings account from below.")
		.ClickFundTransferElement("SuperValue Account")
		.verifyConfirmationMessage("Here you go.")
		.clickConfirmButton()
		.VerifyTransactionSuccessMessage()
		.verifySuccessIcon();
	}	
}
