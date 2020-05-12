package testcases.locator;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LocatorPage;

public class TC01VerifyLocatorIconIsClickableWithoutLoginFromWelcomePrompt extends wrappers.ProjectWrappers{

	public TC01VerifyLocatorIconIsClickableWithoutLoginFromWelcomePrompt() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC01 - Verify the Locator Icon Is Clickabe from the Welcome Screen Before Login";
		TestDescription="Verify the Locator Icon Is Clickabe from the Welcome Screen Before Login";
		browserName="chrome";
		Application="Locator";
		Authors="Vikram";
	}
	
	@Test
	public void clickLocatorIconFromWelcomeScreenBeforeLogin() throws Exception
	{
		new LocatorPage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.verifyLocatorIcon("Locator")
		.ScrollDownForLocatorIcon()
		.ClickLocator()
		.verifylocatorText("Please select an option to help you with your request");
	}

}
