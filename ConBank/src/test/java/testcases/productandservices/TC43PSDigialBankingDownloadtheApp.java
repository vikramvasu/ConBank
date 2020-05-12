package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC43PSDigialBankingDownloadtheApp extends wrappers.ProjectWrappers{

	public TC43PSDigialBankingDownloadtheApp() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC43 - To verify if user click on Download the App";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void DBDownloadTheApp() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Digital Banking")
		.VerifyLoanSubMenuNavigation("Download the App");			
	}	
}
