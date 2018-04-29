package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.Base;
import pageObjects.landingPage;
import pageObjects.loginPage;

public class HomePage extends Base {
	private static Logger log = LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		
	driver=initializeDriver();
	log.info("Driver is initialized");
	
		
	}
	

	@Test(dataProvider = "getData")
	public void landingPage(String username, String Password) throws IOException {
		
		driver.get(prop.getProperty("url"));
			
		landingPage lp = new landingPage(driver);
		lp.getlogin().click();
		
		loginPage l = new loginPage(driver);
		l.Email().sendKeys(username);
		l.Password().sendKeys(Password);
		log.info("Successfully passed the data");
		l.Login().click();
		
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		//0th row
		data[0][0] = "hello1@gmail.com";
		data[0][1] = "123456";
		//1st row
		data[1][0]= "hello2";
		data[1][1]="567347";
		
		return data;
	}
	
	@AfterTest
	public void teardown(){
		driver.close();
		driver=null;
	}
		
}
