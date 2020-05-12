package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC27VerifyUserAbleToCancelTheFlowAndGoToTheMainMenu extends wrappers.ProjectWrappers{

	public TC27VerifyUserAbleToCancelTheFlowAndGoToTheMainMenu() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC27 - To Verify that user is able to Cancel the flow and go to the Main Menu";
		TestDescription="To Verify that user is able to Cancel the flow and go to the Main Menu";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void CancelAndGotoTheMainMenu() throws Exception
	{
		new AccountBalancePage(driver,test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		//.verifyAccountBalanceIcon("Account Balance")
		.EnterText("Login")
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.EnterText("Account Balance")
		.VerifyCardIsPersent("SuperValue Account")
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickViewTransaction("SuperValue Account")
		.VerifyYourTransactionMessage("Here are your transactions")
		.VerifyTransactionTitle("SuperValue")
		.EnterText("Cancel")
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
