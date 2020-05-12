package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC35PSInvestmentHowToInvestNewCustomerFlow extends wrappers.ProjectWrappers{

	public TC35PSInvestmentHowToInvestNewCustomerFlow() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC35 - To Verify if user enter or tap on Investments How to Invest - New Customer Flow  ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void HowToInvestNewCustomerFlow() throws Exception
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
		.ClickChooseAccount("New Customer")
		.VerifyClientMessage("New Customer")
		.VerifyOpenAccountTitle("Below steps for New Customer")
		.VerifyNewCustomerInstruction();
	}	
}
