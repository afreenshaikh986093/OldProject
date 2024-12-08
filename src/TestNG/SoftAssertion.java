package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
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
					Thread.sleep(5000);
			
	}
	
	@Test
	public void verifyTitle1() {
		//driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		
		//soft assertion
		
		String actTitle =driver.getTitle();
		
		System.out.println(actTitle);
		
		SoftAssert sa =new SoftAssert();
		
		sa.assertEquals(actTitle, "– log in or sign up", "title does not matched");
		
	
		System.out.println("after assertion");
		
		sa.assertAll();
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}
}
	

	
	

