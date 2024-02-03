package seleniumtest;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class PopupWindowHandle {
	
	public static void main(String args[]) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		
		String parentHandle = driver.getWindowHandle();
		Set <String> allWindowHandle = driver.getWindowHandles();
		
		for(String currentHandle : allWindowHandle) {
			System.out.println("Current Window Handle is: "+ currentHandle);
			if(!currentHandle.equalsIgnoreCase(parentHandle)) {
				driver.switchTo().window(currentHandle);
				System.out.println("The title of a child window id is: "+ driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(parentHandle);
		
		
		driver.close();
	}

}
