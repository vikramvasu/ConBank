package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;


public class ProductsAndServicesPage extends wrappers.ProjectWrappers  {

	public ProductsAndServicesPage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
	}

	
	public ProductsAndServicesPage EnterUserName(){
		//System.out.println("Home Page: verifyUserName Method !!");
		enterByXpath("//input[@formcontrolname='userId']","Tagit");
		return this;
	}
	
	public ProductsAndServicesPage EnterPassword(){
		enterByXpath("//input[@formcontrolname='passwd']","Tagit@123");
		return this;
	}
	
	public ProductsAndServicesPage ClickLoginButton(){
		
		clickByXpath("//span[text()='LOGIN']");
		return this;
	}
	
   public ProductsAndServicesPage ClickLogin(){
		
		clickByXpath("//span[text()=' Login ']");
		return this;
	}
   
    public ProductsAndServicesPage ClickSplashLogo(){
		
		clickByXpath("//img[@class='splash-logo']");
		driver.switchTo().frame(0);
		return this;
	}
       
    public ProductsAndServicesPage EnterTextArea(String Input) throws InterruptedException {
    	enterByXpath("//textarea[@id='chatInputText']",Input);
    	Thread.sleep(1000);
    	clickByXpath("//button[@id='chatSubmit']");
		return this;
	}

    public ProductsAndServicesPage clickProductsAndServicesLogo(){
		clickByXpath("//img[@alt='Products and Services']");
		return this;
	}
    
    public ProductsAndServicesPage VerifyMainmenu(String Mainmenu){
    	verifyElementisPresent("//h4[@id='mxGPTFootTitle'][contains(text(),'"+Mainmenu+"')]",Mainmenu);
		return this;
	}
    
    public ProductsAndServicesPage VerifySubmenu(String Submenu){
    	verifyElementisPresent("//span[@class='mat-button-wrapper'][contains(text(),'"+Submenu+"')]",Submenu);
		return this;
	}
    
    public ProductsAndServicesPage ClickSubmenu(String Submenu){
    	clickByXpath("//span[@class='mat-button-wrapper'][contains(text(),'"+Submenu+"')]");
		return this;
	}
    
    public ProductsAndServicesPage ClickApplyNow(String Submenu){
    	clickByXpath("//h4[@id='mxGPTFootTitle'][text()='"+Submenu+"']//ancestor::div[@class='mxCardFooterContainer ng-star-inserted']/following-sibling::div/div/ul/li/div/a/span[contains(text(),'Apply Now')]");
		return this;
	}
    
    public ProductsAndServicesPage ClickChooseAccount(String Account){
    	clickByXpath("//div[@class='mat-list-item-content']/div[contains(text(),'"+Account+"')]");
		return this;
	}
    
    public ProductsAndServicesPage VerifyChooseAccountSubmenu(String Account){
    	verifyElementisPresent("//div[@class='mat-list-item-content']/div[contains(text(),'"+Account+"')]",Account);
		return this;
	}
    
    public ProductsAndServicesPage VerifyOpenAccountTitle(String Title){
    	verifyElementisPresent("//div[@class='mxListTitle'][contains(text(),'"+Title+"')]",Title);
		return this;
	}
    
    public ProductsAndServicesPage VerifyOpenAccountSteps(){
    	verifyTextByXpath("//div/p[contains(text(),'Step1')]/following-sibling::span[contains(text(),'Download and complete the form')]","Download and complete the form");
    	verifyTextByXpath("//div/p[contains(text(),'Step2')]/following-sibling::span[contains(text(),'Visit the Branch')]","Visit the Branch");
    	verifyTextByXpath("//div/p[contains(text(),'Step3')]/following-sibling::span[contains(text(),'Wait for your ATM Card, Passbook or checkbook')]","Wait for your ATM Card, Passbook or checkbook");
    	verifyTextByXpath("//div/p[contains(text(),'Step4')]/following-sibling::span[contains(text(),'Enroll on Digital Banking')]","Enroll on Digital Banking");
		return this;
	}
    
    public ProductsAndServicesPage VerifyEnrollUsingaCardInstruction(){
    	verifyTextByXpath("//div/p[contains(text(),'Step1')]/following-sibling::span[contains(text(),'Fill out the form available at the branch')]","Fill out the form available at the branch");
    	verifyTextByXpath("//div/p[contains(text(),'Step2')]/following-sibling::span[contains(text(),'Enter the account number, mobile number and SMS PIN')]","Enter the account number, mobile number and SMS PIN");
    	verifyTextByXpath("//div/p[contains(text(),'Step3')]/following-sibling::span[contains(text(),'Enter and confirm basic account details')]","Enter and confirm basic account details");
    	verifyTextByXpath("//div/p[contains(text(),'Step4')]/following-sibling::span[contains(text(),'Login and enter the Online Activation Code')]","Login and enter the Online Activation Code");
		return this;
	}
    
    public ProductsAndServicesPage VerifyEnrollattheBranchInstruction(){
    	verifyTextByXpath("//div/p[contains(text(),'Step1')]/following-sibling::span[contains(text(),'Select an Account Type')]","Select an Account Type");
    	verifyTextByXpath("//div/p[contains(text(),'Step2')]/following-sibling::span[contains(text(),'Enter the account number, mobile number and SMS PIN')]","Enter the account number, mobile number and SMS PIN");
    	verifyTextByXpath("//div/p[contains(text(),'Step3')]/following-sibling::span[contains(text(),'Enter the 6-digit OTP')]","Enter the 6-digit OTP");
    	verifyTextByXpath("//div/p[contains(text(),'Step4')]/following-sibling::span[contains(text(),'Login and enter the Online Activation Code')]","Login and enter the Online Activation Code");
		return this;
	}
    
    public ProductsAndServicesPage VerifyAccountHolderInstruction(){
    	verifyTextByXpath("//div/p[contains(text(),'Option1')]/following-sibling::span[contains(text(),'Invest using Digital Banking')]","Invest using Digital Banking");
    	verifyTextByXpath("//div/p[contains(text(),'Option2')]/following-sibling::span[contains(text(),'Invest using ATM')]","Invest using ATM");
		return this;
	}
    
    public ProductsAndServicesPage VerifyNewCustomerInstruction(){
    	verifyTextByXpath("//div/p[contains(text(),'Step 1')]/following-sibling::span[contains(text(),'Visit the branch and open an account')]","Visit the branch and open an account");
    	verifyTextByXpath("//div/p[contains(text(),'Step 2')]/following-sibling::span[contains(text(),'Identify the fund where you want to invest')]","Identify the fund where you want to invest");
    	verifyTextByXpath("//div/p[contains(text(),'Step 3')]/following-sibling::span[contains(text(),'Enroll your savings and investments accounts on Digital Banking')]","Enroll your savings and investments accounts on Digital Banking");
		return this;
	}
    
    public ProductsAndServicesPage VerifyHowtoInvestApplyNowInstruction(){
    	verifyTextByXpath("//div/p[contains(text(),'Step1')]/following-sibling::span[contains(text(),'Download and complete the form')]","Download and complete the form");
    	verifyTextByXpath("//div/p[contains(text(),'Step2')]/following-sibling::span[contains(text(),'Requirements')]","Requirements");
    	verifyTextByXpath("//div/p[contains(text(),'Step3')]/following-sibling::span[contains(text(),'Find the branch')]","Find the branch");
		return this;
	}
    
    public ProductsAndServicesPage VerifyIDList(String List){
    	verifyElementisPresent("//div/p[contains(text(),'"+List+"')]",List);
		return this;
	}
    
    public ProductsAndServicesPage ClickNextArrow(){
    	clickByXpath("//span[@aria-label='Next']");
		return this;
	}
    
    public ProductsAndServicesPage ClickPreviousArrow(){
    	clickByXpath("//span[@aria-label='Previous']");
		return this;
	}
    
    public ProductsAndServicesPage VerifyClientMessage(String Message){
    	verifyTextByXpath("//div[@id='mxUserMsg'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}
    
    public ProductsAndServicesPage VerifyClientResponseMessage(String Message){
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}
    
    public ProductsAndServicesPage VerifyLoanSubMenuNavigation(String Submenu) throws Exception {
  	  String winHandleBefore = driver.getWindowHandle();
  	  ClickSubmenu(Submenu);
  	  for(String winHandle : driver.getWindowHandles())
  	  { 
  	  driver.switchTo().window(winHandle); 
  	  Thread.sleep(4000);
  	  } 
  	  String actual = driver.getCurrentUrl();
  	  Assert.assertEquals(actual, "https://www.tagitmobile.com/");
  	  System.out.println(actual);
  	  driver.switchTo().window(winHandleBefore);
  	  Thread.sleep(4000);
     	return this;
    }
    
    
}