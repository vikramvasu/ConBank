package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC06PSListofRemittanceSubMenuCheck extends wrappers.ProjectWrappers{

	public TC06PSListofRemittanceSubMenuCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC06 - To Verify if user enter or tap on Remittance - Sub menu  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ListofRemittanceSubMenuCheck() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.VerifyMainmenu("Remittance")
		.VerifySubmenu("How to Send Money")
		.VerifySubmenu("Receive Money")
		.VerifySubmenu("Remittance Tracker details");		
	}	
}
