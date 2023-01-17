package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckOut_OnePage;
import Pages.CheckOut_TwoPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckOut_TwoPageTest extends TestBase {
	CheckOut_TwoPage checkOutTwo;
	InventoryPage inventory;
	LoginPage login;
	CartPage cart;
	CheckOut_OnePage checkOneTest;
	@BeforeMethod
	public void setup() throws Exception
	{
		initilization();
		checkOutTwo = new CheckOut_TwoPage();
		inventory= new InventoryPage();
		login = new LoginPage();
		cart = new CartPage();
		checkOneTest = new CheckOut_OnePage();
		login.loginPageFunctionality();
		inventory.addProduct();
		Thread.sleep(3000);
		inventory.verifyAddToCart();
		
		cart.verifyCheckOutBtn();
		
		checkOneTest.verifyInformationDetails();
		checkOneTest.verifyContiBtnClick();
		
	}
//	@Test
	public void verifyOverViewTextTest()
	{
		boolean result = checkOutTwo.verifyOverViewText();
		Assert.assertEquals(result, true);
			}
//	@Test
	public void verifyPaymentTextTest()
	{
		boolean result = checkOutTwo.verifyPaymentText();
		Assert.assertEquals(result, true);
			}
//	@Test
	public void verifyPymentInfoTextTest()
	{
		boolean result = checkOutTwo.verifyPymentInfoText();
		Assert.assertEquals(result, true);
			}
//	@Test
	public void verifyShippingTextTest()
	{
		boolean result = checkOutTwo.verifyShippingText();
		Assert.assertEquals(result, true);
			}
//	@Test
	public void verifyShippingInfoTextTest()
	{
		boolean result = checkOutTwo.verifyShippingInfoText();
		Assert.assertEquals(result, true);
			}
//	@Test
	public void verifyCancelBtnTest()
	{
	boolean result = checkOutTwo.verifyCancelBtn();	
	Assert.assertEquals(result, true);
	}
//	@Test
	public void verifyCancelBtnClickTest()
	{
		checkOutTwo.verifyCancelBtnClick();
	}
//	@Test
	public void verifyCancelBtnFunctionalityTest()
	{   checkOutTwo.verifyCancelBtnClick();
		String act = checkOutTwo.verifyCancelBtnFunctionality();
		String exp = checkOneTest.verifyContiBtnFunctionality();
		Assert.assertEquals(act, exp);
	}
//	@Test		
		public void verifyfinishBtnDisplayTest()
	{
		boolean result = checkOutTwo.verifyfinishBtnDisplay();
		Assert.assertEquals(result, true);
	}
//	@Test
	public void verifyfinishBtnClick() throws Exception
	{
//	checkOneTest.verifyInformationDetails();
//	Thread.sleep(3000);
//	checkOneTest.verifyContiBtnClick();
//	Thread.sleep(3000);
		checkOutTwo.verifyfinishBtnClick();
		
	}
//	@Test
	public void verifyfinishBtnFunctionalityTest() throws Exception
	{ 	
//		checkOneTest.verifyInformationDetails();
	checkOutTwo.verifyfinishBtnClick();
	String act = checkOutTwo.verifyfinishBtnFunctionality();
	String exp ="https://www.saucedemo.com/checkout-complete.html";
	Assert.assertEquals(act, exp);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@AfterMethod
		public void closeBrowser()
		{
			driver.close();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
