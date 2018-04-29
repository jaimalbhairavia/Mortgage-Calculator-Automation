package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import resources.Base;
import pageObjects.landingPage;

public class validateTitle extends Base {

	private static Logger log = LogManager.getLogger(validateTitle.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver=initializeDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to the HomePage");
	}
	
	
	@Test()
	public void landingPage() {
		
		landingPage lp = new landingPage(driver);
		Assert.assertEquals("FEATURED OURSES", lp.getTitle().getText());
		log.info("Text is displayed");
		
	}
	
	@AfterTest
	public void teardown(){
		driver.close();
		driver=null;
	}
	
		
}
