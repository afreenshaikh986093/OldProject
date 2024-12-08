package Selenium;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragaction {
	
public static void dragObjectbykeyvalue() throws InterruptedException {
		
		//set path require while creating driver instance 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

				//step-1 initalize instance-
				WebDriver driver =new ChromeDriver();
				System.out.println("-----------Step-1---------");
				
				//step-2 maximize
				driver.manage().window().maximize();
				System.out.println("-----------Step-2---------");
				
				//step-3
				driver.get("https://jqueryui.com/draggable");
				System.out.println("-----------Step-3---------");
				
				//step-4 handle frame
				WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				driver.switchTo().frame(frame);
				System.out.println("-----------Step-4---------");
				
				//step-5 find drag object
				WebElement drag = driver.findElement(By.id("draggable"));
				System.out.println("-----------Step-5---------");
				
				//step-6 actions class
				Actions act2= new Actions(driver);
				
				act2.dragAndDropBy(drag, 150, 40).perform();
				System.out.println("-----------Step--6--------");
				Thread.sleep(8000);
				
				//step-7 close window
				driver.close();
				System.out.println("-----------Step-7---------");
		
		
	}


public static void dragObjectbyelement() throws InterruptedException, IOException {
	
	//set path require while creating driver instance 
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

			//step-1 initalize instance-
			WebDriver driver =new ChromeDriver();
			System.out.println("-----------Step-1---------");
			
			//step-2 maximize
			driver.manage().window().maximize();
			System.out.println("-----------Step-2---------");
			
			//step-3
			driver.get("https://jqueryui.com/droppable/");
			System.out.println("-----------Step-3---------");
			
			//step-4 handle frame
			WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(frame);
			System.out.println("-----------Step-4---------");
			
			//step-5 find drag object
			WebElement drag = driver.findElement(By.id("draggable"));
			//WebElement draggable = driver.findElement(By.id("draggable"));
			
			System.out.println("-----------Step-5---------");
			
			WebElement droppable = driver.findElement(By.id("droppable"));
			//step-6 actions class
			Actions act2= new Actions(driver);
			
			act2.dragAndDrop(drag, droppable).perform();
			System.out.println("-----------Step--6--------");
			Thread.sleep(2000);
			ScreenShots.captureScreen(driver);
			//step-7 close window
			driver.close();
			System.out.println("-----------Step-7---------");
	
	
}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 //dragObjectbykeyvalue();
		dragObjectbyelement();
	}

}
