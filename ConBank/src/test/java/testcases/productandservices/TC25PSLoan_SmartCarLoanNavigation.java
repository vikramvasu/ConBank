package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC25PSLoan_SmartCarLoanNavigation extends wrappers.ProjectWrappers{

	public TC25PSLoan_SmartCarLoanNavigation() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC25 - To Verify if user Click Smart Car Loans - Navigation  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void SmarCarLoan() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Loans")
		.VerifySubmenu("Smart Car Loan")
		.VerifyLoanSubMenuNavigation("Smart Car Loan");
	}	
}
