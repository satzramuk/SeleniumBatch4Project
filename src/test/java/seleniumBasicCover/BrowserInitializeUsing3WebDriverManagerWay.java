package seleniumBasicCover;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserInitializeUsing3WebDriverManagerWay {
	
	public static WebDriver driver;


	public static void main(String[] args) {
		//Webdriver Manager
		
       // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();
        

		

	}

}
