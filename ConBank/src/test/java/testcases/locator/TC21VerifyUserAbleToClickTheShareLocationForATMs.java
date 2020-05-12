package testcases.locator;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LocatorPage;

public class TC21VerifyUserAbleToClickTheShareLocationForATMs extends wrappers.ProjectWrappers{

	public TC21VerifyUserAbleToClickTheShareLocationForATMs() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC21 - Verify User click the Share Location for ATMs";
		TestDescription="Verify User click the Share Location for ATMs";
		browserName="chrome";
		Application="Locator";
		Authors="Vikram";
	}
	
	@Test
	public void userAbleToClickShareLocationForATMs() throws Exception
	{
		new LocatorPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		//.verifyLocatorIcon("Locator")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.ScrollUpForLocatorIcon()
		.ClickLocator()
		.verifylocatorText("Please select an option to help you with your request")
		.verifyLocatorTypes("ATMs")
		.verifyLocatorTypes("Branches")
		.clickLocType("ATMs")
		.verifyShareLocText("You can type a street address, neighborhood, city, postal code or use the button below.To exit the branch finder type 'cancel'.")
		.clickShareLoc();
	}

}
