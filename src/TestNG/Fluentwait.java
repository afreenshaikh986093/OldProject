package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fluentwait{
	

	public static WebDriver driver;
	
	@BeforeClass
	public void initalization(){
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");

		//step-1 launch instance 
		 driver = new ChromeDriver();
				
				//step-2 maximize window
				driver.manage().window().maximize();
				
				//step-3 open webpage
				driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
				
				//step-4 global wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Test
	public void buttonHandling() {
		
		driver.findElement(By.xpath("//button[@id='enable-button']")).click();
		
		WebElement button = driver.findElement(By.xpath("//button[@id='disable']"));
		
		//fluent wait
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver);
		
		fwait.withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(1));
		
		fwait.until(ExpectedConditions.elementToBeClickable(button));
		
		Assert.assertTrue(button.isEnabled(), "Button is disable");
		
	}
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}

}
