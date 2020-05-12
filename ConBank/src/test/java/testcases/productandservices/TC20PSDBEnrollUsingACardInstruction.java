package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC20PSDBEnrollUsingACardInstruction extends wrappers.ProjectWrappers{

	public TC20PSDBEnrollUsingACardInstruction() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC20 - To verify if user click on Enroll Using a Card - Instruction ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void EnrollUsingACardInstruction() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Digital Banking")
		.VerifySubmenu("How to Enroll")
		.ClickSubmenu("How to Enroll")
		.VerifyClientMessage("How to Enroll for Digital Banking")
		.VerifyOpenAccountTitle("Below are the options to enroll into digital banking")
		.VerifyChooseAccountSubmenu("Enroll Using a Card")
		.ClickChooseAccount("Enroll Using a Card")
		.VerifyOpenAccountTitle("Follow below instruction for enroll using a card")
		.VerifyEnrollUsingaCardInstruction();
	}	
}
