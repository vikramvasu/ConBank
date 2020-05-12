package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC48VerifyIfUserEntersSpecialCharsOrCharactersAsMobileNumber extends wrappers.ProjectWrappers{

	public TC48VerifyIfUserEntersSpecialCharsOrCharactersAsMobileNumber() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC48 - Verify if User enters Special chars or Characters as mobile number";
		TestDescription="Verify if User enters Special chars or Characters as mobile number";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void specialCharsForMobile() throws Exception
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
		.EnterText("/*-%$#")
		.verifyInvalidMobileText("The entered mobile number is invalid. Please enter the 10 digit mobile number you wish to recharge.");
	}

	@Test(priority=2)
	public void charactersForMobile() throws Exception
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
		.EnterText("Recharge")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge")
		.SelectAccount("Ultimate Card")
		.verifyMobileText("Please enter the mobile number you wish to recharge")
		.EnterText("abcdef")
		.verifyInvalidMobileText("The entered mobile number is invalid. Please enter the 10 digit mobile number you wish to recharge.");
	}
	
}
