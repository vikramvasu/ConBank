package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC09FundTransferOwnFromAccountSelection extends wrappers.ProjectWrappers{

	public TC09FundTransferOwnFromAccountSelection() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC09 - FundTransferOwnFromAccountSelection";
		TestDescription="TC09- To verify that user able to select the Transfer Type as Own Account";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferNavigationClickFTLogo() throws Exception
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
		.ClickFundTransferElement("SuperValue Account")
		//.VerifyClientResponseMessage()
		.VerifyClientResponseMessage("To which account do you want to transfer?");
	}	
}
