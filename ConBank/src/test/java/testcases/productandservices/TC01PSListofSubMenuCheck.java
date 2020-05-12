package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC01PSListofSubMenuCheck extends wrappers.ProjectWrappers{

	public TC01PSListofSubMenuCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC01 - To Verify that if user enter Products & Services then bot should display the list of sub menu ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ListofSubMenuCheck() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.VerifyMainmenu("Accounts")
		.VerifyMainmenu("Credit Cards")
		.VerifyMainmenu("Digital Banking")
		.VerifyMainmenu("Loans")
		.VerifyMainmenu("Remittance")
		.VerifyMainmenu("Investments")
		.VerifyMainmenu("Customer Care")
		.VerifyMainmenu("Branch & ATM Location");
		
		
			
	}	
}
