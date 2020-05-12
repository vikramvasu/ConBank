package testcases.recharge_jira;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC02VerifyRechargeIconClickWithoutLogin extends wrappers.ProjectWrappers{

	public TC02VerifyRechargeIconClickWithoutLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC02 - To Verify that user is able to click on Recharge icon - Without Login";
		TestDescription="Recharge";
		browserName="Chrome";
		Application="ConBank";
		Authors="Vikram";
	}

	@Test
	public void RechargeIconCheckWithoutLogin() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforRechargeIcon()
		.verifyRechargeIcon("Recharge")
		.clickRechargeLogo();
	}

}
