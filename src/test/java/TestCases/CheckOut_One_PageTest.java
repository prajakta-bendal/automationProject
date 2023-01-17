package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckOut_OnePage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckOut_One_PageTest extends TestBase {
	
	CheckOut_OnePage CheckOneTest;
	LoginPage login;
	InventoryPage inventory;
	CartPage cart;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initilization();
		login = new LoginPage();
		CheckOneTest = new CheckOut_OnePage();
		inventory = new InventoryPage();
		cart = new CartPage();
		login.loginPageFunctionality();
		inventory.verifyAddToCart();
		cart.verifyCheckOutBtn();
	}
	
//	@Test
	public void verifyCheckoutTextTest()
	{
	boolean result = CheckOneTest.verifyCheckoutText();
	Assert.assertEquals(result, true);
	}
//	@Test
	public void verifyInformationDetailsTest() throws Exception
	{
		 boolean result = CheckOneTest.verifyCancelBtnDisplay();
		 Assert.assertEquals(result, true);
		 
	}
//	@Test
	public void verifyCancelBtnClickTest()
	{
		CheckOneTest.verifyCancelBtnClick();
	}
//	@Test
	public void verifyCancelBtnFunctionalityTest()
	{
		String act = CheckOneTest.verifyCancelBtnFunctionality();
		String exp = cart.verifyCartPageUrl();
		Assert.assertEquals(act, exp);
	}
//	@Test		
		public void verifyContiBtnDisplayTest()
	{
		boolean result = CheckOneTest.verifyContiBtnDisplay();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifyContiBtnClick() throws Exception
	{	CheckOneTest.verifyInformationDetails();
		CheckOneTest.verifyContiBtnClick();
	}
	@Test
	public void verifyContiBtnFunctionalityTest() throws Exception
	{ 	CheckOneTest.verifyInformationDetails();
		CheckOneTest.verifyContiBtnClick();
		String act = CheckOneTest.verifyContiBtnFunctionality();
		String exp ="https://www.saucedemo.com/checkout-step-two.html";
		Assert.assertEquals(act, exp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
