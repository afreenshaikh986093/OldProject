package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;

public class Parametarization {
	
WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void initalization(String browserType) throws InterruptedException {
		
		if (browserType.equals("chrome")) {
		//set path require while creating driver instance 
				System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

				//step-1 launch instance 
				 driver = new ChromeDriver();
		}	
		else if (browserType.equals("edge")) {
			
			//set path require while creating driver instance 
			System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\edgedriver_win64\\msedgedriver.exe");

			//step-1 launch instance 
			 driver = new EdgeDriver();
			
			
		}
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
		 
		 System.out.println("verifyTitle:test case passed");
		 
	 }
	 else {
		 
		 System.out.println("test acse failed");
	 }
	
}

@Test 
public void verifyURL() {
	
	String actUrl = driver.getCurrentUrl();
	
	Assert.assertEquals(actUrl, "https://vctcpune.com/selenium/practice.html");
	 System.out.println("verifyURL:test case passed");
}
	
@AfterClass
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);
	driver.close();
}
		}
