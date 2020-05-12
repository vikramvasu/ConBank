package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC17PSChooseaCreditcardsSubMenuCheck extends wrappers.ProjectWrappers{

	public TC17PSChooseaCreditcardsSubMenuCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC17 - To verify enter or click on Choose a Crdit card - Sub menu  ";
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
		.VerifySubmenu("Choose a Credit Card")
		.ClickSubmenu("Choose a Credit Card")
		.VerifyClientMessage("Choose a Credit Card")
		.VerifyMainmenu("Premium Travel and Lifestyle card")
		.VerifyMainmenu("Miles Master Card")
		.VerifyMainmenu("Mobeix Credit Card")
		.VerifyMainmenu("Union Credit Card ");
	}	
}
