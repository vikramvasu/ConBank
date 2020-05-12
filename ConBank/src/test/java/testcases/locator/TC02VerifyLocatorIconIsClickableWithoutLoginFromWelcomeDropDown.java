package testcases.locator;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LocatorPage;

public class TC02VerifyLocatorIconIsClickableWithoutLoginFromWelcomeDropDown extends wrappers.ProjectWrappers{

	public TC02VerifyLocatorIconIsClickableWithoutLoginFromWelcomeDropDown() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC02 - Verify the Locator Icon Is Clickabe from the Welcome Drop Down Before Login";
		TestDescription="Verify the Locator Icon Is Clickabe from the Welcome Drop Down Before Login";
		browserName="chrome";
		Application="Locator";
		Authors="Vikram";
	}
	
	@Test
	public void clickLocatorIconFromDropDownBeforeLogin() throws Exception
	{
		new LocatorPage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.ClickWelcomeDropDownArrow()
		.ClickLocatorFromDropDownArrow()
		.verifylocatorText("Please select an option to help you with your request");
	}

}
