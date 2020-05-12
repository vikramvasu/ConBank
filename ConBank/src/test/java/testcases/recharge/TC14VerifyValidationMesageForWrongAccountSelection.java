package testcases.recharge;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RechargePage;


public class TC14VerifyValidationMesageForWrongAccountSelection extends wrappers.ProjectWrappers{

	public TC14VerifyValidationMesageForWrongAccountSelection() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC14 - To Verify that user is able to enter wrong input & view proper validation message while Account Selection";
		TestDescription="To Verify that user is able to enter wrong input & view proper validation message while Account Selection";
		browserName="Chrome";
		Application="Recharge";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void transactionCancelMessageForRecharge() throws Exception
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
		.verifySelectAccountText("Please select the account from below to continue your recharge");
	}

}
