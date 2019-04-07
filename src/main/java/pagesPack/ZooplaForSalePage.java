package pagesPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableBiMap.Builder;

import basePack.ZooplaBasePage;

public class ZooplaForSalePage extends ZooplaBasePage{
	//WebElements
	
	@FindBy(xpath="//select[@class=\"js-redirects-to-option js-check js-touched\"]//option[contains(text(),\"Highest price\")]")
      WebElement desc_sort_element;
	
	
	
	//**********************INITIALIZING WEBELEMENTS*************
	public ZooplaForSalePage() {
		PageFactory.initElements(driver, this);
		
	}
	
//**************** ACTIONS ON FORSALEPAGE***************	
	
	public String forsalepage_title() {
		String title=driver.getTitle();
		return title;
	}
	
	public ZooplaSelHousePage select_location_at(int i) {

		desc_sort_element.click();
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
List<WebElement>	list=	driver.findElements(By.xpath("//div[@class=\"listing-results-right clearfix\"]//a[@class=\"listing-results-price text-price\"]"));


System.out.println("No of houses on market===="+list.size());


for(int j=0;j<list.size();j++) {
	String text=list.get(j).getText();
	System.out.println("Price of the house at "+j+"====="+text);

if(j==i) {
	System.out.println("Value of House at location ::::"+i+"===="+list.get(j).getText());
	list.get(j).click();
	System.out.println("AFTER CLICKING ON 5TH ELEMENT");

	break;
	}
}
return new ZooplaSelHousePage();
}
}
