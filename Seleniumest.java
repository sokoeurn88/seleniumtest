package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumest {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.close();
	}

}
