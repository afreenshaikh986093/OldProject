package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicewindowhandle {
	public static void windowhandles() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	//step-1 initalize instance-
	WebDriver driver =new ChromeDriver();
	System.out.println("-----------Step-1---------");
	
	//step-2 maximize
	driver.manage().window().maximize();
	System.out.println("-----------Step-2---------");
	
	//step-3
	driver.get("https://vctcpune.com/selenium/practice.html");
	System.out.println("-----------Step-3---------");
	String parentwindow=driver.getWindowHandle();
	System.out.println(parentwindow);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,600)", "");
	System.out.println("-----------Step-4---------");
	

	driver.findElement(By.xpath("//a[@id='opentab']")).click();
	Set<String> childwindow=driver.getWindowHandles();
	System.out.println(childwindow);
	
	driver.switchTo().window(parentwindow);
	Thread.sleep(4000);
	driver.quit();
	
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		windowhandles();
	}

}
