package seleniumBasicCover;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");
        driver.manage().window().maximize();
        //Sendkeys for typing text
        driver.findElement(By.id("fullName")).sendKeys("Vijay Ranjith");
        //append the text and press Tab key
        driver.findElement(By.id("join")).sendKeys(" person",Keys.TAB);
        //(or)
        driver.findElement(By.id("join")).sendKeys(" person"+Keys.TAB);

        //getattribute
        String attributename = driver.findElement(By.id("getMe")).getAttribute("value");
        System.out.println("Attribute value is : "+attributename);
        
        String gettextway = driver.findElement(By.id("getMe")).getText();
        System.out.println("Visible text is : "+gettextway);
        //Is text is enabled
        boolean testy = driver.findElement(By.id("getMe")).isEnabled();
        System.out.println("Visible text is : "+testy);

        String text = driver.findElement(By.xpath("//label[text()='What is inside the text box']")).getText();

        System.out.println(text);
        
        //Clear the text
        driver.findElement(By.id("clearMe")).clear();
        
        boolean textenabled = driver.findElement(By.id("noEdit")).isEnabled();
        System.out.println(textenabled);
        
        //Confirm text is readonly
        String attribute1 = driver.findElement(By.id("dontwrite")).getAttribute("value");
        System.out.println("Is text is readonly :"+attribute1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //driver.quit();

        
		
	}

}
