package testcases.fundtransfer.ownaccount;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;


public class TC47FundsTransferFromandToSameAccount extends wrappers.ProjectWrappers{

	public TC47FundsTransferFromandToSameAccount() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC47 - Funds Transfer - Account Type Ending with Same Account number ";
		TestDescription="TC47- To verify that user able to enter Utterance - Transfer 100 from savings account ending with 5546 to savings account ending with 5546 ";
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
		.EnterTextArea("Transfer 100 from savings account ending with 5546 to savings account ending with 5546")
		.VerifyClientResponseMessage("From account and To account can not be the same.");
	}	
}
