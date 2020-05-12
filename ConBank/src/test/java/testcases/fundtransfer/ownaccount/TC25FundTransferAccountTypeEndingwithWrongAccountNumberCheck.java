package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC25FundTransferAccountTypeEndingwithWrongAccountNumberCheck extends wrappers.ProjectWrappers{

	public TC25FundTransferAccountTypeEndingwithWrongAccountNumberCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC25 - Funds Transfer - Account Type Ending with Wrong account number Check ";
		TestDescription="TC25- To verify that user able to enter Utterance - Transfer funds from Savings account ending with 3333 ";
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
		.EnterTextArea("Transfer funds from Savings account ending with 3333")
		.ClickFundTransferElement("To Own Account")
		.verifyWrongAccountText("savings account ending 3333")
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
