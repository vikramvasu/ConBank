package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC10PSListofChooseAnAccountSubMenuCheck extends wrappers.ProjectWrappers{

	public TC10PSListofChooseAnAccountSubMenuCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC10 - To verify if user click on Choose an Account and Sub menu  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void TC10PSListofChooseAnAcccountSubMenuCheck() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.VerifyMainmenu("Accounts")
		.VerifySubmenu("Choose an Account")
		.ClickSubmenu("Choose an Account")	
		.VerifyChooseAccountSubmenu("Savings Account")
		.VerifyChooseAccountSubmenu("Checking Account")
		.VerifyChooseAccountSubmenu("Time Deposits")
		.VerifyChooseAccountSubmenu("Foreign Currency");
	}	
}
