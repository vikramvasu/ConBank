package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC28PSRemittanceTrackerDetailsNavigation extends wrappers.ProjectWrappers{

	public TC28PSRemittanceTrackerDetailsNavigation() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC27 - To Verify if user Click Remittance Tracker Details - Navigation  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void RemittanceTrackerDetailsNavigation() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Remittance")
		.VerifySubmenu("Remittance Tracker details")
		.ClickSubmenu(("Remittance Tracker details"))
		.VerifyLoanSubMenuNavigation("Remittance Tracker details");	
	}	
}
