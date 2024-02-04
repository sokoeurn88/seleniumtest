package seleniumtest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxAndgeckodriver {
	
	public static void main(String args[]) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.getTitle();
		driver.get("www.ebay.com");
		
		
		
		System.out.println(driver.getCurrentUrl());
		

		
		driver.close();
	}

}
