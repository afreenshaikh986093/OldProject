package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import exceptionhandling.Throw;
public class Verifytitle {
public void vt() throws InterruptedException {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );

		//step-1 launch instance 
		WebDriver driver = new ChromeDriver();
		
		//step-2 maximize window
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get("https://www.facebook.com/");
		
		//step-4 get actual title from webpage
		String actual_Title = driver.getTitle();
		System.out.println(actual_Title);
		
		String expected_Title = "Facbook";
		
		//step-5 verification
		if (actual_Title.contains(expected_Title)) {
			
			System.out.println("test case passed");
		}
		else {
			
			System.out.println("test case failed");
		}
		
		//step-6
		driver.close();
		Thread.sleep(8000);
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Verifytitle v=new Verifytitle();
		v.vt();
		
	}

}
