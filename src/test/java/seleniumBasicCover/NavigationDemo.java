package seleniumBasicCover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationDemo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		Thread.sleep(3000);
		driver.navigate().to("https://letcode.in");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click();
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);

		driver.navigate().back();

		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);

		driver.navigate().forward();
		
		String currentUrl3 = driver.getCurrentUrl();
		System.out.println(currentUrl3);



	}

}
