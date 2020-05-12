package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC24PSLoan_SmartHomeLoanNavigation extends wrappers.ProjectWrappers{

	public TC24PSLoan_SmartHomeLoanNavigation() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC24 - To Verify if user Click Smart Home Loans - Navigation  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void SmartHomeLoanNavigation() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Loans")
		.VerifySubmenu("Smart Home Loan")
		.VerifyLoanSubMenuNavigation("Smart Home Loan");
	}	
}
