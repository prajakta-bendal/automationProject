package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class InventoryPageTest extends TestBase{
	  private static final String[] smoke = null;
	InventoryPage inventory ;
	 LoginPage login;
	@BeforeMethod(alwaysRun = true)
	public void setup() throws Exception
	{ initilization();
	 inventory= new InventoryPage();
	 login = new LoginPage();
	 
	 login.loginPageFunctionality();
//	 Thread.sleep(2000 );
		}
	
	
	
//	@Test 			//verify current page URL  is correct or not
	public void verifyCurrentUrlTest() throws Exception
	{
		String actUrl = inventory.verifyCurrentUrl();
		String expUrl = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actUrl, expUrl,"test case failed");
		System.out.println("this is test cases for verify current url");
			
		}
	
//	@Test			//verify small bot logo displayed on inventory webpage
	public void verifySmallBoTest()
	{	System.out.println("Excution stared");
		SoftAssert soft = new SoftAssert();
		boolean result = inventory.verifySmallBot();
		soft.assertEquals(result, false);
		System.out.println("Excution ended");
		soft.assertAll();
	}
	
//	@BeforeSuite
//	@Test			//verify when click on menu button menu displayed. 
	public void verifyOpenMenuButtonTest()
	{
		 boolean result = inventory.verifyOpenMenuButton();
		Assert.assertEquals(result, true);
	}
//	@Test(timeOut=200)		//verify twitter button displayed on inventory webpage.
	public void veriftwitterbtnTest()
	{
		 boolean result = inventory.veriftwitterbtn();
		 
		 Assert.assertEquals(result, true);
			}
//	@Test		//verify facebook button displayed on inventory webpage
	public void verifyfacebookLogobtnTest()
	{
		boolean result = inventory.verifyfacebookLogobtn();
		Assert.assertEquals(result, true);
	}
	@Test(enabled=false) 			// verify linkdin button displayed on invetory webpage.
	public void verifylinkdinLogoBtnTest()
	{
		 boolean result = inventory.verifylinkdinLogoBtn();
		 Assert.assertEquals(result, true);
			}
//	@Test		//verify footer logo displayed on inventory webpage
	public void verifyfooterLogobtnTest()
	{
		boolean result = inventory.verifyfooterLogobtn();
		Assert.assertEquals(result, true);
	}
//	 @Test(invocationCount = 3) 			//
	 public void verifyfooterCopyLineTest()
	 {
		 boolean result = inventory.verifyfooterCopyLine();
		 Assert.assertEquals(result, true);
	 }
	 @Test(groups = "smoke")
	 public void verifyNameListTest() throws Exception
	 {
		 inventory.verifyNameList();
	 }
	 @Test(groups = {"sanity","smoke"})
	 public void addProductTest()
	 {
		 
		 inventory.addProduct();
	 }
	  
//	 @Test(groups = "sanity")
	 public void verifyAddToCartTest()
	 {
		 
		 inventory.verifyAddToCart();
	 }
			 
	
	@AfterMethod (alwaysRun = true)
	public void closeBrowser()
	{ driver.close();}
	}


