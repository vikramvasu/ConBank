package testcases.locator;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LocatorPage;

public class TC14VerifyUserAbleToViewListOfAllBranchesForTheGivenPincode extends wrappers.ProjectWrappers{

	public TC14VerifyUserAbleToViewListOfAllBranchesForTheGivenPincode() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC14 - Verify User able to view list of all Branches for the given Pincode";
		TestDescription="Verify User able to view list of all Branches for the given Pincode";
		browserName="chrome";
		Application="Locator";
		Authors="Vikram";
	}
	
	@Test
	public void userAbleToViewAllBranchesForGivenPincode() throws Exception
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
		.clickLocType("Branches")
		.EnterText("600119")
		.verifyATMListTitle("Nehru Main Road")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
