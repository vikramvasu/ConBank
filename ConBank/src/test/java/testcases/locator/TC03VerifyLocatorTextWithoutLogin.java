package testcases.locator;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LocatorPage;

public class TC03VerifyLocatorTextWithoutLogin extends wrappers.ProjectWrappers{

	public TC03VerifyLocatorTextWithoutLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC03 - Verify User able to type the Locator Text without Login";
		TestDescription="Verify User able to type the Locator Text without Login";
		browserName="chrome";
		Application="Locator";
		Authors="Vikram";
	}
	
	@Test
	public void verifyLocatorTextInput() throws Exception
	{
		new LocatorPage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.EnterText("Locator")
		.verifylocatorText("Please select an option to help you with your request");
	}

}
