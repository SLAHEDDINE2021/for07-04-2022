package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		
		
		prop = new Properties() ;
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Finance\\eclipse-workspace\\Project2021\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		//String BrowserName =System.getProperty("browser");
		
		String BrowserName = prop.getProperty("browser");
		
		System.out.println(BrowserName);
		
		if (BrowserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		
		else if(BrowserName.equals("firefox"))
		{

			 System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			 driver= new FirefoxDriver();
			//firefox code
		}
		
		else if(BrowserName.equals("IE"))
		{
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
	
	public String getScreenShotPath(String testcasename, WebDriver driver) throws IOException {
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String destinationfile = System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		
		FileUtils.copyFile(source, new File(destinationfile));
		
		return destinationfile;
		
		
	}
	
	
	}
	
	
	
	


