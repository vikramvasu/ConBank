package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC22PSDigitalBankingOTP extends wrappers.ProjectWrappers{

	public TC22PSDigitalBankingOTP() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC22 - Verify that user able to view OTP details when user clicks OTP under Digital Banking";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void DigitalBankingOTP() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Digital Banking")
		.VerifySubmenu("OTP")
		.ClickSubmenu("OTP")
		.VerifyClientMessage("OTP digital bank")
		.VerifyClientResponseMessage("For OTP reach out the bank");
	}	
}
