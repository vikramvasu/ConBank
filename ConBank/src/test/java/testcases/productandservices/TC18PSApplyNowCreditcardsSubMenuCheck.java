package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC18PSApplyNowCreditcardsSubMenuCheck extends wrappers.ProjectWrappers{

	public TC18PSApplyNowCreditcardsSubMenuCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC18 - To verify enter or click on Apply now - Sub menu  ";
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
		.ClickApplyNow("Credit Cards")
		.VerifyClientMessage("Apply for Credit Cards")
		.VerifyMainmenu("Premium Travel and Lifestyle card")
		.VerifyMainmenu("Miles Master Card")
		.VerifyMainmenu("Mobeix Credit Card")
		.VerifyMainmenu("Union Credit Card ");
	}	
}
