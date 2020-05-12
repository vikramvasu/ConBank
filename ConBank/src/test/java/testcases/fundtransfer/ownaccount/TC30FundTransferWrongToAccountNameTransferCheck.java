package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC30FundTransferWrongToAccountNameTransferCheck extends wrappers.ProjectWrappers{

	public TC30FundTransferWrongToAccountNameTransferCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC30 -Funds Transfer - Wrong Account Name Transfer Check";
		TestDescription="TC30- To verify that user able to enter Utterance Funds Transfer to Own Accounts by Account Name - Transfer funds To Employee Banking Account ";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferWrongAccountNameTransferCheck() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Transfer funds To Employee Banking Account")
		.verifyWrongAccountText("employee banking account")
		.VerifyClientResponseMessage("Please choose an account from below.")
		.ClickFundTransferElement("SuperValue Account")
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
