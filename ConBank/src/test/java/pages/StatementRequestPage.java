package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;


public class StatementRequestPage extends wrappers.ProjectWrappers  {

	public StatementRequestPage(RemoteWebDriver driver, ExtentTest test)throws Exception{
	this.driver = driver;
	this.test = test;
	}

	public StatementRequestPage verifyWelcomeText(String Input) throws InterruptedException {
	Thread.sleep(2000);
	verifyTextByXpath("//div[@class='mxWelcomeTemp']",Input);
	return this;
	}
	
	public StatementRequestPage ClickSplashLogo() throws InterruptedException{
	Thread.sleep(1000);
	clickByXpath("//img[@class='splash-logo']");
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	return this;
	}

	public StatementRequestPage scrollDownforSRIcon() throws InterruptedException{
	Thread.sleep(1000);
	scrollDown("//img[@alt='Statement Request']");
	return this;
	}
	
	public StatementRequestPage clickStatementRequestLogo(){
	clickByXpath("//img[@alt='Statement Request']");
	return this;
	}
	
	public StatementRequestPage verifySRDisplayIcon(String IconName) {
	verifyElementisPresent("//img[@alt='Statement Request']",IconName);
	return this;
	}
	
	public StatementRequestPage ClickLoginButton(){
	clickByXpath("//span[@class='mat-button-wrapper'][contains(text(),' Login ')]");
	return this;
	}
	
	public StatementRequestPage EnterUserName(String User) {
	enterByXpath("//input[@formcontrolname='userId']",User);
	return this;
	}
	
	public StatementRequestPage EnterPassword(){
	enterByXpath("//input[@formcontrolname='passwd']","Tagit@123");
	return this;
	}
	
	public StatementRequestPage ClickLogin(){
	clickByXpath("//span[text()='LOGIN']");
	return this;
	}
   
    public StatementRequestPage verifyWelcomeUserName(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Welcome')]","Welcome "+Input);
	return this;
	}
    
    public StatementRequestPage scrollDownforSelectAccountText(){
	scrollDown("//div[@class='mxWelcomeTemp'][contains(text(),'I am happy to help you with that, Please select an account for which you want to download a statement')]");
	return this;
	}
    
    public StatementRequestPage scrollDownforSavingsAccountName(){
    scrollDown("//div[@id='mxCPTTitle'][contains(text(),'SuperValue Account')]");
    return this;
    }
     
    public StatementRequestPage scrollDownforCreditAccountName(){
    scrollDown("//div[@id='mxCPTTitle'][contains(text(),'Ultimate Card')]");
    return this;
    }
    
    public StatementRequestPage scrollDownforMarMonth(){
    scrollDown("//div[@id='mxCPTTitle'][contains(text(),'March')]");
    return this;
    }
   
