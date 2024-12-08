package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Parelleltesting {
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
				driver.get("https://vctcpune.com/selenium/practice.html");
				Thread.sleep(5000);
		
	}
  
	
@Test
public void verifyTitle() {
	
	String actTitle =driver.getTitle();
	System.out.println();
	
	 if (actTitle.equals("Practice Page")) {
		 
		 System.out.println("test case passed");
		 
	 }
	 else {
		 
		 System.out.println("test acse failed");
	 }
	
}

@Test
public void verifyURL() {
	
	String actUrl = driver.getCurrentUrl();
	
	Assert.assertEquals(actUrl, "https://vctcpune.com/selenium/practice.html");
	System.out.println("test case passed");
}
	
@AfterClass
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);
	driver.close();
}
	
}
