package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC05FundTransferUsingUtterances extends wrappers.ProjectWrappers{

	public TC05FundTransferUsingUtterances() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC05 - FundTransferUsingUtterances";
		TestDescription="TC05- To verify that user able to enter Funds Transfer Module by using Funds Transfer - Supported intent utterances";
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
		.EnterTextArea("can you help me with Funds Transfer")
		.verifyTransferText();
	}	
	
	@Test
	public void FundTransferText2() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("can you initiate Funds Transfer")
		.verifyTransferText();
	}	
	
	@Test
	public void FundTransferText3() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("please Funds Transfer")
		.verifyTransferText();
	}	
	
	@Test
	public void FundTransferText4() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("can you help me do Funds Transfer")
		.verifyTransferText();
	}	
}
