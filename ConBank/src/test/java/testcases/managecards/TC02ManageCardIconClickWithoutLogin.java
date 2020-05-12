package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC02ManageCardIconClickWithoutLogin extends wrappers.ProjectWrappers{

	public TC02ManageCardIconClickWithoutLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC02 - To Verify that user able to click on Manage Cards icon  - Without Login";
		TestDescription="TC02 - To Verify that user able to click on Manage Cards icon  - Without Login";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardIconClickWithoutLogin() throws Exception
	{
		new ManageCardsPage(driver, test)
		.ClickSplashLogo()
		.ScrollDown()
		.clickManageCardsLogo()
		.VerifyCheckBookRequestClientMessage("Manage Cards")
		.ClickLogin()
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("Tagit");
		
	}
		
}
