package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC03VerifyRechargeIconClickAfterLogin extends wrappers.ProjectWrappers{

	public TC03VerifyRechargeIconClickAfterLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC03 - To Verify that user is able to click on Recharge icon - After Login";
		TestDescription="To Verify that user is able to click on Recharge icon - After Login";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test
	public void RechargeIconCheckAfterLogin() throws Exception
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
		.clickRechargeLogo();
	}

}
