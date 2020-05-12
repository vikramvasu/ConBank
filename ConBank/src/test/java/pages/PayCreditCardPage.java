package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;


public class PayCreditCardPage extends wrappers.ProjectWrappers  {

	public PayCreditCardPage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
	}

	
	public PayCreditCardPage EnterUserName(String username) throws InterruptedException {
		Thread.sleep(2000);
		enterByXpath("//input[@formcontrolname='userId']",username);
		return this;
	}
	
	public PayCreditCardPage EnterPassword(String password){
		enterByXpath("//input[@formcontrolname='passwd']",password);
		return this;
	}
	
	public PayCreditCardPage ClickLoginButton(){
		clickByXpath("//span[text()='LOGIN']");
		return this;
	}
	
   public PayCreditCardPage ClickLogin() throws InterruptedException{
	    Thread.sleep(1000);
		clickByXpath("//span[text()=' Login ']");
		return this;
	}
   
    public PayCreditCardPage ClickSplashLogo() throws InterruptedException{
		clickByXpath("//img[@class='splash-logo']");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		return this;
	}
    
    public PayCreditCardPage clickPayCreditCardLogo(){
		clickByXpath("//img[@alt='Pay Credit Card']");
		return this;
	}
    
    public PayCreditCardPage verifyWelcomeUserName(String Input) throws InterruptedException {
    	Thread.sleep(2000);
		verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Welcome')]","Welcome "+Input);
		return this;
	}
    
    public PayCreditCardPage verifyLoginPopUpMessage() throws InterruptedException {
    	Thread.sleep(2000);
    	verifyElementisPresent("//strong[@id='mxPTTitle'][contains(text(),'Let me assist with Pay Credit Card. Kindly login to proceed further.')]","LoginPopUpMessage");
		return this;
	}
    
    
    public PayCreditCardPage EnterTextArea(String Input) throws InterruptedException{
    	Thread.sleep(2000);
    	enterByXpath("//textarea[@id='chatInputText']",Input);
    	Thread.sleep(1000);
    	clickByXpath("//button[@id='chatSubmit']");
		return this;
	}
    
    public PayCreditCardPage ClickNextArrow(){
    	clickByXpath("//span[@aria-label='Next']");
		return this;
	}
    
    public PayCreditCardPage ClickPreviousArrow(){
    	clickByXpath("//span[@aria-label='Previous']");
		return this;
	}
    
    public PayCreditCardPage ClickDownArrow(){
    	clickByXpath("//span/mat-icon[text()='arrow_downward']");
		return this;
	}
    
    public PayCreditCardPage VerifyClientMessage(String Message) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@id='mxUserMsg'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}
    
    public PayCreditCardPage VerifyClientResponseMessage(String Message) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}
    
    public PayCreditCardPage VerifyAccountListMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'From which account do you want to pay?  Please choose from the list below.')]","From which account do you want to pay? Please choose from the list below.");
		return this;	
	}
     
    public PayCreditCardPage VerifyPaycreditcardElementPresent(String Message){
    	verifyElementisPresent("//div[@id='mxCPTTitle'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}

    public PayCreditCardPage ClickPaycreditcardElement(String Message){
    	clickByXpath("//div[@id='mxCPTTitle'][contains(text(),'"+Message+"')]");
		return this;	
	}
    
    public PayCreditCardPage verifySuccessIcon(){
    	verifyElementisPresent("//mat-icon[@class='mat-icon material-icons mat-icon-no-color'][text()='done']","Success ICON");
  		return this;
  	}
    
    public PayCreditCardPage verifyCancellationIcon(){
    	verifyElementisPresent("//mat-icon[@class='mat-icon material-icons mat-icon-no-color'][text()='priority_high']","Cancellation ICON");
  		return this;
  	}
    
    public PayCreditCardPage clickConfirmButton(){
  		clickByXpath("//button/span[contains(text(),'Confirm')]");
  		return this;
  	}
      
    public PayCreditCardPage clickCancelButton(){
  		clickByXpath("//button/span[contains(text(),'Cancel')]");
  		return this;
  	}
      
    public PayCreditCardPage verifyConfirmButton(){
    	verifyElementisPresent("//button/span[contains(text(),'Confirm')]","Confirm");
  		return this;
  	}
      
    public PayCreditCardPage verifyCancelButton(){
    	verifyElementisPresent("//button/span[contains(text(),'Cancel')]","Cancel");
  		return this;
  	}
    
    
    public PayCreditCardPage verifyPayCreditCardConfirmationMessage(String message) {
    	verifyElementisPresent("//strong[@id='mxPTTitle'][contains(text(),'"+message+"')]",message);
		return this;
	}
    
    public PayCreditCardPage VerifyTransactionSuccessMessage(){
    	verifyElementisPresent("//div[@id='mxSTTitle'][contains(text(),'Your transaction was successful. The following details have been sent to your email. Transaction Date and Time')]","Transaction Success Message");
		return this;	
	}
    
    public PayCreditCardPage verifyCancellationMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	String CancellationMessage=driver.findElement(By.xpath("//div[@class='mx-statusTitle'][contains(text(),'Your request has been cancelled')]")).getText();
    	System.out.println(CancellationMessage);
    	verifyTextByXpath("//div[@class='mx-statusTitle'][contains(text(),'Your request has been cancelled')]",CancellationMessage);
  		return this;
  	}
    
    public PayCreditCardPage VerifyNotAbleToFindAccount(String Accountname) throws InterruptedException{
    	Thread.sleep(2000);
    	String name="Sorry, I couldn't find any "+Accountname+" linked to you.";
    	System.out.println(name);
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'linked to you.')]",name);
		return this;	
	}
    
 
}