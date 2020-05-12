package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;



public class ViewTransactionPage extends wrappers.ProjectWrappers  {

	public ViewTransactionPage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
	}
	

	public ViewTransactionPage EnterUserName(String username) throws InterruptedException {
		Thread.sleep(2000);
		enterByXpath("//input[@formcontrolname='userId']",username);
		return this;
	}
	
	public ViewTransactionPage EnterPassword(String password){
		enterByXpath("//input[@formcontrolname='passwd']",password);
		return this;
	}
	
	public ViewTransactionPage ClickLoginButton(){
		
		clickByXpath("//span[text()='LOGIN']");
		return this;
	}
	
    public ViewTransactionPage ClickLogin(){
		
		clickByXpath("//span[text()=' Login ']");
		return this;
	}
   
    public ViewTransactionPage ClickSplashLogo() throws InterruptedException{
		clickByXpath("//img[@class='splash-logo']");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		return this;
	}
        
    public ViewTransactionPage EnterTextArea(String Input) throws InterruptedException{
    	enterByXpath("//textarea[@id='chatInputText']",Input);
    	clickByXpath("//button[@id='chatSubmit']");
		return this;
	}
    
    public ViewTransactionPage verifyWelcomeUserName(String Input) throws InterruptedException {
    	Thread.sleep(2000);
		verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Welcome')]","Welcome "+Input);
		return this;
	}
    
    public ViewTransactionPage VerifyClientMessage(String Message) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@id='mxUserMsg'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}
    
    public ViewTransactionPage VerifyClientResponseMessage(String Message) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}
    
    public ViewTransactionPage ClickViewTransactionButton(String CardName){
		clickByXpath("//h4[contains(text(),'"+CardName+"')]/../following-sibling::div/button/span[contains(text(),'View Transactions')]");
		return this;
	}
 
    public ViewTransactionPage VerifyViewTransactionCardTitle(String cardname) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyElementisPresent("//div[@class='mxTransactionTitle'][contains(text(),'"+cardname+"')]",cardname);
		return this;
	}
    
    public ViewTransactionPage VerifyCardIsPresent(String cardname) throws InterruptedException{
    		Thread.sleep(2000);
    		verifyElementisPresent("//h4[contains(text(),'"+cardname+"')]",cardname);
			return this;
		}
 
    public ViewTransactionPage VerifyMessageIsPresent(String Message){
    	verifyElementisPresent("//div[@id='mxTTMessage'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}
 
    public ViewTransactionPage verifyWrongAccountText(String Accountname) throws InterruptedException{
    	Thread.sleep(2000);
    	//String name="Sorry, I couldn't find any "+Accountname+" linked to you."; - Correct test case
    	String name="Sorry, looks like you don't have any "+Accountname+".";
    	System.out.println(name);
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'"+Accountname+"')]",name);
		return this;	
	}
 
    public ViewTransactionPage verifyWrongAccountEndingText(String Accountname) throws InterruptedException{
    	Thread.sleep(2000);
    	//String name="Sorry, I couldn't find any "+Accountname+" linked to you."; - Correct test case
	 	String name="Sorry, I was not able to find any "+Accountname+".";
	 	System.out.println(name);
	 	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'"+Accountname+"')]",name);
		return this;	
		}

}