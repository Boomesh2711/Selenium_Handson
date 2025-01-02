package maven;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;



public class Maven {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.edge.driver","D:\\Workspace\\edgedriver_win64\\msedgedriver.exe"); one method
		WebDriverManager.edgedriver().setup(); // another method

		WebDriver driver=new EdgeDriver();  // creating object of EdgeDriver
		driver.get("https://www.flipkart.com/"); // opening the website
		driver.manage().window().maximize(); // maximizing the window

		Pom.searchbox(driver).sendKeys("redmi",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // implicit wait
		Pom.tv(driver).click(); // clicking on tv and appliances xpath in Pom class
		Pom.wash(driver).click();
	    WebDriverWait wait=new WebDriverWait(driver, 10); // explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Fully Automatic Front Load']")));

		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Fully Automatic Front Load']")));
		Pom.wash(driver).click();






		  // WebElement a =driver.findElement(By.xpath("//input[@type='text']"));

	      //a.sendKeys("Redmi", Keys.ENTER);
		  //WebElement tv=driver.findElement(By.xpath("//span[@class='TSD49J'and text()='TVs & Appliances']"));


	}

}
