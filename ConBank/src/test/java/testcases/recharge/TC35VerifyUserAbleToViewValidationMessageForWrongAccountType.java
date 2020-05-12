package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC35VerifyUserAbleToViewValidationMessageForWrongAccountType extends wrappers.ProjectWrappers{

	public TC35VerifyUserAbleToViewValidationMessageForWrongAccountType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC35 - To Verify that user is able to view proper validation message for Wrong Account Type";
		TestDescription="To Verify that user is able to view proper validation message for Wrong Account Type";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void wrongAccountType() throws Exception
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
		.EnterText("Recharge from esaver account")
		.verifyWrongAccountText("esaver account")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
}
