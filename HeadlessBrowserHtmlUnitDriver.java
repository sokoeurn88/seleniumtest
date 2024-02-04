package seleniumtest;

import org.openqa.selenium.WebDriver;

public class HeadlessBrowserHtmlUnitDriver {

	public static void main(String[] args) {
		
		WebDriver driver = new HtmlUnitDriver();		// this code not work, need more precise implementation
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
