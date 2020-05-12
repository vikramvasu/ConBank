package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC03SRIconDisplay extends wrappers.ProjectWrappers{

	public TC03SRIconDisplay() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC03 - To verify that Statement Request icon is displayed as per UI/UX shared";
		TestDescription="To verify that Statement Request icon is displayed as per UI/UX shared";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test
	public void StatementRequestIconDisplay() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.clickStatementRequestLogo()
		.verifySRDisplayIcon("Statement Request");
	}

}
