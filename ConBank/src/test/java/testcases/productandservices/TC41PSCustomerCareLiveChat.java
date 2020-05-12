package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC41PSCustomerCareLiveChat extends wrappers.ProjectWrappers{

	public TC41PSCustomerCareLiveChat() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC41 - To Verify if user enter or tap on Customer Care - Live Chat  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void CustomerCareLiveChat() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Customer Care")
		.VerifySubmenu("Cards Hotline")
		.VerifySubmenu("Bank Hotline")
		.VerifyLoanSubMenuNavigation("Live Chat");
	}	
}
