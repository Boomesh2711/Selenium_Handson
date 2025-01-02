package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class LinkExtendedExamples {

        public static void main(String[] args) {
            WebDriverManager.edgedriver().setup();
            WebDriver driver = new EdgeDriver();

            driver.get("https://leafground.com/");
          //  driver.navigate().to("https://leafground.com/pages/Link.html");
            driver.manage().window().maximize();
            Pom.Elements(driver).click();


            Pom.Hyperlinkicon(driver).click();
            Pom.Homepage(driver).click();
            driver.navigate().back();
            Pom.FindUrl(driver).getAttribute("href");
            System.out.println("The URL of the link is: "+Pom.FindUrl(driver).getAttribute("href"));
            Pom.VerifyLink(driver).click();
            driver.getTitle();
            System.out.println("The title of the page is: "+driver.getTitle());
            if(driver.getTitle().equals("404 Not Found")){
                System.out.println("The title of the page is incorrect");
            }
            driver.navigate().back();
            Pom.Homepage(driver).click();
            driver.navigate().back();
        List<WebElement> size=    driver.findElements(By.tagName("a"));
       int FindSize= size.size();
            System.out.println("The number of links in the page is: "+FindSize);

        }
    }
