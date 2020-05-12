package testcases.recharge_jira;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC43VerifyUserAbleToViewValidationMessageForWrongAccountNumberEnding extends wrappers.ProjectWrappers{

	public TC43VerifyUserAbleToViewValidationMessageForWrongAccountNumberEnding() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC43 - To Verify that user is able to view proper validation message for Wrong Account Number Ending";
		TestDescription="Recharge";
		browserName="Chrome";
		Application="ConBank";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void wrongAccountNumberEnding() throws Exception
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
		.EnterText("Recharge from Account number ending with 1111")
		.verifyWrongAccountNumberText("1111")
		.verifyValidSelectAccountText("Please select the account from below to continue your recharge");
	}
	
}
