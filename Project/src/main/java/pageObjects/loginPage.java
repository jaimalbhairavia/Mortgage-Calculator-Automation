package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class loginPage extends Base {
	
public loginPage(WebDriver driver) {
	this.driver = driver;
}
	By emailid = By.id("user_email");
	By password = By.id("user_password");
	By loginbutton = By.name("commit");
	
	public WebElement Email() {
		return driver.findElement(emailid);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	public WebElement Login() {
		return driver.findElement(loginbutton);
	}
}
