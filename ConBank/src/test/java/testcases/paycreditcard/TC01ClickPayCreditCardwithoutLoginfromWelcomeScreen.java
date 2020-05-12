package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC01ClickPayCreditCardwithoutLoginfromWelcomeScreen extends wrappers.ProjectWrappers{

	public TC01ClickPayCreditCardwithoutLoginfromWelcomeScreen() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC01 - To Verify that the user able to click Pay Credit Card without Login from Welcome Screen";
		TestDescription="TC01 - To Verify that the user able to click Pay Credit Card without Login from Welcome Screen";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ClickPayCreditCardWithoutLogin() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.clickPayCreditCardLogo()
		//.verifyLoginPopUpMessage()
		.ClickLogin();
		
	}
	
	
}
