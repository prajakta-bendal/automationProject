package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckOut_TwoPage extends TestBase{
	@FindBy(xpath="//span[text()='Checkout: Overview']")private WebElement overview;
	@FindBy(xpath="//div[text()='Payment Information:']")private WebElement payment;
	@FindBy(xpath="//div[text()='SauceCard #31337']")private WebElement paymentInfo;
	@FindBy(xpath="//div[text()='Shipping Information:']")private WebElement shipping;
	@FindBy(xpath="//div[text()='FREE PONY EXPRESS DELIVERY!']")private WebElement shippingInfo;
	@FindBy(xpath="//button[@id='cancel']")private WebElement cancel;
	@FindBy(xpath="//button[@id='finish']")private WebElement finish;
	
	public CheckOut_TwoPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyOverViewText()
	{
		return overview.isDisplayed();
				}
	public boolean verifyPaymentText()
	{
		return payment.isDisplayed();
				}
	public boolean verifyPymentInfoText()
	{
		return paymentInfo.isDisplayed();
				}
	public boolean verifyShippingText()
	{
		return shipping.isDisplayed();
				}
	public boolean verifyShippingInfoText()
	{
		return shippingInfo.isDisplayed();
				}
	public boolean verifyCancelBtn()
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
	public boolean verifyfinishBtnDisplay()
	{
		return finish.isDisplayed();
	}
	public void verifyfinishBtnClick()
	{
		finish.click();
	}
	public String verifyfinishBtnFunctionality()
	{
		return driver.getCurrentUrl();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
