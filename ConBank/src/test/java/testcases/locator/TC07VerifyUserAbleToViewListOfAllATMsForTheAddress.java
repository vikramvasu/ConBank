package testcases.locator;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LocatorPage;

public class TC07VerifyUserAbleToViewListOfAllATMsForTheAddress extends wrappers.ProjectWrappers{

	public TC07VerifyUserAbleToViewListOfAllATMsForTheAddress() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC07 - Verify User able to view list of all ATMs for the given Address";
		TestDescription="Verify User able to view list of all ATMs for the given Address";
		browserName="chrome";
		Application="Locator";
		Authors="Vikram";
	}
	
	@Test
	public void userAbleToViewAllATMsForGivenAddress() throws Exception
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
		.EnterText("Ward 197")
		.verifyATMListTitle("Living spring english church")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
