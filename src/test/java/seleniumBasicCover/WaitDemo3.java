package seleniumBasicCover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitDemo3 {
	
	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://letcode.in/waits");
        driver.manage().window().maximize();
        driver.findElement(By.id("accept")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        Alert until = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(until.getText());
        until.accept();
        //(or) driver.switch().alert().accept();
       
        driver.quit(); 
        

	}

}

