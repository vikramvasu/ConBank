package testcases.locator;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LocatorPage;

public class TC15VerifyUserAbleToViewHoursForTheSearchedATMs extends wrappers.ProjectWrappers{

	public TC15VerifyUserAbleToViewHoursForTheSearchedATMs() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC15 - Verify User able to view Hours for the searched ATMs for the given City";
		TestDescription="Verify User able to view Hours for the searched ATMs for the given City";
		browserName="chrome";
		Application="Locator";
		Authors="Vikram";
	}
	
	@Test
	public void userAbleToViewHoursForTheSearchedATMs() throws Exception
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
		.EnterText("Chennai")
		.ClickNextArrow()
		.ClickNextArrow()
		.verifyATMListTitle("Rajiv Gandhi Salai")
		.ClickGetHours("Rajiv Gandhi Salai")
		.verifyATMGetHoursText("Working HRs: 9:00 am - 6:00 pm")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
