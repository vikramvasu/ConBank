package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC37FundsTransfertoOwnAccountsbyTOAccountTypeEndingWithDifferentAccountType extends wrappers.ProjectWrappers{

	public TC37FundsTransfertoOwnAccountsbyTOAccountTypeEndingWithDifferentAccountType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC37 - Funds Transfer to Own Accounts by TO Account Type Ending With Different Account Type";
		TestDescription="TC37 -Funds Transfer to Own Accounts by TO Account Type Ending With - Transfer funds to account number ending with 5546";
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
		.EnterTextArea("Transfer funds to account number ending with 5546")
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
