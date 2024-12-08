package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {
	
	public static void calenderHandling() throws InterruptedException {
		
		//set path require while creating driver instance 
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

				//step-1 initalize instance-
				WebDriver driver =new ChromeDriver();
				System.out.println("-----------Step-1---------");
				
				//step-2 maximize
				driver.manage().window().maximize();
				System.out.println("-----------Step-2---------");
				
				//step-3
				driver.get("https://jqueryui.com/datepicker");
				System.out.println("-----------Step-3---------");
				
				
				
				//step-4 handling of frame
				//switch to frame as element is part of frame
				WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				driver.switchTo().frame(frame);
				System.out.println("-----------Step-4---------");
				
				//step-5
				WebElement tab = driver.findElement(By.xpath("//input[@id='datepicker']"));
				tab.click();
				System.out.println("-----------Step-5---------");
				
				//step-6
				Thread.sleep(8000);
				
				System.out.println("-----------Step-6---------");
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		calenderHandling();
	}

}
