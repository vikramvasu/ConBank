package testcases.recharge_jira;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class JIRA_TC17VerifyIfUserEntersBiggerAmountThanTheAvailableAccountBal extends wrappers.ProjectWrappers{

	public JIRA_TC17VerifyIfUserEntersBiggerAmountThanTheAvailableAccountBal() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="JIRA - TC17 - Verify if User entered amount is more than the available balance";
		TestDescription="Recharge";
		browserName="Chrome";
		Application="ConBank";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void enterBiggerAmounToRecharge() throws Exception
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
		.EnterText("can you help me with Recharge")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge")
		.SelectAccount("Ultimate Card")
		.verifyMobileText("Please enter the mobile number you wish to recharge")
		.EnterText("9176664701")
		.verifyMobileOperatorText("9176664701 looks like an Aircel number")
		.confirmOperatorText()
		.verifyAmountText("Please enter the amount you want to recharge")
		.EnterText("52000")
		.verifyInsufficientAmountText("The selected account do not have sufficient funds to complete recharge. Please enter a lesser amount");		
	}
	
}
