package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC08PSListofCustomerCareSubMenuCheck extends wrappers.ProjectWrappers{

	public TC08PSListofCustomerCareSubMenuCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC08 - To Verify if user enter or tap on Customer Care - Sub menu  ";
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
		.VerifyMainmenu("Customer Care")
		.VerifySubmenu("Cards Hotline")
		.VerifySubmenu("Bank Hotline")
		.VerifySubmenu("Live Chat")	
		.VerifySubmenu("Apply Now");			
	}	
}
