package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC28FundTransferAccountNumberEndingwithWrongNumberCheck extends wrappers.ProjectWrappers{

	public TC28FundTransferAccountNumberEndingwithWrongNumberCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC28 - Funds Transfer - Account Number Ending with wrong number Check";
		TestDescription="TC28- Funds Transfer to Own Accounts by Account Number Ending With -Transfer funds from account number ending with 3333 ";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferAccountNumberEndingwithCorrectNumberCheck() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Transfer funds from account number ending with 3333")
		.verifyTransferText()
		.ClickFundTransferElement("To Own Account")
		.VerifyClientResponseMessage("Sorry, I was not able to find this account.")
		.ClickFundTransferElement("SuperValue Account")
		.VerifyClientResponseMessage("To which account do you want to transfer?")
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
