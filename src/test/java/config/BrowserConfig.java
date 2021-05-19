package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig {
	
	public static WebDriver driver;

	public WebDriver loadDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/test-data/chrome/chromedriver.exe");
		driver = new ChromeDriver(); 
		return driver;
	}

}
