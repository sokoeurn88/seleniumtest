package seleniumtest;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseEventsHandle {
	
	public static void main(String args[]) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		
		/*
		WebElement myMainMenu = driver.findElement(By.xpath(""));
		WebElement myLink = driver.findElement(By.xpath(""));
		
		Actions action = new Actions(driver);
		action.moveToElement(myMainMenu)
		.moveToElement(myLink)
		.click()
		.perform();
		*/
		
		driver.close();
	}

}
