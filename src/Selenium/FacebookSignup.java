package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {
	public static void signuppage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		//step-1 initalize instance-
		WebDriver driver =new ChromeDriver();
		System.out.println("-----------Step-1---------");
		
		//step-2 maximize
		driver.manage().window().maximize();
		System.out.println("-----------Step-2---------");
		
		//step-3
		driver.get("https://www.facebook.com/signup");
		System.out.println("-----------Step-3---------");
	
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("anushka");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sharma");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8208665543");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Pass@afreen1234");
		System.out.println("-----------Step-5---------");
		
		WebElement datedropdown = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement monthdropdown = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement yeardropdown = driver.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(2000);
		System.out.println("-----------Step-5---------");
		Select seldate =new Select(datedropdown);
		Select selmonth =new Select(monthdropdown);
		Select selyear =new Select(yeardropdown);
		
		seldate.selectByVisibleText("26");
		
		selmonth.selectByVisibleText("Feb");
		
		selyear.selectByVisibleText("1995");
		
		System.out.println("-----------Step-6---------");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		Thread.sleep(20000);
		
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		signuppage();
	}

}
