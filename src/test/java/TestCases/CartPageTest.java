package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CartPageTest extends TestBase{
	CartPage cart;
	InventoryPage inventory;
	LoginPage login;
	@BeforeMethod(alwaysRun = true)
	public void setup() throws Exception
	{
		initilization();
		login = new LoginPage();
		inventory= new InventoryPage();
		cart= new CartPage();
		login.loginPageFunctionality();
		inventory.addProduct();
		Thread.sleep(3000);
		inventory.verifyAddToCart();
		Thread.sleep(3000);
		
		
		}
	@Test(groups = "sanity")
	public void verifyCartPageUrlTest()
	{	
		String act = cart.verifyCartPageUrl();
		String exp = "https://www.saucedemo.com/cart.html";
		Assert.assertEquals(act, exp);
			}
	@Test(groups = "smoke")
	public void verifyYourCartTextTest()
	{
		boolean result = cart.verifyYourCartText();
		Assert.assertEquals(result, true);
	}
	@Test (groups = "smoke")
	public void verifyQuslityTextTest()       
	{
		 boolean result = cart.verifyQuslityText();
		 Assert.assertEquals(result, true); }
//	@Test
	public void verifyDiscTextTest()
	{
		boolean result = cart.verifyDiscText();
		Assert.assertEquals(result, true);
	}
//	@Test
	public void verifyContinueBtnTest()
	{
	boolean result = cart.verifyContinueBtn();
	Assert.assertEquals(result, true);
		
	}
//	@Test
	public void verifycheckoutbtnDisplay()
	{
		boolean prajakta = cart.verifycheckoutbtnDisplay();
		Assert.assertEquals(prajakta, true);
			}
//	@Test
	public void verifyCartBtnTest()
	{
		boolean result = cart.verifyCartBtn();
		Assert.assertEquals(result, true);
		
	}
//	@Test
	public void verifyCountOfCartTest()
	{
		String act = cart.verifyCountOfCart();
		String exp = "2";
		Assert.assertEquals(act, exp);
	}
//	@Test
	public void verifyContinueBtnClickTest()
	{
			cart.verifyContinueBtnClick();
			}
//	@Test
	public void verifyContinueBtnLinkTest()
	{
		cart.verifyContinueBtnClick();
		String act = cart.verifyContinueBtnLink();
		String exp = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(act, exp);
	}
//	@Test
	public void verifyRemoveBtnTest()
	{
		cart.verifyRemoveBtn();
	}
//	@Test
	public void verifyRemoveBtnFunctionalityTest()
	{
		cart.verifyRemoveBtn();
	String act = cart.verifyRemoveBtnFunctionality();
	String exp = "1";
	Assert.assertEquals(act, exp);
	}
//	@Test
	public void verifyCheckOutBtnTest()
	{
		cart.verifyCheckOutBtn();
	}
	@Test
	public void  verifyCheckOutBtnClickTest()
	{
		cart.verifyCheckOutBtn();
		String act = cart.verifyCheckOutBtnClick();
		String exp = "https://www.saucedemo.com/checkout-step-one.html";
		Assert.assertEquals(act, exp);
		
		
	}
	
	
	
	
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
