package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC32FundTransferOwnAccountsbyTOAccountTypeUserDontHaveAccount extends wrappers.ProjectWrappers{

	public TC32FundTransferOwnAccountsbyTOAccountTypeUserDontHaveAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC32 -Funds Transfer to Own Accounts by TO Account Type - User Donot Have Account";
		TestDescription="TC32-  To verify that user able to view validation message for Account Type which user don't have in the utterances";
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
		.EnterUserName("user5")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("user5")
		.EnterTextArea("Transfer funds to Savings account")
		.VerifyClientResponseMessage("Is there anything else I can help you with?");
	}	
}
