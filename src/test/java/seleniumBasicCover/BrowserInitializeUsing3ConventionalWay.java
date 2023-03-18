package seleniumBasicCover;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserInitializeUsing3ConventionalWay {
	
	public static void main(String[] args) throws Exception   {
		
         
        System.setProperty("webdriver.chrome.driver","C://Users//Sathish//Desktop//Sathish//SeleniumClassNotes//DriverExecutables//chromedriver.exe");	
		WebDriver driver=new ChromeDriver(); 		
		//ChromeDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		driver.quit();
		
		

	}
	
	
}
