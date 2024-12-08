package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG.TestngListeners1.class)

public class Listener2 {
	
WebDriver driver;
	
	@BeforeClass
	public void initalization() throws InterruptedException {
		
		//set path require while creating driver instance 
				System.setProperty("webdriver.edge.driver","C:\\Users\\hp\\OneDrive\\Desktop\\edgedriver_win64\\msedgedriver.exe" );

				//step-1 launch instance 
				 driver = new EdgeDriver();
				
				//step-2 maximize window
				driver.manage().window().maximize();
				
				//step-3 open webpage
				driver.get("https://vctcpune.com/selenium/practice.html");
				Thread.sleep(5000);
		
	}
  
	
@Test (dependsOnMethods="getButtonText",description="This test perform on edge browser")
public void verifyTitle() {
	
	String actTitle =driver.getTitle();
	System.out.println("Test verify Title");
	
	 if (actTitle.equals("Practice Page")) {
		 
		 System.out.println("test case passed");
		 
	 }
	 else {
		 
		 System.out.println("test acse failed");
	 }
	
}

@Test (description="This test perform on edge browser")
public void verifyURL() {
	System.out.println("Test VerifyURL");
	String actUrl = driver.getCurrentUrl();
	
	Assert.assertEquals(actUrl, "https://vctcpune.com/selenium/practice.html");
	
}

@Test 
public void getButtonText() { 
	System.out.println("Test GetButtontext");
	Assert.assertTrue(false);
}
	
@AfterClass
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);
	driver.close();
}
	
	
	


}
