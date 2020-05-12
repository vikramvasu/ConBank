package testcases.accountbalance;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountBalancePage;


public class TC26VerifyUserAbleToViewTransactionsForTheSelectedAccount extends wrappers.ProjectWrappers{

	public TC26VerifyUserAbleToViewTransactionsForTheSelectedAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC26 - To Verify that user is able to View the Transactions for the Selected Account";
		TestDescription="To Verify that user is able to View the Transactions for the Selected Account";
		browserName="Chrome";
		Application="Account Balance";
		Authors="Vikram";
	}
	
	@Test(priority=1)
	public void ViewTransactionsForSelectedAccount() throws Exception
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
		.verifyAnythingElseText("Is there anything else I can help you with?");
	}

}
