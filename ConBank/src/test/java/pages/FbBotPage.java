package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

public class FbBotPage extends wrappers.ProjectWrappers  {

	public FbBotPage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
	}
		
	public FbBotPage FBUserName(){
		enterByXpath("//input[@id='email']","cbp.dev@tagitmobile.com");
		return this;
	}
	
	public FbBotPage FBPassword(){
		enterByXpath("//input[@id='pass']","Tagit@2019");
		return this;
	}
	
	public FbBotPage verifyFbBotName(String Input) {
		verifyTextByXpath("//span[@class='_3oh-'][contains(text(),'Mia QA')]",Input);
		return this;
	}
	
	public FbBotPage FbLoginBtn(){
		clickByXpath("//button[@id='loginbutton']");
		return this;
	}

	public FbBotPage verifyWelcomeUserName(String Input) {
		verifyTextByXpath("//div[@class='mxWelcomeTemp'][contains(text(),'Welcome')]","Welcome "+Input);
		return this;
	}
	
    public FbBotPage EnterText(String Input) throws InterruptedException{
    	/*Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='_1mf _1mj']")));
        actions.click();
        actions.sendKeys("Hi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='_1mf _1mj']")).sendKeys(Keys.ENTER);
        actions.build().perform();
        return this;*/
    	
    	clickByXpath("//div[@class='_1mf _1mj']");
    	enterByXpath("//div[@class='_1mf _1mj']",Input);
		Thread.sleep(1000);
	   	clickByXpath("//a[@class='_30yy _38lh _7kpi']");
		return this;
	}
    
 }
