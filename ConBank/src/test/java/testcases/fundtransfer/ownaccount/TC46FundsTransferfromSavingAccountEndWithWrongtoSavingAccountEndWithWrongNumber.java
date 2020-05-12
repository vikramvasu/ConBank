package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC46FundsTransferfromSavingAccountEndWithWrongtoSavingAccountEndWithWrongNumber extends wrappers.ProjectWrappers{

	public TC46FundsTransferfromSavingAccountEndWithWrongtoSavingAccountEndWithWrongNumber() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC46 - Funds Transfer - Account Type Ending with Wrong account number Check ";
		TestDescription="TC46- To verify that user able to enter Utterance - Transfer funds from Savings account ending with 3333 ";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundsTransferfromSavingAccountEndWithWrongtoSavingAccountEndWithWrongNumber() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Transfer 100 from Savings account ending with 3333 to Savings account ending with 2222")
		.verifyWrongAccountText("savings account ending 3333")
		.VerifyClientResponseMessage("Please choose an account from below.")
		.ClickFundTransferElement("SuperValue Account")
		.VerifyElementPresent("aXcessPlus Account")
		.VerifyElementPresent("Regular Current Account")
		.ClickFundTransferElement("aXcessPlus Account")
		.verifyConfirmationMessage("Here you go.")
		.clickConfirmButton()
		.VerifyTransactionSuccessMessage()
		.verifySuccessIcon();
		
	}	
}
