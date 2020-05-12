package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC47PSCreditcardsPromos extends wrappers.ProjectWrappers{

	public TC47PSCreditcardsPromos() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC47 - To verify enter or click on Apply now - Sub menu  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	
	@Test
	public void ListofCreditcardSubMenuCheck() throws Exception	
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.VerifyMainmenu("Credit Cards")
		.ClickNextArrow()
		.VerifySubmenu("Apply Now")
		.VerifyLoanSubMenuNavigation("Promos");
	}	
}
