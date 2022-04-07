package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	 public WebDriver driver;
	 
	 
	 
	 By signin = By.cssSelector("a[href*='sign_in']");
	By forgetpassword = By.cssSelector("a[href*='password']") ;
	By title=By.cssSelector(".text-center>h2");
	 public LandingPage (WebDriver driver)
	 {
		 
		 this.driver=driver;
		 
	 }
	
	public LoginPage GetLoginPage() {
		
		driver.findElement(signin).click();
		LoginPage lp = new LoginPage(driver);
		return lp;
		
	
		
	}
	
	public WebElement ValidateTittle(){
		
		return driver.findElement(title);
	}
	
	
		
		
	 

}
