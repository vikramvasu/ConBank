package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC04FundTransferIconClickWithoutLogin extends wrappers.ProjectWrappers{

	public TC04FundTransferIconClickWithoutLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC04 - FundTransferIconClickWithoutLogin";
		TestDescription="TC04- To Verify that user able to click on Funds Transfer icon  - Without Login";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundTransferIconClickWithoutLogin() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.clickFundtransferLogo()
		.ClickLogin()
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("Tagit");
	}	
}
