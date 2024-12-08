package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Implicitwait {
	
public static WebDriver driver;
	
	@BeforeClass
	public void initalization() throws InterruptedException {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");

		//step-1 launch instance 
		 driver = new ChromeDriver();
				
				//step-2 maximize window
				driver.manage().window().maximize();
				
				//step-3 open webpage
				driver.get("https://www.facebook.com");
				
				//step-4 global wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@Test
	public void verifyTitle1() {
		//driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		
		System.out.println(driver.getTitle());
		
	}
	
	

	
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}

}
