package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;


public class ApplyNowPage extends wrappers.ProjectWrappers  {

	public ApplyNowPage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
	}

	public ApplyNowPage verifyWelcomeText(String Input) {
		verifyTextByXpath("//div[@class='mxWelcomeTemp']",Input);
		return this;
	}

   public ApplyNowPage ClickSplashLogo(){
		clickByXpath("//img[@class='splash-logo']");
		driver.switchTo().frame(0);
		return this;
	}
   
   public ApplyNowPage EnterText(String Input) throws InterruptedException{
		enterByXpath("//textarea[@id='chatInputText']",Input);
	   	clickByXpath("//button[@id='chatSubmit']");
		return this;
	}
   
   public ApplyNowPage ClickNextArrow(){
   	clickByXpath("//span[@aria-label='Next']");
		return this;
	}
   
   public ApplyNowPage VerifyMainmenu(String Mainmenu){
   	verifyElementisPresent("//h4[@id='mxGPTFootTitle'][contains(text(),'"+Mainmenu+"')]",Mainmenu);
		return this;
	}
   
   public ApplyNowPage VerifySubmenu(String Submenu){
   	verifyElementisPresent("//span[@class='mat-button-wrapper'][contains(text(),'"+Submenu+"')]",Submenu);
		return this;
	}
   
   public ApplyNowPage ClickSubmenu(String Submenu){
   	clickByXpath("//span[@class='mat-button-wrapper'][contains(text(),'"+Submenu+"')]");
		return this;
	}
    
    
}