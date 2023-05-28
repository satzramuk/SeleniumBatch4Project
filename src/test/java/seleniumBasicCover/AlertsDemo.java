package seleniumBasicCover;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");
        driver.manage().window().maximize();
        //Simple Alert
        driver.findElement(By.id("accept")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("Text value is :"+text);
        Thread.sleep(3000);
        alert.accept();
        
        //Confirm Alert
        driver.findElement(By.id("confirm")).click();
        Thread.sleep(3000);
        alert.dismiss();
        //Prompt Alert
        driver.findElement(By.id("prompt")).click();
        Thread.sleep(3000);
        alert.sendKeys("VijayRanjith");
         String text1 = alert.getText();
         System.out.println("Text values is :"+text1);
         alert.accept();

         //Modern Alert
         driver.findElement(By.id("modern")).click();
         Thread.sleep(3000);
         String moderntext = driver.findElement(By.xpath( "//*[text()='Modern Alert - Some people address me as sweet alert as well ']")).getText();
         System.out.println("Text values is :"+moderntext);
         driver.findElement(By.cssSelector("button.modal-close.is-large")).click();

        



        
        
        
        

        
        
		
		
	}

}
