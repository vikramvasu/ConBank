package testcases.locator;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LocatorPage;

public class TC24VerifyResponseForValidLocationForBranches extends wrappers.ProjectWrappers{

	public TC24VerifyResponseForValidLocationForBranches() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC24 - Verify reponse for the valid location of Branches";
		TestDescription="Verify reponse for the valid location of Branches";
		browserName="chrome";
		Application="Locator";
		Authors="Vikram";
	}
	
	@Test
	public void ResponseForValidLocOfBranches() throws Exception
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
		.verifyShareLocText("You can type a street address, neighborhood, city, postal code or use the button below.To exit the branch finder type 'cancel'.")
		.clickShareLoc()
		//.ScrollDownToViewATMorBranch()
		.verifyBranchListTitle("6.20 Km* away.")
		.ClickNextArrow()
		.verifyBranchListTitle("7.41 Km* away.")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
