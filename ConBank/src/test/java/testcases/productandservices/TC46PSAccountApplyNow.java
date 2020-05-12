package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC46PSAccountApplyNow extends wrappers.ProjectWrappers{

	public TC46PSAccountApplyNow() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC46 - To Verify if user tap on Apply Now ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PSAcccountApplyNow() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.VerifyMainmenu("Accounts")
		.VerifySubmenu("How to Open")
		.ClickApplyNow("Accounts")
		.VerifyOpenAccountTitle("Below are the steps to open an account")
		.VerifyOpenAccountSteps();
	}	
}
