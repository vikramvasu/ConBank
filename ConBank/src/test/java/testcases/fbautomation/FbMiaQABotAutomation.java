package testcases.fbautomation;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FbBotPage;


public class FbMiaQABotAutomation extends wrappers.ProjectWrappers{

	public FbMiaQABotAutomation() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="FbMiaQABotAutomation";
		TestDescription="FB Automation";
		browserName="Chrome";
		Application="Mia QA";
		Authors="Vikram";
	}
	
	@Test
	public void FbBotPageAutomation() throws Exception
	{
		new FbBotPage(driver,test)
		.FBUserName()
		.FBPassword()
		.FbLoginBtn()
		.verifyFbBotName("Mia QA")
		.EnterText("Hi");
	}

}
