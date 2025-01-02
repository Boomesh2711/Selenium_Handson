package testNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {
	

		private void m1() {
			// TODO Auto-generated method stub
			
		//	System.setProperty("webdriver.edge.driver", "C:\\Users\\2052529\\Documents\\maven1\\src\\test\\resources\\Webdrivers\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
		      driver.get("https://www.flipkart.com/");
		      WebElement a =driver.findElement(By.xpath("//input[@type='text']"));
		      a.sendKeys("Redmi");
		}
	@Test(priority = 0)
		private void m2() {
			// TODO Auto-generated method stub
		//	System.setProperty("webdriver.edge.driver", "C:\\Users\\2052529\\Documents\\maven1\\src\\test\\resources\\Webdrivers\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		      driver.get("https://www.flipkart.com/");
		      WebElement a =driver.findElement(By.xpath("//input[@type='text']"));
		      a.sendKeys("Redmi");
		}

	 
	}
	 


