package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC04ClickPayCreditCardwithLoginfromWelcomeScreen extends wrappers.ProjectWrappers{

	public TC04ClickPayCreditCardwithLoginfromWelcomeScreen() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="TC04 - To Verify that the user able to click Pay Credit Card with Login from Welcome Screen";
		TestDescription="TC04 - To Verify that the user able to click Pay Credit Card with Login from Welcome Screen";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vairamuthu";
	}
	

	@Test
	public void ClickPayCreditCardWithLogin() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("Tagit")
		.EnterTextArea("Pay Credit Card")
		.VerifyClientMessage("Pay Credit Card");
		
	}
	
	
}
