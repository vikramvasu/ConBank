package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC27FundTransferAccountNumberEndingwithCorrectNumberCheck extends wrappers.ProjectWrappers{

	public TC27FundTransferAccountNumberEndingwithCorrectNumberCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC27 - Funds Transfer - Account Number Ending with Correct number Check";
		TestDescription="TC27- Funds Transfer to Own Accounts by Account Number Ending With -Transfer funds from account number ending with 5546 ";
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
		.EnterTextArea("Transfer funds from account number ending with 5546")
		.verifyTransferText()
		.ClickFundTransferElement("To Own Account")
		.VerifyClientResponseMessage("To which account do you want to transfer?")
		.ClickFundTransferElement("aXcessPlus Account")
		.VerifyClientResponseMessage("How much would you like to transfer?")
		.EnterTextArea("100")
		.verifyConfirmationMessage("Here you go.")
		.clickConfirmButton()
		.VerifyTransactionSuccessMessage()
		.verifySuccessIcon();
		
	}	
}
