package testcases.locator;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LocatorPage;

public class TC18VerifyValidationMsgOfBranchesForTheWrongInput extends wrappers.ProjectWrappers{

	public TC18VerifyValidationMsgOfBranchesForTheWrongInput() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC18 - Verify User able to view validation message of Branches for the given wrong input";
		TestDescription="Verify User able to view validation message of Branches for the given wrong input";
		browserName="chrome";
		Application="Locator";
		Authors="Vikram";
	}
	
	@Test
	public void viewValidationMsgOfBranchforWrongInput() throws Exception
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
		.EnterText("Bangalore")
		.verifyWrongInputText("Sorry! requested location is not available. Try again with another location.")
		.verifyShareLocText("You can type a street address, neighborhood, city, postal code or use the button below.To exit the branch finder type 'cancel'.");
	}

}
