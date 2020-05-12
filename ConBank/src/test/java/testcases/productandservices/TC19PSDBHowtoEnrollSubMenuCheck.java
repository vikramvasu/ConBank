package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC19PSDBHowtoEnrollSubMenuCheck extends wrappers.ProjectWrappers{

	public TC19PSDBHowtoEnrollSubMenuCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC19 - To verify if user click on How to Enroll button - Submenu ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void HowtoEnrollSubMenuCheck() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Digital Banking")
		.VerifySubmenu("How to Enroll")
		.ClickSubmenu("How to Enroll")
		.VerifyClientMessage("How to Enroll for Digital Banking")
		.VerifyOpenAccountTitle("Below are the options to enroll into digital banking")
		.VerifyChooseAccountSubmenu("Enroll Using a Card")
		.VerifyChooseAccountSubmenu("Enroll at the Branch");			
	}	
}
