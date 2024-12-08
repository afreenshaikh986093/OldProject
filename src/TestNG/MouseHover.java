package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseHover {
public static WebDriver driver;
	public static WebElement ele;
	public static  Actions act;
	@BeforeClass
	public void initalization() throws InterruptedException {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");

		//step-1 launch instance 
		 driver = new ChromeDriver();
				
				//step-2 maximize window
				driver.manage().window().maximize();
				
				//step-3 open webpage
				driver.get("https://www.flipkart.com/");
				
				//step-4 global wait
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		}
	@Test
	public void mousehover() throws InterruptedException{
	
		WebElement ele =driver.findElement(By.xpath("//div[@class='exehdJ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
	}
	@Test
	public void m2() throws InterruptedException {
		driver.findElement(By.partialLinkText("Download App")).click();
		driver.navigate().back();
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
	}
	@Test
	public void m3() throws InterruptedException {
		driver.findElement(By.partialLinkText("Advertise")).click();
		driver.navigate().back();
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
	}
	@Test
	public void m4() throws InterruptedException {
		driver.findElement(By.partialLinkText("Notification Preferences")).click();
		driver.navigate().back();
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
	}
	@Test
	public void m5() throws InterruptedException {
	driver.findElement(By.partialLinkText("24*7 Custom Care ")).click();
			
			Thread.sleep(10000);
		}
	@AfterClass
	public void browserclose() {
		driver.close();
	}
	
}
