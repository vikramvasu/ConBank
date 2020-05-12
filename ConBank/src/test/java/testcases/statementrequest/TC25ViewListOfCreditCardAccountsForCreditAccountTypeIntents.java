package testcases.statementrequest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.StatementRequestPage;


public class TC25ViewListOfCreditCardAccountsForCreditAccountTypeIntents extends wrappers.ProjectWrappers{

	public TC25ViewListOfCreditCardAccountsForCreditAccountTypeIntents() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC25 - To verify that user able to view list of credit cards to select for using credir card type utterance";
		TestDescription="To verify that user able to view list of credit cards to select for using credir card type utterance";
		browserName="Chrome";
		Application="Statement Request";
		Authors="Vikram";
	}
	

	@Test(priority=1, enabled=true)
	public void StatementRequestIntentOneForCreditAccountType() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("View statement of my credit account")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.scrollDownforCreditAccountName()
		.verifySelectAccountforSRText("I am happy to help you with that, Please select an account for which you want to download a statement")
		.VerifyAccount("Ultimate Card")
		.VerifyAccount("Platinum Rewards");
	}
	
	@Test(priority=2, enabled=true)
	public void StatementRequestIntentTwoForCreditAccountType() throws Exception
	{
		new StatementRequestPage(driver, test)
		.ClickSplashLogo()
		//.verifyWelcomeText("Hi! I'm Mia your digital banking assistant. I am new and still learning. How may I help you?")
		.scrollDownforSRIcon()
		.EnterText("Statement of my credit card")
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword()
		.ClickLogin()
		//.verifyWelcomeUserName("Tagit")
		.scrollDownforCreditAccountName()
		.verifySelectAccountforSRText("I am happy to help you with that, Please select an account for which you want to download a statement")
		.VerifyAccount("Ultimate Card")
		.VerifyAccount("Platinum Rewards");
	}

}
