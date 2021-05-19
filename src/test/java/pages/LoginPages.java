package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages {

	WebDriver driver;
	By userName = By.id("txtUsername");
	By password = By.id("txtPassword");
	By login = By.id("btnLogin");

	public LoginPages(WebDriver driver) {
		this.driver = driver;
	}

	public void loginAsUSer(String user, String pwd) {
		driver.findElement(userName).sendKeys(user);
		driver.findElement(password).sendKeys(pwd);

		driver.findElement(login).click();

	}

}
