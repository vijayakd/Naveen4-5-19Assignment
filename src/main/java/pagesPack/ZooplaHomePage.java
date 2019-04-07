package pagesPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePack.ZooplaBasePage;

public class ZooplaHomePage extends ZooplaBasePage {

	//***************FINDING WEB ELEMENTS*************
	@FindBy(xpath="//input[@id=\"search-input-location\"]")
	WebElement city_loc_element;
	
	@FindBy(xpath="//button[contains(text(),\"Search\")]")
	WebElement search_element;
	
	//****************INITIALIZING WEB ELEMENTS**************
	public ZooplaHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//************** ACTIONS ON THIS PAGE *********************
	
	public String verify_pageTitle() {
		String title=driver.getTitle();
           return title;		
	}
	
	public void enter_city(String city) {
		
		city_loc_element.sendKeys(prop.getProperty("city"));
	}
	
	public ZooplaForSalePage click_Search() {
		
		search_element.click();
		return new ZooplaForSalePage();
		
	}
}
