package testcases.locator;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LocatorPage;

public class TC01VerifyLocatorIconIsAsPerUI extends wrappers.ProjectWrappers{

	public TC01VerifyLocatorIconIsAsPerUI() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC01 - Verify the Locator Icon Is As Per UI";
		TestDescription="Verify the Locator Icon Is As Per UI";
		browserName="chrome";
		Application="Locator";
		Authors="Vikram";
	}
	
	@Test
	public void verifyLocatorIcon() throws Exception
	{
		new LocatorPage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.verifyLocatorIcon("Locator");
	}

}
