package seleniumtest;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsClass {
	
	public static void main(String args[]) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		WebElement searchTextArea = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		Actions actions = new Actions(driver);	//Actions is a class

		/*
		Action actionStep = actions.moveToElement(searchTextArea) //Action is interface
		.click()
		.keyDown(searchTextArea, Keys.SHIFT)
		.sendKeys(searchTextArea, "lucid")
		.keyUp(searchTextArea, Keys.SHIFT)
		.build();
		actionStep.perform();
		*/
		
		actions.moveToElement(searchTextArea) //Action is interface
		.click()
		.keyDown(searchTextArea, Keys.SHIFT)
		.sendKeys(searchTextArea, "lucid")
		.keyUp(searchTextArea, Keys.SHIFT)
		.perform();		
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
