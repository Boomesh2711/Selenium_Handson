package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExamples {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://leafground.com/");
        driver.manage().window().maximize();


        Actions actions = new Actions(driver);  // creating object of Actions class
       /* actions.keyDown(Keys.CONTROL)         // keyDown() method is used to press the control key
                .click(Pom.SelectableItem1(driver))
                .click(Pom.SelectableItem3(driver))
                .click(Pom.SelectableItem5(driver))
                .click(Pom.SelectableItem7(driver))
                .keyUp(Keys.CONTROL)
                .build()
                .perform();



        */
    }
}

