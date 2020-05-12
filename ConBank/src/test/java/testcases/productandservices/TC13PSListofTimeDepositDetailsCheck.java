package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC13PSListofTimeDepositDetailsCheck extends wrappers.ProjectWrappers{

	public TC13PSListofTimeDepositDetailsCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC13 - To verify if user click on Choose an Account-Time Deposits and Sub menu";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PSListofTimeDepositsDetailsCheck() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.VerifyMainmenu("Accounts")
		.VerifySubmenu("Choose an Account")
		.ClickSubmenu("Choose an Account")	
		.VerifyChooseAccountSubmenu("Time Deposits")
		.ClickChooseAccount("Time Deposits")
		.VerifyMainmenu("SuperTeller ATM")
		.VerifyMainmenu("Debit Savings Account")
		.VerifyMainmenu("TAP Master Card");
	}	
}
