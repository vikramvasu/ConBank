package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC06FundTransferInvalidTransferTypeSelectedMessageCheck extends wrappers.ProjectWrappers{

	public TC06FundTransferInvalidTransferTypeSelectedMessageCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC06 - FundTransferInvalidTransferTypeSelectedMessageCheck";
		TestDescription="TC06-To verify that user able to view Invalid Transfer Type Selected Message when user enters Wrong Transfer Type";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferText() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Funds Transfer")
		.verifyTransferText()
		.EnterTextArea("Wrong Type")
		.VerifyInvalidTransferTypeMessageCheck("Wrong Type")
		.VerifyClientResponseMessage("Please select one of the provided options");
	}	
	
}
