package testcases.recharge_jira;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC17VerifyUserAbleToEnterWrongInputTwiceForMobileNumber extends wrappers.ProjectWrappers{

	public TC17VerifyUserAbleToEnterWrongInputTwiceForMobileNumber() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC17 - To Verify that user is able to enter wrong input second consecutive time while account selection";
		TestDescription="Recharge";
		browserName="Chrome";
		Application="ConBank";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void wrongInputTwiceForMobile() throws Exception
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
		.EnterText("916664701")
		.verifyInvalidMobileText("The entered mobile number is invalid. Please enter the 10 digit mobile number you wish to recharge.")
		.EnterText("916664701")
		.verify2InvalidInput("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.verifyAnythingElseText("Is there anything else i can help you with?");
	}

}
