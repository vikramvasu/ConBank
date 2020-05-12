package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;


public class ChequeBookRequestPage extends wrappers.ProjectWrappers  {

	public ChequeBookRequestPage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
	}

	public ChequeBookRequestPage EnterUserName(String username) throws InterruptedException {
		Thread.sleep(2000);
		enterByXpath("//input[@formcontrolname='userId']",username);
		return this;
	}
	
	public ChequeBookRequestPage EnterPassword(String password){
		enterByXpath("//input[@formcontrolname='passwd']",password);
		return this;
	}
	
	public ChequeBookRequestPage ClickLoginButton(){
		clickByXpath("//span[text()='LOGIN']");
		return this;
	}
	
   public ChequeBookRequestPage ClickLogin() throws InterruptedException{
	    Thread.sleep(1000);
		clickByXpath("//span[text()=' Login ']");
		return this;
	}
   
    public ChequeBookRequestPage ClickSplashLogo() throws InterruptedException{
		clickByXpath("//img[@class='splash-logo']");
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		return this;
	}
      
    public ChequeBookRequestPage ClickAccountBalance(){
		clickByXpath("(//img[@alt='Account Balance']");
		return this;
	}
    
    public ChequeBookRequestPage clickChequeBookRequestLogo(){
		clickByXpath("//img[@alt='Cheque Book Request']");
		return this;
	}

    public ChequeBookRequestPage verifyWelcomeUserName(String Input) throws InterruptedException {
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Welcome')]","Welcome "+Input);
		return this;
	}
    
    public ChequeBookRequestPage EnterTextArea(String Input) throws InterruptedException{
    	enterByXpath("//textarea[@id='chatInputText']",Input);
    	Thread.sleep(1000);
    	clickByXpath("//button[@id='chatSubmit']");
		return this;
	}
     
    public ChequeBookRequestPage VerifyCheckBookRequestClientMessage(String Message) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyElementisPresent("//div[@class='mxClientMsgBlock'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}
    
    public ChequeBookRequestPage VerifyCheckBookRequestIntentAccountDisplayMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	verifyElementisPresent("//div[@class='mxWelcomeTemp'][contains(text(),'Please select an account for which you would like to request a Cheque Book')]","Intent Account Display Message");
		return this;	
	}
    
    public ChequeBookRequestPage VerifyCheckBookRequestIntentSavingAccountDisplayMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	verifyElementisPresent("//div[@class='mxWelcomeTemp'][contains(text(),'Please select savings account for which you request a Cheque Book')]","Intent Saving Account Display Message");
		return this;	
	}
    
    
    public ChequeBookRequestPage clickaXcessPlusAccount(){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'aXcessPlus Account')]");
  		return this;
  	}
    
    public ChequeBookRequestPage clickSuperValueAccount(){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'SuperValue Account')]");
  		return this;
  	}
    
    public ChequeBookRequestPage clickRegularCurrentAccount(){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'Regular Current Account')]");
  		return this;
  	}
    
    public ChequeBookRequestPage verifyaXcessPlusAccount() throws InterruptedException{
    	Thread.sleep(2000);
    	verifyElementisPresent("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'aXcessPlus Account')]","aXcessPlus Account");
  		return this;
  	}
    
    public ChequeBookRequestPage verifySuperValueAccount() throws InterruptedException{
    	Thread.sleep(2000);
    	verifyElementisPresent("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'SuperValue Account')]","SuperValue Account");
  		return this;
  	}
    
    public ChequeBookRequestPage verifyRegularCurrentAccount() throws InterruptedException{
    	Thread.sleep(2000);
    	verifyElementisPresent("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'Regular Current Account')]","Regular Current Account");
  		return this;
  	}
    
    public ChequeBookRequestPage VerifyCheckBookRequestResponseMessage(String Message){
    	verifyElementisPresent("//div[@class='mxWelcomeTemp'][contains(text(),'would like to request a Cheque Book')]",Message);
		return this;	
	}

    public ChequeBookRequestPage Scrollup(){
    	scrollUp("//img[@alt='Cheque Book Request']");
		return this;	
	}
    
    public ChequeBookRequestPage verifyDeliveryAddress() throws InterruptedException{
    	Thread.sleep(2000);
    	String address=driver.findElement(By.xpath("//div[@class='mxWelcomeTemp'][contains(text(),'Business Park')]")).getText();
    	System.out.println(address);
    	verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Business Park')]",address);
  		return this;
  	}
    
    public ChequeBookRequestPage verifyConfirmMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	String confirmmessage=driver.findElement(By.xpath("//Strong[@class='mxWelcomeTemp'][contains(text(),'Your Cheque Book for')]")).getText();
    	System.out.println(confirmmessage);
    	verifyTextByXpath("//Strong[@class='mxWelcomeTemp'][contains(text(),'Your Cheque Book for')]",confirmmessage);
  		return this;
  	}
    
    public ChequeBookRequestPage verifySuccessMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	String successmessage=driver.findElement(By.xpath("//div[@class='mx-statusTitle sucessStatusTitle']")).getText();
    	System.out.println(successmessage);
    	verifyTextByXpath("//div[@class='mx-statusTitle sucessStatusTitle']",successmessage);
  		return this;
  	}
    
    public ChequeBookRequestPage verifyCanHelpYouMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	String CanHelpYouMessage=driver.findElement(By.xpath("//div[@class='mxWelcomeTemp'][contains(text(),'can help you with')]")).getText();
    	System.out.println(CanHelpYouMessage);
    	verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'can help you with')]",CanHelpYouMessage);
  		return this;
  	}
    
    public ChequeBookRequestPage verifyCancellationMessage() throws InterruptedException{
    	Thread.sleep(1000);
    	String CancellationMessage=driver.findElement(By.xpath("//div[@class='mx-statusTitle'][contains(text(),'Your request has been cancelled')]")).getText();
    	System.out.println(CancellationMessage);
    	verifyTextByXpath("//div[@class='mx-statusTitle'][contains(text(),'Your request has been cancelled')]",CancellationMessage);
  		return this;
  	}
    
    
    public ChequeBookRequestPage verifySorryDonotHaveAccountMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	String sorrymessage=driver.findElement(By.xpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, looks like you don')]")).getText();
    	System.out.println(sorrymessage);
    	verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, looks like you don')]",sorrymessage);
  		return this;
  	}
    
    public ChequeBookRequestPage verifySorryTwoInvalidAttemptMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	String sorrymessage=driver.findElement(By.xpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, you have made two consecutive invalid attempts. Your request has been cancelled')]")).getText();
    	System.out.println(sorrymessage);
    	verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, you have made two consecutive invalid attempts. Your request has been cancelled')]",sorrymessage);
  		return this;
  	}
    
    public ChequeBookRequestPage verifyConfirmInvalidInputMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	String sorrymessage=driver.findElement(By.xpath("//strong[@class='mxWelcomeTemp'][contains(text(),'is an invalid input. Please select confirm for requesting a Cheque Book or cancel to abort')]")).getText();
    	System.out.println(sorrymessage);
    	verifyTextByXpath("//strong[@class='mxWelcomeTemp'][contains(text(),'is an invalid input. Please select confirm for requesting a Cheque Book or cancel to abort')]",sorrymessage);
  		return this;
  	}
    
    public ChequeBookRequestPage verifyIndividualAccountBalanceMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	verifyElementisPresent("//div[@class='mxWelcomeTemp'][contains(text(),'Here are your individual account balances')]","Here are your individual account balances Message");
  		return this;
  	}
    
    public ChequeBookRequestPage verifySuccessIcon(){
    	verifyElementisPresent("//mat-icon[@class='mat-icon material-icons mat-icon-no-color'][text()='done']","Success ICON");
  		return this;
  	}
    
    public ChequeBookRequestPage verifyCancellationIcon(){
    	verifyElementisPresent("//mat-icon[@class='mat-icon material-icons mat-icon-no-color'][text()='priority_high']","Cancellation ICON");
  		return this;
  	}
    
    public ChequeBookRequestPage clickConfirmButton(){
  		clickByXpath("//button/span[contains(text(),'Confirm')]");
  		return this;
  	}
      
    public ChequeBookRequestPage clickCancelButton(){
  		clickByXpath("//button/span[contains(text(),'Cancel')]");
  		return this;
  	}
      
    public ChequeBookRequestPage verifyConfirmButton(){
    	verifyElementisPresent("//button/span[contains(text(),'Confirm')]","Confirm");
  		return this;
  	}
      
    public ChequeBookRequestPage verifyCancelButton(){
    	verifyElementisPresent("//button/span[contains(text(),'Cancel')]","Cancel");
  		return this;
  	}
    
    public ChequeBookRequestPage verifySorryMessageInvalidAccount() throws InterruptedException{
    	Thread.sleep(2000);
    	String sorrymessage=driver.findElement(By.xpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, look')]")).getText();
    	System.out.println(sorrymessage);
    	verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, look')]",sorrymessage);
  		return this;
  	}
    
    public ChequeBookRequestPage VerifyChequeBookRequestClientMessage(String Message) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}
}