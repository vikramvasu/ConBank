package testcases.applynow;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ApplyNowPage;

public class TC02VerifyUserAbleToClickApplyNow extends wrappers.ProjectWrappers{

	public TC02VerifyUserAbleToClickApplyNow() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC02 - Verify user is able to click the Apply Now";
		TestDescription="Apply Now";
		browserName="chrome";
		Application="Apply Now";
		Authors="Vikram";
	}
	
	@Test
	public void clickApplyNow() throws Exception
	{
		new ApplyNowPage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.EnterText("apply now")
		.VerifyMainmenu("Accounts")
		.VerifySubmenu("Apply Now")
		.ClickSubmenu("Apply Now");
	}

}
