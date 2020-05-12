package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC38VerifyUserAbleToViewValidationMessageForWrongCardType extends wrappers.ProjectWrappers{

	public TC38VerifyUserAbleToViewValidationMessageForWrongCardType() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC38 - To Verify that user is able to view proper validation message for Wrong Card Type";
		TestDescription="To Verify that user is able to view proper validation message for Wrong Card Type";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void wrongCardType() throws Exception
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
		.EnterText("Recharge from esaver card")
		.verifyWrongAccountText("esaver card")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
}
