package pagesPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePack.ZooplaBasePage;

public class ZooplaSelHousePage extends ZooplaBasePage{
	
	//OBJECTS ON THIS PAGE
	
	@FindBy(xpath="//div[@class=\"ui-agent__logo\"]//img[@class=\"js-lazy-loaded\"]")
	WebElement zoopla_agent_Company_logo;
	
	@FindBy(xpath="//div[@class=\"dp-sidebar-wrapper__contact\"]//a[@class=\"ui-agent__details\"]//h4[@class=\"ui-agent__name\"]")
	WebElement Zoopla_agent_Company_name;
	
	
	//************* INITIALIZING OBJECTS
	public ZooplaSelHousePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	//********** ACTIONS ON THIS PAGE
	
	public String verifyZSelHousePageTitle() {
		String title= driver.getTitle();
		return title;
	}
	
	public Boolean verifyZAgentLogoPresence() {
		String agent_logo_text=zoopla_agent_Company_logo.getText();
		System.out.println("Agent logo text ===="+agent_logo_text);
		Boolean result =zoopla_agent_Company_logo.isDisplayed();
		return result;
	}
	
	public Boolean verifyZAgentCompanyNamePresence() {
		String agent_company_name=Zoopla_agent_Company_name.getText();
		System.out.println("Agent company name ===="+agent_company_name);
		Boolean result =Zoopla_agent_Company_name.isDisplayed();
		return result;
	}
	public Zoopla_agent_Company_namePage clickOnZAgentName() {
		Zoopla_agent_Company_name.click();
		return new Zoopla_agent_Company_namePage();
	}

}
