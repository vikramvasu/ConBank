package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC48FundsTransferFromAcccountandToAccountEndingWithValidNumber extends wrappers.ProjectWrappers{

	public TC48FundsTransferFromAcccountandToAccountEndingWithValidNumber() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC48 - Funds Transfer - Account Type Ending with Same Account number ";
		TestDescription="TC48- To verify that user able to enter Utterance - Transfer 100 from savings account ending with 5546 to savings account ending with 3968 ";
		browserName="chrome";
		Application="Fund Transfer";
		Authors="Vairamuthu";
	}
	
	@Test
	public void FundsTransferfromSavingAccountEndWithWrongtoSavingAccountEndWithWrongNumber() throws Exception
	{
		 new FundTransferPage(driver,test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		//.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Transfer 100 from account number ending with 5546 to account number ending with 3968")
		.verifyConfirmationMessage("Here you go.")
		.clickConfirmButton()
		.VerifyTransactionSuccessMessage()
		.verifySuccessIcon();
	}	
}
