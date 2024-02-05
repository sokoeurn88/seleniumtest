package seleniumtest;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;


public class Relative_Locators {
	
	public static void main(String args[]) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Yahoo");
		
		/* it's not work because eclipse version
		WebElement button = driver.findElement(RelativeLocator.withTagName("input").below(searchBox));
		button.click();
		*/
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@class='gNO89b']"));
		searchButton.click();

//		driver.close();
		
		
	}

}
