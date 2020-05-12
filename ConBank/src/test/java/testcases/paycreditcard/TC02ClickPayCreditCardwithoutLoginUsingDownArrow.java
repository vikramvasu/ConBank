package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC02ClickPayCreditCardwithoutLoginUsingDownArrow extends wrappers.ProjectWrappers{

	public TC02ClickPayCreditCardwithoutLoginUsingDownArrow() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC02 - Verify that the user able to click Pay Credit Card without Login using Dropdown from Welcome Screen";
		TestDescription="TC02 - Verify that the user able to click Pay Credit Card without Login using Dropdown from Welcome Screen";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ClickPayCreditCardWithoutLogin() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.ClickDownArrow()
		.clickPayCreditCardLogo()
		//.verifyLoginPopUpMessage()
		.ClickLogin();
		
	}
	
	
}
