package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumest {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contentEquals("Google")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		WebElement element = driver.findElement(By.id("APjFqb"));
		element.sendKeys("Yahoo");
		element.sendKeys(Keys.ENTER);
		
		driver.close();
	}

}
