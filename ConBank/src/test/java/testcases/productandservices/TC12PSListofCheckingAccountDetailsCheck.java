package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC12PSListofCheckingAccountDetailsCheck extends wrappers.ProjectWrappers{

	public TC12PSListofCheckingAccountDetailsCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC12 - To verify if user click on Choose an Account-Checking Account and Sub menu";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PSListofCheckingAccountDetailsCheck() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.VerifyMainmenu("Accounts")
		.VerifySubmenu("Choose an Account")
		.ClickSubmenu("Choose an Account")	
		.VerifyChooseAccountSubmenu("Checking Account")
		.ClickChooseAccount("Checking Account")
		.VerifyMainmenu("Priority Checking Account")
		.VerifyMainmenu("Regular Checking Account")
		.VerifyMainmenu("Budget Checking Account");
	}	
}
