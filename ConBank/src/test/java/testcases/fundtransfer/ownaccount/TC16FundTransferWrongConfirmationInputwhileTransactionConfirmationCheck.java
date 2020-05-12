package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC16FundTransferWrongConfirmationInputwhileTransactionConfirmationCheck extends wrappers.ProjectWrappers{

	public TC16FundTransferWrongConfirmationInputwhileTransactionConfirmationCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC16 -Funds Transfer - Wrong Confirmation Input while transaction confirmation check";
		TestDescription="TC16- To verify that user able to view the Wrong Confirmation Input given Message while confirming the transaction";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferWrongConfirmationInputwhileTransactionConfirmationCheck() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Fund Transfer")
		.verifyTransferText()
		.ClickFundTransferElement("To Own Account")
		.VerifyFromAccountMessage("Please select a debit account from the below list.")
		.VerifyElementPresent("SuperValue Account")
		.VerifyElementPresent("aXcessPlus Account")
		.VerifyElementPresent("Regular Current Account")
		.ClickFundTransferElement("SuperValue Account")
		.VerifyClientResponseMessage("To which account do you want to transfer?")
		.VerifyElementPresent("aXcessPlus Account")
		.VerifyElementPresent("Regular Current Account")
		.ClickFundTransferElement("aXcessPlus Account")
		.VerifyClientResponseMessage("How much would you like to transfer?")
		.EnterTextArea("100")
		.verifyConfirmationMessage("Here you go.")
		.EnterTextArea("ABCD")
		.verifyWrongConfirmationInputMessage("ABCD");
		
	}	
}
