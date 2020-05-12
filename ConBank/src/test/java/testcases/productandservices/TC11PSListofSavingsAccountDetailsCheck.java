package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC11PSListofSavingsAccountDetailsCheck extends wrappers.ProjectWrappers{

	public TC11PSListofSavingsAccountDetailsCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC11 - To verify if user click on Choose an Account-Saving Account and Sub menu  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void TC11PSListofSavingsAccounttDetailsCheck() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.VerifyMainmenu("Accounts")
		.VerifySubmenu("Choose an Account")
		.ClickSubmenu("Choose an Account")	
		.VerifyChooseAccountSubmenu("Savings Account")
		.ClickChooseAccount("Savings Account")
		.VerifyMainmenu("Regular Savings Account")
		.VerifyMainmenu("Womens Savings Account")
		.VerifyMainmenu("Max Savings Account")
		.VerifyMainmenu("Savings Max Account")
		.VerifyMainmenu("Silver Savings Account");
		
	}	
}
