package basePack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZooplaBasePage {
	public  static WebDriver driver;
	public static Properties prop;
	static FileInputStream fis;

	public ZooplaBasePage() {
		 prop = new Properties();
			try {
				fis = new FileInputStream("C:\\Users\\vijay\\eclipse-workspace\\NaveenAssignment5April2019\\src\\main\\java\\configPack\\config.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static void init() throws InterruptedException {
		
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			
					System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
					 driver = new ChromeDriver();
		}else
			if(browserName.equalsIgnoreCase("ff")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				    driver = new FirefoxDriver();
			}	
	
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		*/driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	  Thread.sleep(5000);

	
	}
	
}
