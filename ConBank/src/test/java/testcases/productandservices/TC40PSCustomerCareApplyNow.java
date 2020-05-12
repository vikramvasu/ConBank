package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC40PSCustomerCareApplyNow extends wrappers.ProjectWrappers{

	public TC40PSCustomerCareApplyNow() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC40 - To Verify if user enter or tap on Customer Care - Apply Now  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void CustomerCareApplyNow() throws Exception
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
		.ClickApplyNow("Customer Care")
		.VerifyClientMessage("Talk to Customer Care");
	}	
}
