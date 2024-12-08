package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

public static void windowHandling() throws InterruptedException {
		
				//set path require while creating driver instance 
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
				
				//step-4
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("window.scrollBy(0,600)", "");
				System.out.println("-----------Step-4---------");
				Thread.sleep(2000);
				
				//step-5 get current window handle
				String parentTab = driver.getWindowHandle();
				System.out.println("Parent tab " + parentTab);
				System.out.println("-----------Step-5---------");
				
				//step-6 locate tab button
				driver.findElement(By.id("opentab")).click();
				System.out.println("-----------Step-6---------");
				Thread.sleep(2000);
				
				//step-7 using getWindow Handles
				Set<String> tabs = driver.getWindowHandles();
				
				//no of tabs
				System.out.println(tabs.size());
				
				//iterating on value
				for (String val :tabs) {
					
					if (!val.equals(parentTab)) {
						
						//switch to tab
						driver.switchTo().window(val);
						String childTabTitle = driver.getTitle();
						System.out.println("Child Tab Title " + childTabTitle);
						Thread.sleep(2000);
				
					}
					
				}
				System.out.println("-----------Step-7---------");
				
				//step-8
				//switch back to parent tab
				driver.switchTo().window(parentTab);
				String parentTabTitle = driver.getTitle();
				System.out.println("Parent Tab Title " + parentTabTitle);
				System.out.println("-----------Step-8---------");
				
				//step-a
				Thread.sleep(6000);
				driver.quit();
				System.out.println("-----------Step-9---------");
				
		
	}

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		windowHandling();
	}

}
