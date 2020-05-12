package testcases.fundtransfer;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;
import pages.HomePage;


public class FundTransferOtherAccountSuperValue extends wrappers.ProjectWrappers{

	public FundTransferOtherAccountSuperValue() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="Login";
		TestDescription="FundTransfer Other Account";
		browserName="chrome";
		Application="Smoke";
		Authors="Vairamuthu";
	}
	
	public void Login() throws Exception
	{
		new HomePage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("Tagit");
	}

	@Test()
	public void FundTransferOtherAccountAxcessAccount() throws Exception
	{
		Login();
		new FundTransferPage(driver,test)
		.EnterTextArea("FundTransfer")
		.clickToOtherAccount()
		.clickaXcessPlusAccount()
		.clickBeneficiaryName("John")
		.EnterTextArea("100")
		.clickConfirmButton()
		.EnterTextArea("123456")
		.clickNoButton();
	}
	
	@Test()
	public void FundTransferOtherAccountSuperValueAccount() throws Exception
	{
		Login();
		new FundTransferPage(driver,test)
		.EnterTextArea("FundTransfer")
		.clickToOtherAccount()
		.clickSuperValueAccount()
		.clickBeneficiaryName("John")
		.EnterTextArea("100")
		.clickConfirmButton()
		.EnterTextArea("123456")
		.clickNoButton();
	}

	@Test()
	public void FundTransferOtherAccountRegularCurrentAccount() throws Exception
	{
		Login();
		new FundTransferPage(driver,test)
		.EnterTextArea("FundTransfer")
		.clickToOtherAccount()
		.clickRegularCurrentAccount()
		.clickBeneficiaryName("John")
		.EnterTextArea("100")
		.clickConfirmButton()
		.EnterTextArea("123456")
		.clickNoButton();
	}

}
