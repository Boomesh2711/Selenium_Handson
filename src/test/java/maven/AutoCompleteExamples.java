package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class AutoCompleteExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://leafground.com/");
        driver.manage().window().maximize();
        Pom.Elements(driver).click();
        Pom.Dropdown(driver).click();
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", Pom.Autocomplete(driver));


        //   Pom.Autocomplete(driver).click();
        Pom.Autocomplete(driver).sendKeys("Sel");
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

        List<WebElement> ListOFOptions;
        ListOFOptions = driver.findElements(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all']"));
        for (WebElement option : ListOFOptions) {
            if (option.getText().equals("Selenium WebDriver")) {
                option.click();
                String Selectedoption = option.getText();
                System.out.println("Selected option is: " + Selectedoption);
                  break;
            } else {
                System.out.println("No option is selected");
            }

        }
    }
}
