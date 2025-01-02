package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AlertExamples {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://leafground.com/");  // opening the website
        driver.manage().window().maximize();  // maximizing the window
        Pom.BrowserElement(driver).click();  // clicking on the browser element
        Pom.AlertIcon(driver).click();  // clicking on the alert element
        Pom.Alertbutton(driver).click();  // clicking on the alert button
        Alert alert = driver.switchTo().alert();  // switching to the alert
        alert.accept();  // accepting the alert
        Pom.ConfirmAlert(driver).click();  // clicking on the confirm alert
        Alert confirmAlert = driver.switchTo().alert();  // switching to the confirm alert
        confirmAlert.dismiss();  // dismissing the confirm alert
        Pom.PromptAlert(driver).click();  // clicking on the prompt alert
        Alert promptAlert = driver.switchTo().alert();  // switching to the prompt alert


        // Wait for the alert to be present
        WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        // Wait for the alert to be present
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.alertIsPresent());

        // Use JavaScript to send keys to the alert
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].value='Munniyandi';", promptAlert);
             //  promptAlert.sendKeys("hello");  // sending the keys to the prompt alert
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.promptResponse = 'Munniyandi'; window.prompt = function() { return window.promptResponse; };");

        Thread.sleep(3000);  // waiting for 2 seconds
        promptAlert.accept();  // accepting the prompt alert
    }
}


