package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC52FundTransferTwoInvalidAccountType extends wrappers.ProjectWrappers{

	public TC52FundTransferTwoInvalidAccountType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC14 - Funds Transfer - Wrong Amount Entered Message Check";
		TestDescription="TC14- To verify that user able to view the Wrong Amount Entered Message when user gives wrong amount while entering the amount";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferWrongAmountEnteredMessageCheck() throws Exception
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
		.VerifyElementPresent("To Own Account")
		.EnterTextArea("wrong input")
		.EnterTextArea("2nd wrong input")
		.verifySorryTwoInvalidAttemptMessage();
		
	
		
	}	
}
