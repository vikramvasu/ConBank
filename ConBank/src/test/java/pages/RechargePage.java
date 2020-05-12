package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;


public class RechargePage extends wrappers.ProjectWrappers  {

	public RechargePage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
	}
	
	public RechargePage verifyWelcomeText(String Input) throws InterruptedException {
		Thread.sleep(1000);
		verifyTextByXpath("//div[@class='mxWelcomeTemp']",Input);
		return this;
		}
		
		public RechargePage ClickSplashLogo() throws InterruptedException{
		Thread.sleep(2000);
		clickByXpath("//img[@class='splash-logo']");
		driver.switchTo().frame(0);
		return this;
		}

		public RechargePage scrollDownforRechargeIcon(){
		scrollDown("//img[@alt='Recharge']");
		return this;
		}
		
		public RechargePage clickRechargeLogo(){
		clickByXpath("//img[@alt='Recharge']");
		System.out.println("Recharge Icon is Clicked!!");
		return this;
		}
		
		public RechargePage verifyRechargeIcon(String IconName) {
		verifyElementisPresent("//img[@alt='Recharge']",IconName);
		return this;
		}
		
		public RechargePage EnterText(String Input) throws InterruptedException{
		enterByXpath("//textarea[@id='chatInputText']",Input);
		Thread.sleep(1000);
	   	clickByXpath("//button[@id='chatSubmit']");
		return this;
		}
		
		public RechargePage ClickLoginButton(){
		clickByXpath("//span[@class='mat-button-wrapper'][contains(text(),'Login')]");
		return this;
		}
		
		public RechargePage EnterUserName(String User) {
		enterByXpath("//input[@formcontrolname='userId']",User);
		return this;
		}
		
		public RechargePage EnterPassword(){
		enterByXpath("//input[@formcontrolname='passwd']","Tagit@123");
		return this;
		}
		
		public RechargePage ClickLogin(){
		clickByXpath("//span[text()='LOGIN']");
		return this;
		}
	   
	    public RechargePage verifyWelcomeUserName(String Input) throws InterruptedException {
	    Thread.sleep(2000);
	    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Welcome')]","Welcome "+Input);
		return this;
		}
	    
	    public RechargePage verifyValidSelectAccountText(String SelectAccountText) throws InterruptedException{     
	   	Thread.sleep(2000);
	    verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Please select the account from below to continue your recharge')]",SelectAccountText);
	    return this;
	    } 
	    
	    public RechargePage selectDebitAccountText(String SelectSavingsAccountText) throws InterruptedException{     
	   	Thread.sleep(2000);
	    verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Here are your savings and checking account')]",SelectSavingsAccountText);
		System.out.println("Debit Card Type Text Verified!!!"); //SuperValue and aXcess Account
		return this;
	    }
	    
	    public RechargePage selectCreditAccountText(String SelectSavingsAccountText) throws InterruptedException{     
	   	Thread.sleep(2000);
	   	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Here are your credit account')]",SelectSavingsAccountText);
		System.out.println("Credit Card Type Text Verified!!!"); //SuperValue and aXcess Account
		return this;
		}
	    
	    public RechargePage VerifyAccount(String VerifyAccount) throws InterruptedException{
	    Thread.sleep(2000);
	    verifyTextByXpath("//div[@id='mxCPTTitle'][contains(text(),'"+VerifyAccount+"')]",VerifyAccount);
	    return this;
	    }
	    
	    public RechargePage SelectAccount(String SelectAccount){
	    clickByXpath("//div[@id='mxCPTTitle'][contains(text(),'"+SelectAccount+"')]");
	    return this;
	    }
	    
	    public RechargePage verifyMobileText(String MobileText) throws InterruptedException{     
	    Thread.sleep(2000);
	   	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Please enter the mobile number you wish to recharge')]",MobileText);
		System.out.println("Mobile Number Text Verified!!!");
		return this;
		}
	    
	    public RechargePage verifyMobileOperatorText(String MobileOperatorText) throws InterruptedException{     
	   	Thread.sleep(2000);
	   	verifyTextByXpath("//strong[@id='mxPTTitle'][contains(text(),'looks like an Aircel number')]",MobileOperatorText);
		System.out.println("Mobile Operator Text Verified!!!");
		return this;
		}
    
	    public RechargePage confirmOperatorText(){
		clickByXpath("//span[@class='mat-button-wrapper'][contains(text(),'YES')]");
		System.out.println("YES button clicked for Operator!!!");
		return this;
		}
	    
	    public RechargePage clickNOforOperator(){
		clickByXpath("//span[@class='mat-button-wrapper'][contains(text(),'NO')]");
		System.out.println("No button clicked for Operator!!!");
		return this;
	    }
	    
	    public RechargePage verifyselectOperatorText(String selectOperator) throws InterruptedException{     
	   	Thread.sleep(2000);
	    verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Please Choose an operator below')]",selectOperator);
		System.out.println("Select Operator Text Verified!!!");
		return this;
		}
	    
	   public RechargePage verifyWrongOperatorText() throws InterruptedException{
		   Thread.sleep(2000);
		   String OperatorText = driver.findElement(By.xpath("//div[@id='mxTTMessage'][contains(text(),'operator')]")).getText();
	    if(OperatorText.equals("The entered mobile operator does not exists please select from below")) {
	    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'The entered mobile operator does not exists please select from below')]",OperatorText);
	    	}
	    else if(OperatorText.equals("Sorry, I could not find the operator for the given number")) {
	    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Sorry, I could not find the operator for the given number')]",OperatorText);
	    	}
	    System.out.println("Wrong Operator Text Verified!!!");
		return this;
		}
	    
	    public RechargePage clickAircelOperator(){
		clickByXpath("//img[@src='https://d6hk2iz63gg1u.cloudfront.net/genie/externalassets/images/recharges/img_aircel.png']");
		System.out.println("Aircel Operator clicked!!!");
		return this;
	    }
	    
	    public RechargePage clickJioOperator(){
		clickByXpath("//img[@src='https://d6hk2iz63gg1u.cloudfront.net/genie/externalassets/images/recharges/img_gio.png']");
		System.out.println("Jio Operator clicked!!!");
		return this;
		}
	    
	    public RechargePage clickBSNLOperator(){
		clickByXpath("//img[@src='https://d6hk2iz63gg1u.cloudfront.net/genie/externalassets/images/recharges/img_bsnl.png']");
		System.out.println("BSNL Operator clicked!!!");
		return this;
		}
	    
	    public RechargePage clickAirtelOperator(){
		clickByXpath("//img[@src='https://d6hk2iz63gg1u.cloudfront.net/genie/externalassets/images/recharges/img_airtel.png']");
		System.out.println("Airtel Operator clicked!!!");
		return this;
		}

	    public RechargePage verifyMinAmountText(String minAmountText) throws InterruptedException{     
	   	Thread.sleep(2000);
	   	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Minimum recharge amount is 10. Please proceed with recharge of 10 or more than 10')]",minAmountText);
		System.out.println("Negative and Zero Amount Text Verified!!!");
		return this;
		}
	  
	    public RechargePage verifyAmountText(String AmountText) throws InterruptedException{     
	   	Thread.sleep(2000);
	    verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Please enter the amount you want to recharge')]",AmountText);
		System.out.println("Amount Text Verified!!!");
		return this;
		}
	    
	    public RechargePage verifyConfirmRechargeText(String MobileNumber) throws InterruptedException{     
	   	Thread.sleep(2000);
	    String CofirmRechargeText = driver.findElement(By.xpath("(//strong[@id='mxPTTitle'][contains(text(),'"+MobileNumber+"')])[2]")).getText();
	    System.out.println(CofirmRechargeText);
	    verifyTextByXpath("(//strong[@id='mxPTTitle'][contains(text(),'"+MobileNumber+"')])[2]",CofirmRechargeText);
		System.out.println("Confirm Recharge Text Verified!!!");
		return this;
		}
	    	    
	    public RechargePage confirmRechargeText(){
		clickByXpath("(//span[@class='mat-button-wrapper'][contains(text(),'YES')])[2]");
		System.out.println("Confirm Recharge button Clicked!!!");
		return this;
		}
	    
	    public RechargePage cancelRechargeText(){
		clickByXpath("(//span[@class='mat-button-wrapper'][contains(text(),'NO')])[2]");
		System.out.println("Confirm Recharge button Clicked!!!");
		return this;
		}
	    
	    public RechargePage verifyOTPText() throws InterruptedException{
	   	Thread.sleep(2000);
	    String OTPText = driver.findElement(By.xpath("//div[@id='mxTTMessage'][contains(text(),'OTP')]")).getText();
	    if(OTPText.equals("Enter the OTP you have received to your registered mobile.")) {
	    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Enter the OTP you have received to your registered mobile.')]",OTPText);
	    	}
	    else if(OTPText.equals("Please enter your OTP to continue Recharge")) {
	    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Please enter your OTP to continue Recharge')]",OTPText);
	    	}
	    System.out.println("OTP Text Verified!!!");
		return this;
		}
	  
	    public RechargePage verifySuccessText() throws InterruptedException{     
		Thread.sleep(2000);
		verifyElementisPresent("//div[@id='mxSTTitle'][contains(text(),'Your transaction was successful')]","SuccessText");
		System.out.println("Successful Text Verified!!!");
		return this;
		}
	    
	    public RechargePage verifyCancelText(String CancelText) throws InterruptedException{   
	    Thread.sleep(2000);
		verifyTextByXpath("//div[@class='mx-statusTitle cancelStatusTitle'][contains(text(),'Your request has been cancelled.')]",CancelText);
		System.out.println("Cancel Text Verified!!!");
		return this;
		}
	    
	    public RechargePage verifyWrongAccountText(String Accountname) throws InterruptedException{
	    	Thread.sleep(2000);
	    	String name="Sorry I couldn't find any "+Accountname+" account.";
	    	System.out.println(name); 
	    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'"+Accountname+"')]",name);
			return this;	
		}
	    
	    public RechargePage verifyWrongAccountNumberText(String AccountNum) throws InterruptedException{
	    	Thread.sleep(2000);
	    	String name="Sorry I couldn't find any account ending "+AccountNum+".";
	    	System.out.println(name);
	    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'"+AccountNum+"')]",name);
			return this;	
		}
	    
	    public RechargePage verifySelectAccountText(String SelectAccountText) throws InterruptedException{     
	   	Thread.sleep(2000);
	    verifyTextByXpath("(//div[@id='mxTTMessage'][contains(text(),'Please select the account from below to continue your recharge')])[2]",SelectAccountText);
		System.out.println("Wrong Account Text Verified!!!");
		return this;
	    }
	    
	    public RechargePage verify2InvalidInput(String InvalidInput) throws InterruptedException {
	    Thread.sleep(2000);
	    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Sorry, you have made two consecutive invalid attempts. Your request has been cancelled.')]",InvalidInput);
	    System.out.println("2 Invalid Input Text Verified!!!");
	    return this;
	    }
	    
	    public RechargePage verifyAnythingElseText(String Input) throws InterruptedException {
	   	Thread.sleep(2000);
	    verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Is there anything else')]",Input);
	    System.out.println("Anything else Text Verified!!!");
	    return this;
	    }
	    
	    public RechargePage verifyInvalidMobileText(String InvalidMobileText) throws InterruptedException {
	   	Thread.sleep(2000);
	    verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'The entered mobile number is invalid. Please enter the 10 digit mobile number you wish to recharge.')]",InvalidMobileText);
		System.out.println("Invalid Mobile Text Verified!!!");
		return this;
		}
	    
	    public RechargePage verifyInvalidMobileOperatorText(String InvalidMobileOperatorText) throws InterruptedException {
	   	Thread.sleep(2000);
	    verifyTextByXpath("//strong[@id='mxPTTitle'][contains(text(),'Given input for Operator Prediction is not valid. Please Choose an operator below')]",InvalidMobileOperatorText);
		System.out.println("Invalid Mobile Operator Text Verified!!!");
		return this;
		}
	    	    
	    public RechargePage verifyInvalidAmountText(String InvalidAmountText) throws InterruptedException{     
	   	Thread.sleep(2000);
	    String InvalidAmount = driver.findElement(By.xpath("//div[@id='mxTTMessage'][contains(text(),'"+InvalidAmountText+"')]")).getText();
		System.out.println(InvalidAmount);
		verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'"+InvalidAmountText+"')]",InvalidAmount);
		System.out.println("Invalid Amount Text Verified!!!");
		return this;
		}
	    
	    public RechargePage verifyInsufficientAmountText(String InsufficientAmountText) throws InterruptedException {
	    	Thread.sleep(2000);
	    	verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'The selected account do not have sufficient funds to complete recharge. Please enter a lesser amount')]",InsufficientAmountText);
			System.out.println("Insufficient Balance Text Verified!!!");
			return this;
		}
	    	  
	    public RechargePage verifyWrongConfirmationInputText(String WrongConfirmationInputText) throws InterruptedException{     
	    	Thread.sleep(2000);
	    	String wrongInput = driver.findElement(By.xpath("//strong[@id='mxPTTitle'][contains(text(),'"+WrongConfirmationInputText+"')]")).getText();
		    System.out.println(wrongInput);
		    verifyTextByXpath("//strong[@id='mxPTTitle'][contains(text(),'"+WrongConfirmationInputText+"')]",wrongInput);
			System.out.println("Wrong Confirmation Text Verified!!!");
			return this;
			}
	   
	    public RechargePage verifyWrongOTPInputText(String WrongOTPText) throws InterruptedException {
	   	Thread.sleep(2000);
	    verifyTextByXpath("//div[@id='mxTTMessage'][contains(text(),'Entered OTP is invalid, Please re-enter.')]",WrongOTPText);
		System.out.println("Invalid Mobile Operator Text Verified!!!");
		return this;
		}
	    
	    public RechargePage verifySuccessIcon(){
	    	verifyElementisPresent("//mat-icon[@class='mat-icon material-icons mat-icon-no-color'][text()='done']","Success ICON");
	  		return this;
	  	}
	    
	    public RechargePage verifyCancellationIcon(){
	    	verifyElementisPresent("//mat-icon[@class='mat-icon material-icons mat-icon-no-color'][text()='priority_high']","Cancellation ICON");
	  		return this;
	  	}
	   
	    
}