    public StatementRequestPage verifySelectAccountforSRText(String Input) throws InterruptedException {
    Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'I am happy to help you with that, Please select an account for which you want to download a statement')]",Input);
	return this;
	}
   
    public StatementRequestPage EnterText(String Input) throws InterruptedException{
   	enterByXpath("//textarea[@id='chatInputText']",Input);
   	Thread.sleep(1000);
   	clickByXpath("//button[@id='chatSubmit']");
	return this;
	}
   
    public StatementRequestPage VerifyAccount(String VerifyAccount) throws InterruptedException{
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@id='mxCPTTitle'][contains(text(),'"+VerifyAccount+"')]",VerifyAccount);
	return this;
	}
   
    public StatementRequestPage SelectAccount(String SelectAccount){
	clickByXpath("//div[@id='mxCPTTitle'][contains(text(),'"+SelectAccount+"')]");
	return this;
	}
   
    public StatementRequestPage verifyLast6Months(String MonthName) throws InterruptedException{
   	Thread.sleep(2000);
   	verifyTextByXpath("//div[@id='mxCPTTitle'][contains(text(),'"+MonthName+"')]",MonthName);
	return this;
	}
    
    public StatementRequestPage SelectMonth(String SelectMonth){
    clickByXpath("//div[@id='mxCPTTitle'][contains(text(),'"+SelectMonth+"')]");
    return this;
    }
    
    public StatementRequestPage verifyDownloadText(String DownloadText) throws InterruptedException{     
    Thread.sleep(2000);
    verifyTextByXpath("//strong[@id='mxPTTitle'][contains(text(),'Here is the statement of your')]",DownloadText);
   	return this;
    }
   
    public StatementRequestPage clickDownload(){
    clickByXpath("//span[@class='mat-button-wrapper'][contains(text(),'Download')]");
    return this;
    }
  
    public StatementRequestPage verifyWrongAccountText(String WrongAccountTxt){     
    verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Sorry, There is no matching account for given account')]",WrongAccountTxt);
    return this;
    }
    
    public StatementRequestPage verifySelectAccountForWrongAccount(String Input) throws InterruptedException {
    Thread.sleep(2000);
    verifyTextByXpath("(//div[@class='mxWelcomeTemp'][contains(text(),'Please select an account for which you want to download a statement')])[2]",Input);
    return this;
    }
    
    public StatementRequestPage verifySelectAccountForWrongAccountCases(String Input) throws InterruptedException {
    Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Please select an account for which you want to download a statement')]",Input);
    return this;
    }
        
    public StatementRequestPage verifyNoAccountResponse(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),\"Sorry, looks like you don't have any active accounts.\")]",Input);
    return this;
    }
    
    public StatementRequestPage verifyNoSavingsAccountResponse(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, There is no matching account for given account type savings account')]",Input);
    return this;
    }
    
    public StatementRequestPage verifyNoCheckingAccountResponse(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, There is no matching account for given account type checking account')]",Input);
    return this;
    }
     
    public StatementRequestPage verify2InvalidAttempts(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.')]",Input);
    return this;
    }
      
    public StatementRequestPage verifyAnythingElseText(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Is there anything else I can help you with?')]",Input);
    return this;
    }
    
    public StatementRequestPage verifyAnythingElseTextinDownloadResponse(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Is there anything else I can help you with?')]",Input);
    return this;
    }
    
    public StatementRequestPage verifyWrongMonthText(String WrongMonthTxt) throws InterruptedException{     
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'is not a valid month.')]",WrongMonthTxt);
    return this;
    }
    
    public StatementRequestPage verifyResponseForWrongMonth(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Please select the month')]",Input);
    return this;
    }
   
    public StatementRequestPage verifyResponseForInvalidCarNumber(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'is not a valid number.')]",Input);
    return this;
    } 
    
    public StatementRequestPage verifyResponseOneForSameCardNumberEndingIntentAgain(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, Statement of my card ending with 8140 is not a valid month.')]",Input);
    return this;
    }
  
    public StatementRequestPage verifyResponseTwoForSameCardNumberEndingIntentAgain(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, Statement of my card ending with 6070 is not a valid month.')]",Input);
    return this;
    }
    
    public StatementRequestPage verifyDownloadSavingsAccountText(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//strong[@class='mxWelcomeTemp'][contains(text(),'Here is the statement of your SuperValue Account for the month of March. Please click to download the statement')]",Input);
    return this;
    }
    
    public StatementRequestPage verifyDownloadCheckingAccountText(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//strong[@class='mxWelcomeTemp'][contains(text(),'Here is the statement of your Regular Current Account for the month of March. Please click to download the statement')]",Input);
    return this;
    }
    
    public StatementRequestPage verifyDownloadCurrentAccountText(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//strong[@class='mxWelcomeTemp'][contains(text(),'Here is the statement of your Regular Current Account for the month of March. Please click to download the statement')]",Input);
    return this;
    }
    
    public StatementRequestPage verifyDownloadCreditAccountText(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//strong[@class='mxWelcomeTemp'][contains(text(),'Here is the statement of your Ultimate Card for the month of March. Please click to download the statement')]",Input);
    return this;
    }
    
    public StatementRequestPage verifyTextForCorrectAccountTypeAndInvalidAccountNumber(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, There is no matching account for given account type savings account with number 5555')]",Input);
    return this;
    }
  
    public StatementRequestPage verifyTextForCorrectAccountTypeAndDifferentAccountTypesActNumber(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, There is no matching account for given account type savings account with number 3968')]",Input);
    return this;
    }
    
    public StatementRequestPage verifyTextForAccountTypeAndAccountNumberGivenTwice(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, Statement of my Savings account ending with 5546 is not a valid month.')]",Input);
    return this;
    }
    
    public StatementRequestPage verifyTextForAccountNumberEnding(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, 5555 is not a valid number.')]",Input);
    return this;
    }
    
    public StatementRequestPage verifyTextForAccountNumberGivenTwice(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, Statement of my Account number ending with 5546 is not a valid month.')]",Input);
    return this;
    }
    
    public StatementRequestPage verifyTextForCorrectMonthTwice(String Input) throws InterruptedException {
   	Thread.sleep(2000);
    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, There is no matching account for given account name Statement')]",Input);
    return this;
    }
    
}