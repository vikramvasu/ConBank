package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC03PayCreditCardInTextAreawithoutLogin extends wrappers.ProjectWrappers{

	public TC03PayCreditCardInTextAreawithoutLogin() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC03 - Verify that the user able to type the Pay Credit Card in TextBox area (Without Login Scenario)";
		TestDescription="TC03 - Verify that the user able to type the Pay Credit Card in TextBox area (Without Login Scenario)";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void PayCreditCardInTextAreawithoutLogin() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Pay Credit Card")
		//.verifyLoginPopUpMessage()
		.ClickLogin();
		
	}
	
	
}
