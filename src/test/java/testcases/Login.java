package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import config.BrowserConfig;
import pages.LoginPages;

public class Login {

	public static WebDriver driver;
	public static LoginPages loginPages;
	
	@BeforeSuite()
	public void initiateDriver() {
		BrowserConfig browserConfig = new BrowserConfig();
		driver = browserConfig.loadDriver();
		loginPages = new LoginPages(driver);
	}

	@Test
	public void loginOrangeHrm() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginPages.loginAsUSer("Admin", "admin123");
	}
}
