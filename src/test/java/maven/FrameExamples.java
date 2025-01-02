package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class FrameExamples {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://leafground.com/");
        driver.manage().window().maximize();
        Pom.BrowserElement(driver).click();
        Pom.Frame(driver).click();
        driver.switchTo().frame(0);
        Pom.InsideFrame(driver).click();
        String Clicktext=  Pom.InsideFrame(driver).getText();
        System.out.println("Text inside the frame is: "+Clicktext);
        driver.switchTo().defaultContent();                // switching back to the main page
        driver.switchTo().frame(2);                 // switching to the frame using index
        driver.switchTo().frame("frame2");      // switching to the nestedframe using id
        Pom.NestedFrame(driver).click();
        String Clicktext1=  Pom.NestedFrame(driver).getText();
        System.out.println("Text inside the frame is: "+Clicktext1);
        driver.switchTo().defaultContent();
        List<WebElement> NoOfFrames=driver.findElements(By.tagName("iframe")); // finding the number of frames in the page
        int size=NoOfFrames.size();
        System.out.println("Number of frames in the page are: "+size);

    }
}
