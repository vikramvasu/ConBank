package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC38PSCustomerCareCardsHotline extends wrappers.ProjectWrappers{

	public TC38PSCustomerCareCardsHotline() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC38 - To Verify if user enter or tap on Customer Care - Cards Hotline";
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
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Customer Care")
		.VerifySubmenu("Cards Hotline")
		.VerifySubmenu("Bank Hotline")
		.VerifySubmenu("Live Chat")	
		.VerifySubmenu("Apply Now")
		.ClickSubmenu("Cards Hotline")
		.VerifyClientMessage("Cards Hotline")
		.VerifyClientResponseMessage("Call 6328189818");
	}	
}
