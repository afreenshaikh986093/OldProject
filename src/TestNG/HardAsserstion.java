package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HardAsserstion {
	public static WebDriver driver;
		@BeforeClass
		public void initialization() throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com");
			Thread.sleep(5000);
		}
		@Test
		public void verifyTitle1()
		{
			//driver.navigate().to("https://vctcpune.com/selenium/practice.html");
			
			String actTitle =driver.getTitle();
			
			System.out.println(actTitle);
			
			Assert.assertEquals(actTitle, "acebook – log in or sign up", "Title does not matched");
			
			System.out.println("after assertion");
		}

		@AfterClass
		public void Browserclose() {
			
			driver.close();
		}
	}

