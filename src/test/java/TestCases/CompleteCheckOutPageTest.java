package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckOut_OnePage;
import Pages.CheckOut_TwoPage;
import Pages.CompleteCheckOutPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CompleteCheckOutPageTest extends TestBase{
	CompleteCheckOutPage complete;
	CheckOut_TwoPage checkOutTwo;
	InventoryPage inventory;
	LoginPage login;
	CartPage cart;
	CheckOut_OnePage checkOneTest;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initilization();
		complete = new CompleteCheckOutPage();
		checkOutTwo = new CheckOut_TwoPage();
		inventory= new InventoryPage();
		login = new LoginPage();
		cart = new CartPage();
		checkOneTest = new CheckOut_OnePage();
		login.loginPageFunctionality();
		Thread.sleep(2000);
		inventory.addProduct();
		Thread.sleep(2000);
		inventory.verifyAddToCart();
		Thread.sleep(2000);
		cart.verifyCheckOutBtn();
		Thread.sleep(2000);
		checkOneTest.verifyInformationDetails();
		Thread.sleep(2000);
		checkOneTest.verifyContiBtnClick();
		Thread.sleep(2000);
		checkOutTwo.verifyfinishBtnClick();
	}
	
//	@Test
	public void verifyCompleteLink()
	{
		String act = complete.verifyCompleteLink();
		String exp = "https://www.saucedemo.com/checkout-complete.html";
		Assert.assertEquals(act, exp);
	}
	
//	@Test
	public void verifycompleteTextTest()
	{
		boolean result = complete.verifyCompleteText();
		Assert.assertEquals(result, true);
			}
	@Test
	public void verifyThankUTextTest()
	{
		boolean result = complete.verifyThankUText();
		Assert.assertEquals(result, true);
			}
//	@Test
	public void verifyPonyExpressLog()
	{
		boolean result = complete.verifyPonyExpressLogo();
		Assert.assertEquals(result, true);
	}
//	@Test
	public void verifyBackHomeBtnTest()
	{
		boolean result = complete.verifyBackHomeBtn();
		Assert.assertEquals(result, true);
	}
//	@Test
	public void verifyBackHomeBtnClickTest()
	{
		complete.verifyBackHomeBtn();
	}
//	@Test
	public void  verifyBackHomeBtnClickFunctionalityTest()
	{ complete.verifyBackHomeBtnClick();
		 String act = complete.verifyBackHomeBtnClickFuctionality();
//		 String exp = "https://www.saucedemo.com/inventory.html";
		String exp = login.verifyUrl();
		Assert.assertEquals(act, exp);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void closeB()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
