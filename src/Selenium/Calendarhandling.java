package Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarhandling {
	
public static void calenderHandling() throws InterruptedException, IOException {
		
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
				Thread.sleep(2000);
				System.out.println("-----------Step-5---------");
				
				//step-6 select date - covid- 24 march 2020
				//step-6A --month & year
				
				while (true) {
				WebElement monthyearele =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
				
				String monthyear = monthyearele.getText();
				
				if (!monthyear.equals("March 2020")) {
					
					WebElement prevLink =driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all'  or @data-handler='prev']"));
					prevLink.click();
				}
				else {
					
					break;
				}
				}
				Thread.sleep(2000);
				
				//step-6B --select date
				driver.findElement(By.xpath("//a[text()='24']")).click();
				System.out.println("date selected");
				
				
				
				//step-
				
				ScreenShots.captureScreen(driver);
				driver.close();
				System.out.println("-----------Step-6---------");
				
				
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 calenderHandling();
	}

}
