package testcases.recharge_jira;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC19VerifyUserAbleToEnterWrongInputForTheMobileOperatorTwice extends wrappers.ProjectWrappers{

	public TC19VerifyUserAbleToEnterWrongInputForTheMobileOperatorTwice() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC19 - To Verify that user is able to enter wrong input second consecutive time while predicting the mobile operator";
		TestDescription="Recharge";
		browserName="Chrome";
		Application="ConBank";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void wrongOperatorInputTwiceForRecharge() throws Exception
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
		.EnterText("abcd")
		.verifyInvalidMobileOperatorText("Given input for Operator Prediction is not valid. Please Choose an operator below")
		.EnterText("efgh")
		.verify2InvalidInput("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.verifyAnythingElseText("Is there anything else i can help you with?");
	}

}
