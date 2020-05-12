package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC34VerifyUserAbleToRechargeUsingAccountTypeSupportedIntents extends wrappers.ProjectWrappers{

	public TC34VerifyUserAbleToRechargeUsingAccountTypeSupportedIntents() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC34 - To Verify that user is able to Recharge by using Account Type - Supported Intent Utterances";
		TestDescription="To Verify that user is able to Recharge by using Account Type - Supported Intent Utterances";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void SavingsTypeForRecharge() throws Exception
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
		.EnterText("Recharge from Savings Account")
		.VerifyAccount("SuperValue Account")
		.VerifyAccount("aXcessPlus Account");
	}
	
	@Test(priority=2)
	public void CurrentTypeForRecharge() throws Exception
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
		.EnterText("Recharge from Current Account")
		.verifyMobileText("Please enter the mobile number you wish to recharge");
	}
	
}
