package seleniumBasicCover;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class BrowserInitializeUsing4SeleniumManager {

	public static void main(String[] args) {
		
		String ChromePathLocationInSystem = SeleniumManager.getInstance().getDriverPath("chromedriver");
		System.out.println("Location of ChromePath is : "+ChromePathLocationInSystem);

		//Selenium Manager
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
