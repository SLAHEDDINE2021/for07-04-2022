package Academy;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class addItems extends base {

	public WebDriver driver;

	@BeforeTest
	public void Initialize() throws IOException {

		driver = initializeDriver();

	}

	@Test
	public void AddIteams() throws InterruptedException {

		driver.get(("https://rahulshettyacademy.com/seleniumPractise/#/"));

		driver.manage().window().maximize();

		Thread.sleep(5000);

		String[] ProductNeedes = { "Brocoli", "Concombre" };

		List ProductNeedesList = Arrays.asList(ProductNeedes);
		
		List<WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < Products.size(); i++) {

			String[] name = Products.get(i).getText().split("-");
			String formattedname = name[0].trim();

			if (ProductNeedesList.contains(formattedname)) {

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == 2) {
					break;
				}

			}

		}

	}

}
