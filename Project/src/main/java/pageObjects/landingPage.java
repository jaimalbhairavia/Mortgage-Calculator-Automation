package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	WebDriver driver;
	
	public landingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By Login = By.cssSelector("#homepage > header > div.tools > div > nav > ul > li:nth-child(4) > a");
	By title = By.cssSelector("#content > div > div > h2");
	By navBar = By.cssSelector("#homepage > header > div.navbar.navbar-default.navbar-static-top > div > nav > ul");
	By viewCoursesButton = By.cssSelector("#homepage > section:nth-child(6) > div > a");
	
	public WebElement getlogin() {
	return driver.findElement(Login);
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
		}
	
	public WebElement getNavBar() {
		return driver.findElement(navBar);
		}
	
	public WebElement getViewCourseButton() {
		return driver.findElement(viewCoursesButton);
		}
}
