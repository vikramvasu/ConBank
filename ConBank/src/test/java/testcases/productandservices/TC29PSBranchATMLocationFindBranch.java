package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC29PSBranchATMLocationFindBranch extends wrappers.ProjectWrappers{

	public TC29PSBranchATMLocationFindBranch() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC29 - To Verify if user enter or tap on Branch & ATM Location - Find a Branch Navigation  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void BranchATMLocationFindBranch() throws Exception
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
		.VerifySubmenu("Find an ATM ")
		.VerifySubmenu("Weekend Banking")
		.VerifyLoanSubMenuNavigation("Find a Branch");
	}	
}
