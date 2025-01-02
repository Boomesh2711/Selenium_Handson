package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class FilesExamples {
    public static void main(String[] args) throws AWTException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://leafground.com/");
        driver.manage().window().maximize();
        Pom.MiscIcon(driver).click();
        Pom.Files(driver).click();
    /*    Pom.Download(driver).click();
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
      //  C:\Users\boome\Downloads
        File file = new File("C:\\Users\\boome\\Downloads"); // File is a class in java.io package
        File[] files=  file.listFiles();
        for(File f:files){
            if(f.getName().equals("TestLeaf Logo.png")){
                System.out.println("File is downloaded");
                break;
            }else {
                System.out.println("File is not downloaded");
            }
            } /*
      //

     */





        Pom.Upload(driver).click();
       // JavascriptExecutor jse = (JavascriptExecutor) driver;
       // jse.executeScript("arguments[0].click()", Pom.Upload(driver));
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        // StringSelection is a class in java.awt
        String filePath = "C:\\Users\\boome\\Downloads\\TestLeaf Logo.png";
        StringSelection stringSelection = new StringSelection(filePath);
        // Toolkit is a class in java.awt package
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);


        try {
            Robot robot = new Robot();
            robot.setAutoDelay(200); // Press Ctrl+V
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(5000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(5000);
            // Press Enter
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(5000);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(5000);
            // Press Enter
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(5000);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }   catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
