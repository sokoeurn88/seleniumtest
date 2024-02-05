package seleniumtest;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;


public class OpeningNewTabWindow {
	
	public static void main(String args[]) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		/*
		System.out.println("1 Window Title is: "+ driver.getTitle());
		
		String parentWindow = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		System.out.println("2 Window Title is: "+ driver.getTitle());
		
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println("1 Back Window Title is :"+ driver.getTitle());

		*/
		
		driver.close();
		
		
	}

}
