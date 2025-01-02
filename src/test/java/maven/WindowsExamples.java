package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import java.util.Set;

public class WindowsExamples {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://leafground.com/");
        driver.manage().window().maximize();
        Pom.BrowserElement(driver).click();
        Pom.Window(driver).click();
        String parentWindow = driver.getWindowHandle(); // gets the parent window GUI ID
        Pom.OpenNewWindow(driver).click(); // opens a new window
        Set<String> allwindows= driver.getWindowHandles(); // gets the GUI ID of all the windows
        for (String childWindow:allwindows) {
           driver.switchTo().window(childWindow); // switches to the child window
        }
        Pom.OpenNewTab(driver).click();
        driver.close(); // closes the child window
        driver.switchTo().window(parentWindow); // switches back to the parent window

        Pom.multipleWindows(driver).click();  // opens a multiple windows
        int NoOfWindow=driver.getWindowHandles().size(); // gets the number of windows opened
        System.out.println("Number of windows opened: "+NoOfWindow);

        Set<String> allwindows1= driver.getWindowHandles(); // gets the GUI ID of all the windows
        for (String childWindow:allwindows1) {
            if(!childWindow.equals(parentWindow)){
                driver.switchTo().window(childWindow); // switches to the child window
                driver.close(); // closes the child window
            }
        }

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // implicit wait
        driver.switchTo().window(parentWindow); // switches to the child window
        driver.close(); // closes the child window
        }
    }

