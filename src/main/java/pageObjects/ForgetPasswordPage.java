package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetPasswordPage {
	
	
	public WebDriver driver;
	
	By email = By.cssSelector("[type='email']");
	By sendmeinstruction = By.cssSelector("input[type='submit']");
	
	
	
	public ForgetPasswordPage(WebDriver driver) {
		
		this.driver=driver;
	}
	

	
	
	public WebElement GetEmail() {
		
		
		return driver.findElement(email);
		
	}
public WebElement GetsendMeInstructions() {
		
		
		return driver.findElement(sendmeinstruction);
		
	}
}
