package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC31PSBranchATMLocationWeekendBanking extends wrappers.ProjectWrappers{

	public TC31PSBranchATMLocationWeekendBanking() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC31 - To Verify if user enter or tap on Branch & ATM Location - Weekend Banking Navigation  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void BranchATMLocationWeekendBankingNavigation() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Branch & ATM Location")
		.VerifySubmenu("Find a Branch")
		.VerifySubmenu("Find an ATM")
		.VerifySubmenu("Weekend Banking")
		.VerifyLoanSubMenuNavigation("Weekend Banking");
	}	
}
