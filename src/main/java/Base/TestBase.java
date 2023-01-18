package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.lang.WordUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ReadData1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
		public void initilization() throws Exception
	{ WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get(ReadData1.readPropertyFile("url"));
	driver.manage().deleteAllCookies();
	driver.get("https://www.saucedemo.com/");
	// updated here github.com
			
	}
		

}
