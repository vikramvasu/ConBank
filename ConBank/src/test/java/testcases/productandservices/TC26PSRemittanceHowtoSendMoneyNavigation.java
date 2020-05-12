package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC26PSRemittanceHowtoSendMoneyNavigation extends wrappers.ProjectWrappers{

	public TC26PSRemittanceHowtoSendMoneyNavigation() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC26 - To Verify if user Click How to Send Money - Navigaion  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void HowtoSendMoney() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Remittance")
		.VerifySubmenu("How to Send Money")
		.ClickSubmenu(("How to Send Money"))
		.VerifyLoanSubMenuNavigation("How to Send Money");	
	}	
}
