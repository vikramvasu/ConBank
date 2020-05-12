package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC04PSListofDigitalbankingSubMenuCheck extends wrappers.ProjectWrappers{

	public TC04PSListofDigitalbankingSubMenuCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC04 - To Verify if user enter or tap on Digital Banking - Sub menu  ";
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
		.VerifyMainmenu("Digital Banking")
		.VerifySubmenu("How to Enroll")
		.VerifySubmenu("Download the App")
		.VerifySubmenu("OTP")
		.VerifySubmenu("Apply Now");			
	}	
}
