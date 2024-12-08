package Selenium;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class Alerthandling {
	
public static void m2() throws InterruptedException, IOException {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		//step-1 launch instance 
		WebDriver dr= new ChromeDriver();
		
		//step-2 maximize window
		dr.manage().window().maximize();
		
		//step-3 open webpage
		dr.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		//stp-3 a scrolling on webpage
		JavascriptExecutor js = (JavascriptExecutor)dr;
		
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(2000);

		//find element-
		WebElement textbox = dr.findElement(By.name("enter-name"));
		textbox.sendKeys("afreen");
		Thread.sleep(4000);
		
		WebElement button=dr.findElement(By.id("confirmbtn"));
		button.click();
		Thread.sleep(4000);
		
		Alert al = dr.switchTo().alert();
		String textAlert =al.getText();
		System.out.println(textAlert);
		Thread.sleep(4000);
		if(textAlert.contains("afreen"))
		{
			al.accept();
			System.out.println("alertaccepted");
		}
		else
		{
				al.dismiss();
				System.out.println("alertdismiss");
			
		}
		
		Thread.sleep(4000);
		ScreenShots.captureScreen(dr);
		dr.close();
}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		m2();
	}

}
