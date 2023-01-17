package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData1;


public class LoginPage  extends TestBase {
	
		@FindBy(xpath="//div[@class='bot_column']")private WebElement BotLogo;
		@FindBy(xpath="//div[@class='login_logo']")private WebElement TitalLogo;
		@FindBy(xpath="//input[@id='user-name']")private WebElement userNameInput;
		@FindBy(xpath="//input[@id='password']")private WebElement passwordInput;
		@FindBy(xpath="//input[@id='login-button']")private WebElement loginClick;
		@FindBy(xpath="//span[text()='Products']")private WebElement productTital;
		
		
//		driver.findelement(by.xpath)
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
	public  String veriftTital()
	{return driver.getTitle();

    }
	public  String verifyUrl()
	{ return driver.getCurrentUrl();
	
	}
	public  boolean verifyBotLog()
	{
	return	BotLogo.isDisplayed();
		
	}
	public boolean verifyTitalLogo()
	{
		return TitalLogo.isDisplayed();
	}
	
	public String verifyProductTital()
	{
	return productTital.getText();
		
	}
	
	public String loginPageFunctionality() throws Exception
	{
//		Thread.sleep(1000);
//		userNameInput.sendKeys("standard_user");
//		Thread.sleep(1000);
//		passwordInput.sendKeys("secret_sauce");
//		Thread.sleep(1000);
		/*userNameInput.sendKeys(ReadData1.readPropertyFile("username"));
		 * 
		Thread.sleep(1000);
		passwordInput.sendKeys(ReadData1.readPropertyFile("password"));
		Thread.sleep(1000);*/
		userNameInput.sendKeys(ReadData1.readExcelData(0,1));
		Thread.sleep(1000);
		passwordInput.sendKeys(ReadData1.readExcelData(1, 1));
		Thread.sleep(1000);
			
		loginClick.click();
		return driver.getCurrentUrl();
		
		
	}
	
		
}
