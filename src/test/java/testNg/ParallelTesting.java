package testNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
    @Test
//    private void mi() {
//        // TODO Auto-generated method stub
//        //	System.setProperty("webdriver.edge.driver", "C:\\Users\\2052529\\Documents\\maven1\\src\\test\\resources\\Webdrivers\\msedgedriver.exe");
//        WebDriverManager.edgedriver().setup();
//        WebDriver driver=new EdgeDriver();
//        driver.get("https://www.flipkart.com/");
//        WebElement a =driver.findElement(By.xpath("//input[@type='text']"));
//        a.sendKeys("Redmi");
//        String a=Assert.assertEquals("Redmi", a.getText());
//        System.out.println(a);
//    }
    //@Test
    private void Apple() {
        // TODO Auto-generated method stub
        //	System.setProperty("webdriver.edge.driver", "C:\\Users\\2052529\\Documents\\maven1\\src\\test\\resources\\Webdrivers\\msedgedriver.exe");
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        WebElement a =driver.findElement(By.xpath("//input[@type='text']"));
        a.sendKeys("Apple");
    }

}
