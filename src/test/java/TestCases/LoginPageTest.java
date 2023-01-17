package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.UtilityMethod;

public class LoginPageTest extends TestBase {
	
	LoginPage login ; //= new LoginPage();

	@BeforeMethod(alwaysRun = true)
	public void setup() throws Exception
	{ initilization();
	 login = new LoginPage();
		}
	
	
	@Test(enabled=false)		//verify page tital
	public void verifyTitalTest()
	
	{String actTital = login.veriftTital();
	String expTital = "Swag Labs";
	Assert.assertEquals(actTital, expTital);
	}
	
//	@Test 	 (priority=3)				//to verify current url
	public void verifyUrlTest()
	{  String actUrl = login.verifyUrl();
	String expUrl = "https://www.saucedemo.com/";
	Assert.assertEquals(actUrl, expUrl);
		
	}
	
//	@Test(dependsOnMethods="verifyUrlTest")		//verify bot logo present on the login page
	
		public void verifyBotLogTest()
		{
	 boolean result = login.verifyBotLog();
	 Assert.assertEquals(result,true);
		
	}
	
//	@Test(priority=2)		//verify tital logo present on the login page
	public void verifyTitalLogoTest()
	{ boolean result = login.verifyTitalLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test(groups="sanity")  //verify login functionality when click on login button then next page should be open
	public void loginPageFunctionalityTest() throws Exception
	{
		
	String act = login.loginPageFunctionality();
	String exp = "https://www.sauced emo.com/inventory.html"	;
	Assert.assertEquals(act, exp);
	}
	@Test(priority=1)     		//verify products tital should be display on webpage.
	public void verifyProductTitalTest() throws Exception
	{loginPageFunctionalityTest();
	String act = login.verifyProductTital();
	String exp = "PRODUCTS";
	Assert.assertEquals(act, exp);
		
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser(ITestResult a) throws Exception
	{ 
		if(ITestResult.FAILURE==a.getStatus())
		{
			UtilityMethod.captureScreenShot(a.getName());
		}
		
		
		
		driver.close();}
	
}
	
	

