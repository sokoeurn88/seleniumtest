package seleniumtest;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinkInAWebsite {
	
	public static void main(String args[]) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
//		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = allLinks.iterator();
		while(it.hasNext()) {
			try {
				String url = it.next().getAttribute("href");
				HttpURLConnection huc = (HttpURLConnection) new URL(url).openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				int responseCode = huc.getResponseCode();
				if(responseCode>=400) {
					System.out.println("Broken Link is: "+ url);
				} else {
					System.out.println("Valid Link is: "+ url);
				}
			} catch(Exception e) {
				
			}
		}
		
		System.out.println("Links verified completely.");
		driver.close();
		
		
	}

}
