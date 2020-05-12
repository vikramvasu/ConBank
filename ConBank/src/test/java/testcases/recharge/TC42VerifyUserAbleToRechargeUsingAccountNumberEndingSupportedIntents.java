package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC42VerifyUserAbleToRechargeUsingAccountNumberEndingSupportedIntents extends wrappers.ProjectWrappers{

	public TC42VerifyUserAbleToRechargeUsingAccountNumberEndingSupportedIntents() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC42 - To Verify that user is able to Recharge by using Account Number Ending - Supported Intent Utterances";
		TestDescription="To Verify that user is able to Recharge by using Account Number Ending - Supported Intent Utterances";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void AccountNumberEndingIntentOne() throws Exception
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
		.EnterText("Recharge from Account number ending with 5546")
		.verifyMobileText("Please enter the mobile number you wish to recharge");
	}
	
	@Test(priority=2)
	public void AccountNumberEndingIntentTwo() throws Exception
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
		.EnterText("Recharge from Account number ending with 2220")
		.verifyMobileText("Please enter the mobile number you wish to recharge");
	}
	
	@Test(priority=3)
	public void AccountNumberEndingIntentThree() throws Exception
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
		.EnterText("Recharge from Account number ending with 3968")
		.verifyMobileText("Please enter the mobile number you wish to recharge");
	}
	
}
