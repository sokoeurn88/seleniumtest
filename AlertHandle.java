package seleniumtest;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class AlertHandle {
	
	public static void main(String args[]) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		
		/* Can't access the instructor website
		 
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Alert text is : "+ alertText);
		
		alert.accept();
		alert.dismiss();
		
		System.out.println("Alert message is : "+ driver.findElement(By.xpath("")).getText());
		
		*/
		
		driver.close();
	}

}
