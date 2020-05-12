package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;



public class AccountBalancePage extends wrappers.ProjectWrappers  {

	public AccountBalancePage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
	}
	
	public AccountBalancePage verifyWelcomeText(String Input) throws InterruptedException {
		Thread.sleep(1000);
		verifyTextByXpath("//div[@class='mxWelcomeTemp']",Input);
		return this;
	}
	
	public AccountBalancePage verifyAccountBalanceIcon(String IconName) throws InterruptedException {
		Thread.sleep(1000);
		verifyElementisPresent("//img[@alt='Account Balance']",IconName);
		return this;
	}
	
	public AccountBalancePage EnterUserName(String UserName){
		enterByXpath("//input[@formcontrolname='userId']",UserName);
		return this;
	}
	
	public AccountBalancePage EnterPassword(){
		enterByXpath("//input[@formcontrolname='passwd']","Tagit@123");
		return this;
	}
	
	public AccountBalancePage verifyWelcomeUserName(String Input) throws InterruptedException {
		Thread.sleep(2000);
		verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Welcome')]","Welcome "+Input);
		return this;
	}
	
	public AccountBalancePage ClickLoginButton(){
		clickByXpath("//span[@class='mat-button-wrapper'][contains(text(),'Login')]");
		return this;
	}
	
   public AccountBalancePage ClickLogin(){
		clickByXpath("//span[text()='LOGIN']");
		return this;
	}
   
    public AccountBalancePage ClickSplashLogo(){
		clickByXpath("//img[@class='splash-logo']");
		driver.switchTo().frame(0);
		return this;
	}
      
    public AccountBalancePage ScrollUpToSelectAccountBal() {
    	scrollUp("//div[@class='mxWelcomeTemp']");
    	return this;
    }
    
    public AccountBalancePage ClickAccountBalance(){
		clickByXpath("//img[@alt='Account Balance']");
		return this;
	}
    
    public AccountBalancePage EnterText(String Input) throws InterruptedException{
		enterByXpath("//textarea[@id='chatInputText']",Input);
		Thread.sleep(2000);
	   	clickByXpath("//button[@id='chatSubmit']");
		return this;
	}
    
    /*public AccountBalancePage VerifyAcountBalText(String BalText){
    	verifyTextByXpath("//div[@id='mxTTMessage'][starts-with(text(),'Your total deposit amount is')]",BalText);
		return this;	
	}*/
    
    public AccountBalancePage ClickNextArrow(){
    	clickByXpath("//span[@aria-label='Next']");
		return this;
	}
    
    public AccountBalancePage ClickViewTransaction(String CardName){
    	clickByXpath("//h4[contains(text(),'"+CardName+"')]/../following-sibling::div/button/span");
    	System.out.println("View Transaction Clicked!!!");
		return this;	
	}
    
    public AccountBalancePage VerifyCardIsPersent(String CardName){
    	verifyElementisPresent("//h4[contains(text(),'"+CardName+"')]",CardName);
		return this;	
	}
 
    public AccountBalancePage VerifyYourTransactionMessage(String Message){
    	verifyElementisPresent("//div[@class='mxWelcomeTemp'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}
    
    public AccountBalancePage VerifyTransactionTitle(String Title){
    	verifyElementisPresent("//div[@class='mxTransactionTitle'][contains(text(),'"+Title+"')]",Title);
		return this;	
	}	
    
    public AccountBalancePage ScrollUpForWrongAccountNameText() throws InterruptedException {
    	Thread.sleep(1000);
    	scrollUp("(//div[@id='mxTTMessage'])[4]");
    	return this;
    }
    
    public AccountBalancePage verifyWrongAccountText(String Accountname) throws InterruptedException{
    	String name="Sorry, looks like you don't have any "+Accountname+" account.";
    	System.out.println(name); 
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'"+Accountname+"')]",name);
		return this;	
	}
    
    public AccountBalancePage verifyWrongAccountTypeEndingText(String AccountTypeEnding) throws InterruptedException{
    	String type="Sorry, I was not able to find "+AccountTypeEnding+".";
    	System.out.println(type); 
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'"+AccountTypeEnding+"')]",type);
		return this;	
	}
    
    public AccountBalancePage verifyNoCreditCardUserText(String NoCreditCardUser) throws InterruptedException{
    	String credit="Sorry, looks like you don't have any "+NoCreditCardUser+".";
    	System.out.println(credit); 
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'"+NoCreditCardUser+"')]",credit);
		return this;	
	}
    
    public AccountBalancePage verifyAnythingElseText(String Input) throws InterruptedException {
    	Thread.sleep(2000);
	    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Is there anything else')]",Input);
	    return this;
	}
  
}
    
  //  ----------------------------------------------------------------------------------------
