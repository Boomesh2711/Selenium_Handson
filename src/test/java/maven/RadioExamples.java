package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioExamples {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://leafground.com/");
        driver.manage().window().maximize();
        Pom.Elements(driver).click();
        Pom.RadioButton(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='j_idt87:console2:0' and text()='Chrome']\n")));
      boolean chrome=  Pom.RadioChrome(driver).isSelected(); // isSelected() method is used to check whether the radio button is selected or not
      boolean edge=  Pom.RadioEdge(driver).isSelected();
      boolean fiefox=  Pom.RadioFirefox(driver).isSelected();
      boolean safari=  Pom.RadioSafari(driver).isSelected();

        System.out.println("Chrome radio button is selected: "+chrome);
        System.out.println("Edge radio button is selected: "+edge);
        System.out.println("Firefox radio button is selected: "+fiefox);
        System.out.println("Safari radio button is selected: "+safari);
        driver.quit();
    }
}
