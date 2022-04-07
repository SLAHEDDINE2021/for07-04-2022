package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	
	
	public WebDriver driver ;
	
	By email = By.cssSelector("[type='email']");
	By password = By.cssSelector("[type='password']");
	By login = By.cssSelector("[type='submit']");
	By forgetpassword = By.cssSelector("[class='link-below-button']");
	
	
	public LoginPage (WebDriver driver) {
		
		this.driver=driver;
	}
	
	public WebElement GetEmail()
	{
		
		return driver.findElement(email);
	}
	
	public WebElement GetPassword()
	{
		
		return driver.findElement(password);
		
	}
	public WebElement GetLogin()
	{
		
		return driver.findElement(login);
		
	}
		public ForgetPasswordPage GetForgetPassword() {
			
			driver.findElement(forgetpassword).click();
			ForgetPasswordPage fp= new ForgetPasswordPage(driver);
			
			return fp;
		
	
		
	}
}
