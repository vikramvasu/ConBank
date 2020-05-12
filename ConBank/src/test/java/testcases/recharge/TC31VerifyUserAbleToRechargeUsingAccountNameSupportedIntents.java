package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC31VerifyUserAbleToRechargeUsingAccountNameSupportedIntents extends wrappers.ProjectWrappers{

	public TC31VerifyUserAbleToRechargeUsingAccountNameSupportedIntents() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC31 - To Verify that user is able to Recharge by using Account Name - Supported Intent Utterances";
		TestDescription="To Verify that user is able to Recharge by using Account Name - Supported Intent Utterances";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void AccountNameIntentOneForRecharge() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		//.verifyRechargeIcon("Recharge")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.EnterText("Recharge from SuperValue Account")
		.verifyMobileText("Please enter the mobile number you wish to recharge");
	}
	
	@Test(priority=2)
	public void AccountNameIntentTwoForRecharge() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		//.verifyRechargeIcon("Recharge")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.EnterText("Recharge from Ultimate Card")
		.verifyMobileText("Please enter the mobile number you wish to recharge");
	}
	
	@Test(priority=3)
	public void AccountNameIntentThreeForRecharge() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		//.verifyRechargeIcon("Recharge")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.EnterText("Recharge from Platinum Rewards")
		.verifyMobileText("Please enter the mobile number you wish to recharge");
	}
	
	@Test(priority=4)
	public void AccountNameIntentFourForRecharge() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		//.verifyRechargeIcon("Recharge")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.EnterText("Recharge from aXcessPlus Account")
		.verifyMobileText("Please enter the mobile number you wish to recharge");
	}
	
	@Test(priority=5)
	public void AccountNameIntentFiveForRecharge() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		//.verifyRechargeIcon("Recharge")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.EnterText("Recharge from Regular Current Account")
		.verifyMobileText("Please enter the mobile number you wish to recharge");
	}

}
