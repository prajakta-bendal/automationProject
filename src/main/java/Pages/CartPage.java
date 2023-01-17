package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase{
	@FindBy(xpath="//span[text()='Your Cart']")private WebElement yCart;
	@FindBy(xpath="//div[text()='QTY']")private WebElement quality;
	@FindBy(xpath="//div[text()='DESCRIPTION']")private WebElement discription;
	@FindBy(xpath="//button[@name='continue-shopping']")private WebElement continuebtn;
	@FindBy(xpath="//button[@name='checkout']")private WebElement checkoutbtn;
	@FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement cartbtn;
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")private WebElement removeProduct;
	
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	 public String verifyCartPageUrl()
	 {
		return driver.getCurrentUrl(); }
	 
	 public boolean verifyYourCartText()
	 {	return yCart.isDisplayed();
	 }
	 public boolean verifyQuslityText()
	 {
		 return quality.isDisplayed();
	 }
	 public boolean verifyDiscText()
	 {
		 return discription.isDisplayed();
	 }
	public boolean verifyContinueBtn()
	{
		return continuebtn.isDisplayed();
	}
	public boolean verifycheckoutbtnDisplay()
	{
		return checkoutbtn.isDisplayed();
	}
	public boolean verifyCartBtn()
	{
		return cartbtn.isDisplayed();
		
	}
	public String verifyCountOfCart()
	{
		return cartbtn.getText();
	}
	public void verifyContinueBtnClick()
	{
		continuebtn.click();
	}
	public String verifyContinueBtnLink()
	{
	return driver.getCurrentUrl();
	}
	public void verifyRemoveBtn()
	{
		removeProduct.click();
	}
	public String verifyRemoveBtnFunctionality()
	{
		return cartbtn.getText();
	}
	public void verifyCheckOutBtn()
	{
		checkoutbtn.click();
	}
	public String verifyCheckOutBtnClick()
	{
		return driver.getCurrentUrl();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
