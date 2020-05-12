package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC07PSListofInvestmentsSubMenuCheck extends wrappers.ProjectWrappers{

	public TC07PSListofInvestmentsSubMenuCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC07 - To Verify if user enter or tap on Investments - Sub menu  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ListofInvestmentsSubMenuCheck() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.VerifyMainmenu("Investments")
		.VerifySubmenu("Choose a Fund")
		.VerifySubmenu("How to Invest")
		.VerifySubmenu("Invest Online")
		.VerifySubmenu("Apply Now");			
	}	
}
