package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC24FundTransferAccountTypeEndingwithCorrectAccountNumberCheck extends wrappers.ProjectWrappers{

	public TC24FundTransferAccountTypeEndingwithCorrectAccountNumberCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC24 - Funds Transfer - Account Type Ending with correct account number Check ";
		TestDescription="TC24- To verify that user able to enter Utterance - Transfer funds from Savings account ending with 5546 ";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferTransferfromCreditAccounts() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Transfer funds from Savings account ending with 5546")
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
