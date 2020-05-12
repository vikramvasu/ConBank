package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC01FundTransferNavigationClickFTLogo extends wrappers.ProjectWrappers{

	public TC01FundTransferNavigationClickFTLogo() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC01 - FundTransferNavigationClickFTLogo";
		TestDescription="TC01- Fund Transfer Navigation Click FTLogo";
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
		.verifyWelcomeUserName("Tagit")
		.Scrollup()
		.clickFundtransferLogo()
		.verifyTransferText();
	}	
}
