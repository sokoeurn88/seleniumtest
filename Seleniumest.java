package seleniumtest;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.io.Files;

public class Seleniumest {
	
	public static void main(String args[]) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup(); //now work for now because of webdriver manager jar file.
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
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
		System.out.println("Element found: " + clickElement.getText()); //get the text of element located.
		clickElement.click();
		
		/* explicit wait*/
		WebDriverWait wait = new WebDriverWait(driver, 5);
		long oldTime = System.currentTimeMillis();
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ybar-sbq']"))); /*wait the element to appear for 5 second*/
		WebElement searchElement = driver.findElement(By.xpath("//input[@id='ybar-sbq']"));
		searchElement.sendKeys("lucid");
		} catch(Exception e) {
			System.out.println("Total time in second to fine element is: " + (double) (System.currentTimeMillis()-oldTime)/100);
			System.out.println("Element not found");
		} finally {
			System.out.println("Program finished closing the browser");
		}
		
		
		// Javascript
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.getElementById('ybar-sbq').value='dropdown sample element example';");
//		searchElement.sendKeys(Keys.ENTER);
//		
//		driver.get("https://search.yahoo.com/search;_ylt=AwrNai7_u7tlugoDYW1XNyoA;_ylc=X1MDMjc2NjY3OQRfcgMyBGZyA3lmcC10BGZyMgNzYS1ncC1zZWFyY2gEZ3ByaWQDNnowc3d6MWdULkMuXy5rQmVQc1R3QQRuX3JzbHQDMARuX3N1Z2cDNARvcmlnaW4Dc2VhcmNoLnlhaG9vLmNvbQRwb3MDNARwcXN0cgNkcm9wZG93biBzYW1wbGUgZWxlbWVudARwcXN0cmwDMjMEcXN0cmwDMzEEcXVlcnkDZHJvcGRvd24lMjBzYW1wbGUlMjBlbGVtZW50JTIwZXhhbXBsZQR0X3N0bXADMTcwNjgwMjYwNgR1c2VfY2FzZQM-?p=dropdown+sample+element+example&fp=1&fr=yfp-t&fr2=sa-gp-search&iscqry=&mkr=8");
//		Select selectDropdown = new Select(driver.findElement(By.xpath("//select[@name='cars']")));
//		selectDropdown.selectByIndex(2);
		
//		driver.get("https://mail.google.com/mail/u/0/#inbox");
//		
//		WebElement signinElement = driver.findElement(By.xpath("//*[text()='Sign in']"));
//		signinElement.click();
//		
//		WebElement emailInput = driver.findElement(By.xpath("//input[@id='identifierId']"));
//		emailInput.sendKeys("sokoeurn.chhaya@gmail.com");
//		emailInput.sendKeys(Keys.ENTER);
		
//		WebElement nextButton = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
//		nextButton.click();
		
		/* auto IT
		Process P = Runtime.getRuntime().exec("SampleScriptAutoIT");
		P.wait(); */
		
		
		/* Take Screenshot*/
		TakesScreenshot srcshot = ((TakesScreenshot) driver);
//		ChromeDriver srcshot = ((ChromeDriver) driver);
		File srcFile = srcshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\sokoeurn chhay\\Selenium_Java_Review\\seleniumtest\\testscreenshot3.png");
		Files.copy(srcFile, destFile);
		System.out.println("Screenshot taken");
		
		

		
		
		
		driver.close();
	}

}
