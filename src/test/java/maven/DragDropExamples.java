package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropExamples {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://leafground.com/");
        driver.manage().window().maximize();
        Pom.BrowserElement(driver).click();
        Pom.Dragelement(driver).click();
        Actions actions = new Actions(driver);  // creating object of Actions class
        // click and hold the draggable element and move to droppable element and release
        actions.clickAndHold(Pom.Draggable(driver)).moveToElement(Pom.Droppale(driver)).release().build().perform();
        // drag and drop the draggable element to droppable element
        actions.dragAndDrop(Pom.Draggable(driver), Pom.Droppale(driver)).build().perform();

    }
}
