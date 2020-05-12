package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC03ManageCardsIconClickAfterLogin extends wrappers.ProjectWrappers{

	public TC03ManageCardsIconClickAfterLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC03 - To Verify that user able to click on Manage Cards icon  - After Login";
		TestDescription="TC03 - To Verify that user able to click on Manage Cards icon  - After Login";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardIconClickWithoutLogin() throws Exception
	{
		new ManageCardsPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("Tagit")
		.Scrollup()
		.clickManageCardsLogo()
		.VerifyCheckBookRequestClientMessage("Manage Cards");	
	}
	
	
}
