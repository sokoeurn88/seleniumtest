package seleniumtest;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetSizeAndPositionOfElement {
	
	public static void main(String args[]) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("Form_submitForm_EmailHomePage"));
		Rectangle dimensions = element.getRect();
		
		System.out.println(dimensions.getWidth());
		System.out.println(dimensions.getHeight());
		System.out.println(dimensions.getX());
		System.out.println(dimensions.getY());
		
		driver.close();
		
		
	}

}
