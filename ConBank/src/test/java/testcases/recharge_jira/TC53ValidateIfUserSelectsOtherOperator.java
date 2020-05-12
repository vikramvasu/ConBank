package testcases.recharge_jira;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC53ValidateIfUserSelectsOtherOperator extends wrappers.ProjectWrappers{

	public TC53ValidateIfUserSelectsOtherOperator() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC53 - Validate once user selects any other Operator then User should ask user to enter amount";
		TestDescription="Recharge";
		browserName="Chrome";
		Application="ConBank";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void selectOtherOperator() throws Exception
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
		.clickNOforOperator()
		.verifyselectOperatorText("Please Choose an operator below")
		.clickAirtelOperator()
		.verifyAmountText("Please enter the amount you want to recharge");
	}
}
