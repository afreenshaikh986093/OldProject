package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

public static void radiobutton() throws InterruptedException  {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		//step-1 launch instance 
		WebDriver driver = new ChromeDriver();
		
		//step-2 maximize window
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(2000);
		//step-4 find elements
		List<WebElement > list = driver.findElements(By.xpath("//input[@name='radio']"));
		
		System.out.println("No of element " + list.size());
		
		for ( WebElement ele : list) {
			
			ele.click();
			Thread.sleep(1000);
		}
		
		
		
		Thread.sleep(4000);
		//step-6
		driver.close();

	}

public static void checkboxclick() throws InterruptedException  {
	
	//set path require while creating driver instance 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	//step-1 launch instance 
	WebDriver driver = new ChromeDriver();
	
	//step-2 maximize window
	driver.manage().window().maximize();
	
	//step-3 open webpage
	driver.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,700)", "");
	Thread.sleep(2000);
	//step-4 find elements
	List<WebElement > list = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	System.out.println("No of element " + list.size());
	
	for ( WebElement ele : list) {
		
		ele.click();
		Thread.sleep(1000);
	}

	Thread.sleep(4000);
	//step-6
	driver.close();

}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		radiobutton();
		checkboxclick();
		
	}

}
