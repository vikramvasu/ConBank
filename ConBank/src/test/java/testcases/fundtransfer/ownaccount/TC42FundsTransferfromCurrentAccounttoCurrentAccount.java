package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC42FundsTransferfromCurrentAccounttoCurrentAccount extends wrappers.ProjectWrappers{

	public TC42FundsTransferfromCurrentAccounttoCurrentAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC42 - Funds Transfer to Own Accounts - Transfer 100 from Current account to Current account";
		TestDescription="TC42 - Funds Transfer to Own Accounts - Transfer 100 from Current account to Current account";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundsTransferfromCurrentAccounttoCurrentAccount() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Transfer 100 from Current account to Current account")
		.VerifyClientResponseMessage("From account and To account can not be the same.")
		.VerifyClientResponseMessage("Please select an account to which you want to transfer")
		.ClickFundTransferElement("SuperValue Account")
		.VerifyClientResponseMessage("Transfering from your Regular Current Account.")
		.verifyConfirmationMessage("Here you go.")
		.clickConfirmButton()
		.VerifyTransactionSuccessMessage()
		.verifySuccessIcon();
	}	
}
