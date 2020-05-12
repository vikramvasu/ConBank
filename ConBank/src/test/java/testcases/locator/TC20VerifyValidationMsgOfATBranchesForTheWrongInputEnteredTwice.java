package testcases.locator;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LocatorPage;

public class TC20VerifyValidationMsgOfATBranchesForTheWrongInputEnteredTwice extends wrappers.ProjectWrappers{

	public TC20VerifyValidationMsgOfATBranchesForTheWrongInputEnteredTwice() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC20 - Verify User able to view validation message of Branches for the wrong input entered twice";
		TestDescription="Verify User able to view validation message of Branches for the wrong input entered twice";
		browserName="chrome";
		Application="Locator";
		Authors="Vikram";
	}
	
	@Test
	public void viewValidationMsgOfBranchforWrongInputEnteredTwice() throws Exception
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
		.verifyShareLocText("You can type a street address, neighborhood, city, postal code or use the button below.To exit the branch finder type 'cancel'.")
		.EnterText("Bangalore")
		.verifyWrongInputTextTwice("Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
