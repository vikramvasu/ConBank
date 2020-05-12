package testcases.locator;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LocatorPage;

public class TC23VerifyResponseForValidLocationForATMs extends wrappers.ProjectWrappers{

	public TC23VerifyResponseForValidLocationForATMs() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC23 - Verify reponse for the valid location of ATMs";
		TestDescription="Verify reponse for the valid location of ATMs";
		browserName="chrome";
		Application="Locator";
		Authors="Vikram";
	}
	
	@Test
	public void ResponseForValidLocOfATMs() throws Exception
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
		.clickShareLoc()
		//.ScrollDownToViewATMorBranch()
		.verifyATMListTitle("3.64 Km* away.")
		.ClickNextArrow()
		.verifyATMListTitle("4.93 Km* away.")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
