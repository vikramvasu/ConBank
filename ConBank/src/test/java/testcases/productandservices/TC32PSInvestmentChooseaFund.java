package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC32PSInvestmentChooseaFund extends wrappers.ProjectWrappers{

	public TC32PSInvestmentChooseaFund() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC32 - To Verify if user enter or tap on Investments Choose a Fund - Sub menu  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void InvestmentsChooseAfund() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Investments")
		.VerifySubmenu("Choose a Fund")
		.VerifySubmenu("How to Invest")
		.VerifySubmenu("Invest Online")
		.VerifySubmenu("Apply Now")
		.ClickSubmenu("Choose a Fund")
		.VerifyMainmenu("UITF - Money Market Fund")
		.VerifyMainmenu("UITF - Balanced Fund")
		.VerifyMainmenu("UITF - Equity Fund")
		.VerifyMainmenu("UITF - Intermediate Bond")
		.VerifyMainmenu("UITF - Global Fund");
	}	
}
