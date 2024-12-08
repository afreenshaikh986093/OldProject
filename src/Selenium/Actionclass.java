package Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//keyboard Actions
public class Actionclass {
	public static void actionkeyboard() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		Thread.sleep(2000);
		
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		
		ac.sendKeys(Keys.ARROW_UP).perform();
		ScreenShots.captureScreen(driver);
		Thread.sleep(2000);
		driver.close(); 
		
		
	}
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		actionkeyboard();
	}

}
