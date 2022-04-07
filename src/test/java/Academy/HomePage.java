package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgetPasswordPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver =initializeDriver();
		
	}
	
	@Test(dataProvider ="GetData")
	public void getNavigationPage(String username,String password, String text) {
		
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		
		LoginPage lp =l.GetLoginPage();
		
		lp.GetEmail().sendKeys(username);
		lp.GetPassword().sendKeys(password);
		lp.GetLogin().click();
		ForgetPasswordPage fp = lp.GetForgetPassword();
		
		fp.GetEmail().sendKeys("aaaa@yahoo.fr");
		fp.GetsendMeInstructions().click();
		
		
		
	}

	@AfterTest
	public void TearDown()
	{
		
		driver.close();
	}
	
	@DataProvider
	public Object[][] GetData() {
		
		Object[][] data = new Object[2][3];
		
		data [0][0] ="jslah2008@yahoo.fr";
		data [0][1] ="123456";
		data [0][2] ="non non";
		data [1][0] ="jslah2008@gmail.com";
		data [1][1] ="1234567";
		data [1][2] ="non oui non";
		return data;
	}
}
