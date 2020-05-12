package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC04ManageCardsUsingText extends wrappers.ProjectWrappers{

	public TC04ManageCardsUsingText() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC04 - To Verify that user able to enter Manage Cards by Text  - After Login";
		TestDescription="TC04 - To Verify that user able to enter Manage Cards by Text  - After Login";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardsUsingText() throws Exception
	{
		new ManageCardsPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Manage Cards")
		.VerifyCheckBookRequestClientMessage("Manage Cards");	
	}
	
	
}
