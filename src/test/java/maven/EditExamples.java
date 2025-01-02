package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class EditExamples {

    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://leafground.com/");
        driver.manage().window().maximize();
        Pom.Elements(driver).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Pom.textboxelement(driver).click();
        Pom.name(driver).sendKeys("Rajanikanth");
        Pom.textAppend(driver).sendKeys(" India");
        String retrivetext1 =  Pom.retriveText(driver).getAttribute("value"); // getAttribute() method is used to get the value from the text field
        System.out.println(retrivetext1);
        Pom.clearText(driver).clear();
        boolean validate=  Pom.disableText(driver).isEnabled(); // isEnabled() method is used to check whether the text field is enabled or not
        System.out.println(validate);
        Pom.textTab(driver).sendKeys("Rajanikanth@gmail.com", Keys.TAB); // keys.TAB is used to move to the next field
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement activeElement = driver.switchTo().activeElement(); // Verify if the active element is the expected one
        if (activeElement.equals(Pom.nextFocus(driver))) {
            System.out.println("Focus moved to the next element successfully.");
        } else { System.out.println("Focus did not move to the next element."); }

        driver.quit();

    }
}


//  String retrivetext =  Pom.retriveText(driver).getText(); // getText() method is used to get the text from the text field
