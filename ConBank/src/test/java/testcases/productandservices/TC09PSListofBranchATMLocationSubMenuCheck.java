package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC09PSListofBranchATMLocationSubMenuCheck extends wrappers.ProjectWrappers{

	public TC09PSListofBranchATMLocationSubMenuCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC09 - To Verify if user enter or tap on Branch & ATM Location - Sub menu  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ListofCustomerCareSubMenuCheck() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.VerifyMainmenu("Branch & ATM Location")
		.VerifySubmenu("Find a Branch")
		.VerifySubmenu("Find an ATM ")
		.VerifySubmenu("Weekend Banking");			
	}	
}
