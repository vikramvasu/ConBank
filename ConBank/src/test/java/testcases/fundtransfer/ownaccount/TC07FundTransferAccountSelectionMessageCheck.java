package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC07FundTransferAccountSelectionMessageCheck extends wrappers.ProjectWrappers{

	public TC07FundTransferAccountSelectionMessageCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC07 - FundTransferAccountSelectionMessageCheck";
		TestDescription="TC07- To verify that user able to enter Funds Transfer Module by using Funds Transfer - Supported intent utterances";
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
