package testcases.recharge_jira;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class JIRA_TC03VerifyTheUsserUtteranceForRecharge extends wrappers.ProjectWrappers{

	public JIRA_TC03VerifyTheUsserUtteranceForRecharge() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="JIRA - TC03 - To Verify that user is able to provide the Recharge Supported Utterances";
		TestDescription="Recharge";
		browserName="Chrome";
		Application="ConBank";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void RechargeUtteranceOne() throws Exception
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
		.EnterText("Recharge")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
	@Test(priority=2)
	public void RechargeUtteranceTwo() throws Exception
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
		.EnterText("I want to recharge")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}

	@Test(priority=3)
	public void RechargeUtteranceThree() throws Exception
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
		.EnterText("I want to recharge my mobile")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
	@Test(priority=4)
	public void RechargeUtteranceFour() throws Exception
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
		.EnterText("I want to Top-Up")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
	@Test(priority=5)
	public void RechargeUtteranceFive() throws Exception
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
		.EnterText("I want to top-up my mobile")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
	@Test(priority=6)
	public void RechargeUtteranceSix() throws Exception
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
		.EnterText("Recharge my Mobile")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
	@Test(priority=7)
	public void RechargeUtteranceSeven() throws Exception
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
		.EnterText("Top-up")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
	@Test(priority=8)
	public void RechargeUtteranceEight() throws Exception
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
		.EnterText("Refill")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
	@Test(priority=9)
	public void RechargeUtteranceNine() throws Exception
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
		.EnterText("Reload")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
}
