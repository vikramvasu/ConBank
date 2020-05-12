package testcases.productandservices;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ProductsAndServicesPage;



public class TC45PSDBApplyNowEnrollattheBranchInstruction extends wrappers.ProjectWrappers{

	public TC45PSDBApplyNowEnrollattheBranchInstruction() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC45 - To verify if user click on Enroll at the Branch- Instruction ";
		TestDescription="Product and Services";
		browserName="chrome";
		Application="Product and Services";
		Authors="Vairamuthu";
	}
	

	@Test
	public void EnrollattheBranchInstruction() throws Exception
	{
		new ProductsAndServicesPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Product and Services")
		.ClickNextArrow()
		.ClickNextArrow()
		.VerifyMainmenu("Digital Banking")
		.VerifySubmenu("How to Enroll")
		.ClickApplyNow("Digital Banking")
		.VerifyClientMessage("Enroll for Digital Banking")
		.VerifyOpenAccountTitle("Below are the options to enroll into digital banking")
		.VerifyChooseAccountSubmenu("Enroll at the Branch")
		.ClickChooseAccount("Enroll at the Branch")
		.VerifyOpenAccountTitle("Follow below instruction for enroll at the branch")
		.VerifyEnrollattheBranchInstruction();
	}	
}
