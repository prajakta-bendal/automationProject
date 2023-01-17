package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData1;

public class CheckOut_OnePage extends TestBase{
	@FindBy(xpath="//span[text()='Checkout: Your Information']")private WebElement checkOut;
	@FindBy(xpath="//input[@id='first-name']")private WebElement firstName;
	@FindBy(xpath="//input[@id='last-name']")private WebElement lastName;
	@FindBy(xpath="//input[@id='postal-code']")private WebElement postaCode;
	@FindBy(xpath="//button[@id='cancel']") private WebElement cancel;
	@FindBy(xpath="//input[@id='continue']")private WebElement continuebtn;
	
	
	
	public CheckOut_OnePage ()
	{
		PageFactory.initElements(driver,this);
	}
	public boolean verifyCheckoutText()
	{
	return checkOut.isDisplayed();
	}
	public void verifyInformationDetails() throws Exception
	{
		firstName.sendKeys("prajakta");
		lastName.sendKeys(ReadData1.readPropertyFile("lastName"));
		postaCode.sendKeys(ReadData1.readPropertyFile("PostalCode"));
	}
	public boolean verifyCancelBtnDisplay()
	{
		return cancel.isDisplayed();
	}
	public void verifyCancelBtnClick()
	{
		cancel.click();
	}
	public String verifyCancelBtnFunctionality()
	{
		return driver.getCurrentUrl();
	}
	public boolean verifyContiBtnDisplay()
	{
		return continuebtn.isDisplayed();
	}
	public void verifyContiBtnClick()
	{
		continuebtn.click();
	}
	public String verifyContiBtnFunctionality()
	{
		return driver.getCurrentUrl();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
