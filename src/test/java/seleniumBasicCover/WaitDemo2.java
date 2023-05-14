package seleniumBasicCover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitDemo2 {
	
	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       // WebDriverWait wait = new WebDriverWait(driver,30);
        driver.get("https://letcode.in/signin");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("sathishndr92@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Sathish@123");
        driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
        driver.findElement(By.cssSelector("span.ng-tns-c41-40")).click();
//        WebElement toast = driver.findElement(By.cssSelector("span.ng-tns-c41-40"));
//        wait.until(ExpectedConditions.invisibilityOf(toast));
        driver.findElement(By.xpath("//a[text()='Sign out']")).click();
        driver.quit(); 
        

	}

}

