package Selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
public void vurl() throws InterruptedException {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		//step-1 launch instance 
		WebDriver driver = new ChromeDriver();
		
		//step-2 maximize window
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get("https://www.facebook.com/");
		
		//step-4 get actual title from webpage
		String actual_url = driver.getCurrentUrl();
		System.out.println(actual_url);
		
		String expected_url = "https://www.facbook.com/";
		
		//step-5 verification
		if (actual_url.equals(expected_url)) {
			
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
		VerifyURL v=new VerifyURL();
		v.vurl();
	}

}
