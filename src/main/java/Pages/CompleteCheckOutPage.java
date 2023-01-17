package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CompleteCheckOutPage  extends TestBase{
	@FindBy(xpath="//span[text()='Checkout: Complete!']")private WebElement completeText;
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")private WebElement thankYou;
	@FindBy(xpath="//img[@class='pony_express']")private WebElement ponyExpressLogo;
	@FindBy(xpath="//button[@class='btn btn_primary btn_small']")private WebElement backHomeBtn;
	
//	public CompleteCheckOutPage()
	{
//		PageFactory.initElements(driver, this);
	}
	public String verifyCompleteLink()
	{
		return driver.getCurrentUrl();
	}
	public boolean verifyCompleteText()
	{
		return completeText.isDisplayed();
				} 
	public boolean verifyThankUText()
	{
		return thankYou.isDisplayed();
				} 
	public boolean verifyPonyExpressLogo()
	{
		return ponyExpressLogo.isDisplayed();
	}
	public boolean verifyBackHomeBtn()
	{
		return backHomeBtn.isDisplayed();
	}
	public void verifyBackHomeBtnClick()
	{
		completeText.click();
	}
	public String verifyBackHomeBtnClickFuctionality()
	{
		return driver.getCurrentUrl();
		
	}
	
	
	
	
	
	
	
	

}
