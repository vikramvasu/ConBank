package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC40VerifyUserAbleToRechargeUsingAccountTypeWithAccountNumberSupportedIntents extends wrappers.ProjectWrappers{

	public TC40VerifyUserAbleToRechargeUsingAccountTypeWithAccountNumberSupportedIntents() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC40 - To Verify that user is able to Recharge by using Account Type with Account Number - Supported Intent Utterances";
		TestDescription="To Verify that user is able to Recharge by using Account Type with Account Number - Supported Intent Utterances";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void AccountTypeWithNumberIntentOne() throws Exception
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
		.EnterText("Recharge from Savings Account ending with 5546")
		.verifyMobileText("Please enter the mobile number you wish to recharge");
	}
	
	@Test(priority=2)
	public void AccountTypeWithNumberIntentTwo() throws Exception
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
		.EnterText("Recharge from Savings Account ending with 2220")
		.verifyMobileText("Please enter the mobile number you wish to recharge");
	}
	
	@Test(priority=3)
	public void AccountTypeWithNumberIntentThree() throws Exception
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
		.EnterText("Recharge from Current Account ending with 3968")
		.verifyMobileText("Please enter the mobile number you wish to recharge");
	}
	
}
