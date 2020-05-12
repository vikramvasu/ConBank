package testcases.recharge_jira;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC37VerifyUserAbleToRechargeUsingCardTypeSupportedIntents extends wrappers.ProjectWrappers{

	public TC37VerifyUserAbleToRechargeUsingCardTypeSupportedIntents() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC37 - To Verify that user is able to Recharge by using Card Type - Supported Intent Utterances";
		TestDescription="Recharge";
		browserName="Chrome";
		Application="ConBank";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void debitCardTypeForRecharge() throws Exception
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
		.EnterText("Recharge from Debit Card")
		.selectDebitAccountText("Here are your savings and checking account")
		.VerifyAccount("SuperValue Account")
		.VerifyAccount("aXcessPlus Account")
		.VerifyAccount("Regular Current Account");		
	}
	
	@Test(priority=2)
	public void creditCardTypeForRecharge() throws Exception
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
		.EnterText("Recharge from Credit Card")
		.selectCreditAccountText("Here are your credit account")
		.VerifyAccount("Ultimate Card")
		.VerifyAccount("Platinum Rewards");
	}
	
}
