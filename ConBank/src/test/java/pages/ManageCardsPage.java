package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;


public class ManageCardsPage extends wrappers.ProjectWrappers  {

	public ManageCardsPage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
	}

	public ManageCardsPage EnterUserName(String username) throws InterruptedException {
		Thread.sleep(2000);
		enterByXpath("//input[@formcontrolname='userId']",username);
		return this;
	}
	
	public ManageCardsPage EnterPassword(String password){
		enterByXpath("//input[@formcontrolname='passwd']",password);
		return this;
	}
	
	public ManageCardsPage ClickLoginButton(){
		
		clickByXpath("//span[text()='LOGIN']");
		return this;
	}
	
    public ManageCardsPage ClickLogin(){
		
		clickByXpath("//span[text()=' Login ']");
		return this;
	}
   
    public ManageCardsPage ClickSplashLogo() throws InterruptedException{
		clickByXpath("//img[@class='splash-logo']");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		return this;
	}
      
    public ManageCardsPage ClickAccountBalanceLogo() {
		clickByXpath("(//img[@alt='Account Balance']");
		return this;
	}
    
    public ManageCardsPage clickFundtransferLogo(){
		clickByXpath("//img[@alt='Funds Transfer']");
		return this;
	}
    
    public ManageCardsPage clickChequeBookRequestLogo(){
		clickByXpath("//img[@alt='Cheque Book Request']");
		return this;
	}
    
    public ManageCardsPage clickProductsAndServicesLogo(){
		clickByXpath("//img[@alt='Products and Services']");
		return this;
	}
    
    public ManageCardsPage clickPayCreditCardLogo(){
		clickByXpath("//img[@alt='Pay Credit Card']");
		return this;
	}
    
    public ManageCardsPage clickRechargeLogo(){
		clickByXpath("//img[@alt='Recharge']");
		return this;
	}
    
    public ManageCardsPage clickManageCardsLogo(){
		clickByXpath("//img[@alt='Manage Cards']");
		return this;
	}
    
    public ManageCardsPage clickStatementRequestLogo(){
		clickByXpath("//img[@alt='Statement Request']");
		return this;
	}
    
    public ManageCardsPage EnterTextArea(String Input) throws InterruptedException {
    	enterByXpath("//textarea[@id='chatInputText']",Input);
    	Thread.sleep(1000);
    	clickByXpath("//button[@id='chatSubmit']");
		return this;
	}
    
    public ManageCardsPage verifyWelcomeText(String Input) throws InterruptedException {
    	Thread.sleep(2000);
    	verifyTextByXpath("(//div[@class='mxWelcomeTemp'])[1]",Input);
		return this;
	}
	
    public ManageCardsPage verifyWelcomeUserName(String Input) throws InterruptedException {
    	Thread.sleep(2000);
		verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Welcome')]","Welcome "+Input);
		return this;
	}
    
    
    public ManageCardsPage verifyTransferMessage() throws InterruptedException {
    	Thread.sleep(2000);
		verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'What type of transfer do you want to make?')]","What type of transfer do you want to make?");
		return this;
	}
      
    public ManageCardsPage clickToOtherAccount(){
		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(), 'To Other Account ')]");
		return this;
	}
    
    public ManageCardsPage clickToOwnAccount(){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(), 'To Own Account ')]");
  		return this;
  	}
    
    public ManageCardsPage clickaXcessPlusAccount(){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'aXcessPlus Account')]");
  		return this;
  	}
    
    public ManageCardsPage clickSuperValueAccount(){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'SuperValue Account')]");
  		return this;
  	}
    
    public ManageCardsPage clickRegularCurrentAccount(){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'Regular Current Account')]");
  		return this;
  	}
      
    public ManageCardsPage clickConfirmButton(){
  		clickByXpath("//button/span[contains(text(),'Confirm')]");
  		return this;
  	}
      
    public ManageCardsPage clickCancelButton(){
  		clickByXpath("//button/span[contains(text(),'Cancel')]");
  		return this;
  	}
    
    public ManageCardsPage clickRefreshButton(){
  		clickByXpath("//mat-icon[contains(text(),'refresh')]");
  		return this;
  	}
      
    public ManageCardsPage clickYesButton(){
  		clickByXpath("//button/span[contains(text(),'YES')]");
  		return this;
  	}
      
    public ManageCardsPage clickNoButton(){
  		clickByXpath("//button/span[contains(text(),'NO')]");
  		return this;
  	}
    
    public ManageCardsPage clickBeneficiaryName(String Name){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'"+Name+"')]");
  		return this;
  	}
    
    //-------------------------------------------------------------
    
    public ManageCardsPage VerifyCheckBookRequestClientMessage(String Message) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyElementisPresent("//div[@class='mxClientMsgBlock'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}
        
    public ManageCardsPage ScrollDown() throws InterruptedException{
    	Thread.sleep(2000);
    	scrollDown("//img[@alt='Manage Cards']");
		return this;	
	}
    
    public ManageCardsPage Scrollup(){
    	scrollUp("//img[@alt='Manage Cards']");
		return this;	
	}
    
    public ManageCardsPage VerifyManageCardClientMessage(String Message) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'"+Message+"')]",Message);
		return this;	
	}
    
    public ManageCardsPage VerifyBlockIcon(){
    	verifyElementisPresent("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'Block')]","Block Icon");
		return this;	
	}
    
    public ManageCardsPage VerifyUnBlockIcon(){
    	verifyElementisPresent("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'Unblock')]","UnBlock Icon");
		return this;	
	}
    
    public ManageCardsPage clickBlockIcon(){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'Block')]");
  		return this;
  	}
    
    public ManageCardsPage clickUnBlockIcon(){
  		clickByXpath("//div[@class='mxChipTitle ng-star-inserted'][contains(text(),'Unblock')]");
  		return this;
  	}
    
    public ManageCardsPage clickBlockButton(String cardname){
  		clickByXpath("//h4[contains(text(),'"+cardname+"')]/../../following-sibling::div/div/button");
  		return this;
  	}
    
    public ManageCardsPage clickUnBlockButton(String cardname){
  		clickByXpath("//h4[contains(text(),'"+cardname+"')]/../../following-sibling::div/div/button");
  		return this;
  	}
    
    public ManageCardsPage VerifyCardIsPresent(String cardname){
    	verifyElementisPresent("//h4[contains(text(),'"+cardname+"')]",cardname);
  		return this;
  	}
    
    public ManageCardsPage VerifyManageCardConfirmationMessage(String Message,String cardname) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyTextByXpath("//strong[@class='mxWelcomeTemp'][contains(text(),'"+Message+"')]",Message+" "+cardname);
		return this;	
	}
    
    public ManageCardsPage VerifyManageCardNotAbleToFindCardMessage(String Message,String cardname) throws InterruptedException{
    	Thread.sleep(2000);
    	String name=Message+" "+cardname+" to block.";
    	System.out.println(name);
    	verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'"+name+"')]",name);
		return this;	
	}
    
    public ManageCardsPage VerifyManageCardNotAbleToFindUnblockCardMessage(String input,String cardname) throws InterruptedException{
    	Thread.sleep(2000);
    	String name=input+" is an invalid input. Please select confirm to unblock your "+cardname+" or cancel to abort.";
    	System.out.println(name);
    	verifyTextByXpath("//strong[@class='mxWelcomeTemp'][contains(text(),'"+name+"')]",name);
		return this;	
	}
    
    public ManageCardsPage VerifyManageCardInvalidInputCardMessage(String Message,String cardname,String input) throws InterruptedException{
    	Thread.sleep(2000);
    	String name=input+" "+Message+" "+cardname+" or cancel to abort.";
    	System.out.println(name);
    	verifyTextByXpath("//strong[@class='mxWelcomeTemp'][contains(text(),'"+name+"')]",name);
		return this;	
	}
}