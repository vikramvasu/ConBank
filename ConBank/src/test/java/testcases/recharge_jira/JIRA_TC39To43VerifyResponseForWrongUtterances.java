package testcases.recharge_jira;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class JIRA_TC39To43VerifyResponseForWrongUtterances extends wrappers.ProjectWrappers{

	public JIRA_TC39To43VerifyResponseForWrongUtterances() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="JIRA - TC39 to TC43 - Verify Validation Response for the Wrong Utterances";
		TestDescription="Recharge";
		browserName="Chrome";
		Application="ConBank";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void verifyResponseForUtteranceOne() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.verifyRechargeIcon("Recharge")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		.verifyWelcomeUserName("Tagit")
		.EnterText("Mobile Recharge from Corporate Account")// Sorry validation missing in response
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}

	@Test(priority=2)
	public void verifyResponseForUtteranceTwo() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.verifyRechargeIcon("Recharge")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		.verifyWelcomeUserName("Tagit")
		.EnterText("Recharge from Account Number ending with 8144")// Bot is throwing mobile num invalid error
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
	@Test(priority=3)
	public void verifyResponseForUtteranceThree() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.verifyRechargeIcon("Recharge")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		.verifyWelcomeUserName("Tagit")
		.EnterText("Recharge from Current Account ending with 5555")// Bot is throwing mobile num invalid error
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
	@Test(priority=4)
	public void verifyResponseForUtteranceFour() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.verifyRechargeIcon("Recharge")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		.verifyWelcomeUserName("Tagit")
		.EnterText("Recharge from Current Account ending with 5555")// Bot is throwing mobile num invalid error
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
}
