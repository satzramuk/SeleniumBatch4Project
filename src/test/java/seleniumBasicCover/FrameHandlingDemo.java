package seleniumBasicCover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandlingDemo {
	
	static WebDriver driver;


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Vijay");
		WebElement ele = driver.findElement(By.cssSelector("iframe.has-background-white"));
		driver.switchTo().frame(ele);

		driver.findElement(By.name("email")).sendKeys("ranjith@gmail.com");
		
		//driver.quit();
		
		
		
		
		
		
	}

}
