package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateTittle extends base {
	
	
	public WebDriver driver;
	
	
	
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver =initializeDriver();

}
	
	@Test
	public void ValidationTittle() {
		
		driver.get(prop.getProperty("url"));
		LandingPage l= new LandingPage(driver);
		
		Assert.assertEquals("l.ValidateTittle().getText()", "FEATURES TEXTS");
	}
	
	@AfterTest
	public void TearDown()
	{
		
		driver.close();
	}
}