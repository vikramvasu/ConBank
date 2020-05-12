package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC27PSRemittanceReceiveMoneyNavigation extends wrappers.ProjectWrappers{

	public TC27PSRemittanceReceiveMoneyNavigation() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC27 - To Verify if user Click Receive Money - Navigation  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ReceiveMoneyNavigation() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Remittance")
		.VerifySubmenu("Receive Money")
		.ClickSubmenu(("Receive Money"))
		.VerifyLoanSubMenuNavigation("Receive Money");	
	}	
}
