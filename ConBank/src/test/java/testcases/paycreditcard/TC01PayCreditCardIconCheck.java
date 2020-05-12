package testcases.paycreditcard;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PayCreditCardPage;


public class TC01PayCreditCardIconCheck extends wrappers.ProjectWrappers{

	public TC01PayCreditCardIconCheck() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="To verify that Pay Credit Card icon is as per UI/UX shared";
		TestDescription="To verify that Pay Credit Card icon is as per UI/UX shared";
		browserName="chrome";
		Application="Pay Credit Card";
		Authors="Vikram";
	}
	

	@Test
	public void PayCreditCardIconCheck() throws Exception
	{
		new PayCreditCardPage(driver, test)
		.ClickSplashLogo()
		.clickPayCreditCardLogo()
		.ClickLoginButton()
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLogin()
		.verifyWelcomeUserName("Tagit");
	}

}
