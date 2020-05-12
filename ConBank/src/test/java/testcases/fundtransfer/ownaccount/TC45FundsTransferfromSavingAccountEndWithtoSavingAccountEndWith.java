package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC45FundsTransferfromSavingAccountEndWithtoSavingAccountEndWith extends wrappers.ProjectWrappers{

	public TC45FundsTransferfromSavingAccountEndWithtoSavingAccountEndWith() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC45 - Funds Transfer to Own Accounts - Transfer 100 from Savings account ending with 5546 to Savings account ending with 2220";
		TestDescription="TC45 - Funds Transfer to Own Accounts - Transfer 100 from Savings account ending with 5546 to Savings account ending with 2220";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundsTransferfromSavingAccountEndWithtoSavingAccountEndWith() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Transfer 100 from Savings account ending with 5546 to Savings account ending with 2220")
		.verifyConfirmationMessage("Here you go.")
		.clickConfirmButton()
		.VerifyTransactionSuccessMessage()
		.verifySuccessIcon();
	}	
}
