package testcases.fundtransfer;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;



public class Login extends wrappers.ProjectWrappers{

	public Login() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setData() {
		TestCaseName="Login";
		TestDescription="Login To Application";
		browserName="chrome";
		dataSheetName="Login";
		Application="Smoke";
		Authors="Vairamuthu";
	}

	@Test()
	public void Login1() throws Exception
	{
		new HomePage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName("Tagit")
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName("Tagit");
	}

}
