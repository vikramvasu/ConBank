package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC39FundsTransfer100fromSuperValueAccounttoRegularCurrentAccount extends wrappers.ProjectWrappers{

	public TC39FundsTransfer100fromSuperValueAccounttoRegularCurrentAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC39 - Funds Transfer to Own Accounts - Transfer 100 from SuperValue Account to Regular Current Account";
		TestDescription="TC39 - Funds Transfer to Own Accounts - Transfer 100 from SuperValue Account to Regular Current Account";
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
		.EnterTextArea("Transfer 100 from SuperValue Account to Regular Current Account")
		.verifyConfirmationMessage("Here you go.")
		.clickConfirmButton()
		.VerifyTransactionSuccessMessage()
		.verifySuccessIcon();
		
	}	
}
