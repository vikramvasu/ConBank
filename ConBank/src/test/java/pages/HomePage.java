package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;


public class HomePage extends wrappers.ProjectWrappers  {

	public HomePage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
	}

	public HomePage EnterUserName(String username) throws InterruptedException {
		Thread.sleep(2000);
		enterByXpath("//input[@formcontrolname='userId']",username);
		return this;
	}
	
	public HomePage EnterPassword(String password){
		enterByXpath("//input[@formcontrolname='passwd']",password);
		return this;
	}
	
	public HomePage ClickLoginButton() throws InterruptedException{
		clickByXpath("//span[text()='LOGIN']");
		Thread.sleep(2000);
		return this;
	}
	
    public HomePage ClickLogin() throws InterruptedException{
		Thread.sleep(2000);
		clickByXpath("//span[text()=' Login ']");
		return this;
	}
   
    public HomePage ClickSplashLogo() throws InterruptedException{
    	Thread.sleep(2000);
		clickByXpath("//img[@class='splash-logo']");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		return this;
	}
      
    public HomePage ClickAccountBalanceLogo() {
		clickByXpath("//img[@alt='Account Balance']");
		return this;
	}
    
    public HomePage clickFundtransferLogo(){
		clickByXpath("//img[@alt='Funds Transfer']");
		return this;
	}
    
    public HomePage clickChequeBookRequestLogo(){
		clickByXpath("//img[@alt='Cheque Book Request']");
		return this;
	}
    
    public HomePage clickProductsAndServicesLogo(){
		clickByXpath("//img[@alt='Products and Services']");
		return this;
	}
    
    public HomePage clickPayCreditCardLogo(){
		clickByXpath("//img[@alt='Pay Credit Card']");
		return this;
	}
    
    public HomePage clickRechargeLogo(){
		clickByXpath("//img[@alt='Recharge']");
		return this;
	}
    
    public HomePage clickManageCardsLogo(){
		clickByXpath("//img[@alt='Manage Cards']");
		return this;
	}
    
    public HomePage clickStatementRequestLogo(){
		clickByXpath("//img[@alt='Statement Request']");
		return this;
	}
    
    public HomePage EnterTextArea(String Input) throws InterruptedException {
    	Thread.sleep(1000);
    	enterByXpath("//textarea[@id='chatInputText']",Input);
    	clickByXpath("//button[@id='chatSubmit']");
		return this;
	}
    
    public HomePage verifyWelcomeText(String Input) {
		verifyTextByXpath("(//div[@class='mxWelcomeTemp'])[1]",Input);
		return this;
	}
	
    public HomePage verifyWelcomeUserName(String Input) {
		verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Welcome')]","Welcome "+Input);
		return this;
	}
    
    
    public HomePage verifyTransferMessage() {
		verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'What type of transfer do you want to make?')]","What type of transfer do you want to make?");
		return this;
	}
    
    
   
    public HomePage clickConfirmButton(){
  		clickByXpath("//button/span[contains(text(),'Confirm')]");
  		return this;
  	}
      
    public HomePage clickCancelButton(){
  		clickByXpath("//button/span[contains(text(),'Cancel')]");
  		return this;
  	}
      
    public HomePage clickYesButton(){
  		clickByXpath("//button/span[contains(text(),'YES')]");
  		return this;
  	}
      
    public HomePage clickNoButton(){
  		clickByXpath("//button/span[contains(text(),'NO')]");
  		return this;
  	}
    
    public HomePage clickBeneficiaryName(String Name){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'"+Name+"')]");
  		return this;
  	}
    
        
}