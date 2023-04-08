package seleniumBasicCover;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationDemo {

	static WebDriver driver;


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("position"));
		Point point = element.getLocation();
		int x = point.getX();
		int y = point.getY();

		System.out.println("x => "+x +" y => "+y);

		WebElement element2 = driver.findElement(By.id("color"));
		String cssValue = element2.getCssValue("background-color");
		System.out.println("Getting CSS value is "+cssValue);

		Rectangle rect = driver.findElement(By.id("property")).getRect();
		Dimension dimen = rect.getDimension();
		int height = dimen.getHeight();
		int width = dimen.getWidth();

		System.out.println("height => "+height +" width => "+width);
		Dimension size = driver.findElement(By.id("property")).getSize();
		System.out.println(size);


	}

}
