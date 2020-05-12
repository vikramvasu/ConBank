package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

public class LocatorPage extends wrappers.ProjectWrappers  {

	public LocatorPage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
	}
	
	public LocatorPage verifyWelcomeText(String Input) throws InterruptedException {
		Thread.sleep(1000);
		verifyTextByXpath("(//div[@class='mxWelcomeTemp'])[1]",Input);
		return this;
	}
	
	public LocatorPage verifyLocatorIcon(String IconName) throws InterruptedException {
		Thread.sleep(1000);
		verifyElementisPresent("//img[@alt='Locator']",IconName);
		System.out.println("Locator Icon Verified!");
		return this;
	}
	
	public LocatorPage EnterUserName(String UserName){
		enterByXpath("//input[@formcontrolname='userId']",UserName);
		return this;
	}
	
	public LocatorPage EnterPassword(){
		enterByXpath("//input[@formcontrolname='passwd']","Tagit@123");
		return this;
	}
	
	public LocatorPage verifyWelcomeUserName(String Input) throws InterruptedException {
		Thread.sleep(2000);
		verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Welcome')]","Welcome "+Input);
		return this;
	}
	
	public LocatorPage ClickLoginButton(){
		clickByXpath("//span[@class='mat-button-wrapper'][contains(text(),'Login')]");
		return this;
	}
	
   public LocatorPage ClickLogin(){
		clickByXpath("//span[text()='LOGIN']");
		return this;
	}
   
   public LocatorPage ClickSplashLogo(){
		clickByXpath("//img[@class='splash-logo']");
		driver.switchTo().frame(0);
		return this;
	}
      
   public LocatorPage ClickLocator(){
		clickByXpath("//img[@alt='Locator']");
		return this;
	}
   
   public LocatorPage ClickWelcomeDropDownArrow() throws InterruptedException{
	    Thread.sleep(1000);
		clickByXpath("(//span[@class='mat-button-wrapper'])[4]");
		return this;
	} 

   public LocatorPage ClickLocatorFromDropDownArrow() throws InterruptedException{
	    Thread.sleep(1000);
		clickByXpath("//img[@class='ng-tns-c1-0'][@alt='Locator']");
		return this;
	} 
   
   public LocatorPage ScrollUpForLocatorIcon() throws InterruptedException{
	   Thread.sleep(1000);
	   scrollUp("//img[@alt='Locator']");
		return this;
	}
    
   public LocatorPage ScrollDownForLocatorIcon() throws InterruptedException{
	   Thread.sleep(1000);
	   scrollDown("//img[@alt='Locator']");
		return this;
	}
   
    public LocatorPage EnterText(String Input) throws InterruptedException{
		enterByXpath("//textarea[@id='chatInputText']",Input);
		Thread.sleep(1000);
	   	clickByXpath("//button[@id='chatSubmit']");
		return this;
	}
    
    public LocatorPage verifylocatorText(String Input) throws InterruptedException {
    	Thread.sleep(2000);
	    verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Please select an option to help you with your request')]",Input);
	    return this;
	}
   
    public LocatorPage verifyLocatorTypes(String locType){
    	verifyElementisPresent("//div[@id='mxCPTTitle'][contains(text(),'"+locType+"')]",locType);
		return this;	
	}
    
    public LocatorPage clickLocType(String locType) {
    	clickByXpath("//div[@id='mxCPTTitle'][contains(text(),'"+locType+"')]");
	    return this;
	}
    
    public LocatorPage clickShareLoc() {
    	clickByXpath("//span[contains(text(),'Share Location')]");
    	System.out.println("Share Location button clicked!!!");
	    return this;
	}
    
    public LocatorPage acceptAlertForLoc() {
    	acceptAlert();
	    return this;
	}
     
    public LocatorPage ScrollDownToViewATMorBranch() throws InterruptedException {
    	Thread.sleep(3000);
    	scrollDown("//h4[@id='mxGPTFootTitle']");
    	return this;
    }
    
    public LocatorPage verifyATMListTitle(String ATMlisTitle) throws InterruptedException{
    	Thread.sleep(5000);
    	verifyTextByXpath("//h4[@id='mxGPTFootTitle'][contains(text(),'"+ATMlisTitle+"')]",ATMlisTitle);
		return this;	
	}
    
    public LocatorPage verifyBranchListTitle(String BranchlisTitle) throws InterruptedException{
    	Thread.sleep(5000);
    	verifyTextByXpath("//h4[@id='mxGPTFootTitle'][contains(text(),'"+BranchlisTitle+"')]",BranchlisTitle);
		return this;	
	}

    public LocatorPage ClickGetHours(String name){
    	clickByXpath("//h4[@id='mxGPTFootTitle'][text()='"+name+"']//ancestor::div[@class='mxCardFooterContainer ng-star-inserted']/following-sibling::div/div/a/span[contains(text(),'Get Hours')]");
		return this;
	}
    
    public LocatorPage ClickNextArrow(){
    	clickByXpath("//span[@aria-label='Next']");
		return this;
	}

    public LocatorPage verifyATMGetHoursText(String ATMGetHr) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@id='mxTTMessage'][text()='Working HRs: 9:00 am - 6:00 pm']",ATMGetHr);
		return this;	
	}
  
    public LocatorPage verifyWrongInputText(String wrnginp) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Sorry! requested location is not available. Try again with another location.')]",wrnginp);
		return this;	
	}
    
    public LocatorPage verifyWrongInputTextTwice(String wrnginp) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.')]",wrnginp);
		return this;	
	} 
    
    public LocatorPage verifyShareLocText(String shareLocText) throws InterruptedException{
    	Thread.sleep(2000);
    	verifyTextByXpath("//strong[@class='mxWelcomeTemp'][contains(text(),\"You can type a street address, neighborhood, city, postal code or use the button below.To exit the branch finder type 'cancel'.\")]",shareLocText);
		return this;	
	}
 
    public LocatorPage verifyAnythingElseText(String Input) throws InterruptedException{
    	Thread.sleep(2000);
	    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Is there anything else')]",Input);
	    return this;
	}
  
}
