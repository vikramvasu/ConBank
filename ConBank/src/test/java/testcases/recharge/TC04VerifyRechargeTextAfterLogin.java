package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC04VerifyRechargeTextAfterLogin extends wrappers.ProjectWrappers{

	public TC04VerifyRechargeTextAfterLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC04 - To Verify that user is able to enter Recharge by Text - After Login";
		TestDescription="To Verify that user is able to enter Recharge by Text - After Login";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test
	public void RechargeTextCheckAfterLogin() throws Exception
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
		.EnterText("Recharge")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}

}
