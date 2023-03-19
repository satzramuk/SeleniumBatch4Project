package seleniumBasicCover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScriptBasic {
	
	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin1234");
        driver.findElement(By.className("orangehrm-login-button")).click();
        Thread.sleep(3000);
        String errortext = driver.findElement(By.className("oxd-alert-content-text")).getText();

        if(errortext.startsWith("Invalid")) {
        	
        	System.out.println("Test is passed");
        }else {
        	
        	System.out.println("Test is failed");
        }
        
       driver.quit(); 
        

	}

}


//equals
//equalsIgnoreCase
//contains
//startsWith