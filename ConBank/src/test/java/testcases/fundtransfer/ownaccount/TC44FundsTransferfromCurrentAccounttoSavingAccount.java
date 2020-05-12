package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC44FundsTransferfromCurrentAccounttoSavingAccount extends wrappers.ProjectWrappers{

	public TC44FundsTransferfromCurrentAccounttoSavingAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC44 - Funds Transfer to Own Accounts - Transfer 100 from Current account to Saving account";
		TestDescription="TC44 - Funds Transfer to Own Accounts - Transfer 100 from Current account to Saving account";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundsTransferfromCurrentAccounttoSavingAccount() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Transfer 100 from Current account to Saving account")
		.VerifyClientResponseMessage("Transfering from your Regular Current Account.")
		.ClickFundTransferElement("SuperValue Account")
		.verifyConfirmationMessage("Here you go.")
		.clickConfirmButton()
		.VerifyTransactionSuccessMessage()
		.verifySuccessIcon();
	}	
}
