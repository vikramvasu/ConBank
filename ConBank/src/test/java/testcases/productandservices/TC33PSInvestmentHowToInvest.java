package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC33PSInvestmentHowToInvest extends wrappers.ProjectWrappers{

	public TC33PSInvestmentHowToInvest() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC33 - To Verify if user enter or tap on Investments How to Invest - Sub menu  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void InvestmentsHowtoInvest() throws Exception
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
		.ClickSubmenu("How to Invest")
		.VerifyOpenAccountTitle("Below are the options for investment")
		.VerifyChooseAccountSubmenu("Account Holder" )
		.VerifyChooseAccountSubmenu("New Customer ");
	}	
}
