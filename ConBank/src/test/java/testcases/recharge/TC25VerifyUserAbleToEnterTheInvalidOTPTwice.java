package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC25VerifyUserAbleToEnterTheInvalidOTPTwice extends wrappers.ProjectWrappers{

	public TC25VerifyUserAbleToEnterTheInvalidOTPTwice() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC25 - To Verify that user is able to enter wrong input second consecutive time while entering OTP";
		TestDescription="To Verify that user is able to enter wrong input second consecutive time while entering OTP";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void enterInvalidOTPTwiceForRecharge() throws Exception
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
		.SelectAccount("Ultimate Card")
		.verifyMobileText("Please enter the mobile number you wish to recharge")
		.EnterText("9176664701")
		.verifyMobileOperatorText("9176664701 looks like an Aircel number")
		.confirmOperatorText()
		.verifyAmountText("Please enter the amount you want to recharge")
		.EnterText("100")
		.verifyConfirmRechargeText("9176664701")
		.confirmRechargeText()
		.verifyOTPText()
		.EnterText("1234")
		.verifyWrongOTPInputText("Entered OTP is invalid, Please re-enter.")
		.EnterText("1234")
		.verify2InvalidInput("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.verifyAnythingElseText("Is there anything else I can help you with?");		
	}

}
