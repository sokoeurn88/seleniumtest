package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumest {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup(); //now work for now because of webdriver manager jar file.
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contentEquals("Google")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		WebElement element = driver.findElement(By.id("APjFqb"));
		element.sendKeys("Yahoo");
		element.sendKeys(Keys.ENTER);
		
		// Find element using Relative Xpath
		WebElement clickElement = driver.findElement(By.xpath("//*[@class='LC20lb MBeuO DKV0Md']"));
		clickElement.click();
		
		WebElement searchElement = driver.findElement(By.xpath("//input[@id='ybar-sbq']"));
//		searchElement.sendKeys("lucid");
		
		// Javascript
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('ybar-sbq').value='dropdown sample element example';");
		searchElement.sendKeys(Keys.ENTER);
		
		driver.get("https://search.yahoo.com/search;_ylt=AwrNai7_u7tlugoDYW1XNyoA;_ylc=X1MDMjc2NjY3OQRfcgMyBGZyA3lmcC10BGZyMgNzYS1ncC1zZWFyY2gEZ3ByaWQDNnowc3d6MWdULkMuXy5rQmVQc1R3QQRuX3JzbHQDMARuX3N1Z2cDNARvcmlnaW4Dc2VhcmNoLnlhaG9vLmNvbQRwb3MDNARwcXN0cgNkcm9wZG93biBzYW1wbGUgZWxlbWVudARwcXN0cmwDMjMEcXN0cmwDMzEEcXVlcnkDZHJvcGRvd24lMjBzYW1wbGUlMjBlbGVtZW50JTIwZXhhbXBsZQR0X3N0bXADMTcwNjgwMjYwNgR1c2VfY2FzZQM-?p=dropdown+sample+element+example&fp=1&fr=yfp-t&fr2=sa-gp-search&iscqry=&mkr=8");
		Select selectDropdown = new Select(driver.findElement(By.xpath("//select[@name='cars']")));
		selectDropdown.selectByIndex(2);
		
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		WebElement signinElement = driver.findElement(By.xpath("//*[text()='Sign in']"));
		signinElement.click();
		
		
		
		

		
		
		
//		driver.close();
	}

}
