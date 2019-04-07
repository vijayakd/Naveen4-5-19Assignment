package testsPack;

import org.testng.annotations.Test;

import basePack.ZooplaBasePage;
import pagesPack.ZooplaForSalePage;
import pagesPack.ZooplaHomePage;
import pagesPack.ZooplaSelHousePage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ZooplaForSalePageTest extends ZooplaBasePage{
  
public static 	ZooplaHomePage zHomePage;
public static ZooplaForSalePage zforSalePage;
public static ZooplaSelHousePage newselhousepage;
	
	public ZooplaForSalePageTest() {
		super();
	}
	
	@Test(priority=1)
  public void verifyZooplaForSale() {
		String title=zforSalePage.forsalepage_title();
		System.out.println("Title For ZooplaForSalePage====="+title);
		Assert.assertEquals(title, "Property for Sale in London - Buy Properties in London - Zoopla");
		
  }
	
	@Test(priority=2)
public void selectingLoctionAt() {
		System.out.println("IN 2ND TEST");
		newselhousepage=zforSalePage.select_location_at(5);
		
	}
  
	@BeforeMethod
  public void setup()  {
		try {
			init();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		zHomePage=new ZooplaHomePage();
		zforSalePage= new ZooplaForSalePage();
		zHomePage.enter_city(prop.getProperty("city"));
		zHomePage.click_Search();
	}

  @AfterMethod
  public void teardown() {
	  driver.quit();
  }

}
