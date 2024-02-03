package seleniumtest;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchToIframe {
	
	public static void main(String args[]) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		
		/*
		driver.switchTo().frame("Iframe1");						//switch to iframe
		driver.findElement(By.xpath("")).sendKeys("Hello");
		Thread.sleep(5000);
		
		driver.switchTo().parentFrame();	//swith back to parent frame
		System.out.println("Text is: "+ driver.findElement(By.xpath("")).getText());
		
		*/
		
		driver.close();
	}

}
