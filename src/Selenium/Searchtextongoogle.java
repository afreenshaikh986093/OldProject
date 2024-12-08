package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchtextongoogle {
	public static void searchtext() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.google.co.in/");
		WebElement textBox= driver.findElement(By.xpath("//input[@name='q']"));
		textBox.sendKeys("facebook");
		//driver.get("https://www.google.co.in/");
		WebElement Box= driver.findElement(By.name("btnK"));
		Box.submit();
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		searchtext();
	}

}
