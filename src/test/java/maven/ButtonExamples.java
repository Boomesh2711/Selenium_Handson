package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ButtonExamples {

    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://leafground.com/");
        driver.manage().window().maximize();
        Pom.Elements(driver).click();
        Pom.Button(driver).click();
        Point xypoint=Pom.GetPositionButton(driver).getLocation(); // getLocation() method is used to get the x and y coordinates of the button
        int xvalue =xypoint.getX();
        int yvalue =xypoint.getY();
        System.out.println("The x value is "+xvalue+" and the y value is "+yvalue);
        String color= Pom.GetColorButton(driver).getCssValue("background-color"); // getCssValue() method is used to get the color of the button
        System.out.println("The color of the button is "+color);
        Dimension size=  Pom.GetSizeButton(driver).getSize(); // getSize() method is used to get the size of the button
        int height = size.getHeight();
        int width = size.getWidth();
        System.out.println("The height of the button is "+height+" and the width of the button is "+width);
        driver.quit();


    }
}
