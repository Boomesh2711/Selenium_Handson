package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownExamples {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://leafground.com/");
        driver.manage().window().maximize();
        Pom.Elements(driver).click();
        Pom.Dropdown(driver).click();
        Select select=new Select(Pom.SelectIndexDropdown(driver)); // Select class is used to handle the dropdown
        select.selectByIndex(4);                                   // selectByIndex() method is used to select the dropdown by index
        select.selectByVisibleText("Playwright");                  // selectByVisibleText() method is used to select the dropdown by visible text
        select.selectByValue("4");                                 // selectByValue() method is used to select the dropdown by value
        List<WebElement> ListOfOptions = select.getOptions();
        ListOfOptions.size();
        System.out.println("Number of elements"+ListOfOptions.size());
        driver.quit();

    }
}
