package testcases.recharge_jira;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC24VerifyUserAbleToEnterTheInvalidOTP extends wrappers.ProjectWrappers{

	public TC24VerifyUserAbleToEnterTheInvalidOTP() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC24 - To Verify that user is able to enter wrong input and view proper validation message for the OTP";
		TestDescription="Recharge";
		browserName="Chrome";
		Application="ConBank";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void enterInvalidOTPForRecharge() throws Exception
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
		.confirmOperatorText()
		.verifyAmountText("Please enter the amount you want to recharge")
		.EnterText("100")
		.verifyConfirmRechargeText("9176664701")
		.confirmRechargeText()
		.verifyOTPText()
		.EnterText("1234")
		.verifyWrongOTPInputText("Entered OTP is invalid, Please re-enter.");		
	}

}
