package testcases.locator;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LocatorPage;

public class TC04VerifyLocatorIconIsClickableAfterLoginFromWelcomePrompt extends wrappers.ProjectWrappers{

	public TC04VerifyLocatorIconIsClickableAfterLoginFromWelcomePrompt() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC04 - Verify the Locator Icon Is Clickabe from the Welcome Screen After Login";
		TestDescription="Verify the Locator Icon Is Clickabe from the Welcome Screen After Login";
		browserName="chrome";
		Application="Locator";
		Authors="Vikram";
	}
	
	@Test
	public void clickLocatorIconFromWelcomeScreenAfterLogin() throws Exception
	{
		new LocatorPage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.verifyLocatorIcon("Locator")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		.verifyWelcomeUserName("Tagit")
		.ScrollUpForLocatorIcon()
		.ClickLocator()
		.verifylocatorText("Please select an option to help you with your request");
	}

}
