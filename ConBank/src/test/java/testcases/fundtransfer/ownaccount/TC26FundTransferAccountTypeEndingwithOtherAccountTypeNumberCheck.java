package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC26FundTransferAccountTypeEndingwithOtherAccountTypeNumberCheck extends wrappers.ProjectWrappers{

	public TC26FundTransferAccountTypeEndingwithOtherAccountTypeNumberCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC26 - Funds Transfer - Account Type Ending with Other Account Type number check -";
		TestDescription="TC26- Funds Transfer to Own Accounts by Account Type Ending With - Transfer funds from Current account ending with 5546 ";
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
		.EnterTextArea("Transfer funds from Current account ending with 5546")
		.verifyTransferText()
		.ClickFundTransferElement("To Own Account")
		.verifyWrongAccountText("checking account ending 5546")
		.VerifyClientResponseMessage("Please choose an account from below.")
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
