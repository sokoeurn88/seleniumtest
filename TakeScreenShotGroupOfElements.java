package seleniumtest;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenShotGroupOfElements {
	
	public static void main(String args[]) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		
		// The code will work after Selenium 4 features.
		/*
		WebElement element = driver.findElement(By.id("Form_submitForm"));
		File srcfile = element.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile("srcFile", new File("./groupelement.png"));
		
		*/

		driver.close();
		
		
	}

}
