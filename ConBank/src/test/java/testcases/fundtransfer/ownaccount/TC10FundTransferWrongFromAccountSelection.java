package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC10FundTransferWrongFromAccountSelection extends wrappers.ProjectWrappers{

	public TC10FundTransferWrongFromAccountSelection() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC10 - Funds Transfer - Wrong FROM  Account Name Entered Message Check";
		TestDescription="TC10- To verify that user able to view the Wrong Account Name entered Message when User gives Wrong Account Name ";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferWrongFromAccountSelection() throws Exception
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
		.EnterTextArea("Wrong Account Type")
		.verifyWrongAccountText("Wrong Account Type")
		.VerifyClientResponseMessage("Please choose an account from below.");
	}	
}
