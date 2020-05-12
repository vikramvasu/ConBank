package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC15PSHowtoOpenStepsVerification extends wrappers.ProjectWrappers{

	public TC15PSHowtoOpenStepsVerification() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC15 - To Verify if user tap on How to Open button then bot should show the steps to open ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PSHowtoOpenStepsVerification() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.VerifyMainmenu("Accounts")
		.VerifySubmenu("How to Open")
		.ClickSubmenu("How to Open")	
		.VerifyOpenAccountTitle("Below are the steps to open an account")
		.VerifyOpenAccountSteps();
	}	
}
