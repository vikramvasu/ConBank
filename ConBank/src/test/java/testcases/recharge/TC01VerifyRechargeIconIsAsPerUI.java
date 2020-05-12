package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC01VerifyRechargeIconIsAsPerUI extends wrappers.ProjectWrappers{

	public TC01VerifyRechargeIconIsAsPerUI() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC01 - To Verify that Recharge Icon is displayed as per UI/UX shared";
		TestDescription="To Verify that Recharge Icon is displayed as per UI/UX shared";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test
	public void RechargeIconCheck() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforRechargeIcon()
		.verifyRechargeIcon("Recharge");
	}

}
