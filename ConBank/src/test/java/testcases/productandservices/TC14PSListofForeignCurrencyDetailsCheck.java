package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC14PSListofForeignCurrencyDetailsCheck extends wrappers.ProjectWrappers{

	public TC14PSListofForeignCurrencyDetailsCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC14 - To verify if user click on Choose an Account-Foreign Currency  and Sub menu";
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
		.VerifyChooseAccountSubmenu("Foreign Currency")
		.ClickChooseAccount("Foreign Currency")
		.VerifyMainmenu("Dollar Savings Account")
		.VerifyMainmenu("Euro Savings Account")
		.VerifyMainmenu("Renminbi Savings Account");
	}	
}
