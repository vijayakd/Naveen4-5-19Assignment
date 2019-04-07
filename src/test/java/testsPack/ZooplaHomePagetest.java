package testsPack;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePack.ZooplaBasePage;
import pagesPack.ZooplaForSalePage;
import pagesPack.ZooplaHomePage;

public class ZooplaHomePagetest extends ZooplaBasePage{
	
	public static ZooplaHomePage zHomePage;
	public static ZooplaForSalePage fsalepage;
  
  public  ZooplaHomePagetest() {
	  super();
  }
  
  @Test(priority=1)
  public void verifyZooplaHomePagetitle() {
	  
	  String title=zHomePage.verify_pageTitle();
	  System.out.println("Title of Zoopla Home Page is--------"+ title);
Assert.assertEquals(title, "Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents");
  
  }
  
  @Test(priority=2)
  public void entercity() {
	  zHomePage.enter_city(prop.getProperty("city"));
  }
  
  
  @Test(priority=3)
  public void clickonsearch() {
	  
	  ZooplaForSalePage fsalepage=zHomePage.click_Search();
	  
  }
  
  @BeforeTest
  public void setUp() throws InterruptedException {
init();
zHomePage= new ZooplaHomePage();
  }
  
  @AfterTest
  public void teardown() {
driver.quit();
  }
  
  
  
  
}
