package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	
	
	public static void M1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver objectdriver=new ChromeDriver();
		objectdriver.get("https://housing.com/");
		Thread.sleep(5000);
		
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       M1();
       
	}

}
