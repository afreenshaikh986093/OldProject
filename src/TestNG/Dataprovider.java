package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
WebDriver driver;
	
	@BeforeClass
	public void initalization() throws InterruptedException {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

		//step-1 launch instance 
		 driver = new ChromeDriver();
				
				//step-2 maximize window
				driver.manage().window().maximize();
				
				//step-3 open webpage
				driver.get("https://www.facebook.com");
				Thread.sleep(5000);
		
	}
	
	@Test (dataProvider="testData")
	public void login(String email, String pass) throws InterruptedException {
		
		
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).sendKeys(pass);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(4000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
	}
	
	@DataProvider(name="testData")
	public String[][] getData() {
		
		   String [][] data = {{ "abc@gmail.com", "abc123"},{"def@gmail.com","def123"}};
		   
		   return data;
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}
}
