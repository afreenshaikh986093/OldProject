package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliderhandling {

	public static void sliderHandling() throws InterruptedException {
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		//step-1 initalize instance-
		WebDriver driver =new ChromeDriver();
		System.out.println("-----------Step-1---------");
		
		//step-2 maximize
		driver.manage().window().maximize();
		System.out.println("-----------Step-2---------");
		
		//step-3
		driver.get("https://jqueryui.com/slider");
		System.out.println("-----------Step-3---------");
		
		//step-4 switch to frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		System.out.println("-----------Step-4---------");
		
		//step-5 find slider element 
		WebElement slider = driver.findElement(By.id("slider"));
		System.out.println("-----------Step-5---------");
		
		//step-6 using actions for performing actions on slider
		Actions act1 =new Actions(driver);
		
		//click and hold slider
		act1.clickAndHold(slider).perform();
		Thread.sleep(2000);
		
		//move the slider
		act1.moveByOffset(300, 0).perform();
		Thread.sleep(2000);
		
		//release slider
		act1.release(slider).perform();
		System.out.println("-----------Step-6---------");
		Thread.sleep(8000);
		
		//step-7 close browser
		driver.close();
		System.out.println("-----------Step-7---------");
		
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		sliderHandling();
	}

}
