package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC36PSInvestmentApplyNowInsruction extends wrappers.ProjectWrappers{

	public TC36PSInvestmentApplyNowInsruction() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC36 - To Verify if user enter or tap on Investments Apply Now Instruction";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void InvestmentsApplyNowInstruction() throws Exception
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
		.ClickApplyNow("Investments")
		.VerifyClientMessage("Apply for Investments")
		.VerifyOpenAccountTitle("Follow below instruction for applying at branch")
		.VerifyHowtoInvestApplyNowInstruction();
	}	
}
