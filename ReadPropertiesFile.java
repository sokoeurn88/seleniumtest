package seleniumtest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class ReadPropertiesFile {
	
	public static void main(String args[]) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("./config.properties"));
		System.out.println(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		

		
		driver.close();
	}

}
