package Pages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.UtilityMethod;
import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class InventoryPage extends TestBase{
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/div[1]")private WebElement smallBot;
	@FindBy(xpath ="//button[text()='Open Menu']")private WebElement openMenu;
	@FindBy(xpath="//a[text()='Twitter']")private WebElement twitterLogo;
	@FindBy(xpath ="//a[text()='Facebook']")private WebElement facebookLogo;
	@FindBy(xpath="//a[text()='LinkedIn']")private WebElement linkdinLogo;
	@FindBy(xpath ="//img[@class='footer_robot']")private WebElement footerLogo;
	@FindBy(xpath ="//img[@class='footer_robot']")private WebElement footercopy;
	@FindBy(xpath="//select[@class='product_sort_container']")private WebElement nameAtoZList;
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-backpack']")private WebElement bagPack;
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-onesie']")private WebElement onesie;
	@FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement addToCart;
	public InventoryPage()
	{//a[@class='shopping_cart_link']
		PageFactory.initElements(driver,this);
	}
	
	
	public String verifyCurrentUrl() throws Exception

		{ return driver.getCurrentUrl();
		}
	public boolean verifySmallBot()
	{
	return smallBot.isDisplayed(); }
	
	public boolean verifyOpenMenuButton()
	{
		return openMenu.isDisplayed();
	}
	
	public boolean veriftwitterbtn()
	{
		return twitterLogo.isDisplayed();
		
	}
	public boolean verifyfacebookLogobtn()
	{
		return facebookLogo.isDisplayed();
		
	}
	public boolean verifylinkdinLogoBtn()
	{
		return linkdinLogo.isDisplayed();
		
	}
	public boolean verifyfooterLogobtn()
	{
		return footerLogo.isDisplayed();
		
	}
	public boolean verifyfooterCopyLine()
	{
		return footercopy.isDisplayed();
		
	}
	public void verifyNameList() throws Exception
	{
//		Select s = new Select(nameAtoZList);
//		s.selectByVisibleText("Name (Z to A)");
		UtilityMethod.selectClass(nameAtoZList, "Name (Z to A)");
		Thread.sleep(3000);
		
	}
	public void addProduct()
	{
		bagPack.click();
		onesie.click();
		
	}
	
	public void verifyAddToCart()
	{
		addToCart.click();
		
	}
	

	
	
	
	
}
