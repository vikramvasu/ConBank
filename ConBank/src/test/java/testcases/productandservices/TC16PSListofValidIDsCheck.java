package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC16PSListofValidIDsCheck extends wrappers.ProjectWrappers{

	public TC16PSListofValidIDsCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC16 - To Verify if user tap on List of valid IDs button then bot should display IDS";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}


	@Test
	public void PSListofValidIDsCheck() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()	
		.EnterTextArea("Product and Services")
		.VerifyMainmenu("Accounts")
		.VerifySubmenu("List of Valid Ids")
		.ClickSubmenu("List of Valid Ids")	
		.VerifyOpenAccountTitle("Valid Ids are listed here below")
		.VerifyIDList("Voter ID")
		.VerifyIDList("Passport")
		.VerifyIDList("Driving Licnese")
		.VerifyIDList("National Id");
	}	
}
