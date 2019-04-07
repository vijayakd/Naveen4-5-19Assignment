package testsPack;

import org.testng.annotations.Test;

import basePack.ZooplaBasePage;
import pagesPack.ZooplaForSalePage;
import pagesPack.ZooplaHomePage;
import pagesPack.ZooplaSelHousePage;
import pagesPack.Zoopla_agent_Company_namePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ZooplaSelHousePageTest extends ZooplaBasePage{
	
	public static ZooplaHomePage zHomePage;
	public static ZooplaForSalePage zforSalePage;
	public static ZooplaSelHousePage newselhousepage;
	public static	Zoopla_agent_Company_namePage zAgentCompName;
	
	public ZooplaSelHousePageTest() {
		super();
	}
	
	@Test(priority=1)
	public void verifyAgentlogo() {
		Boolean result=newselhousepage.verifyZAgentLogoPresence();
		Assert.assertTrue(result);
	}
	@Test(priority=3)
	public void verifyAgentcompanyname() {
		Boolean result=newselhousepage.verifyZAgentCompanyNamePresence();
		Assert.assertTrue(result);
	}
	@Test(priority=4)
	public void clickOnAgentCompanyName() {
		zAgentCompName=newselhousepage.clickOnZAgentName();
		
	}
	
	 @Test(priority=2)
	  public void verifyZSelHousePageTitle() {
			

		 String title=newselhousepage.verifyZSelHousePageTitle();
		 System.out.println("Title of Zoopla Selected HousePage is ----"+title);
		 Assert.assertEquals(title, "8 bed detached house for sale in Old Church Street, London SW3 - Zoopla");
	 }

  @BeforeTest
  public void setup() throws InterruptedException  {
		
			init();
		
		zHomePage=new ZooplaHomePage();
		zforSalePage= new ZooplaForSalePage();
		newselhousepage=new ZooplaSelHousePage();
		zHomePage.enter_city(prop.getProperty("city"));
		zHomePage.click_Search();
		zforSalePage.select_location_at(5);

	}

 /* @AfterMethod
  public void teardown() {
driver.quit();  }
*/
}
