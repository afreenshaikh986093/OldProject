package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import exceptionhandling.Throw;

public class GetNaviget {
public static void chrome() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().window().minimize();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.com/");
	driver.navigate().to("https://www.javatpoint.com"); 
	 
	driver.navigate().back();

	
	driver.navigate().forward();
	 
	Thread.sleep(2000);
	driver.navigate().refresh(); 
	driver.close();
}
public static void edge() throws InterruptedException {
	System.setProperty("webdriver.edge.driver","C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().window().minimize();
	
	driver.manage().window().maximize();
	

	driver.navigate().to("https://www.javatpoint.com"); 
	 
	driver.navigate().back();
	
	
	driver.navigate().forward();
// 
	Thread.sleep(2000);
	driver.navigate().refresh(); 

	
	
}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//edge();
		chrome();
	}

}
