package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
	
	WebDriver driver;
	
	@Test
	public static WebDriver BrowserOptions(WebDriver driver,String  browserName, String AppUrl)
	{
		//WebDriver driver = null;
		if (browserName.equalsIgnoreCase("Chrome")|| browserName.equalsIgnoreCase("GC")
				|| browserName.equalsIgnoreCase("Google Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\DataDrivenKeywordDriven\\Chrome Browser Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("Edge")|| browserName.equalsIgnoreCase("EG")
				|| browserName.equalsIgnoreCase("Microsoft Edge")) {
		
			System.setProperty("webdriver.edge.driver", "./DataDrivenKeywordDriven/EdgeBrowser/msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			
			System.out.println("Sorry we do not support this browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(20,  TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(AppUrl);
		return driver;
	}
	
	public static void closeBrowser (WebDriver driver)
	{
		//driver.quit();
	}

}
