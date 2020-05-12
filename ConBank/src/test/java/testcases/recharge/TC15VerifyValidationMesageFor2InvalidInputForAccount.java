package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC15VerifyValidationMesageFor2InvalidInputForAccount extends wrappers.ProjectWrappers{

	public TC15VerifyValidationMesageFor2InvalidInputForAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC15 - To Verify that user is able to enter wrong input second consecutive time while account selection";
		TestDescription="To Verify that user is able to enter wrong input second consecutive time while account selection";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void Invalid2AccountForRecharge() throws Exception
	{
		new RechargePage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		//.verifyRechargeIcon("Recharge")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.EnterText("can you help me with Recharge")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge")
		.EnterText("unknown")
		.verifyWrongAccountText("unknown")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge")
		.EnterText("unknown")
		.verify2InvalidInput("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.verifyAnythingElseText("Is there anything else i can help you with?");
	}

}
