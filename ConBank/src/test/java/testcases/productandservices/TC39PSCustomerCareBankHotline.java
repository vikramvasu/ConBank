package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC39PSCustomerCareBankHotline extends wrappers.ProjectWrappers{

	public TC39PSCustomerCareBankHotline() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC39 - To Verify if user enter or tap on Customer Care - Bank Hotline ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void CustomerCareBankHotline() throws Exception
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
		.ClickSubmenu("Bank Hotline")
		.VerifyClientMessage("Bank Hotline")
		.VerifyClientResponseMessage("Call 6325378888");
	}	
}
