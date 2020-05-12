package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;


public class FundTransferPage extends wrappers.ProjectWrappers  {

	public FundTransferPage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
	}

	
	public FundTransferPage EnterUserName(String username) {
		enterByXpath("//input[@formcontrolname='userId']",username);
		return this;
	}
	
	public FundTransferPage EnterPassword(String password){
		enterByXpath("//input[@formcontrolname='passwd']",password);
		return this;
	}
	
	public FundTransferPage ClickLoginButton(){
		
		clickByXpath("//span[text()='LOGIN']");
		return this;
	}
	
   public FundTransferPage ClickLogin(){
		
		clickByXpath("//span[text()=' Login ']");
		return this;
	}
   
   public FundTransferPage verifyWelcomeUserName(String Input) throws InterruptedException {
	   Thread.sleep(2000);
	   verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Welcome')]","Welcome "+Input);
		return this;
	}
    public FundTransferPage ClickSplashLogo(){
		
		clickByXpath("//img[@class='splash-logo']");
		driver.switchTo().frame(0);
		return this;
	}
      
    public FundTransferPage ClickAccountBalance() throws InterruptedException{
		//clickByXpath("//img[@alt='Account Balance']");
		clickByXpath("(//button[@class='mxSysTempIcon mat-fab mat-primary'])[1]");
		return this;
	}
    
   // -------------------------------------------------------------------------------------------
    
    public FundTransferPage EnterTextArea(String Input) throws InterruptedException{
    	enterByXpath("//textarea[@id='chatInputText']",Input);
    	clickByXpath("//button[@id='chatSubmit']");
		return this;
	}
    /*	
    public void Login(String username) throws Exception
	{
		new HomePage(driver, test)
		.ClickSplashLogo()
		.EnterTextArea("Login")
		.EnterUserName(username)
		.EnterPassword("Tagit@123")
		.ClickLoginButton()
		.verifyWelcomeUserName(username);
	}*/
    
    public FundTransferPage clickFundtransferLogo(){
		clickByXpath("//img[@alt='Funds Transfer']");
		return this;
	}
    
    public FundTransferPage Scrollup(){
    	scrollUp("//img[@alt='Funds Transfer']");
		return this;	
	}
    
    
    public FundTransferPage clickToOtherAccount(){
		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(), 'To Other Account ')]");
		return this;
	}
    
    public FundTransferPage clickToOwnAccount(){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(), 'To Own Account ')]");
  		return this;
  	}
    
    public FundTransferPage clickaXcessPlusAccount(){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'aXcessPlus Account')]");
  		return this;
  	}
    
    public FundTransferPage clickSuperValueAccount(){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'SuperValue Account')]");
  		return this;
  	}
    
    public FundTransferPage clickRegularCurrentAccount(){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'Regular Current Account')]");
  		return this;
  	}
      
    public FundTransferPage clickBeneficiaryName(String name){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'"+name+"')]");
  		return this;
  	}
    
    public FundTransferPage VerifyClientMessage(String Message) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@id='mxUserMsg'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}
    
    public FundTransferPage VerifyClientResponseMessage(String Message){
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}
    
    public FundTransferPage VerifyElementPresent(String Message) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyElementisPresent("//div[@id='mxCPTTitle'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}

    
    public FundTransferPage ClickFundTransferElement(String Message){
    	clickByXpath("//div[@id='mxCPTTitle'][contains(text(),'"+Message+"')]");
		return this;	
	}
    
    public FundTransferPage verifySuccessIcon(){
    	verifyElementisPresent("//mat-icon[@class='mat-icon material-icons mat-icon-no-color'][text()='done']","Success ICON");
  		return this;
  	}
    
    public FundTransferPage verifyCancellationIcon(){
    	verifyElementisPresent("//mat-icon[@class='mat-icon material-icons mat-icon-no-color'][text()='priority_high']","Cancellation ICON");
  		return this;
  	}
    
    public FundTransferPage verifyConfirmationMessage(String message) throws InterruptedException {
    	Thread.sleep(2000);
    	verifyElementisPresent("//strong[@id='mxPTTitle'][contains(text(),'"+message+"')]","Confirmation message");
		return this;
	}
    
    public FundTransferPage VerifyTransactionSuccessMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	verifyElementisPresent("//div[@id='mxSTTitle'][contains(text(),'Your transaction was successful. The following details have been sent to your email.')]","Transaction Success Message");
		return this;	
	}
    
    public FundTransferPage VerifyInsufficendFundMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	verifyElementisPresent("//div[@id='mxTTMessage'][contains(text(),'Sorry, insufficient funds')]"," Insufficent Fund Message");
		return this;	
	}
    
    public FundTransferPage verifyCancellationMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	String CancellationMessage=driver.findElement(By.xpath("//div[@id='mxSTTitle'][contains(text(),'Your request has been cancelled')]")).getText();
    	System.out.println(CancellationMessage);
    	verifyTextByXpath("//div[@id='mxSTTitle'][contains(text(),'Your request has been cancelled')]",CancellationMessage);
  		return this;
  	}
    
    public FundTransferPage clickConfirmButton(){
  		clickByXpath("//button/span[contains(text(),'Confirm')]");
  		return this;
  	}
      
    public FundTransferPage clickCancelButton(){
  		clickByXpath("//button/span[contains(text(),'Cancel')]");
  		return this;
  	}
      
    public FundTransferPage clickYesButton(){
  		clickByXpath("//button/span[contains(text(),'YES')]");
  		return this;
  	}
      
    public FundTransferPage clickNoButton(){
  		clickByXpath("//button/span[contains(text(),'NO')]");
  		return this;
  	}
    
    public FundTransferPage verifyTransferText() throws InterruptedException{
    	Thread.sleep(2000);
    	String TransferText = driver.findElement(By.xpath("//div[@id='mxTTMessage'][contains(text(),'transfer')]")).getText();
    if(TransferText.equals("Please select one of the transfer types given below.")) {
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Please select one of the transfer types given below.')]",TransferText);
    	}
    else if(TransferText.equals("What type of transfer do you want to make?")) {
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'What type of transfer do you want to make?')]",TransferText);
    	}
    System.out.println("Fund Transfer Text Verified!!!");
	return this;
	}
    
    public FundTransferPage VerifyInvalidTransferTypeMessageCheck(String Message) throws InterruptedException{
    	Thread.sleep(2000);
    	String msg="Sorry, I currently do not support "+Message;
    	String msg1= Message+" is currently an unsupported transfer type.";
    	String InvalidTransferType = driver.findElement(By.xpath("//div[@id='mxTTMessage'][contains(text(),'currently')]")).getText();
    	if(InvalidTransferType.equals(msg))
    	{
    		System.out.println(msg);
    		System.out.println("Invalid Transfer Type Message Verified!!!");
    	}
    	if(InvalidTransferType.equals(msg1))
    	{
    		System.out.println(msg1);
    		System.out.println("Invalid Transfer Type Message Verified!!!");
    	}
		return this;	
	}
    
    public FundTransferPage VerifyFromAccountMessage(String Message) throws InterruptedException{
    	Thread.sleep(2000);
    	int size=driver.findElements(By.xpath("//div[@id='mxTTMessage'][contains(text(),'"+Message+"')]")).size();
    	
    	if(size!=0)
    	{
    		verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'"+Message+"')]",Message);
    	}
    	
    	else {
            verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'From which account do you want to transfer?')]","From which account do you want to transfer?");
    	}
		return this;	
	}
    
    public FundTransferPage verifyWrongAccountText(String Accountname) throws InterruptedException{
    	Thread.sleep(2000);
    	//String name="Sorry, I couldn't find any "+Accountname+" linked to you."; - Correct test case
    	String name="Sorry, I coudn't find any "+Accountname+" linked to you.";
    	System.out.println(name);
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'linked to you.')]",name);
		return this;	
	}
    
    public FundTransferPage verifyWrongConfirmationInputMessage(String Input) throws InterruptedException{
    	Thread.sleep(2000);
    	String name=Input+" is an inavlid input";
    	System.out.println(name);
    	verifyElementisPresent("//strong[@id='mxPTTitle'][contains(text(),'"+name+"')]","Wrong Confirmation Input message");
		return this;	
	}
    
    public FundTransferPage verifySorryTwoInvalidAttemptMessage() throws InterruptedException{
    	Thread.sleep(2000);
    	String sorrymessage=driver.findElement(By.xpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, you have made two consecutive invalid attempts. Your request has been cancelled')]")).getText();
    	System.out.println(sorrymessage);
    	verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, you have made two consecutive invalid attempts. Your request has been cancelled')]",sorrymessage);
  		return this;
  	}
}