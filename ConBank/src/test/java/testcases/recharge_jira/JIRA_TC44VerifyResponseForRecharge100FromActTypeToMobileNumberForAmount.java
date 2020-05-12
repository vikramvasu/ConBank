package testcases.recharge_jira;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class JIRA_TC44VerifyResponseForRecharge100FromActTypeToMobileNumberForAmount extends wrappers.ProjectWrappers{

	public JIRA_TC44VerifyResponseForRecharge100FromActTypeToMobileNumberForAmount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="JIRA - TC45 - To Verify 'Recharge from Account Type to Mobile Number for Amount'";
		TestDescription="Recharge";
		browserName="Chrome";
		Application="ConBank";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void verifyRechargeForgivenIntent() throws Exception
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
		.EnterText("Recharge from Current account to 9176664701 for 100")// Bot is asking for number and amount again
		.verifyMobileText("Please enter the mobile number you wish to recharge")
		.EnterText("9176664701");
		//.verifyMobileOperatorText("9176664701 looks like an Aircel number")
		//.confirmOperatorText()
	}

}
