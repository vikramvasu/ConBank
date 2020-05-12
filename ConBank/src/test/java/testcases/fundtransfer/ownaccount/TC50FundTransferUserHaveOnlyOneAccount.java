package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC50FundTransferUserHaveOnlyOneAccount extends wrappers.ProjectWrappers{

	public TC50FundTransferUserHaveOnlyOneAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC50 -Funds Transfer to Own Accounts by TO Account Type - User Donot Have Account";
		TestDescription="TC50-  To verify that user able to view the correct validation message when user having only one accounts for transfering funds";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferUserHaveOnlyOneAccount() throws Exception
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
