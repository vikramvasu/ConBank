package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC23PSLoan_HomeLoanForOFWs extends wrappers.ProjectWrappers{

	public TC23PSLoan_HomeLoanForOFWs() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC23 - To Verify if user Click Loan Home Loan For OFWs - Navigation  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void HomeLoanForOFWs() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Loans")
		.VerifySubmenu("Home Loan for OFWs")
		.VerifyLoanSubMenuNavigation("Home Loan for OFWs");
	}	
}
