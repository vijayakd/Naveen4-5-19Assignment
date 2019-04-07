package testsPack;

import org.testng.annotations.Test;

//import pack.crm.utils.TestUtil;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class sampleTest {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void setup() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.zoopla.co.uk/");
  }

  @AfterMethod
  public void teardown() {
	  driver.quit();
  }

}
