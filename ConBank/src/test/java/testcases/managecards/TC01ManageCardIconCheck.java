package testcases.managecards;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ManageCardsPage;


public class TC01ManageCardIconCheck extends wrappers.ProjectWrappers{

	public TC01ManageCardIconCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC01 - To verify that Manage Cards icon is displayed as per UI/UX shared";
		TestDescription="TC01 - To verify that Manage Cards icon is displayed as per UI/UX shared";
		browserName="chrome";
		Application="Manage Cards";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ManageCardIconCheck() throws Exception
	{
		new ManageCardsPage(driver, test)
		.ClickSplashLogo()
		.ScrollDown()
		.clickManageCardsLogo()
		.VerifyCheckBookRequestClientMessage("Manage Cards");	
	}	
}
